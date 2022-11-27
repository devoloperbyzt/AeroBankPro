public class Money {
    private double MainMoney;
    private double Limit;
    private String currency;

    public double getMainMoney() {
        return MainMoney;
    }

    public void setMainMoney(double mainMoney) {
        MainMoney = mainMoney;
    }

    public double getLimit() {
        return Limit;
    }

    public void setLimit(double limit) {
        Limit = limit;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double withdraw(double WithdrawMoney)
    {
        if (this.Limit>WithdrawMoney) {
            this.MainMoney = this.MainMoney - WithdrawMoney;
            this.Limit = this.Limit - WithdrawMoney;

        }
        else
            System.out.println("para cekme islemi limiti asıyor. Pare çekme limiti: "+this.Limit);

        return this.MainMoney;
    }

    public double Deposit(double DepositMoney)
    {
        this.MainMoney= this.MainMoney + DepositMoney;
        return this.MainMoney;
    }

    public String CheckMainMoney()
    {
        return "Mal varligi: " + this.MainMoney + this.currency+"\nPara cekme limiti: "+this.Limit;
    }
}
