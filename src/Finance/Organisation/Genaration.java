package Finance.Organisation;

import java.util.ArrayList;

public class Genaration {
    ArrayList<Changer> organizations = new ArrayList();

    //ідея заповнення данних класа через аргумент функції
    void createBank (String title, String address, String year) {}
    void createChanger (String title, String address, String [] titleCurrency, double [] buyCurrency, double [] sellCurrency) {
        Changer changer = new Changer();

        changer.title(title);
        changer.address(address);
        changer.introduceAnExchangeRate(titleCurrency, buyCurrency, sellCurrency);

        organizations.add(changer);
    }
    void createPawnshop(){}
    void createCreditCafe(){}
    void createCreditUnion(){}
    void createInvestmentFund(){}
    void createMail(){}
    void createOnlineForwardingService(){}
    ArrayList<Changer> getList(){
        return organizations;
    }
}
