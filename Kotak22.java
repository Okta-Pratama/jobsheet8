import java.util.Scanner;

public class Kotak22{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        if(i == 0 || i == n - 1 || j == 0 || j == n - 1) {
          System.out.print(n);
        } else {
          System.out.print(" ");
        }
        System.out.print(" ");
      }
      System.out.println();
    }
    sc.close();
  } 

}