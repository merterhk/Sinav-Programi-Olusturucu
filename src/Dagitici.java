
import Nesneler.*;

public class Dagitici extends Thread {

    Gun[] gunler = new Gun[6];
    Saat[] saatler = new Saat[4];
    Hoca[] hocalar = new Hoca[18];
    Ders[] dersler = new Ders[25];
    Asistan[] asistanlar = new Asistan[5];
    int maxDershaneSayisi = 6;

    /**
     * Gün, Saat, Hoca, Ders, Asistan dizileri burada tanımlanır.
     */
    public void kur() {
        // <editor-fold defaultstate="collapsed" desc="Günler">
        gunler[0] = new Gun("Pazartesi");
        gunler[1] = new Gun("Salı");
        gunler[2] = new Gun("Çarşamba");
        gunler[3] = new Gun("Perşembe");
        gunler[4] = new Gun("Cuma");
        gunler[5] = new Gun("Cumartesi");
//        gunler[6] = new Gun("Pazartesi 2");
//        gunler[7] = new Gun("salı 2");
//        gunler[8] = new Gun("Çarşamba 2");
//        gunler[9] = new Gun("perşembe 2");
//        gunler[10] = new Gun("Cuma 2");
//        gunler[11] = new Gun("Cumartesi 2");
//        gunler[12] = new Gun("Pazartesi 3");
//        gunler[13] = new Gun("salı 3");
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Saatler">
        saatler[0] = new Saat(8, 00);
        saatler[1] = new Saat(9, 00);
        saatler[2] = new Saat(10, 00);
        saatler[3] = new Saat(11, 00);
        saatler[4] = new Saat(12, 00);
        saatler[5] = new Saat(13, 00);
        saatler[6] = new Saat(14, 00);
        saatler[7] = new Saat(15, 00);
        saatler[8] = new Saat(16, 00);
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Hocalar">
        hocalar[0] = new Hoca("Galip Aydin");
        hocalar[1] = new Hoca("Bedri Özer");
        hocalar[2] = new Hoca("Mehmet Kaya");
        hocalar[3] = new Hoca("Burhan Ergen");
        hocalar[4] = new Hoca("Ahmet Çınar");
        hocalar[5] = new Hoca("Yetkin Tatar");
        hocalar[6] = new Hoca("Erhan Akın");
        hocalar[7] = new Hoca("Hayrettin Can");
        hocalar[8] = new Hoca("Mehmet Karaköse");

        hocalar[9] = new Hoca("Turkdilici");
        hocalar[10] = new Hoca("Matematikci");
        hocalar[11] = new Hoca("İngilizceci");
        hocalar[12] = new Hoca("fizikci");
        hocalar[13] = new Hoca("lineerci");
        hocalar[14] = new Hoca("inkilapci");
        hocalar[15] = new Hoca("sosyal");
        hocalar[16] = new Hoca("teknik1");
        hocalar[17] = new Hoca("teknik2");

        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Dersler">
        // new Ders (Hocası, Dersin Adı, Sınıfı, Suresi, Derslik sayısı);
// 1. sınıf
        dersler[0] = new Ders(hocalar[6], "Bilgisayar  Mühen. Giriş", 1, 190, 3);
        dersler[1] = new Ders(hocalar[0], "Algoritma  ve Programlama -I", 1, 190, 3);
        dersler[2] = new Ders(hocalar[12], "Fizik-I", 1, 190, 3);
        dersler[3] = new Ders(hocalar[10], "Matematik-I", 1, 190, 3);
        dersler[4] = new Ders(hocalar[9], "Türk Dili-I", 1, 190, 3);
        dersler[5] = new Ders(hocalar[11], "İngilizce-I", 1, 190, 3);
// 2. sınıf
        dersler[6] = new Ders(hocalar[5], "Sayısal Tasarım", 2, 90, 3);
        dersler[7] = new Ders(hocalar[1], "Bilgisayar Bilimi için Ayrık Yapılar", 2, 90, 3);
        dersler[8] = new Ders(hocalar[6], "Sistem Teorisi", 2, 90, 3);
        dersler[9] = new Ders(hocalar[3], "Veri Yapıları", 2, 90, 3);
        dersler[10] = new Ders(hocalar[13], "Lineer Cebir", 2, 90, 3);
        dersler[11] = new Ders(hocalar[14], "Atatürk İlkeleri ve İnkılap Tarihi I", 2, 90, 3);
        dersler[12] = new Ders(hocalar[2], "Mesleki İngilizce-I", 2, 90, 3);
// 3. sınıf
        dersler[13] = new Ders(hocalar[7], "Mikroişlemciler", 3, 90, 3);
        dersler[14] = new Ders(hocalar[2], "Veritabanı Sistemleri", 3, 90, 3);
        dersler[15] = new Ders(hocalar[1], "Programlama Dilleri ", 3, 90, 3);
        dersler[16] = new Ders(hocalar[8], "Biçimsel Diller ve Otomata Teorisi", 3, 90, 3);
        dersler[17] = new Ders(hocalar[2], "Teknik Seçmeli", 3, 90, 3);
// 4. sınıf
        dersler[18] = new Ders(hocalar[5], "Bilgisayar Sistemleri Laboratuarı", 4, 90, 3);
        dersler[19] = new Ders(hocalar[0], "Internet Programlama", 4, 90, 3);
        dersler[20] = new Ders(hocalar[6], "Bil. Müh. Tasarım", 4, 90, 3);
        dersler[21] = new Ders(hocalar[15], "Sosyal Seçmeli", 4, 90, 3);
        dersler[22] = new Ders(hocalar[16], "Teknik Seçmeli", 4, 90, 3);
        dersler[23] = new Ders(hocalar[17], "Teknik Seçmeli", 4, 90, 3);
        dersler[24] = new Ders(hocalar[7], "Mesleki Uygulama ", 4, 90, 3);

        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Asistanlar">
        asistanlar[0] = new Asistan("İlhan Aydın");
        asistanlar[1] = new Asistan("Ayşe Erdoğan");
        asistanlar[2] = new Asistan("Taner Tuncer");
        asistanlar[3] = new Asistan("Ebubekir Erdem");
        asistanlar[4] = new Asistan("Coşkun Abi");
        // </editor-fold>
    }

