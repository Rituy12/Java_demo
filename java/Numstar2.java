
import java.util.*;

public class Numstar2 {

    public static void main(String[] args) {
        int a, b, row=5;
        
        Scanner x = new Scanner(System.in);
     
        row = x.nextInt();
        for (a = 1; a <= row; a++) {
            for (b = 1; b <= a; b++) {
                System.out.print(a++);
            }
            System.out.println();
        }

    }

}
