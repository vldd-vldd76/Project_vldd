package Finance.Organisation;

import Finance.Interface.BaseMethods;
import Finance.Interface.ExchangeMethods;

public class Changer extends BaseMethods implements ExchangeMethods {
    String title;
    String address;

    double limitExchange;
    double commissionExchange;

    String [] titleCurrencies;
    double [] buyCurrencies;
    double [] sellCurrencies;
    @Override
    public void setData(String title, String address, String year){
        this.title = title;
        this.address = address;
    }

    @Override
    public void setDataExchange(double limit, double commission){
        this.limitExchange = limit;
        this.commissionExchange = commission;
    }

    @Override
    public void setAnExchangeRate(String [] titleCurrency, double [] buyCurrency, double [] sellCurrency){
        this.titleCurrencies = titleCurrency;
        this.buyCurrencies = buyCurrency;
        this.sellCurrencies = sellCurrency;
    }

    @Override
    public String [] getTitleCurrencies(){
        return titleCurrencies;
    }

    @Override
    public String getTitleCurrencies(int index){
        return titleCurrencies[index];
    }

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
    public void getInfo(){
        System.out.println(title);
        System.out.println(address);
        System.out.println("Покупка/продажа валюти: ");
        System.out.println("ліміт: " + limitExchange + " uah " + "комісія: " + commissionExchange + " uah");
    }
}
