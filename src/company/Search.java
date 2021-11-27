package company;

public class Search {

    void toSearch(String date, String category, TopClass [] tp) {
        if (date.contains("-")) {
            String[] array = date.split("-");
            int a1 = Integer.parseInt(array[0]);
            int a2 = Integer.parseInt(array[1]);

            if(category.contains("Все")) {
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
                            topClass.index++;
                        }
                    }
                }
            } else {
                for (TopClass topClass : tp) {
                    if (topClass.type.contains(category)) {
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
                                topClass.index++;
                            }
                        }
                        break;
                    }
                }
            }
        }else {
            if (category.contains("Все")) {

                for (TopClass topClass : tp) {
                    for (int k = 0; k < topClass.published.length; k++) {
                        if(topClass.published[k].contains(date)) {
                            topClass.getInfo(k);
                        }else{
                            topClass.index++;
                        }
                    }
                }
            } else {
                for (TopClass topClass : tp) {
                    if (topClass.type.contains(category)) {
                        for (int k = 0; k < topClass.published.length; k++) {
                            if(topClass.published[k].contains(date)) {
                                topClass.getInfo(k);
                            }else{
                                topClass.index++;
                            }
                        }
                        break;
                    }
                }
            }
        }
        int index2 = 0;
        for (TopClass topClass : tp) {
            if (topClass.index == topClass.published.length) {
                if(category.contains("Все")) {
                    index2++;
                }else{
                    System.out.println("к сожалению, мы ничего не смогли найти:(");
                }
            }
        }
        if(index2 == tp.length){
            System.out.println("к сожалению, мы ничего не смогли найти:(");
        }
    }
}