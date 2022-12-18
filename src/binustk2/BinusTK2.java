package tugas2;

import java.util.Scanner;

public class Tugas2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    String nama;
    String nim;
    String pilihan;
    int jumlahBil;
    boolean running = true;
    
    
    while (running){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anda [1..25] : ");
        nama = scan.nextLine();
        if (("".equals(nama))&&(nama.length()> 25)){
            System.out.println("Nama Tidak boleh kosong & tidak boleh lebih dari 25 karakter");
        }
        
        System.out.print("Masukkan NIM Anda [harus 10 karakter] : ");
        nim = scan.nextLine();
        if (nim.length() != 10){
            System.out.println("NIM Harus berjumlah 10 Karakter");
            continue;
        }
        System.out.println('\n');
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println();
        System.out.println("Registrasi Sukses..");
        System.out.println("Selamat Datang " +nama+"[Nim : "+nim+"].. ^^V");
        System.out.println("");
        System.out.println("Mari belajar macam-macam deret bilangan..");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        
        System.out.print("Masukkan Sembarang Angka [5..20] : ");
        jumlahBil = scan.nextInt();
        if ((jumlahBil < 5) && (jumlahBil > 20)){
            System.out.println("Bilangan minimal harus 5 dan maksimal 20s");
        }
        System.out.println("");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("");
        System.out.println("Deret Bilangan  ");
        System.out.println("###############");
        
    }
    }   
}
