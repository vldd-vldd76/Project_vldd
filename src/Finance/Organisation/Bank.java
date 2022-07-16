package Finance.Organisation;

import Finance.Interface.*;

public class Bank extends BaseMethods implements ExchangeMethods, CreditMethods, InvestmentMethods, TransferMethods {
    String title;
    String address;
    String year;

    double limitExchange;//in ua
    double commissionExchange;//in uah

    double limitCredit;//ua
    double commissionCredit;//%

    double percentInvestment;
    double periodInvestment;

    double commissionPercentTransfer;//%
    double commissionUahTransfer;//ua

    String [] titleCurrencies;
    double [] buyCurrencies;
    double [] sellCurrencies;

    @Override
    public void setData(String title, String address, String year){
        this.title = title;
        this.address = address;
        this.year = year;
    }

    @Override
    public void setDataExchange(double limit, double commission){
        this.limitExchange = limit;
        this.commissionExchange = commission;
    }

    @Override
    public void setAnExchangeRate(String [] currency, double [] buyCurrency, double [] sellCurrency){
        this.titleCurrencies = currency;
        this.buyCurrencies = buyCurrency;
        this.sellCurrencies = sellCurrency;
    }

    @Override
    public void setDataCredit(double limit, double commission){
        this.limitCredit = limit;
        this.commissionCredit = commission;
    }

    @Override
    public void setDataInvestment(double percentInvestment, double periodInvestment){
        this.percentInvestment = percentInvestment;
        this.periodInvestment = periodInvestment;
    }

    @Override
    public void setDataTransfer(double commissionPercent, double commissionUah) {
        this.commissionPercentTransfer = commissionPercent;
        this.commissionUahTransfer = commissionUah;
    }

    @Override
    public String [] getTitleCurrencies(){
        return titleCurrencies;
    }

    @Override
    public String getTitleCurrencies(int index){return titleCurrencies[index];}

    @Override
    public double changeFromUah (double amount, String buyCurrency) {
        double result = 0;
        if(amount <= limitExchange || limitExchange == 0) {
            for (int i = 0; i < titleCurrencies.length; i++) {
                if (buyCurrency.contains(titleCurrencies[i])) {
                    result = (amount - commissionExchange) / sellCurrencies[i];
                    break;
                }
            }
        }else{
            System.out.println("You are exceed limit in 150 000 uah:)");//під питанням
        }
        return result;
    }

    @Override
    public double changeToUah(double amount, String sellCurrency){
        double result = 0;
        for(int i = 0; i < titleCurrencies.length; i++) {
            if(sellCurrency.contains(titleCurrencies[i])) {
                result = amount * buyCurrencies[i];
                result = result - commissionExchange;
                break;
            }
        }
        if(result > limitExchange || limitExchange != 0) {
            System.out.println("You are exceed limit in 150 000 uah:)");
            result = 0;
        }
        return result;
    }

    @Override
    public double credit (double amount) {
        double result = 0;
        if(amount < limitCredit){
            result = amount * commissionCredit;
        }
        return result;
    }

    @Override
    public double investment(double period) {
        double result = 0;
        if(period < periodInvestment) {
            result = 1 / percentInvestment;
        }
        return result;
    }

    @Override
    public double transfer (double amount) { //переслати
        double result = 0;
        double commission = amount * commissionPercentTransfer + commissionUahTransfer;
        result = amount - commission;
        return result;
    }

    @Override
    public void getInfo(){
        System.out.println(title);
        System.out.println(address);
        System.out.println(year);
        System.out.println("Покупка/продажа валюти: ");
        System.out.println("ліміт: " + limitExchange + " uah " + "комісія: " + commissionExchange + " uah");
        System.out.println("Кредит: ");
        System.out.println("ліміт: " + limitCredit + " відсоток: " + commissionCredit);//доробити
        System.out.println("Інвестиції: ");
        System.out.println("термін: " + periodInvestment + " депозит: " + percentInvestment);
        System.out.println("Пересилання: ");
        System.out.println("комісія: " + commissionPercentTransfer + " + " + commissionUahTransfer);
    }
}
