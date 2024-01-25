
//public class Star1 {
   // public static void main(String[] args) {

      //  int i, j, row = 6;

     //   for (i = 0; i < row; i++) {

       //     for (j = 0; j <= i; j++) {
       //         System.out.print("* ");
      //      }

      //      System.out.println();
     //   }
  //  }
//}

public class Star1 {
    public static void main(String[] args) {

        int  row = 10;
        for (int i = 0; i < row; i++) {
            for (int j = 2*(row - i); j >= 0; j--) {
                System.out.print(" ");
            } 
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}