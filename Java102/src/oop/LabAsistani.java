package oop;

public class LabAsistani extends Asistan {
    public LabAsistani(String adSoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
    }

    public void lablaraGir() {
        System.out.println(this.getAdSoyad() + " adlı lab asistanı laba girdi.");
    }

    @Override
    public void derseGir() {
        System.out.println(this.getAdSoyad() + " adlı lab asistanı derse girdi");
    }


}
