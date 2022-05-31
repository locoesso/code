
public class guessingMachine {

    public static void main(String[] args) {

        int arvattava = (int) (1 + Math.random() * 1000);
        int arvauksia = 0;
        int arvaus = 0;
        
        // System.out.println(arvattava);
        
        while (true) {
            if (arvattava == arvaus) {
                break;
            }
            
            arvaus = (int) (1 + Math.random() * 1000);
            arvauksia++;
            System.out.println(arvauksia + ". " + arvaus);
        }
        System.out.println("Arvauksia " + arvauksia);
    }
}
