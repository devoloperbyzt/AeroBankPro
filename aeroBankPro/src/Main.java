import java.util.Scanner;

public class Main {

   //region color codes
  public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
  public static final String RED_BOLD = "\033[1;31m";    // RED
  public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
  public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
  public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
  public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
  public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
  public static final String WHITE_BOLD = "\033[1;37m";  // WHITE
 //endregion

   public static void main(String[] args) {

     //region account adding

     //Personal Account adding
     PersonAccount MyPersonalAccount =new PersonAccount();
     MyPersonalAccount.setName("Ahmet Beyazıt");
     MyPersonalAccount.setSurname("Süleymanoğlu");
     MyPersonalAccount.setAge("14");
     MyPersonalAccount.setTCno("22448578225");
     MyPersonalAccount.setAccountName("TR Personal account");
     MyPersonalAccount.setAccountID("53");
     MyPersonalAccount.setCurrency("TL");
     MyPersonalAccount.setLimit(4500);
     MyPersonalAccount.setAccountPassword("B<Yz|TA!)tPersonal");//Strong password
     MyPersonalAccount.setIBAN("TR15454251515511");
     MyPersonalAccount.setPhoneNo("05112555570");
     MyPersonalAccount.setMainMoney(99999);

     //Business account adding
     BusinessAccount MyBusinessAccount =new BusinessAccount();
     MyBusinessAccount.setBusinessName("Beyazit oto");
     MyBusinessAccount.setBusinessAddress("Ataşehit TR istanbul");
     MyBusinessAccount.setFaxNo("02161541234");
     MyBusinessAccount.setRelatedPerson("Ahmet Beyazıt");
     MyBusinessAccount.setAccountName("TR business account");
     MyBusinessAccount.setAccountID("53");
     MyBusinessAccount.setCurrency("TL");
     MyBusinessAccount.setLimit(4500);
     MyBusinessAccount.setAccountPassword("B<Yz|TA!)tBusiness");//Strong password
     MyBusinessAccount.setIBAN("TR15454251515511");
     MyBusinessAccount.setPhoneNo("05112555570");
     MyBusinessAccount.setMainMoney(99999);
     //endregion

     //region valuables and welcome message
     Scanner scanner =new Scanner(System.in);
     String Input;
     System.out.println(CYAN_BOLD+"Aero bank pro... hosgeldiniz!");
     //endregion

     //region Main code
     while(true)
     {
      //region Input control
      System.out.println(GREEN_BOLD+"\nMevcut hesaba giris icin:1\nHesap acmak icin:2\ncikmak icin:3'u tuslayiniz.");
      Input =scanner.nextLine();
      //endregion

      // region Login account
      if (Input.equals("1"))
      {
       //region Input
       System.out.println("Isletme hesabi icin:1\nBireysel hesap icin:2\nGeri donmek icin 3'u tuslayiniz.");
       Input =scanner.nextLine();
       //endregion

       // region Business account login
       if (Input.equals("1"))
       {
        System.out.println(YELLOW_BOLD+"Lutfen hesap sifresini giriniz.");
        Input =scanner.nextLine();
        // region money function
        if (Input.equals(MyBusinessAccount.getAccountPassword())) //while password is true
        {
         while(true)
         {
             System.out.println(GREEN_BOLD+"Para cek:1\npara yatir:2\nbakiye sorgula:3\nhesap bilgileri:4\nisletme bilgileri:5\nCikis:6");
             Input=scanner.nextLine();
             if (Input.equals("1"))
             {
                 System.out.println(YELLOW_BOLD+"Para cekilecek miktari giriniz.");
                 double GetMoney=scanner.nextDouble();
                 if (MyBusinessAccount.getLimit()>GetMoney)
                 {
                     System.out.println(GREEN_BOLD+"Paraniz hazirlaniyor...\n"+GetMoney+MyBusinessAccount.getCurrency()+" Cekildi.\nYeni bakiyeniz :"+MyBusinessAccount.withdraw(GetMoney)+"\n");
                     scanner.nextLine();
                     continue;
                 }

                 else
                     System.out.println("para cekme islemi limiti asıyor. Pare çekme limiti: "+MyBusinessAccount.getLimit());
             }
             else if (Input.equals("2"))
             {
                 System.out.println(YELLOW_BOLD+"Para yatirilicek miktari giriniz.");
                 double SetMoney=scanner.nextDouble();
                 System.out.println(GREEN_BOLD+"Paraniz yatiriliyor...\n"+SetMoney+MyBusinessAccount.getCurrency()+" yatirildi.\nYeni bakiyeniz :"+MyBusinessAccount.Deposit(SetMoney)+"\n");
             }
             else if (Input.equals("3"))
             {
                 System.out.println(MyBusinessAccount.CheckMainMoney()+"\n");
                 continue;
             }
             else if (Input.equals("4")) {
                 System.out.println(MyBusinessAccount.CheckAccountInfo()+"\n");
                 continue;
             }
             else if (Input.equals("5")) {
                 System.out.println(MyBusinessAccount.CheckBusinessInfo()+"\n");
                 continue;
             }
             else if (Input.equals("6"))
                 break;
             else
                 System.out.println("Lütfen geçerli bir veri giriniz...");
         }
        }
        //endregion
        else
         System.out.println(RED_BOLD+"Sifre yanlis");
       }
       //endregion

       // region Personal account login
       else if (Input.equals("2"))
       {
        System.out.println(YELLOW_BOLD+"Lutfen hesap sifresini giriniz.");
        Input =scanner.nextLine();
        //region account function
        if (Input.equals(MyPersonalAccount.getAccountPassword()))//password is true
        {
            while(true)
            {
                System.out.println(GREEN_BOLD+"Para cek:1\npara yatir:2\nbakiye sorgula:3\nhesap bilgileri:4\nkisisel bilgiler:5\nCikis:6");
                Input=scanner.nextLine();
                if (Input.equals("1"))
                {
                    System.out.println(YELLOW_BOLD+"Para cekilecek miktari giriniz.");
                    double GetMoney=scanner.nextDouble();
                        if (MyPersonalAccount.getLimit()>GetMoney)
                        {
                            System.out.println(GREEN_BOLD+"Paraniz hazirlaniyor...\n"+GetMoney+MyPersonalAccount.getCurrency()+" Cekildi.\nYeni bakiyeniz :"+MyPersonalAccount.withdraw(GetMoney)+"\n");
                            scanner.nextLine();
                            continue;
                        }
                        else
                            System.out.println("para cekme islemi limiti asıyor. Pare çekme limiti: "+MyPersonalAccount.getLimit());
                }
                else if (Input.equals("2"))
                {
                    System.out.println(YELLOW_BOLD+"Para yatirilicek miktari giriniz.");
                    double SetMoney=scanner.nextDouble();
                    System.out.println(GREEN_BOLD+"Paraniz yatiriliyor...\n"+SetMoney+MyPersonalAccount.getCurrency()+" yatirildi.\nYeni bakiyeniz :"+MyPersonalAccount.Deposit(SetMoney)+"\n");
                }
                else if (Input.equals("3"))
                {
                    System.out.println(MyPersonalAccount.CheckMainMoney()+"\n");
                    continue;
                }
                else if (Input.equals("4")) {
                    System.out.println(MyPersonalAccount.CheckAccountInfo()+"\n");
                    continue;
                }
                else if (Input.equals("5")) {
                    System.out.println(MyPersonalAccount.CheckPersonalInfo()+"\n");
                    continue;
                }
                else if (Input.equals("6"))
                    break;
                else
                    System.out.println("Lutfen gecerli bir veri giriniz...");
                }
        }
        //endregion
        else
         System.out.println(RED_BOLD+"Sifre yanlis");
       }
       //endregion

       //region go back
       else if (Input.equals("3"))
        continue;
       else
        System.out.println("Lutfen gecerli bir veri giriniz...\n");
       //endregion

      }
      //endregion

      //region Create a new account
      else if (Input.equals("2"))
      {
          System.out.println("\nKisisel hesap:1\nisletme hesapi:2\niptal:3");
          Input=scanner.nextLine();
          if (Input.equals("1"))
          {
              //region Input
             PersonAccount CreateAccount =new PersonAccount();
              System.out.println(YELLOW_BOLD+"isminiz?");
              CreateAccount.setName(scanner.nextLine());
              System.out.println("Soyadiniz?");
              CreateAccount.setSurname(scanner.nextLine());
              System.out.println("yasiniz?");
              CreateAccount.setAge(scanner.nextLine());
              while(CreateAccount.getTCno()==null)
              {
                  System.out.println("TC no?");
                  CreateAccount.setTCno(scanner.nextLine());
              }
              System.out.println("Hesap ismi?");
              CreateAccount.setAccountName(scanner.nextLine());
              System.out.println("Hesap ID?");
              CreateAccount.setAccountID(scanner.nextLine());
              System.out.println("Para birimi?");
              CreateAccount.setCurrency(scanner.nextLine());
              while(CreateAccount.getAccountPassword()==null)
              {
                  System.out.println("Hesap sifresi?");
                  CreateAccount.setAccountPassword(scanner.nextLine());
              }
              while(CreateAccount.getIBAN()==null)
              {
                  System.out.println("IBAN?");
                  CreateAccount.setIBAN(scanner.nextLine());
              }
              while(CreateAccount.getPhoneNo()==null)
              {
                  System.out.println("tel no?");
                  CreateAccount.setPhoneNo(scanner.nextLine());
              }
              System.out.println("Paraniz?");
              CreateAccount.setMainMoney(scanner.nextDouble());
              System.out.println("Para cekme limiti?");
              CreateAccount.setLimit(scanner.nextDouble());
              System.out.println("Hesapiniz olustuldu...");
              //endregion

              //region function
              Input=scanner.nextLine();
              System.out.println(YELLOW_BOLD+"Lutfen hesap sifresini giriniz.");
              Input =scanner.nextLine();
              //region account function
              if (Input.equals(CreateAccount.getAccountPassword()))//password is true
              {
                  while(true)
                  {
                      System.out.println(GREEN_BOLD+"Para cek:1\npara yatir:2\nbakiye sorgula:3\nhesap bilgileri:4\nkisisel bilgiler:5\nCikis:6");
                      Input=scanner.nextLine();
                      if (Input.equals("1"))
                      {
                          System.out.println(YELLOW_BOLD+"Para cekilecek miktari giriniz.");
                          double GetMoney=scanner.nextDouble();
                          if (CreateAccount.getLimit()>GetMoney)
                          {
                              System.out.println(GREEN_BOLD+"Paraniz hazirlaniyor...\n"+GetMoney+CreateAccount.getCurrency()+" Cekildi.\nYeni bakiyeniz :"+CreateAccount.withdraw(GetMoney)+"\n");
                              scanner.nextLine();
                              continue;
                          }
                          else
                              System.out.println("para cekme islemi limiti asıyor. Pare çekme limiti: "+CreateAccount.getLimit());
                      }
                      else if (Input.equals("2"))
                      {
                          System.out.println(YELLOW_BOLD+"Para yatirilicek miktari giriniz.");
                          double SetMoney=scanner.nextDouble();
                          System.out.println(GREEN_BOLD+"Paraniz yatiriliyor...\n"+SetMoney+CreateAccount.getCurrency()+" yatirildi.\nYeni bakiyeniz :"+CreateAccount.Deposit(SetMoney)+"\n");
                      }
                      else if (Input.equals("3"))
                      {
                          System.out.println(CreateAccount.CheckMainMoney()+"\n");
                          continue;
                      }
                      else if (Input.equals("4")) {
                          System.out.println(CreateAccount.CheckAccountInfo()+"\n");
                          continue;
                      }
                      else if (Input.equals("5")) {
                          System.out.println(CreateAccount.CheckPersonalInfo()+"\n");
                          continue;
                      }
                      else if (Input.equals("6"))
                          break;
                      else
                          System.out.println("Lütfen geçerli bir veri giriniz...");
                  }
              }
              //endregion
              else
                  System.out.println(RED_BOLD+"Sifre yanlis");
              //endregion
          }
          else if (Input.equals("2"))
          {
              //region Input
              BusinessAccount CreateBusinessAccount =new BusinessAccount();
              System.out.println(YELLOW_BOLD+"isletme ismi?");
              CreateBusinessAccount.setBusinessName(scanner.nextLine());
              System.out.println("isletme adresi?");
              CreateBusinessAccount.setBusinessAddress(scanner.nextLine());
              while(CreateBusinessAccount.getFaxNo()==null) {
                  System.out.println("isletme Fax no?");
                  CreateBusinessAccount.setFaxNo(scanner.nextLine());
              }
              System.out.println("isletme sahibi?");
              CreateBusinessAccount.setRelatedPerson(scanner.nextLine());
              System.out.println("isletme hesap ismi?");
              CreateBusinessAccount.setAccountName(scanner.nextLine());
              System.out.println("isletme hesap ID?");
              CreateBusinessAccount.setAccountID(scanner.nextLine());
              System.out.println("isletme Hesapi para birimi?");
              CreateBusinessAccount.setCurrency(scanner.nextLine());
              while(CreateBusinessAccount.getAccountPassword()==null) {
                  System.out.println("isletme Hesapi sifresi?");
                  CreateBusinessAccount.setAccountPassword(scanner.nextLine());//Strong password
              }
              System.out.println("isletme Hesapi IBAN?");
              CreateBusinessAccount.setIBAN(scanner.nextLine());
              while(CreateBusinessAccount.getPhoneNo()==null) {
                  System.out.println("isletme Tel NO?");
                  CreateBusinessAccount.setPhoneNo(scanner.nextLine());
              }
              System.out.println("isletme Parasi?");
              CreateBusinessAccount.setMainMoney(scanner.nextDouble());
              System.out.println("isletme Hesapi para cekme limiti?");
              CreateBusinessAccount.setLimit(scanner.nextDouble());
              //endregion

              //region function
              Input=scanner.nextLine();
              System.out.println(YELLOW_BOLD+"Lutfen hesap sifresini giriniz.");
              Input =scanner.nextLine();
              //region account function
              if (Input.equals(CreateBusinessAccount.getAccountPassword()))//password is true
              {
                  while(true)
                  {
                      System.out.println(GREEN_BOLD+"Para cek:1\npara yatir:2\nbakiye sorgula:3\nhesap bilgileri:4\nisletme bilgileri:5\nCikis:6");
                      Input=scanner.nextLine();
                      if (Input.equals("1"))
                      {
                          System.out.println(YELLOW_BOLD+"Para cekilecek miktari giriniz.");
                          double GetMoney=scanner.nextDouble();
                          if (CreateBusinessAccount.getLimit()>GetMoney)
                          {
                              System.out.println(GREEN_BOLD+"Paraniz hazirlaniyor...\n"+GetMoney+CreateBusinessAccount.getCurrency()+" Cekildi.\nYeni bakiyeniz :"+CreateBusinessAccount.withdraw(GetMoney)+"\n");
                              scanner.nextLine();
                              continue;
                          }
                          else
                              System.out.println("para cekme islemi limiti asıyor. Pare çekme limiti: "+CreateBusinessAccount.getLimit());
                      }
                      else if (Input.equals("2"))
                      {
                          System.out.println(YELLOW_BOLD+"Para yatirilicek miktari giriniz.");
                          double SetMoney=scanner.nextDouble();
                          System.out.println(GREEN_BOLD+"Paraniz yatiriliyor...\n"+SetMoney+CreateBusinessAccount.getCurrency()+" yatirildi.\nYeni bakiyeniz :"+CreateBusinessAccount.Deposit(SetMoney)+"\n");
                      }
                      else if (Input.equals("3"))
                      {
                          System.out.println(CreateBusinessAccount.CheckMainMoney()+"\n");
                          continue;
                      }
                      else if (Input.equals("4")) {
                          System.out.println(CreateBusinessAccount.CheckAccountInfo()+"\n");
                          continue;
                      }
                      else if (Input.equals("5")) {
                          System.out.println(CreateBusinessAccount.CheckBusinessInfo()+"\n");
                          continue;
                      }
                      else if (Input.equals("6"))
                          break;
                      else
                          System.out.println("Lutfen gecerli bir veri giriniz...");
                  }
              }
              //endregion
              else
                  System.out.println(RED_BOLD+"Sifre yanlis");
              //endregion
          }
          else if (Input.equals("3"))
              continue;
          else
              System.out.println("Lutfen geçerli veri giriniz.");
      }
      //endregion

      //region exit
      else if (Input.equals("3"))
      {
       System.out.println(WHITE_BOLD+"Gorusmek uzere.");
        System.exit(0);
        break;
      }
      //endregion

      //region Invalid data
      else
       System.out.println("Lutfen gecerli bir veri giriniz...\n");
      //endregion
     }

     //endregion

    }
}