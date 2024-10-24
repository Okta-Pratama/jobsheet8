import java.util.Scanner;

public class RataNilai22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNilai, nilaiMhs, i = 1, j;
        double rataNilai;

        while (i <= 5) {
            System.out.println("Masukkan nilai untuk mahasiswa ke-" + i);

            totalNilai = 0;

            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = sc.nextInt(); 
                totalNilai += nilaiMhs; 
            }

            rataNilai = totalNilai / 5.0; 

            System.out.println("Rata-rata nilai mahasiswa ke-" + i + " adalah: " + rataNilai);

            i++;
            System.out.println(); 
        }

        sc.close();
    }
}
