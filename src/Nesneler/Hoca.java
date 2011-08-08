package Nesneler;

import java.util.ArrayList;

public class Hoca {

    String isim;
    ArrayList<Ders> dersleri = new ArrayList<Ders>();
    ArrayList<Gun> yasakGunler = new ArrayList<Gun>();
    ArrayList<Saat> yasakSaatler = new ArrayList<Saat>();

    /**
     * Ders veren hoca nesnesi.
     * @param isim Hocanın adı.(Örn: Yrd.Doç.Dr. Galip AYDIN)
     */
    public Hoca(String isim) {
        this.isim = isim;
    }

    /**
     * Hocanın sınav istemediği günler buradan atanır.
     * @param gun Belirtilen güne sınav verilmez.
     */
    public void suGunSivavOlmasin(Gun gun) {
        yasakGunler.add(gun);
    }

    /**
     * Hocanın sınav istemediği saatler buradan atanır.
     * @param saat Belirtilen saate sınav verilmez.
     */
    public void suSaatSivavOlmasin(Saat saat) {
        yasakSaatler.add(saat);
    }

    public int getDersSayisi() {
        return dersleri.size();
    }

    public String getIsim() {
        return isim;
    }

    
}
