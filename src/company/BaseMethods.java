package company;

public interface BaseMethods {
    void toSearchPeriod(String date, String category, TopClass [] tp);
    void toSearchYear(String date, String category, TopClass [] tp);
    void toSearchAll();
    void toSearchCategory();
    void toSearchAndGetInfo(TopClass topClass);
    void checkError();
}
