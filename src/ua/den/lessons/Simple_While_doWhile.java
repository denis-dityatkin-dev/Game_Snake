package ua.den.lessons;

public class Simple_While_doWhile {
    public static void main(String[] args) {

        //while

        int n = 10;
        while (n > 0){
            System.out.println(" n = " + n);
            n--;
        }
        System.out.println();
        System.out.println("n = " + n);
        System.out.println("end");
        System.out.println();

        //do_while

        int n1 = 10;
             do {
            System.out.println(" n1 = " + n1);
                   }
       // while (--n1 > 0);
        while (false);
        System.out.println();
        System.out.println("n1 = " + n1);
        System.out.println("end");
    }
}
