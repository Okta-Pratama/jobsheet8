import java.util.Scanner;

public class cabor22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        int jumlahCabor = cabor.length;

        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= jumlahPoliteknik; i++) {
            System.out.println("\nMasukkan nama politeknik ke-" + i + ": ");
            String namaPoliteknik = sc.nextLine();

            for (int j = 0; j < jumlahCabor; j++) {
                System.out.println("Masukkan 5 atlet untuk cabang olahraga " + cabor[j] + " dari " + namaPoliteknik + ":");
                
                for (int k = 1; k <= 5; k++) {
                    System.out.print("Atlet ke-" + k + ": ");
                    String namaAtlet = sc.nextLine();
                    System.out.println("Atlet " + k + " untuk cabang " + cabor[j] + " dari " + namaPoliteknik + ": " + namaAtlet);
                }
            }
        }

        sc.close();
    }
}
