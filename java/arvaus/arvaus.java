
import java.util.Scanner;

public class arvaus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // int arvattava = 7;
        int arvattava = (int) (1 + Math.random() * 10);
        int luvut = 0;
        

        System.out.println("Minäpä tiedän luvun väliltä 1-10, jota sinä et tiedä!");
        
        while (true) {
            
            // System.out.println(arvattava);
            int luku = (int) (1 + Math.random() * 1000);
            System.out.println("Arvaa luku: " + luku);
            // luku = Integer.parseInt(lukija.nextLine());
            
            if (luku == arvattava) {
                luvut++;
                System.out.println("Oikein! Arvauksia yhteensä: " + luvut);
                break;
            }
            
            if (luku < 1) {
                System.out.println("Epäkelpo luku!");
                continue;
            }
            
            if (luku > 10) {
                System.out.println("Epäkelpo luku!");
                continue;
            }
            
            luvut++;
            System.out.println("Ei ollut!");
            
        }

    }
}
