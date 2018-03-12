import java.util.Scanner;

// Tämä ei ole tehtävä, vaan hiekkalaatikko jossa voit vapaasti
// kokeilla kaikenlaista materiaalissa oppimaasi.

public class ArvosanatJaPisteet {

    public static void main(String[] args) {

        // Tänne voit kirjoittaa ohjelmakoodia. Ohjelmasi voit ajaa
        // valitsemalla menusta Run->Run File tai painamalla Shift+F6
        
        Scanner lukija = new Scanner(System.in);
        
        int pisteet;
        String arvosana;
        
        System.out.print("Anna pisteet [0-100]: ");
        pisteet = Integer.parseInt(lukija.nextLine());
        
        if (pisteet < 0) {
            arvosana = "mahdotonta!";
        } else if (pisteet <= 69) {
            arvosana = "hylätty";
        } else if (pisteet <= 75) {
            arvosana = "1";
        } else if (pisteet <= 80) {
            arvosana = "2";
        } else if (pisteet <= 85) {
            arvosana = "3";
        } else if (pisteet <= 90) {
            arvosana = "4";
        } else if (pisteet <= 100) {
            arvosana = "5";
        } else {
            arvosana = "uskomatonta!";
        }
        
        System.out.println("Arvosana: " + arvosana);

    }
}
