import java.util.Scanner;

class testi {
    public static void main(String[] args) {
 
        Scanner lukija = new Scanner(System.in);

        int luku;

        System.out.print("Anna luku: ");
        luku = Integer.parseInt(lukija.nextLine());

        System.out.println("Luku on " + luku);
    }
}
