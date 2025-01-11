public class Guvenlik extends Person{

    Islemler.MaasIslemleri maas = new Islemler().new MaasIslemleri();
    Islemler.TazminatIslemleri tazminat = new Islemler().new TazminatIslemleri();

    public Guvenlik(String name, String surname, int yas){
        setName(name);
        setSurname(surname);
        setYas(yas);
        setMeslek("Güvenlik");
        setMaas(maas.MaasBelirle(getMeslek()));

        PersonelIslemleri.guvenlikEkleme(getName()+" "+getSurname(),getYas(),getMaas());
    }

    public Guvenlik(String name, String surname, int yas , double yil){
        setName(name);
        setSurname(surname);
        setYas(yas);
        setYil(yil);
        setMeslek("Güvenlik");
        setMaas(maas.MaasBelirle(getMeslek()));

        PersonelIslemleri.guvenlikEkleme(getName()+" "+getSurname(),getYas(),getMaas());

        setTazminat(tazminat.TazminatBelirle(getYil(),getMaas()));
    }

    public Guvenlik(String name, String surname, int yas , double yil,int mesaiSaati){
        setName(name);
        setSurname(surname);
        setYas(yas);
        setYil(yil);
        setMeslek("Güvenlik");
        setMesai(mesaiSaati);
        setMaas(maas.MaasBelirle(getMeslek(),getMesai()));

        PersonelIslemleri.guvenlikEkleme(getName()+" "+getSurname(),getYas(),getMaas());

        setTazminat(tazminat.TazminatBelirle(getYil(),getMaas()));
    }

    @Override
    void BilgileriYazdir() {
        super.BilgileriYazdir();
    }

    @Override
    void TazminatYazdir() {
        super.TazminatYazdir();
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