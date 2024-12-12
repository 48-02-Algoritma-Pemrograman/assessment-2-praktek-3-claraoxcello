import java.util.ArrayList;
import java.util.Scanner;

public class soaldua {
    public static void main(String[] args) {
         ArrayList<String> menuKue = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String pilihan = "Y";
        int packing= 0;

        System.out.print("Masukkan Pilihan Hampers: " + "1/2/3 ");
        int pilih = scanner.nextInt();
        scanner.nextLine();

        double harga=0;
        

        if (menuKue.equals("1")){
        harga = 150000;
        }
        else if (menuKue.equals("2")) {
        harga = 175000;
        }
        else if (menuKue.equals("3")) {
        harga = 200000;
        }

        System.out.print("Masukkan Pilihan packing: " + "1/2/3 ");
        int packi = scanner.nextInt();

        System.out.println("\nPilih Jenis Packing:");
            System.out.println("1. Pita - Rp 50,000");
            System.out.println("2. Kartu - Rp 75,000");
            System.out.println("3. Pita + Kartu - Rp 125,000");
            System.out.print("Masukkan pilihan packing [1/2/3]: ");
            int pilihanPacking = scanner.nextInt();

            if (pilihanPacking < 1 || pilihanPacking > 3) {
                System.out.println("Pilihan packing tidak valid. Silakan coba lagi:)).");
                ;
            }
    
    
        System.out.println("Input Lagi [Y/N]?"); 
                pilihan = scanner.nextLine();

        System.out.println("Total Hampers Yang Dipesan = ");        
        System.out.println("Total Yang Harus dibayar = " + harga);           


        

        }








    

        
        

    }
}
