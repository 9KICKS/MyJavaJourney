package selfStudy;

public class IKEDC_Bill {
    private final String userName;
    private final String accountNumber;
    private final String meterNumber;
    private final String tariffCode;
    private final double meterDials;

    public IKEDC_Bill(String userName, String accountNumber, String meterNumber, String tariffCode, double meterDials) {
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.meterNumber = meterNumber;
        this.tariffCode = tariffCode;
        this.meterDials = meterDials;
    }

    public String getUserName() {
        return userName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getMeterNumber() {
        return meterNumber;
    }

    public String getTariffCode() {
        return tariffCode;
    }

    public double getMeterDials() {
        return meterDials;
    }
}
