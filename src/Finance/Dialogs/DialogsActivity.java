package Finance.Dialogs;

import Finance.Activity.Activity;

import java.util.Scanner;

public class DialogsActivity {
    Scanner line;
    Activity activity;
    DialogsText dialogsText;
    String choice;
    public void start(){
        line = new Scanner(System.in);
        activity = new Activity();
        dialogsText = new DialogsText();

        activity.start();
        actionMainMenu();
    }
    public void actionMainMenu(){

        choice = dialogsText.mainMenu();

        if (choice.contains("0")) {
            exit();
        } else if (choice.contains("5")) {

            choice = dialogsText.otherMenu();
            actionOtherMenu(choice);

        } else {
            if (choice.contains("1")) {

                System.out.println("Введіть валюту, котру хочете купити: ");
                String currency = line.nextLine();
                activity.theBestCourseOfChange(currency);

            } else if (choice.contains("2")) {

                activity.minimumInterestRateForCredit();

            } else if (choice.contains("3")) {

                activity.theBestPlaceToInvestment();

            } else if (choice.contains("4")) {

                activity.theBestTransferOrganization();

            }
        }
    }
    void actionOtherMenu(String choice) {
        if (choice.contains("0")) {
            actionMainMenu();
        } else if (choice.contains("1")) {

        } else if (choice.contains("2")) {

        } else if (choice.contains("3")) {

        } else if (choice.contains("4")) {

        }
    }
    void exit(){
        System.out.println("Завершення роботи...");
    }
}
