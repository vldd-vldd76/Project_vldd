package Finance.Organisation;

import java.util.ArrayList;

public class Activity {
    ArrayList<Changer> organization = new ArrayList();

    public void start(String csell, String cbuy, double amount){
        Genaration toGenerate = new Genaration();

        String [] titleCurrency = {"usd", "eur"};
        double [] buyCurrency = {27.1, 32.02};
        double [] sellCurrency = {27.7, 32.34};

        toGenerate.createChanger("Обменка", "вул. Тринклера 23А", titleCurrency, buyCurrency, sellCurrency);

        this.organization = toGenerate.getList();

        action(csell, cbuy, amount);

        //theBestCourseOfChange();

    }

    void action(String csell, String cbuy, double amount){
        if(csell.contains("uah")) {
            organization.get(0).changeFromUah(amount, cbuy);
        }else{
            organization.get(0).changeToUah(amount, csell, cbuy);
        }
    }

    void theBestCourseOfChange(){
        for (TopClass b : organization) {
            System.out.println(b.title);
            break;
        }
    }

}
