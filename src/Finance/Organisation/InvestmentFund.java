package Finance.Organisation;

import Finance.Interface.BaseMethods;
import Finance.Interface.InvestmentMethods;

public class InvestmentFund extends BaseMethods implements InvestmentMethods {
    String title;
    String address;
    String year;

    double percentInvestment;
    double periodInvestment;
    @Override
    public void setData(String title, String address, String year) {
        this.title = title;
        this.address = address;
        this.year = year;
    }
    @Override
    public void setDataInvestment(double percent, double period) {
        this.percentInvestment = percent;
        this.periodInvestment = period;
    }
    @Override
    public double investment(double period){
        double result = 0;
        if(period < periodInvestment) {
            result = 1 / percentInvestment;
        }
        return result;
    }
    @Override
    public void getInfo() {
        System.out.println(title);
        System.out.println(address);
        System.out.println(year);
        System.out.println("Інвестиції: ");
        System.out.println("термін: " + periodInvestment + "депозит: " + percentInvestment);
    }
}
