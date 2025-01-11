import java.util.ArrayList;
import java.util.Scanner;

public class PersonelIslemleri {
    static Scanner scan = new Scanner(System.in);
    private static  ArrayList <String> ogretmenList=new ArrayList();
    private static ArrayList <String> guvenlikList=new ArrayList();
    private static ArrayList <String> personelList=new ArrayList();

    private static ArrayList <Integer> ogretmenYasList=new ArrayList();
    private static ArrayList <Integer> guvenlikYasList=new ArrayList();
    private static ArrayList <Integer> personelYasList=new ArrayList();

    private static ArrayList <String> ogretmenBransList=new ArrayList();
    private static ArrayList <Double> ogretmenMaasList = new ArrayList();
    private static ArrayList <Double> guvenlikMaasList = new ArrayList();
    private static ArrayList <Double> personelMaasList = new ArrayList();


    public static void ogretmenGoruntuleme(){
        if (ogretmenList.isEmpty()){
            System.out.println("Şu anda hiçbir öğretmen yok.");
        }
        else {
            System.out.println("\n---- ÖĞRETMEN LİSTESİ ----");
            for (int i = 0; i < ogretmenList.size(); i++) {
                System.out.println("\n" + (i + 1) + ". " + ogretmenList.get(i) + "\nYaş :" + ogretmenYasList.get(i) + "\nBranş :" + ogretmenBransList.get(i) + "\nMaaş :" + ogretmenMaasList.get(i));
            }
        }
    }

    public static void guvenlikGoruntuleme(){
        if (guvenlikList.isEmpty()){
            System.out.println("Şu anda hiçbir güvenlik yok.");
        }
        else {
            System.out.println("\n---- GÜVENLİK LİSTESİ ----");
            for (int i = 0; i<guvenlikList.size();i++){
                System.out.println("\n"+(i+1)+". "+guvenlikList.get(i)+"\nYaş :"+guvenlikYasList.get(i)+"\nMaaş :"+guvenlikMaasList.get(i));
            }
        }
    }

    public static void personelGoruntuleme(){
        if (personelList.isEmpty()){
            System.out.println("Şu anda hiçbir personel yok.");
        }
        else {
            System.out.println("\n---- PERSONEL LİSTESİ ----");
            for (int i = 0; i<personelList.size();i++){
                System.out.println("\n"+(i+1)+". "+personelList.get(i)+"\nYaş :"+personelYasList.get(i)+"\nMaaş :"+personelMaasList.get(i));
            }
        }
    }

    public static void ogretmenEkleme(String kisi,int yas,String brans ,Double maas){
        ogretmenList.add(kisi);
        ogretmenYasList.add(yas);
        ogretmenBransList.add(brans);
        ogretmenMaasList.add(maas);
    }
    public static void guvenlikEkleme(String kisi,int yas , Double maas){
        guvenlikList.add(kisi);
        guvenlikYasList.add(yas);
        guvenlikMaasList.add(maas);
    }
    public static void personelEkleme(String kisi,int yas , Double maas){
        personelList.add(kisi);
        personelYasList.add(yas);
        personelMaasList.add(maas);
    }

    public static void ogretmenCikarma(){
        ogretmenGoruntuleme();
        System.out.print("\nLütfen Çıkarmak İstediğiniz Kişiyi Seçin :");
        int indexNo = scan.nextInt();

        System.out.println(ogretmenList.get(indexNo-1)+" adlı öğretmen işten çıkartıldı.");
        ogretmenList.remove(indexNo-1);
        ogretmenYasList.remove(indexNo-1);
        ogretmenBransList.remove(indexNo-1);
    }

    public static void guvenlikCikarma(){
        guvenlikGoruntuleme();
        System.out.print("Lütfen Çıkarmak İstediğiniz Kişiyi Seçin :");
        int indexNo = scan.nextInt();

        System.out.println(guvenlikList.get(indexNo-1)+" adlı güvenlik işten çıkartıldı.");
        guvenlikList.remove(indexNo-1);
        guvenlikYasList.remove(indexNo-1);
    }

    public static void personelCikarma(){
        personelGoruntuleme();
        System.out.print("Lütfen Çıkarmak İstediğiniz Kişiyi Seçin :");
        int indexNo = scan.nextInt();

        System.out.println(personelList.get(indexNo-1)+" adlı personel işten çıkartıldı.");
        personelList.remove(indexNo-1);
        personelYasList.remove(indexNo-1);
    }
}