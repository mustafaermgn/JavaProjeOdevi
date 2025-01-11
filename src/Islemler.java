public class Islemler {
    private final double sabitMaas = 17000;

    public class TazminatIslemleri{
        double TazminatBelirle(double yil,double maas){
            double tazminat = maas*2*yil;
            return tazminat;
        }
    }

    public class MaasIslemleri{
        double MaasBelirle(String meslek){
            if (meslek.equals("Öğretmen")){
                return (sabitMaas*2);

            } else if (meslek.equals("Güvenlik")) {
                return (sabitMaas*1.5);
            }
            else{
                return (sabitMaas);
            }
        }

        double MaasBelirle(String meslek , int mesaiSaati){
            if (meslek.equals("Öğretmen")){
                return (sabitMaas*2+(300*mesaiSaati));

            } else if (meslek.equals("Güvenlik")) {
                return (sabitMaas*1.5+(250*mesaiSaati));
            }
            else{
                return (sabitMaas+(150*mesaiSaati));
            }
        }
    }
}