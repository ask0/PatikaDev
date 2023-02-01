package oop;

public abstract class Akademisyen extends Calisan {
    private String bolum;
    private String unvan;

    public Akademisyen(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
        super(adSoyad, telefon, eposta);
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public abstract void derseGir();

}
