public class Yonetim extends Person{

    Yonetim(String name, String surname, int yas , String meslek){
        setName(name);
        setSurname(surname);
        setYas(yas);
        setMeslek(meslek);

        Ekle(meslek);
    }

    void Ekle(String meslek){
        if (meslek.equals("Müdür")){
            YonetimIslemleri.mudurEkleme(getName()+" "+getSurname(),getYas());
        }
        else {
            YonetimIslemleri.mudurYrdEkleme(getName()+" "+getSurname(),getYas());
        }
    }

    @Override
    void BilgileriYazdir() {
        super.BilgileriYazdir();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public int getYas() {
        return super.getYas();
    }

    @Override
    public void setYas(int yas) {
        super.setYas(yas);
    }

    @Override
    public String getMeslek() {
        return super.getMeslek();
    }

    @Override
    public void setMeslek(String meslek) {
        super.setMeslek(meslek);
    }

    @Override
    public double getMaas() {
        return super.getMaas();
    }

    @Override
    public void setMaas(double maas) {
        super.setMaas(maas);
    }

    @Override
    public double getTazminat() {
        return super.getTazminat();
    }

    @Override
    public void setTazminat(double tazminat) {
        super.setTazminat(tazminat);
    }

    @Override
    public double getYil() {
        return super.getYil();
    }

    @Override
    public void setYil(double yil) {
        super.setYil(yil);
    }

    @Override
    public int getMesai() {
        return super.getMesai();
    }

    @Override
    public void setMesai(int mesai) {
        super.setMesai(mesai);
    }
}