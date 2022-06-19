package Finance.Organisation;

public class Changer extends TopClass {
    String title = "Обменка";
    String address = "вул. Тринклера 23А";

    String [] titleCurrency;
    double [] buyCurrency;
    double [] sellCurrency;

    void title(String title){
        this.title = title;
    }

    void address(String address){
        this.address = address;
    }

    void introduceAnExchangeRate(String [] titleCurrency, double [] buyCurrency, double [] sellCurrency){
        this.titleCurrency = titleCurrency;
        this.buyCurrency = buyCurrency;
        this.sellCurrency = sellCurrency;
    }

    void changeFromUah (double amount, String cbuy) {
        double result = 0;
        for(int i = 0; i < titleCurrency.length; i++) {
            if(cbuy.contains(titleCurrency[i])) {
                result = amount / sellCurrency[i];
            }
        }
        System.out.println(result + " " + cbuy);
    }

    void changeToUah(double amount, String csell, String cbuy){
        double result = 0;
        for(int i = 0; i < titleCurrency.length; i++) {
            if(csell.contains(titleCurrency[i])) {
                result = amount * buyCurrency[i];
            }
        }
        System.out.println(result + " " + cbuy);
    }
}
