package company;

public class Search {

    void toSearch(String d, String c) {
        int indexB = 0;
        int indexJ = 0;
        int indexY = 0;

        Book b = new Book();
        Journal j = new Journal();
        Yearbook y = new Yearbook();

        TopClass [] type = {b, j, y};
        String [] titlecategory = {"книги", "журналы", "ежегодники"};

        if(c.contains("все")) {
            if (d.contains("-")) {
                String[] array = d.split("-");
                int a1 = Integer.parseInt(array[0]);
                int a2 = Integer.parseInt(array[1]);

                for (int i = 0; i < b.published.length; i++) {
                    int b1 = Integer.parseInt(b.published[i]);
                    if (a1 <= b1 & b1 <= a2) {
                        b.getInfo(i);
                    } else {
                        indexB++;
                    }
                }
                for (int i = 0; i < j.published.length; i++) {
                    String[] p = j.published[i].split(",");
                    int b1 = Integer.parseInt(p[1]);

                    if (a1 <= b1 & b1 <= a2) {
                        j.getInfo(i);
                    } else {
                        indexJ++;
                    }
                }
                for (int i = 0; i < y.published.length; i++) {
                    int b1 = Integer.parseInt(y.published[i]);
                    if (a1 <= b1 & b1 <= a2) {
                        y.getInfo(i);
                    } else {
                        indexY++;
                    }
                }
            } else {
                for (int i = 0; i < b.published.length; i++) {
                    if (b.published[i].contains(d)) {
                        b.getInfo(i);
                    } else {
                        indexB++;
                    }
                }
                for (int i = 0; i < j.published.length; i++) {
                    if (j.published[i].contains(d)) {
                        j.getInfo(i);
                    } else {
                        indexJ++;
                    }
                }
                for (int i = 0; i < y.published.length; i++) {
                    if (y.published[i].contains(d)) {
                        y.getInfo(i);
                    } else {
                        indexY++;
                    }
                }
            }
            if (indexB == b.published.length & indexJ == j.published.length & indexY == y.published.length) {
                System.out.println("к сожалению, мы ничего не смогли найти:(");
            }
        }else{
            for(int i = 0; i < 3; i++) {
                if(titlecategory[i].contains(c)) {
                    for (int k = 0; k < type[i].published.length; k++) {
                        type[i].getInfo(k);
                    }
                    break;
                }
            }
        }
    }
}
