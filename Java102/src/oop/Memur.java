package oop;

public abstract class Memur extends Calisan {
    private String departman;
    private String mesai;

    public Memur(String adSoyad, String telefon, String eposta, String departman, String mesai) {
        super(adSoyad, telefon, eposta);
        this.departman = departman;
        this.mesai = mesai;
    }

    public String getDepartman() {
        return this.departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getMesai() {
        return this.getMesai();
    }

    public void setMesai() {
        this.mesai = mesai;
    }

    public abstract void calis();


}
