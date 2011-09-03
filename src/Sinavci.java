/* Merter */
import Nesneler.Asistan;
import Nesneler.Ders;
import Nesneler.Gun;
import Nesneler.Hoca;
import Nesneler.Saat;
import java.util.ArrayList;
import java.util.List;

public class Sinavci extends Thread {

    List<Gun> gunler = new ArrayList<Gun>();
    List<Saat> saatler = new ArrayList<Saat>();
    List<Hoca> hocalar = new ArrayList<Hoca>();
    List<Ders> dersler = new ArrayList<Ders>();
    List<Asistan> asistanlar = new ArrayList<Asistan>();
    int maxDershaneSayisi = 6;

    /**
     * Gün, Saat, Hoca, Ders, Asistan dizileri burada tanımlanır.
     */
    public void kur() {
        // <editor-fold defaultstate="collapsed" desc="Günler">
        gunler.add(new Gun("Pazartesi"));
        gunler.add(new Gun("Salı"));
        gunler.add(new Gun("Çarşamba"));
        gunler.add(new Gun("Perşembe"));
        gunler.add(new Gun("Cuma"));
        gunler.add(new Gun("Cumartesi"));
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Saatler">
        saatler.add(new Saat(8, 00));
        saatler.add(new Saat(9, 00));
        saatler.add(new Saat(10, 00));
        saatler.add(new Saat(11, 00));
        saatler.add(new Saat(12, 00));
        saatler.add(new Saat(13, 00));
        saatler.add(new Saat(14, 00));
        saatler.add(new Saat(15, 00));
        saatler.add(new Saat(16, 00));
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Hocalar">
        hocalar.add(new Hoca("Galip Aydin"));
        hocalar.add(new Hoca("Bedri Özer"));
        hocalar.add(new Hoca("Mehmet Kaya"));
        hocalar.add(new Hoca("Burhan Ergen"));
        hocalar.add(new Hoca("Ahmet Çınar"));
        hocalar.add(new Hoca("Yetkin Tatar"));
        hocalar.add(new Hoca("Erhan Akın"));
        hocalar.add(new Hoca("Hayrettin Can"));
        hocalar.add(new Hoca("Mehmet Karaköse"));

        hocalar.add(new Hoca("Turkdilici"));
        hocalar.add(new Hoca("Matematikci"));
        hocalar.add(new Hoca("İngilizceci"));
        hocalar.add(new Hoca("fizikci"));
        hocalar.add(new Hoca("lineerci"));
        hocalar.add(new Hoca("inkilapci"));
        hocalar.add(new Hoca("sosyal"));
        hocalar.add(new Hoca("teknik1"));
        hocalar.add(new Hoca("teknik2"));

        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Dersler">
        // new Ders (Hocası, Dersin Adı, Sınıfı, Suresi, Derslik sayısı);
// 1. sınıf
        dersler.add(new Ders(hocalar.get(6), "Bilgisayar  Mühen. Giriş", 1, 190, 3));
        dersler.add(new Ders(hocalar.get(0), "Algoritma  ve Programlama -I", 1, 190, 3));
        dersler.add(new Ders(hocalar.get(12), "Fizik-I", 1, 190, 3));
        dersler.add(new Ders(hocalar.get(10), "Matematik-I", 1, 190, 3));
        dersler.add(new Ders(hocalar.get(9), "Türk Dili-I", 1, 190, 3));
        dersler.add(new Ders(hocalar.get(11), "İngilizce-I", 1, 190, 3));
// 2. sınıf
        dersler.add(new Ders(hocalar.get(5), "Sayısal Tasarım", 2, 90, 3));
        dersler.add(new Ders(hocalar.get(1), "Bilgisayar Bilimi için Ayrık Yapılar", 2, 90, 3));
        dersler.add(new Ders(hocalar.get(6), "Sistem Teorisi", 2, 90, 3));
        dersler.add(new Ders(hocalar.get(3), "Veri Yapıları", 2, 90, 3));
        dersler.add(new Ders(hocalar.get(13), "Lineer Cebir", 2, 90, 3));
        dersler.add(new Ders(hocalar.get(14), "Atatürk İlkeleri ve İnkılap Tarihi I", 2, 90, 3));
        dersler.add(new Ders(hocalar.get(2), "Mesleki İngilizce-I", 2, 90, 3));
// 3. sınıf
        dersler.add(new Ders(hocalar.get(7), "Mikroişlemciler", 3, 90, 3));
        dersler.add(new Ders(hocalar.get(2), "Veritabanı Sistemleri", 3, 90, 3));
        dersler.add(new Ders(hocalar.get(1), "Programlama Dilleri ", 3, 90, 3));
        dersler.add(new Ders(hocalar.get(8), "Biçimsel Diller ve Otomata Teorisi", 3, 90, 3));
        dersler.add(new Ders(hocalar.get(2), "Teknik Seçmeli", 3, 90, 3));
// 4. sınıf
        dersler.add(new Ders(hocalar.get(5), "Bilgisayar Sistemleri Laboratuarı", 4, 90, 3));
        dersler.add(new Ders(hocalar.get(0), "Internet Programlama", 4, 90, 3));
        dersler.add(new Ders(hocalar.get(6), "Bil. Müh. Tasarım", 4, 90, 3));
        dersler.add(new Ders(hocalar.get(15), "Sosyal Seçmeli", 4, 90, 3));
        dersler.add(new Ders(hocalar.get(16), "Teknik Seçmeli", 4, 90, 3));
        dersler.add(new Ders(hocalar.get(17), "Teknik Seçmeli", 4, 90, 3));
        dersler.add(new Ders(hocalar.get(7), "Mesleki Uygulama ", 4, 90, 3));

        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Asistanlar">
        asistanlar.add(new Asistan("İlhan Aydın"));
        asistanlar.add(new Asistan("Ayşe Erdoğan"));
        asistanlar.add(new Asistan("Taner Tuncer"));
        asistanlar.add(new Asistan("Ebubekir Erdem"));
        asistanlar.add(new Asistan("Coşkun Abi"));
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
                    randGun = gunler.get((int) (Math.random() * gunler.size()));
                    randSaat = saatler.get((int) (Math.random() * saatler.size()));
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
        for (int g = 0; g < gunler.size(); g++) {
            System.out.println(gunler.get(g).gun);
            for (int s = 0; s < saatler.size(); s++) {
                for (Ders d : dersler) {
                    if (d.getGun().equals(gunler.get(g)) && d.getSaat().equals(saatler.get(s))) {
                        System.out.print("\t" + saatler.get(s).h + ":" + saatler.get(s).m);
                        System.out.print(" - " + d.getBitisSaati().h + ":" + d.getBitisSaati().m);
                        System.out.println("\t" + " (" + d.getSinif() + ". sınıf) (Uyumsuzluk Puanı: " + d.getUyumsuzluk() + ") (" + d.getHoca().getIsim() + ") Ders : " + d.getIsim());
                        toplamUyumsuzluk += d.getUyumsuzluk();
                    }
                }
            }
        }
        System.out.println("Ortalama uyumsuzluk : " + (toplamUyumsuzluk / dersler.size()));
        System.out.println("Toplam uyumsuzluk : " + toplamUyumsuzluk);
        System.out.println("Toplam ders : " + dersler.size());

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
        Sinavci d = new Sinavci();
        d.dagit();
    }
}
