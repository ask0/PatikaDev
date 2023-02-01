package oop;

public class GuvenlikGorevlisi extends Memur {
    private String belge;

    public GuvenlikGorevlisi(String adSoyad, String telefon, String eposta, String departman, String mesai, String belge) {
        super(adSoyad, telefon, eposta, departman, mesai);
        this.belge = belge;
    }

    public String getBelge() {
        return this.belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }

    public void nobet() {
        System.out.println(this.getAdSoyad() + " nöbet tuttu!");
    }

    @Override
    public void calis() {
        System.out.println(this.getAdSoyad() + " adlı güvenlik görevlisi çalışıyor.");
    }

    @Override
    public void giris() {
        System.out.println(this.getAdSoyad() + " adlı güvenlik görevlisi giriş yaptı.");
    }

    @Override
    public void cikis() {
        System.out.println(this.getAdSoyad() + " adlı güvenlik görevlisi çıkış yaptı.");
    }

    @Override
    public void yemekhane() {
        System.out.println(this.getAdSoyad() + " adlı güvenlik görevlisi yemekhaneye giriş yaptı.");
    }
}
