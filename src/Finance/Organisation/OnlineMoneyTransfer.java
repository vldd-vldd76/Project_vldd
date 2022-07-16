package Finance.Organisation;

import Finance.Interface.BaseMethods;
import Finance.Interface.TransferMethods;

public class OnlineMoneyTransfer extends BaseMethods implements TransferMethods {
    String title;
    String address;

    double commissionPercentTransfer;//% + ua
    double commissionUahTransfer;

    @Override
    public void setData(String title, String address, String year) {
        this.title = title;
        this.address = address;
    }

    @Override
    public void setDataTransfer(double commissionPercent, double commissionUah) {
        this.commissionPercentTransfer = commissionPercent;
        this.commissionUahTransfer = commissionUah;
    }

    @Override
    public double transfer (double amount){
        double result = 0;
        double commission = amount * commissionPercentTransfer + commissionUahTransfer;
        result = amount - commission;
        return result;
    }

    @Override
    public void getInfo() {
        System.out.println(title);
        System.out.println(address);
        System.out.println("Пересилання: ");
        System.out.println("комісія: " + commissionPercentTransfer + " + " + commissionUahTransfer);
    }
}
