
public class guessingMachine {

    public static void main(String[] args) {

        int arvattava = (int) (1 + Math.random() * 100);
        int arvauksia = 0;
        int luku = 0;
        
        System.out.println(arvattava);
        
        while (true) {
            if (arvattava == luku) {
                break;
            }
            
            luku = (int) (1 + Math.random() * 100);
            arvauksia++;
            System.out.println(arvauksia + ". " + luku);
        }
        System.out.println("Arvauksia " + arvauksia);
    }
}
