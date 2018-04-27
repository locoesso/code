import java.util.Scanner;

class testi {
    public static void main(String[] args) {
 
        Scanner lukija = new Scanner(System.in);

        int luku;
        String kys1 = "Anna luku: ";
        String tulos = "Luku on: ";
        String loppu = "Paskaa.";

        System.out.print(kys1);
        luku = Integer.parseInt(lukija.nextLine());

        System.out.println(tulos + luku);
		System.out.println(loppu);
    }
}
