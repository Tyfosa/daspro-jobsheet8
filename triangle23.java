import java.util.Scanner;

public class triangle23 {

    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        System.out.print("Masukan nilai N = ");
        int N = input23.nextInt();
        int i = 0;
        while(i <= N) {
            int j = 0;
            while (j < i ) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
}
}