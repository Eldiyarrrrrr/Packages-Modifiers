import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Country country = new Country();
        country.setName("ELdiyar");
        country.setKalky(10000);
        country.setAyanty(200);
        country.setTili("Kyrgyz");


        Country country1 = new Country();
        country1.setName("Sabina");
        country1.setKalky(1000);
        country1.setAyanty(500);
        country1.setTili("Kazah");


        Country country2 = new Country();
        country2.setName("Baknazar");
        country2.setKalky(600);
        country2.setAyanty(700);
        country2.setTili("Uzbek");


        Country[] ccountries = {country,country1,country2};
        System.out.println(Country.maxAyant(ccountries));

    }
}