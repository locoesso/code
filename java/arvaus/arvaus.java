import java.util.Scanner;

public class arvaus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int arvattava = (int) (1 + Math.random() * 100);
        int luku;
        int arvauksia = 0;

        System.out.println("Minäpä tiedän luvun väliltä 1-100, jota sinä et tiedä!");

        while (true) {

            System.out.print("Arvaa luku: ");
            luku = Integer.parseInt(lukija.nextLine());

            if (luku == arvattava) {
                break;
            }

            if (luku > 100) {
                System.out.println("Epäkelpo luku!");
                continue;
            }

            if (luku < 1) {
                System.out.println("Epäkelpo luku!");
                continue;
            }

            if (luku < arvattava) {
                System.out.println("Lukuni on isompi!");
                arvauksia++;
                continue;
            }

            if (luku > arvattava) {
                System.out.println("Lukuni on pienempi!");
                arvauksia++;
                continue;
            }

        }

        arvauksia++;
        System.out.println("Oikein! Arvauksia yhteensä: " + arvauksia);
    }
}
