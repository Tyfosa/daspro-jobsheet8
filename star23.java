import java.util.Scanner;

public class star23{

    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int N = input23.nextInt();

        for (int i=1; i<=N; i++) {
        System.out.print("*");
    }

}
}