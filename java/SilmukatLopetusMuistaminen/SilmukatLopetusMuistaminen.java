
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        
        int luku;
        int summa = 0;
        int lukuja = 0;
        double keskiarvo = 0;
        double yhteensa = 0;
        int parillisia = 0;
        int parittomia = 0;
        boolean parillinen;
        
        System.out.println("Lopeta -1");
        System.out.println("Syöta luvut: ");
        
        while (true) {
            luku = Integer.parseInt(lukija.nextLine());
            
            if (luku == -1) {
                break;
            }
            
            summa += luku;
            lukuja += 1;
            yhteensa += luku * 1.0;
            keskiarvo = (yhteensa / lukuja) * 1.0;
            parillinen = (luku%2 == 0);
            
            if (parillinen) {
                parillisia += 1;
            } else {
                parittomia += 1;
            }
            
        } 
        
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + lukuja);
        System.out.println("Keskiarvo: " + keskiarvo);
        System.out.println("Parillisia: " + parillisia);
        System.out.println("Parittomia: " + parittomia);

    }
}
