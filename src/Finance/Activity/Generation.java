package Finance.Activity;

import Finance.Interface.BaseMethods;
import Finance.Organisation.*;

import java.util.ArrayList;

public class Generation {
    ArrayList<BaseMethods> organizations = new ArrayList<>();

    void createBank () {
        {
            Bank bank = new Bank();

            bank.setData("ПриватБанк", "вул. Полтавський шлях", "1997");

            bank.setDataExchange(150000, 15);
            bank.setDataCredit(200000, 0.25);
            bank.setDataInvestment(0.03, 12);
            bank.setDataTransfer(0.01, 25);//не правильно, повинна бути коміссію 1% від суми + 25 грн

            String[] titleCurrency = {"usd", "eur", "rub"};
            double[] buyCurrency = {27.8, 32.02, 0.350};
            double[] sellCurrency = {27.1, 32.30, 0.355};

            bank.setAnExchangeRate(titleCurrency, buyCurrency, sellCurrency);

            organizations.add(bank);
        }

        {
            Bank bank = new Bank();

            bank.setData("ОщадБанк", "вул. Римарська 34", "1990");

            bank.setDataExchange(150000, 15);
            bank.setDataCredit(200000, 0.25);
            bank.setDataInvestment(0.03, 12);
            bank.setDataTransfer(0.01, 25);//не правильно, повинна бути коміссію 1% від суми + 25 грн

            String[] titleCurrency = {"usd", "eur", "rub"};
            double[] buyCurrency = {27.8, 32.02, 0.350};
            double[] sellCurrency = {27.1, 32.30, 0.355};

            bank.setAnExchangeRate(titleCurrency, buyCurrency, sellCurrency);

            organizations.add(bank);
        }
    }
    void createChanger () {
        {
            Changer changer = new Changer();

            changer.setData("Обмін Валют 'Кришталик'", "вул. Тринклера 23А", "-");
            changer.setDataExchange(0, 0);

            String[] titleCurrency = {"usd", "eur", "rub"};
            double[] buyCurrency = {27.5, 32.02, 0.360};
            double[] sellCurrency = {27.1, 32.34, 0.367};

            changer.setAnExchangeRate(titleCurrency, buyCurrency, sellCurrency);

            organizations.add(changer);
        }
    }
    void createPawnshop(){

        Pawnshop pawnshop = new Pawnshop();

        pawnshop.setData("Ломбард 'Мрія'", "вул. Велика Панасівська 45", "-");
        pawnshop.setDataCredit(50000, 0.04);

        organizations.add(pawnshop);

    }
    void createCreditCafe(){
        CreditCafe creditCafe = new CreditCafe();

        creditCafe.setData("КредитКафе 'У ХАТИ'", "вул. Бендховська 34А", "-");
        creditCafe.setDataCredit(4000, 2);

        organizations.add(creditCafe);
    }
    void createCreditUnion(){
        CreditUnion creditUnion = new CreditUnion();

        creditUnion.setData("Кредитний союз 'Гоббіт'", "вул. Полтавський шлях 34Б", "-");
        creditUnion.setDataCredit(100000, 0.2);

        organizations.add(creditUnion);
    }
    void createInvestmentFund(){
        {
            InvestmentFund investmentFund = new InvestmentFund();

            investmentFund.setData("Інвестиційний фонд 'Лапка'", "вул. Карла Маркса 15", "1992");
            investmentFund.setDataInvestment(1, 12);

            organizations.add(investmentFund);
        }

        {
            InvestmentFund investmentFund = new InvestmentFund();

            investmentFund.setData("Інвестиційний фонд 'Дикі Валуни'", "вул. Криштальна 25", "1971");
            investmentFund.setDataInvestment(2, 24);

            organizations.add(investmentFund);
        }
    }
    void createMail(){
        Mail mail = new Mail();

        mail.setData("УкрПошта", "Ґрунвальдська 34", "-");
        mail.setDataTransfer(0.02, 0);

        organizations.add(mail);
    }
    void createOnlineMoneyTransfer(){
        OnlineMoneyTransfer onlineMoneyTransfer = new OnlineMoneyTransfer();

        onlineMoneyTransfer.setData("Онлайн сервіс пересилань 'Я тут ні причому'", "вул. Капітошка 56/58", "-");
        onlineMoneyTransfer.setDataTransfer(0.01, 0);

        organizations.add(onlineMoneyTransfer);
    }
    ArrayList<BaseMethods> getList(){
        return organizations;
    }
}
