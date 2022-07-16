package Finance.Interface;

public interface ExchangeMethods {
    void setDataExchange(double limit, double commission);
    void setAnExchangeRate(String [] currency, double [] buyCurrency, double [] sellCurrency);
    String [] getTitleCurrencies();
    String getTitleCurrencies(int index);
    double changeFromUah(double amount, String buyCurrency);
    double changeToUah(double amount, String sellCurrency);
}
