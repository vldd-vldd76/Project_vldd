package company;

public class Search {

    void toSearch(String d, String c, TopClass [] tp) {
        int indexB = 0;
        int indexJ = 0;
        int indexY = 0;

        TopClass [] type = {tp[0], tp[1], tp[2]};
        String [] titleCategory = {"книги", "журналы", "ежегодники"};

        if(c.contains("все")) {
            if (d.contains("-")) {
                String[] array = d.split("-");
                int a1 = Integer.parseInt(array[0]);
                int a2 = Integer.parseInt(array[1]);

                for (int i = 0; i < tp[0].published.length; i++) {
                    int b1 = Integer.parseInt(tp[0].published[i]);
                    if (a1 <= b1 & b1 <= a2) {
                        tp[0].getInfo(i);
                    } else {
                        indexB++;
                    }
                }
                for (int i = 0; i < tp[1].published.length; i++) {
                    String[] p = tp[1].published[i].split(",");
                    int b1 = Integer.parseInt(p[1]);

                    if (a1 <= b1 & b1 <= a2) {
                        tp[1].getInfo(i);
                    } else {
                        indexJ++;
                    }
                }
                for (int i = 0; i < tp[2].published.length; i++) {
                    int b1 = Integer.parseInt(tp[2].published[i]);
                    if (a1 <= b1 & b1 <= a2) {
                        tp[2].getInfo(i);
                    } else {
                        indexY++;
                    }
                }
            } else {
                for (int i = 0; i < tp[0].published.length; i++) {
                    if (tp[0].published[i].contains(d)) {
                        tp[0].getInfo(i);
                    } else {
                        indexB++;
                    }
                }
                for (int i = 0; i < tp[1].published.length; i++) {
                    if (tp[1].published[i].contains(d)) {
                        tp[1].getInfo(i);
                    } else {
                        indexJ++;
                    }
                }
                for (int i = 0; i < tp[2].published.length; i++) {
                    if (tp[2].published[i].contains(d)) {
                        tp[2].getInfo(i);
                    } else {
                        indexY++;
                    }
                }
            }
            if (indexB == tp[0].published.length & indexJ == tp[1].published.length & indexY == tp[2].published.length) {
                System.out.println("к сожалению, мы ничего не смогли найти:(");
            }
        }else{
            for(int i = 0; i < 3; i++) {
                if(titleCategory[i].contains(c)) {
                    for (int k = 0; k < type[i].published.length; k++) {
                        type[i].getInfo(k);
                    }
                    break;
                }
            }
            System.out.println("к сожалению, мы ничего не смогли найти:(");
        }
    }
}
