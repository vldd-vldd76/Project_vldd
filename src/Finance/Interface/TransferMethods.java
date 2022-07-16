package Finance.Interface;

public interface TransferMethods {
    void setDataTransfer(double commissionPercent, double commissionUah);
    double transfer (double amount);
}
