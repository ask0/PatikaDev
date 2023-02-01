package oop;

public class BilgiIslem extends Memur {
    private String gorev;

    public BilgiIslem(String adSoyad, String telefon, String eposta, String departman, String mesai, String gorev) {
        super(adSoyad, telefon, eposta, departman, mesai);
        this.gorev = gorev;
    }

    public void networkKurulum() {
        System.out.println(this.getAdSoyad() + " network kurulumu yaptı!");
    }

    @Override
    public void giris() {
        System.out.println(this.getAdSoyad() + " adlı Bilgi İşlem çalışanı giriş yaptı.");
    }

    @Override
    public void cikis() {
        System.out.println(this.getAdSoyad() + " adlı Bilgi İşlem çalışanı çıkış yaptı.");
    }

    @Override
    public void yemekhane() {
        System.out.println(this.getAdSoyad() + " adlı Bilgi İşlem çalışanı yemekhaneye giriş yaptı.");
    }

    @Override
    public void calis() {
        System.out.println(this.getAdSoyad() + " adlı Bilgi İşlem çalışanı çalışıyor.");
    }
}
