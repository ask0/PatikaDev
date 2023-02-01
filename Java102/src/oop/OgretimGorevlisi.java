package oop;

public class OgretimGorevlisi extends Akademisyen {
    private String kapiNo;

    public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String bolum, String unvan, String kapiNo) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.kapiNo = kapiNo;
    }

    public String getKapiNo() {
        return kapiNo;
    }

    public void setKapiNo(String kapiNo) {
        this.kapiNo = kapiNo;
    }

    public void senatoToplanti() {
        System.out.println(this.getAdSoyad() + " toplantıya katıldı!");
    }

    public void sinavYap() {
        System.out.println(this.getAdSoyad() + " sınav yaptı!");
    }

    @Override
    public void derseGir() {
        System.out.println(this.getAdSoyad() + " adlı öğretim görevlisi derse girdi.");
    }

    @Override
    public void giris() {
        System.out.println(this.getAdSoyad() + " adlı öğretim görevlisi giriş yaptı.");
    }

    @Override
    public void cikis() {
        System.out.println(this.getAdSoyad() + " adlı öğretim görevlisi çıkış yaptı.");
    }

    @Override
    public void yemekhane() {
        System.out.println(this.getAdSoyad() + " adlı öğretim görevlisi yemekhaneye giriş yaptı.");
    }
}
