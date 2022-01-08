package company;

public class Search {

    void toSearch(String date, String category, TopClass [] tp) {

        SearchActivity sAct = new SearchActivity();

        if (date.contains("-")) {

            sAct.toSearchPeriod(date, category, tp);

        }else {

            sAct.toSearchYear(date, category, tp);

        }
        sAct.checkError();
    }
}