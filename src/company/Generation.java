package company;

public class Generation {

    TopClass[] generate() {

            Book b = new Book();

            b.type = "Книги";
            b.title = new String[]{"Хоббит, или Туда и обратно", "Роббин Гуд"};
            b.authors = new String[]{"Дж. Р Р. Толкинг", "Л. Керрол"};
            b.publishingHouse = new String[]{"Просвещение", "Мир"};
            b.published = new String[]{"1937", "1992"};


            Journal j = new Journal();

            j.type = "Журналы";
            j.title = new String[]{"Квант"};
            j.topic = new String[]{"Точные науки"};
            j.published = new String[]{"январь,1951"};


            Yearbook y = new Yearbook();

            y.type = "Ежегодники";
            y.title = new String[]{"Звездные войны"};
            y.topic = new String[]{"Войны"};
            y.publishingHouse = new String[]{"Гора"};
            y.published = new String[]{"2005"};

            return new TopClass[]{b, j, y};
    }
}
