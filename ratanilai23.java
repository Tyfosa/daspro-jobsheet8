import java.util.Scanner;

public class ratanilai23 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        int i, j;
        float nilai, totalnilai, ratanilai;
        i = 1;
        while (i <= 5) {
            j = 1;
            totalnilai = 0;
            System.out.println("Masukkan Nilai Siswa Ke-" + i);
            while (j <= 5) {
                System.out.print("Masukkan Nilai = ");
                totalnilai += input23.nextInt();
                j++;
            }
            ratanilai = totalnilai / 5;
            System.out.println("Total nilai dari siswa ke " + i + " \t:" + totalnilai);
            System.out.println("Rata Rata Nilai \t\t: " + ratanilai + "\n");
            i++;
 }
}
}