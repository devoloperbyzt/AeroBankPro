public class BusinessAccount extends Account{
    private String BusinessName;
    private String BusinessAddress;
    private String FaxNo;
    private String RelatedPerson;

    public String getBusinessAddress() {
        return BusinessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        BusinessAddress = businessAddress;
    }

    public String getFaxNo() {
        return FaxNo;
    }

    public void setFaxNo(String faxNo) {
        if (faxNo.length()==11)
            FaxNo = faxNo;
        else
            System.out.println("Lutfen gecerli bir fax numarasi giriniz...");
    }

    public String getBusinessName() {
        return BusinessName;
    }

    public void setBusinessName(String businessName) {
        BusinessName = businessName;
    }

    public String getRelatedPerson() {
        return RelatedPerson;
    }

    public void setRelatedPerson(String relatedPerson) {
        RelatedPerson = relatedPerson;
    }

    public String CheckBusinessInfo()
    {
        return "isletme adi: "+this.BusinessName+"\nisletme adresi: "+this.BusinessAddress+"\nFax no: "+this.FaxNo+"\n ilgili kisi: "+this.RelatedPerson;
    }

}
