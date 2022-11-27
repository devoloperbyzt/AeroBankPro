public class PersonAccount extends Account{
private String TCno;
private String Name;
private String Surname;
private String Age;

    public String getTCno() {
        return TCno;
    }

    public void setTCno(String TCno) {
        if (TCno.length()==11)
            this.TCno = TCno;
        else
            System.out.println("Lütfen geçerli bir TC No giriniz.");
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String CheckPersonalInfo()
    {
        return "Ad Soyad: "+this.Name+" "+this.Surname+"\nTC no: "+this.TCno+"\nYas: "+this.Age;
    }
}
