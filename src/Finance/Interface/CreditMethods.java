package Finance.Interface;

public interface CreditMethods {
    void setDataCredit(double limit, double commission);

    double credit(double amount);
}
