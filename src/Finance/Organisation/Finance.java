package Finance.Organisation;

import java.util.*;

public class Finance {
    public static void main(String [] args) {

//        Changer cha = new Changer();
//        Bank ba = new Bank();

        //List collection = new ArrayList();

        Scanner line = new Scanner(System.in);

        System.out.println("Вас вітає система 'Фінинси'!");
        //System.out.println("Обреріть організацію (наприклад: Обменка, Банк): ");
        //String organis = line.nextLine();

        System.out.println("Уведіть валюту, котру хочете продати: ");
        String csell = line.nextLine();

        System.out.println("Уведіть валюту, котру хочите купити: ");
        String cbuy = line.nextLine();

        System.out.println("Уведіть кількість валюти: ");
        String num = line.nextLine();
        double amount = Double.parseDouble(num);

        Activity activity = new Activity();
        activity.start(csell, cbuy, amount);

//        if(organis.contains("Банк")) {
//            ba.change(amount, csell, cbuy);
//        }else{
//            cha.change(amount, csell, cbuy);
//        }


    }
}
