package company;

public class SearchActivity implements BaseMethods {

    private int a1 = 0;
    private int a2 = 0;
    String category = " ";
    String date;
    TopClass [] tp;

    public void toSearchPeriod(String date, String category, TopClass[] tp) {
        String[] array = date.split("-");
        a1 = Integer.parseInt(array[0]);
        a2 = Integer.parseInt(array[1]);
        this.category = category;
        this.date = date;
        this.tp = tp;

        if(category.contains("Все")) {

            toSearchAll();

        } else {

            toSearchCategory();

        }
    }

    public void toSearchYear(String date, String category, TopClass[] tp) {
        this.category = category;
        this.date = date;
        this.tp = tp;

        if (category.contains("Все")) {

            toSearchAll();

        } else {

            toSearchCategory();

        }
    }
    public void toSearchAll() {

        for (TopClass topClass : tp) {
            toSearchAndGetInfo(topClass);
        }

    }

    public void toSearchCategory() {

        for (TopClass topClass : tp) {
            if (topClass.type.contains(category)) {
                toSearchAndGetInfo(topClass);
                break;
            }
        }
    }

    public void toSearchAndGetInfo(TopClass topClass) {

        for (int k = 0; k < topClass.published.length; k++) {
            int b1 = 0;
            if (topClass.published[k].contains(",")) {
                String[] p = topClass.published[k].split(",");
                b1 = Integer.parseInt(p[1]);// twice instance of array is a year
            }else{
                b1 = Integer.parseInt(topClass.published[k]);
            }

            if(date.contains("-")) {
                if (a1 <= b1 & b1 <= a2) {
                    topClass.getInfo(k);
                } else {
                    topClass.index++;
                }
            }else{
                if(topClass.published[k].contains(date)) {
                    topClass.getInfo(k);
                }else{
                    topClass.index++;
                }
            }

        }

    }

    public void checkError() {
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
