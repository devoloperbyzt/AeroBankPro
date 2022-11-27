public class Account extends Money {
    private String AccountID;
    private String AccountName;
    private String AccountPassword;
    private String IBAN;
    private String PhoneNo;

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        if (phoneNo.length()==11)
            PhoneNo = phoneNo;
        else
            System.out.println("Lutfen gecerli bir telefon numarası giriniz...");
    }

    public String getAccountID() {
        return AccountID;
    }

    public void setAccountID(String accountID) {
        AccountID = accountID;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public String getAccountPassword() {
        return AccountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        if (accountPassword.length()>8)
            AccountPassword = accountPassword;
        else
            System.out.println("Lutfen guvenliğiniz için 8 haneden fazla bir sifre giriniz....");
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String CheckAccountInfo()
    {
        return "hesap Id: "+this.AccountID+"\nhesap adi: "+this.AccountName+"\nIBAN: "+this.IBAN+"\nparola: "+this.AccountPassword+"\nTel no: "+this.PhoneNo;
    }
}
