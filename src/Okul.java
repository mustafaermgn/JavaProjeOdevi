import java.util.Scanner;

public class Okul{
    Yonetim mudur = new Yonetim("Süleyman","Çetiner",25,"Müdür");
    Yonetim mudurYrd = new Yonetim("Kerem","Türk",20,"Müdür Yardımcısı");

    Ogretmen ogr = new Ogretmen("Mustafa","Ermeğan",30, "Beden Eğitimi",2 , 5);
    Ogretmen ogr2 = new Ogretmen("Turgut Furkan","Canikli",27,"Fizik",4);

    Guvenlik guv = new Guvenlik("Abdullah","Çeçen",34,6);
    Guvenlik guv2 = new Guvenlik("Hasan","Bozkurt",24,5,10);

    Personel personel = new Personel("Mert","Demir",31,10);
    Personel personel1= new Personel("Muhammet","Çam",54,15,7);

    String newName, newSurname;
    int newAge;
    Scanner scan = new Scanner(System.in);


    public Okul(){
        System.out.println("Okul Sistemine Hoşgeldiniz.");
        AnaMenu();
    }

    void AnaMenu(){
        boolean dongu = true;
        while(dongu) {
            System.out.println("\n---- ANA MENÜ ----\n1.Yönetim İşlemleri\n2.Personel İşlemleri\n3.Çıkış");
            System.out.print("\nLütfen yapmak istediğiniz işlemi seçin :");
            try{
                Exception gecersiz = new Exception();
                int secim = scan.nextInt();
                if (secim<1 || secim>3){
                    throw new Exception(gecersiz);
                }
                switch (secim) {
                    case 1: {
                        YonetimIslemi();
                        break;
                    }
                    case 2: {
                        PersonelIslemi();
                        break;
                    }
                    case 3: {
                        System.out.println("Okul Sisteminden Çıkış Yapılıyor...");
                        dongu = false;
                        break;
                    }
                }
            } catch (Exception e) {
                scan.nextLine();
                System.out.println("Geçersiz karakter. Lütfen 1 ile 3 arasında bir rakam giriniz.");
            }

        }
    }

    void YonetimIslemi(){
        boolean dongu=true;

        while(dongu) {
            System.out.println("\n---- YÖNETİM MENÜSÜ ----\n1.Müdür Bilgileri\n2.Müdür Yardımcısı Bilgileri\n3.Çıkış");
            System.out.print("\nYapmak işlediğiniz işlemi seçin :");

            try{
                Exception gecersiz = new Exception();
                int secim = scan.nextInt();
                if (secim<1 || secim>3){
                    throw new Exception(gecersiz);
                }
                switch (secim) {
                    case 1:
                        YonetimIslemleri.mudurGoruntuleme();
                        break;
                    case 2:
                        YonetimIslemleri.mudurYrdGoruntuleme();
                        break;
                    case 3:
                        System.out.println("Ana Menüye Dönülüyor...");
                        dongu=false;
                        break;
                }
            } catch (Exception gecersiz) {
                scan.nextLine(); //end-line eklemek için kullanıldı.
                System.out.println("Geçersiz karakter. Lütfen 1 ile 3 arasında bir rakam giriniz.");
            }

        }
    }



    void PersonelIslemi(){
        boolean dongu=true;

        while(dongu) {
            System.out.println("\n---- PERSONEL MENÜSÜ ----\n1.Kişi Ekleme\n2.Kişi Çıkartma\n3.Kişi Listeleme\n4.Tazminatları Görüntüle\n5.Çıkış");
            System.out.print("\nYapmak istediğiniz işlemi seçin :");
            try{
                Exception gecersiz = new Exception();
                int secim = scan.nextInt();
                if (secim<1 || secim>5){
                    throw new Exception(gecersiz);
                }
                switch (secim) {
                    case 1: {
                        iseAlma();
                        break;
                    }
                    case 2: {
                        istenCikartma();
                        break;
                    }
                    case 3: {
                        listeleme();
                        break;
                    }
                    case 4:{
                        tazminatListesi();
                        break;
                    }
                    case 5: {
                        System.out.println("Ana Menüye Dönülüyor...");
                        dongu = false;
                    }
                }
            } catch (Exception gecersiz) {
                scan.nextLine();
                System.out.println("Geçersiz karakter. Lütfen 1 ile 5 arasında bir rakam giriniz.");
            }

        }
    }

