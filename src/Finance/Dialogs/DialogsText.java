package Finance.Dialogs;

import java.util.Scanner;

public class DialogsText {
    Scanner line = new Scanner(System.in);
    String mainMenu(){
        System.out.println("Вас вітає система 'Фінинси'!");

        System.out.println("будь ласка обреріть дію, яку хочете зробити:");

        System.out.println("Найкращий курс обміну 20.000 грн на долар/євро/рубль -- натисніть 1, щоб обрати");
        System.out.println("Мінімальна процентна ставка для кредиту у сумі 50.000 грн -- натисніть 2, щоб обрати");
        System.out.println("Найкраще місце для депозиту на 12 міс. -- натисьніть 3, щоб обрати");
        System.out.println("Найкраща організація для пересилання 1000 грн -- натисніть 4, щоб обрати");
        System.out.println("Інше -- натисніть 5, щоб обрати");
        System.out.println("Вийти -- натисніть 0, щоб обрати");

        String choice = line.nextLine();

        return choice;

        //зробити перевірку, що вводить користувач
        //всі умови робити в актівіті

    }
    String otherMenu(){
        System.out.println("Оберіть дію: ");
        System.out.println("Обміняти валюту -- натисніть 1, щоб обрати");
        System.out.println("Узяти кредит -- натисніть 2, щоб обрати");
        System.out.println("Покласти гроші на депозит -- натисніть 3, щоб обрати");
        System.out.println("Переслати валюту -- натисніть 4, щоб обрати");
        System.out.println("Повернутись у головне меню -- натисніть 0, щоб обрати");

        String choice = line.nextLine();

        return choice;
    }
}