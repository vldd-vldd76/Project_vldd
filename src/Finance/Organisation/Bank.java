package Finance.Organisation;

public class Bank extends TopClass {

    String title;
    String address;
    String year;
    double limit = 150000;//in uah
    double commission = 15;//in uah

    String [] titleCurrency = {"usd", "eur", "rub"};
    double [] buyCurrency = {27.8, 32.02, 0.350};
    double [] sellCurrency = {28.0, 32.30, 0.355};

    void introduceAnExchangeRate(String [] currency, double [] buyCurrency, double [] sellCurrency){
        this.titleCurrency = currency;
        this.buyCurrency = buyCurrency;
        this.sellCurrency = sellCurrency;
    }



    void title (String title){
        this.title = title;
    }

    void address(String address){
        this.address = address;
    }

    void year(String year){
        this.year = year;
    }

    void changeFromUah (double amount, String csell, String cbuy) {
        double result = 0;
        if(amount != limit) {
            for (int i = 0; i < titleCurrency.length; i++) {
                if (cbuy.contains(titleCurrency[i])) {
                    result = (amount - commission) / buyCurrency[i];
                    break;
                }
            }
            System.out.println(result + " " + cbuy);
        }else{
            System.out.println("You are exceed limit in 150 000 uah:)");
        }


    }

    void changeToUah(double amount, String csell, String cbuy){
        double result = 0;
        for(int i = 0; i < titleCurrency.length; i++) {
            if(csell.contains(titleCurrency[i])) {
                result = amount * sellCurrency[i];
                result = result - commission;
                break;
            }
        }
        if(result != limit) {
            System.out.println(result + " " + cbuy);
        }else{
            System.out.println("You are exceed limit in 150 000 uah:)");
        }
    }

    void credit (double amount) {
        double limit = 200000;//uah
        double percent = 0.15;

        if(amount != limit){

        }
    }

    void investment (double amount) {
        double term = 12;//month
    }

    void forward (double amount) { //переслати
        double commission = amount * 0.01 + 25;
        double result = amount - commission;
    }
}
