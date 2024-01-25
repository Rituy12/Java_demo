import java.util.Scanner;

public class prog4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int btn=sc.nextInt();
        if(btn==1)
        {
            System.out.println("Hello");
        }else if (btn==2) {
            System.out.println("Namste");
        }
        else if (btn==3) {
            System.out.println("Banjour");
        }
        else{
            System.out.println("invalid");
        }
        
    }
}
