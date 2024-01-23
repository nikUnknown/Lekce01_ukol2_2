import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("Prodejci:");

        double prumer1 = prodejce1();
        System.out.println();
        double prumer2 = prodejce2();
        System.out.println();

        double celkovyPrumer = (prumer1 + prumer2) / 2;
        System.out.println("Celkovy prumer prodane mrkve vsech prodejcu je: " + celkovyPrumer + ".");
    }

    public static double prodejce1() {
        String name = "Pavel Novotny";
        LocalDate date = LocalDate.of(1980, 4, 12);
        int agreement = 2;
        double totalQuantity = 90.5;
        String city = "Olomouc";
        String spz = "6M01224";
        double fuel = 240.4;
        String ip = "192.0.2.146";

        double prumer = totalQuantity / agreement;

        System.out.println("Jmeno prodejce: " + name + ".");
        System.out.println("Datum narozeni: " + date + ".");
        System.out.println("Pocet uzavrenych smluv: " + agreement + ".");
        System.out.println("Celkove mnozstvi prodane mrkve: " + totalQuantity + "tn.");
        System.out.println("Sidlo prodejce: " + city + ".");
        System.out.println("SPZ: " + spz + ".");
        System.out.println("Celkova spotreba auta: " + fuel + "l/100km.");
        System.out.println("IP adresa verze 4: " + ip + ".");
        System.out.println("Prumerne mnozstvi prodane mrkve na jednu smlouvu je: " + prumer + "ks.");

        return prumer;
    }

    public static double prodejce2() {
        String name = "Otakar Vesely";
        LocalDate date = LocalDate.of(1956, 3, 22);
        int agreement = 6;
        double totalQuantity = 800;
        String city = "Prerov";
        String spz = "6M72324";
        double fuel = 1245;
        String ip = "192.0.1.189";

        double prumer = totalQuantity / agreement;

        System.out.println("Jmeno prodejce: " + name + ".");
        System.out.println("Datum narozeni: " + date + ".");
        System.out.println("Pocet uzavrenych smluv: " + agreement + ".");
        System.out.println("Celkove mnozstvi prodane mrkve: " + totalQuantity + "tn.");
        System.out.println("Sidlo prodejce: " + city + ".");
        System.out.println("SPZ: " + spz + ".");
        System.out.println("Celkova spotreba auta: " + fuel + "l/100km.");
        System.out.println("IP adresa verze 4: " + ip + ".");
        System.out.println("Prumerne mnozstvi prodane mrkve na jednu smlouvu je: " + prumer + "ks.");

        return prumer;
    }
}