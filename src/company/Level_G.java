package company;

import java.util.Scanner;

public class Level_G {
    public static void main(String [] args) {
        System.out.println("Введите года/год(например, 1990-2000 или 1980): ");

        Scanner line = new Scanner(System.in);
        String date = line.nextLine();

        System.out.println("Введите категорию(Книги, Журналы, Ежегодники, Все): ");
        String category = line.nextLine();

        Generation g = new Generation();

        Search s = new Search();

        s.toSearch(date, category, g.generate());

    }
}
