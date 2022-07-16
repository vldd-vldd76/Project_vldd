package Finance.Organisation;

import Finance.Interface.BaseMethods;
import Finance.Interface.CreditMethods;

public class CreditUnion extends BaseMethods implements CreditMethods {
    String title;
    String address;

    double limitCredit;//ua
    double commissionCredit;//%
    @Override
    public void setData(String title, String address, String year) {
        this.title = title;
        this.address = address;
    }
    @Override
    public void setDataCredit(double limit, double commission) {
        this.limitCredit = limit;
        this.commissionCredit = commission;
    }
    @Override
    public double credit(double amount) {
        double result = 0;
        if(amount < limitCredit){
            result = amount * commissionCredit;
        }
        return result;
    }

    @Override
    public void getInfo() {
        System.out.println(title);
        System.out.println(address);
        System.out.println("Кредит: ");
        System.out.println("ліміт: " + limitCredit + "відсоток: " + commissionCredit);
    }
}
