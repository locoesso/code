import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Submission { 
 
    public static void main(String[] args) { 
        Scanner lukija = new Scanner(System.in);
		
        int vastaus;
        
        System.out.println("Anna luku: ");
        vastaus = Integer.parseInt(lukija.nextLine());
        if (vastaus > 10) {
            System.out.println("Isompi ku kymppi.");
        } else {
            System.out.println("Pienempi ku kymppi.");
        }

     }
}
