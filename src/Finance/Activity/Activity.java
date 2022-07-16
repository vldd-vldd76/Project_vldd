package Finance.Activity;

import Finance.Interface.BaseMethods;

import java.util.ArrayList;

public class Activity {
    ArrayList<BaseMethods> organization = new ArrayList<>();

    public void start(){
        Generation toGenerate = new Generation();

        toGenerate.createBank();
        toGenerate.createChanger();
        toGenerate.createPawnshop();
        toGenerate.createCreditCafe();
        toGenerate.createCreditUnion();
        toGenerate.createInvestmentFund();
        toGenerate.createMail();
        toGenerate.createOnlineMoneyTransfer();

        organization = toGenerate.getList();
    }
    public void theBestCourseOfChange(String currency){//останні зміни тут
        // цей метод буде працювати, якщо кількість валюти для переводу буде перевищюіати ліміт в якійсь організації ???
        ArrayList<BaseMethods> cloneOrganization = new ArrayList<>();
        ArrayList<String> listCurrency = new ArrayList<>();

        int numberIndex = -1;

        for(int q = 0; q < organization.get(0).getTitleCurrencies().length; q++){

            if(organization.get(0).getTitleCurrencies(q).contains(currency)) {
                ++numberIndex;
                cloneOrganization.add(organization.get(0));
                listCurrency.add(organization.get(0).getTitleCurrencies(q));

                for (int i = 0; i < organization.size() - 1; i++) {
                    if (q < (organization.get(i).getTitleCurrencies().length) && q < (organization.get(i + 1).getTitleCurrencies().length)) {

                        if (cloneOrganization.get(numberIndex).changeFromUah(20000, listCurrency.get(numberIndex)) < organization.get(i + 1).changeFromUah(20000, organization.get(i + 1).getTitleCurrencies(q))) {

                            cloneOrganization.remove(numberIndex);
                            cloneOrganization.add(organization.get(i + 1));
                            listCurrency.remove(numberIndex);
                            listCurrency.add(organization.get(i + 1).getTitleCurrencies(q));
                            // нижня умова не працює!!!  ласт зміни
                        } else if (cloneOrganization.get(numberIndex).changeFromUah(20000, listCurrency.get(numberIndex)) == organization.get(i + 1).changeFromUah(20000, organization.get(i + 1).getTitleCurrencies(q))) {

                            ++numberIndex;
                            cloneOrganization.add(organization.get(i + 1));
                            listCurrency.add(organization.get(i + 1).getTitleCurrencies(q));
                        }
                    }
                }
                break;
            }
        }
        for(int a = 0; a <= numberIndex; a++){
            System.out.println("----------------------------------------------");
            System.out.println("Краща організація для переводу 20 000 грн у " + listCurrency.get(a));
            cloneOrganization.get(a).getInfo();
            System.out.println("----------------------------------------------");
        }
    }

    public void minimumInterestRateForCredit(){
        ArrayList<BaseMethods> cloneOrganization = new ArrayList<>();
        cloneOrganization.add(organization.get(0));

        for(int i = 0; i < organization.size() - 1; i++){
            if(cloneOrganization.get(0).credit(50000) < organization.get(i + 1).credit(50000)){
                cloneOrganization.clear();
                cloneOrganization.add(organization.get(i + 1));

            } else if (cloneOrganization.get(0).credit(50000) == organization.get(i + 1).credit(50000)) {
                cloneOrganization.add(organization.get(i + 1));
            }
        }
        for(int i = 0; i < cloneOrganization.size(); i++){
            if(i == 0){
                System.out.println("Краща організація для отримання кредиту на суму 50 000 грн: ");
            }
            System.out.println("--------------------------------------------------------------");
            cloneOrganization.get(i).getInfo();
            System.out.println("--------------------------------------------------------------");
        }
    }

    public void theBestPlaceToInvestment(){

        ArrayList<BaseMethods> cloneOrganization = new ArrayList<>();
        cloneOrganization.add(organization.get(0));

        for(int i = 0; i < organization.size() - 1; i++){
            if(cloneOrganization.get(0).investment(12) < organization.get(i + 1).investment(12)){
                cloneOrganization.clear();
                cloneOrganization.add(organization.get(i + 1));

            } else if (cloneOrganization.get(0).investment(12) == organization.get(i + 1).investment(12)) {
                cloneOrganization.add(organization.get(i + 1));
            }
        }
        for(int i = 0; i < cloneOrganization.size(); i++){
            if(i == 0){
                System.out.println("Краща організація для інвестування: ");
            }
            System.out.println("--------------------------------------------------------------");
            cloneOrganization.get(i).getInfo();
            System.out.println("--------------------------------------------------------------");
        }
    }

    public void theBestTransferOrganization(){

        ArrayList<BaseMethods> cloneOrganization = new ArrayList<>();
        cloneOrganization.add(organization.get(0));

        for(int i = 0; i < organization.size() - 1; i++){
            if(cloneOrganization.get(0).transfer(1000) < organization.get(i + 1).transfer(1000)){
                cloneOrganization.clear();
                cloneOrganization.add(organization.get(i + 1));

            } else if (cloneOrganization.get(0).transfer(1000) == organization.get(i + 1).transfer(1000)) {
                cloneOrganization.add(organization.get(i + 1));
            }
        }
        for(int i = 0; i < cloneOrganization.size(); i++){
            if(i == 0){
                System.out.println("Краща організація для пересилання 1000 грн: ");
            }
            System.out.println("--------------------------------------------------------------");
            cloneOrganization.get(i).getInfo();
            System.out.println("--------------------------------------------------------------");
        }
    }
}
