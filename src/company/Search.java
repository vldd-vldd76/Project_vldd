package company;

public class Search {

    void toSearch(String d, String c, TopClass [] tp) {
        int index = 0;

        if (d.contains("-")) {
            String[] array = d.split("-");
            int a1 = Integer.parseInt(array[0]);
            int a2 = Integer.parseInt(array[1]);

            if(c.contains("Все")) {
                for (TopClass topClass : tp) {
                    for (int k = 0; k < topClass.published.length; k++) {
                        int b1;
                        if (topClass.published[k].contains(",")) {
                            String[] p = topClass.published[k].split(",");
                            b1 = Integer.parseInt(p[1]);// twice instance of array is a year
                        } else {
                            b1 = Integer.parseInt(topClass.published[k]);
                        }
                        if (a1 <= b1 & b1 <= a2) {
                            topClass.getInfo(k);
                        } else {
                            index++;
                        }
                    }
                }
                /*

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

               */
            } else {
                for (TopClass topClass : tp) {
                    if (topClass.type.contains(c)) {
                        for (int k = 0; k < topClass.published.length; k++) {
                            int b1;
                            if (topClass.published[k].contains(",")) {
                                String[] p = topClass.published[k].split(",");
                                b1 = Integer.parseInt(p[1]);// twice instance of array is a year
                            } else {
                                b1 = Integer.parseInt(topClass.published[k]);
                            }
                            if (a1 <= b1 & b1 <= a2) {
                                topClass.getInfo(k);
                            } else {
                                index++;
                            }
                        }
                        break;
                    }
                }
                /*
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
                 */
            }
        }else {
            if (c.contains("Все")) {

                for (TopClass topClass : tp) {
                    for (int k = 0; k < topClass.published.length; k++) {
                        if(topClass.published[k].contains(d)) {
                            topClass.getInfo(k);
                        }else{
                            index++;
                        }
                    }
                }
            } else {
                for (TopClass topClass : tp) {
                    if (topClass.type.contains(c)) {
                        for (int k = 0; k < topClass.published.length; k++) {
                            if(topClass.published[k].contains(d)) {
                                topClass.getInfo(k);
                            }else{
                                index++;
                            }
                        }
                        break;
                    }
                }
            }
        }
        if (index == tp.length) {
            System.out.println("к сожалению, мы ничего не смогли найти:(");
        }
    }
}