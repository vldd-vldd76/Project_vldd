package Finance.Interface;

public abstract class BaseMethods {
    public abstract void setData(String title, String address, String year);
    public String [] getTitleCurrencies(){
        return new String[0];
    }
    public String getTitleCurrencies(int index){
        String [] titleCurrencies = new String[0];
        return titleCurrencies[index];
    }
    public double changeFromUah(double amount, String buyCurrency){return 0;}// основний метод
    public double changeToUah(double amount, String sellCurrency){return 0;}// основний метод
    public double credit(double amount){return 0;}// основний метод
    public double investment (double amount){return 0;}// основний метод
    public double transfer (double amount){return 0;}// основний метод
    public abstract void getInfo();

}
