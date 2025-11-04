import java.util.Scanner;

public class ukl2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input nilai");
        int bilangan = in.nextInt();

        System.out.println("bilangan : " + bilangan);
        if (bilangan % 2 == 0) {
            System.out.println("genap");
        } else {
            System.out.println("ganjil");
        }
    }
}
