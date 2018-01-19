import java.util.Scanner; // tuodaan lukemiseen käytetty apuväline Scanner käyttöömme

public class Esimerkki {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // ohjelmakoodi
        System.out.print("Kenelle sanotaan hei: ");
        String nimi = lukija.nextLine(); // Luetaan käyttäjältä rivi tekstiä ja asetetaan sen arvo muuttujaan nimi

        System.out.println("Hei " + nimi);
    }
}
