package Nesneler;

import java.util.ArrayList;

public class Ders {

    int sinif;
    Hoca hoca;
    String isim;
    int sinavSuresi;
    int asistanSayisi;
    int uyumsuzlukPuani = 100;
    Gun gun = null;
    Saat saat = null;
    Saat bitisSaati = null;
    boolean kilitli = false;
    ArrayList<Asistan> asistanlar = new ArrayList<Asistan>();
    ArrayList<Gun> yasakGunler = new ArrayList<Gun>();
    ArrayList<Saat> yasakSaatler = new ArrayList<Saat>();

    /**
     * Sınavı olacak ders nesnesi oluşturur.
     * @param hoca Dersi veren hocaya ait nesne.
     * @param isim Dersin çıktıda görünecek ismi.
     * @param sinif Dersi alan sınıf.
     * @param sinavSuresi Dakika cinsinden sınav süresi.
     * @param gun Belirtilen güne dersi kilitler.
     * @param saat Belirtilen saate dersi kilitler.
     */
    public Ders(Hoca hoca, String isim, int sinif, int sinavSuresi, Gun gun, Saat saat) {
        this.hoca = hoca;
        this.isim = isim;
        this.sinif = sinif;
        this.sinavSuresi = sinavSuresi;
        this.gun = gun;
        this.saat = saat;
        bitisSaati = sinavBitisSaatiHesapla();
        kilitli = true;
        hoca.dersleri.add(this);
    }

    /**
     * Sınavı olacak ders nesnesi oluşturur.
     * @param hoca Dersi veren hocaya ait nesne.
     * @param isim Dersin çıktıda görünecek ismi.
     * @param sinif Dersi alan sınıf.
     * @param sinavSuresi Dakika cinsinden sınav süresi.
     * @param asistanSayisi Sınav için gereken -dershane başına- asistan sayısı.
     */
    public Ders(Hoca hoca, String isim, int sinif, int sinavSuresi, int asistanSayisi) {
        this.hoca = hoca;
        this.isim = isim;
        this.sinif = sinif;
        this.sinavSuresi = sinavSuresi;
        hoca.dersleri.add(this);
    }

    /**
     * Belirtilen Gün ve Saate ders yerleştirilir.
     * Dersin kilitli olmaMAsı gerekir.
     * @param gun Sınav yapılacağı gün.
     * @param saat Sınav yapılacağı saat.
     */
    public boolean yerlestir(Gun gun, Saat saat) {
        // Ders uygun değilse yerleştirme.
        if (kilitli || yasakGunler.contains(gun) || yasakSaatler.contains(saat)) {
            return false;
        }
        // Hocası uygun değilse yerleştirme.
        if (hoca.yasakGunler.contains(gun) || hoca.yasakSaatler.contains(saat)) {
            return false;
        }
        // Engel yok, yerleştir.
        this.gun = gun;
        this.saat = saat;
        bitisSaati = sinavBitisSaatiHesapla();
        return true;
    }

    /**
     * Gün ve Saat silinir.
     */
    public void acigaAl() {
        if (!kilitli) {
            gun = null;
            saat = null;
        }
    }

    public boolean acikta() {
        return gun == null || saat == null;
    }

    /**
     * Sınavın yapılmasının istenmediği günü parametre alır.
     * @param gun Belirtilen güne sınav verilmez.
     */
    public void suGunOlmasin(Gun gun) {
        yasakGunler.add(gun);
    }

    /**
     * Sınavın yapılmasının istenmediği saati parametre alır.
     * @param gun Belirtilen saate sınav verilmez.
     */
    public void suSaatOlmasin(Saat saat) {
        yasakSaatler.add(saat);
    }

    /**
     * Belirtilen gün ve saatte sınavı yapılır ve dağıtımdan etkilenmez.
     * @param gun Sabitleneceği gün.
     * @param saat Sabitleneceği saat
     */
    public void kilitle(Gun gun, Saat saat) {
        this.gun = gun;
        this.saat = saat;
        bitisSaati = sinavBitisSaatiHesapla();
        kilitli = true;
    }

    /**
     * Ders kilitlenmiş mi?
     * @return Ders kilitli ise true dönderir, gün ve saati değiştirilmez.
     */
    public boolean isKilitli() {
        return kilitli;
    }

    /**
     * Dersin gün ve saatini yazdırır.
     */
    public void print() {
        if (gun != null && saat != null) {
            System.out.println(isim + " " + gun.gun + " " + saat.h + ":" + saat.m);
        } else {
            System.out.println(isim + " (Henüz atanmamış)");
        }
    }

    protected Saat sinavBitisSaatiHesapla() {
        return new Saat(getSaat().h + (sinavSuresi / 60), getSaat().m + (sinavSuresi % 60));
    }

    public Saat getBitisSaati() {
        return bitisSaati;
    }

    public int getSinif() {
        return sinif;
    }

    public String getIsim() {
        return isim;
    }

    public Gun getGun() {
        return gun;
    }

    public Saat getSaat() {
        return saat;
    }

    public Hoca getHoca() {
        return hoca;
    }

    public void setUyumsuzluk(int uyumsuzluk) {
        this.uyumsuzlukPuani = uyumsuzluk;
    }

    public int getUyumsuzluk() {
        return uyumsuzlukPuani;
    }

    public int getSinavSuresi() {
        return sinavSuresi;
    }
}
