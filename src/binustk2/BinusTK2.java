package binustk2;

import java.util.Scanner;
public class BinusTK2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama="";
        
        Scanner input = new Scanner(System.in);
        do {
            System.out.print( "masukkan nama anda(1...25) : ");
            try {
                nama = input.nextLine();
                if(nama.length() < 1 || nama.length() > 25){
                    throw new I0Exception("Nama terlalu panjang");
                }
            } catch(Exception err){
                System.out.println("Nama harus diisi antara 1 sampai 25 karakter");
            }
        }
        while (nama.length() < 1 || nama.length() > 25);
    }

    private static class I0Exception extends Exception {

        public I0Exception(String nama_terlalu_panjang) {
        }
    }
    
}