    /**
     * Dersin bulunduğu gün ve saatin uyumsuzluk puanini verir.
     * @param ders Yerleştirilmiş ders.
     * @return Çakışma puanı.
     */
    public int uyumsuzlukPuani(Ders ders) {
        int puan = 0;

        for (Ders d : dersler) {
            if (!d.equals(ders)) { // Farklı ders ise.
                if (ders.getGun() == d.getGun()) { // Aynı gün başka sınav varsa.

                    if (ders.getSaat().h > d.getSaat().h && ders.getSaat().h < d.getBitisSaati().h) { // Saat aralığı uyuşması
                        puan += 100;
                    }
                    if (d.getSaat().h > ders.getSaat().h && d.getSaat().h < ders.getBitisSaati().h) {
                        puan += 100;
                    }
                    if (d.getSaat().h == ders.getBitisSaati().h) {

                        puan += 100;
                    }

                    if (d.getBitisSaati().h == ders.getSaat().h) {
                        puan += 100;
                    }

                    if (ders.getSaat() == d.getSaat()) { // Saatler de aynıysa.
                        puan += 100;
                        if (ders.getSinif() == d.getSinif()) { // Sınıfları da aynıysa.
                            puan += 100;
                            if (ders.getHoca().equals(d.getHoca())) { // Üstelik aynı hocanın sınavıysa.
                                puan += 100;
                            }
                        }
                    } else { // Saatler farklıysa
                        if (ders.getSinif() == d.getSinif()) { // Sınıfları aynıysa.
                            puan += 10;
                        }
                        if (ders.getHoca().equals(d.getHoca())) { // Hocanın başka sınavı varsa.
                            puan += 10;
                        }
                    }
                }
            }
        }
        return puan;
    }

    public int optimumYerlestir(Ders ders) {
        int tolerans = ders.getUyumsuzluk();
        Gun optiGun = ders.getGun();
        Saat optiSaat = ders.getSaat();
        for (Gun gun : gunler) {
            for (Saat saat : saatler) {
                ders.yerlestir(gun, saat);
                int puan = uyumsuzlukPuani(ders);
                if (puan < tolerans) {
                    optiGun = gun;
                    optiSaat = saat;
                    tolerans = puan;
                }
            }
        }
        ders.yerlestir(optiGun, optiSaat);
        ders.setUyumsuzluk(tolerans);
        return tolerans;
    }

    /**
     * Önce dersler günlere dağıtılır, daha sonra asistanlar da dağıtılabilirse işlem tamamlanır.
     */
    public void dagit() {
        kur();
        int tolerans = 50;
        int toplamUyumsuzluk;
        do {
            // Dersleri rastgele gün ve saatlere yerleştir.
            Gun randGun;
            Saat randSaat;
            for (Ders ders : dersler) {
                do {
                    randGun = gunler[(int) (Math.random() * gunler.length)];
                    randSaat = saatler[(int) (Math.random() * saatler.length)];
                } while (!ders.isKilitli() && !ders.yerlestir(randGun, randSaat));
            }
            toplamUyumsuzluk = 0;
            for (Ders ders : dersler) {
                toplamUyumsuzluk += optimumYerlestir(ders);
            }
        } while (toplamUyumsuzluk > tolerans);
        programiYazdir();
    }

    public void programiYazdir() {
        int toplamUyumsuzluk = 0;
        for (int g = 0; g < gunler.length; g++) {
            System.out.println(gunler[g].gun);
            for (int s = 0; s < saatler.length; s++) {
                for (Ders d : dersler) {
                    if (d.getGun().equals(gunler[g]) && d.getSaat().equals(saatler[s])) {
                        System.out.print("\t" + saatler[s].h + ":" + saatler[s].m);
                        System.out.print(" - " + d.getBitisSaati().h + ":" + d.getBitisSaati().m);
                        System.out.println("\t" + " (" + d.getSinif() + ". sınıf) (Uyumsuzluk Puanı: " + d.getUyumsuzluk() + ") (" + d.getHoca().getIsim() + ") Ders : " + d.getIsim());
                        toplamUyumsuzluk += d.getUyumsuzluk();
                    }
                }
            }
        }
        System.out.println("Ortalama uyumsuzluk : " + (toplamUyumsuzluk / dersler.length));
        System.out.println("Toplam uyumsuzluk : " + toplamUyumsuzluk);
        System.out.println("Toplam ders : " + dersler.length);

        int dersSay = 0;
        Hoca enCokCalisan = null;
        for (Hoca hoca : hocalar) {
            if (hoca.getDersSayisi() > dersSay) {
                enCokCalisan = hoca;
                dersSay = hoca.getDersSayisi();
            }
        }
        System.out.println("En çok ders veren hoca : " + enCokCalisan.getIsim() + " (" + dersSay + " ders)");
    }

    @Override
    public void run() {
        dagit();
    }

    public static void main(String[] args) {
        Dagitici d = new Dagitici();
        d.dagit();
    }
}