    void iseAlma(){
        int secim = meslekSecim();

        kisiTanimla();
            switch (secim) {
                case 1:
                    String brans = bransTanimla();
                    Ogretmen newOgr = new Ogretmen(newName, newSurname, newAge, brans);
                    System.out.println("\n---- Eklenen Kişi Bilgileri ----");
                    newOgr.BilgileriYazdir();
                    break;
                case 2:
                    Guvenlik newGuv = new Guvenlik(newName, newSurname, newAge);
                    System.out.println("\n---- Eklenen Kişi Bilgileri ----");
                    newGuv.BilgileriYazdir();
                    break;
                case 3:
                    Personel newPer = new Personel(newName, newSurname, newAge);
                    System.out.println("\n---- Eklenen Kişi Bilgileri ----");
                    newPer.BilgileriYazdir();
                    break;
            }
    }

    void istenCikartma(){
        int secim = meslekSecim();

        switch (secim){
            case 1:
                PersonelIslemleri.ogretmenCikarma();
                break;
            case 2:
                PersonelIslemleri.guvenlikCikarma();
                break;
            case 3:
                PersonelIslemleri.personelCikarma();
                break;
        }
    }

    void listeleme(){
        int secim = meslekSecim();

        switch (secim){
            case 1:
                PersonelIslemleri.ogretmenGoruntuleme();
                break;
            case 2:
                PersonelIslemleri.guvenlikGoruntuleme();
                break;
            case 3:
                PersonelIslemleri.personelGoruntuleme();
                break;
        }
    }

    int meslekSecim(){
        Boolean dongu=true;
        int secim=0;
        while(dongu) {
            try{
                Exception gecersiz = new Exception();
                System.out.println("\n---- MESLEKLER ----\n1.Öğretmen\n2.Güvenlik\n3.Personel");
                System.out.print("\nLütfen mesleği seçiniz :");
                secim = scan.nextInt();
                if (secim<1 || secim>3){
                    throw new Exception(gecersiz);
                }
                else{
                    return secim;
                }
            } catch (Exception gecersiz) {
                scan.nextLine();
                System.out.println("Geçersiz karakter.Lütfen 1 ile 3 arasında bir rakam giriniz.");
            }

        }
        return secim;
    }

    void kisiTanimla(){
        Boolean dongu=true;
        while(dongu)
            try{
                Exception gecersiz = new Exception("Yaş 18'den küçük olamaz.Lütfen girdileri baştan giriniz.");
                System.out.print("\nEklemek istediğiniz kişinin ismini giriniz :");
                scan.nextLine();
                newName = scan.nextLine();
                System.out.print("Eklemek istediğiniz kişinin soyismini giriniz :");
                newSurname = scan.nextLine();
                System.out.print("Eklemek istediğiniz kişinin yaşını giriniz :");
                newAge = scan.nextInt();
                if (newAge<18){
                    throw new Exception(gecersiz);
                }
                dongu=false;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Geçersiz karakter.Lütfen girdileri baştan giriniz.");
            }catch (java.lang.Exception gecersiz){
                System.out.println(gecersiz.getMessage());
            }
        }

    String bransTanimla(){
        scan.nextLine();
        System.out.print("Lütfen eklemek istediğiniz kişinin branşını giriniz :");
        String brans =scan.nextLine();
        return brans;
    }

    void tazminatListesi(){
        int secim = meslekSecim();
        System.out.println("\n---- Tazminat Listesi ----");
        switch (secim){
            case 1:
                ogr.TazminatYazdir();
                ogr2.TazminatYazdir();
                break;
            case 2:
                guv.TazminatYazdir();
                guv2.TazminatYazdir();
                break;
            case 3:
                personel.TazminatYazdir();
                personel1.TazminatYazdir();
                break;
        }
    }
}