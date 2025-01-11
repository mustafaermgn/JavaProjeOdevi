import java.util.ArrayList;

public class YonetimIslemleri {
    private static ArrayList <String> mudurList = new ArrayList();
    private static ArrayList <String> mudurYrdList = new ArrayList();

    private static ArrayList <Integer> mudurYasList = new ArrayList();
    private static ArrayList <Integer> mudurYrdYasList = new ArrayList();

    public static void mudurEkleme(String kisi,int yas){
        mudurList.add(kisi);
        mudurYasList.add(yas);
    }

    public static void mudurYrdEkleme(String kisi , int yas){
        mudurYrdList.add(kisi);
        mudurYrdYasList.add(yas);
    }
    public static void mudurGoruntuleme(){
        int i=1;
        System.out.println("\n---- Müdür ----");
        for (String mdr:mudurList) {
            System.out.println(mdr+"\nYaş :"+mudurYasList.get(i-1));
            i++;
        }
    }

    public static void mudurYrdGoruntuleme(){
        int i=1;
        System.out.println("\n---- Müdür Yardımcısı ----");
        for (String mdrYrd:mudurYrdList) {
            System.out.println(mdrYrd+"\nYaş :"+mudurYrdYasList.get(i-1));
            i++;
        }
    }
}