import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlahPoliteknik = input23.nextInt();
        input23.nextLine(); 

        for (int i = 1; i <= jumlahPoliteknik; i++) {
            System.out.print("\nMasukkan nama Politeknik ke-" + i + ": ");
            String namaPoliteknik = input23.nextLine();

            String[] CabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Voli"};

            for (String cabor : CabangOlahraga) {
                System.out.println("\nMasukkan nama 5 atlet untuk " + cabor + ":");

                for (int j = 1; j <= 5; j++) {
                    System.out.print("Nama atlet ke-" + j + ": ");
                    String namaAtlet = input23.nextLine();
                    System.out.println("  " + cabor + " - Atlet ke-" + j + ": " + namaAtlet);
                }
            }
        }
    }
}
