public class Ogretmen extends Person{
    private String brans;
    Islemler.MaasIslemleri maas = new Islemler().new MaasIslemleri();
    Islemler.TazminatIslemleri tazminat = new Islemler().new TazminatIslemleri();

    public Ogretmen(String name, String surname, int yas , String brans) {
        setName(name);
        setSurname(surname);
        setYas(yas);
        setMeslek("Öğretmen");
        setBrans(brans);
        setMaas(maas.MaasBelirle(getMeslek()));

        PersonelIslemleri.ogretmenEkleme(getName()+" "+getSurname(),getYas(),getBrans(),getMaas());
    }

    public Ogretmen(String name, String surname, int yas , String brans , double yil) {
        setName(name);
        setSurname(surname);
        setYas(yas);
        setMeslek("Öğretmen");
        setYil(yil);
        setBrans(brans);
        setMaas(maas.MaasBelirle(getMeslek()));

        PersonelIslemleri.ogretmenEkleme(getName()+" "+getSurname(),getYas(),getBrans(),getMaas());

        setTazminat(tazminat.TazminatBelirle(getYil(),getMaas()));
    }

    public Ogretmen(String name, String surname , int yas , String brans , double yil,int mesaiSaati) {
        setName(name);
        setSurname(surname);
        setYas(yas);
        setMeslek("Öğretmen");
        setYil(yil);
        setBrans(brans);
        setMesai(mesaiSaati);

        setMaas(maas.MaasBelirle(getMeslek(),getMesai()));

        PersonelIslemleri.ogretmenEkleme(getName()+" "+getSurname(),getYas(),getBrans(),getMaas());

        setTazminat(tazminat.TazminatBelirle(getYil(),getMaas()));
    }



    @Override
    void BilgileriYazdir() {
        super.BilgileriYazdir();
        System.out.println("Branş : "+getBrans());
    }

    @Override
    void TazminatYazdir() {
        super.TazminatYazdir();
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

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}