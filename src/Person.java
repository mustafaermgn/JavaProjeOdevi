public abstract class Person {
    private String name,surname,meslek;
    private int yas ,mesai;
    private double maas,tazminat,yil;


    void BilgileriYazdir(){
        System.out.println("\nİsim : "+getName()+"\nSoyisim : "+getSurname()+"\nYaş : "+getYas()+"\nMeslek : "+getMeslek()+"\nMaaş : "+getMaas());
    }

    void TazminatYazdir(){
        System.out.println(getName()+" "+getSurname()+" adlı kişinin tazminatı : "+getTazminat());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }

    public double getYil() {
        return yil;
    }

    public void setYil(double yil) {
        this.yil = yil;
    }

    public int getMesai() {
        return mesai;
    }

    public void setMesai(int mesai) {
        this.mesai = mesai;
    }
}