package ua.den.lessons;

public class Simple_For {
    public static void main(String[] args) {
        int b = 3;
        for (int i = 0; i < 20; i+= b){
            System.out.println("i: " + i);
            if (i == 3){
                b = 4;
            }
        }
        System.out.println("End");
    }
}
