/* (Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE 
   that are divisible by 5 or 6. */

   package Daniel_Liang_10_21;
   import java.math.BigInteger;
   import java.util.Scanner;
   /* Note : kelas yang digunakan untuk menyimpan dan memanipulasi bilangan bulat dengan ukuran apa pun. 
             Kelas ini digunakan untuk operasi matematika yang melibatkan bilangan bulat sangat besar.  */


   public class Desimal {
       public static void main(String[] args) {
           int count = 0; //Menyimpan jumlah angka yang sudah ditemukan
           BigInteger n = new BigInteger(String.valueOf(Long.MAX_VALUE)); //Menyimpan nilai Long.MAX_VALUE sebagai BigInteger
           BigInteger five = new BigInteger("5"); //Menyimpan angka 5 sebagai BigInteger
           BigInteger six = new BigInteger("6"); //Menyimpan angka 6 sebagai BigInteger
           BigInteger zero = new BigInteger("0"); //Menyimpan angka 0 sebagai BigInteger
   
           //Mengambil input dari pengguna untuk jumlah angka yang diinginkan
           Scanner input = new Scanner(System.in);
           System.out.print("Masukkan banyak angka yang diinginkan: ");
           int angka = input.nextInt();
           input.close(); //Menutup Scanner setelah digunakan
   
           //Menampilkan output
           System.out.println("\nAngka yang memiliki nilai lebih dari Long.MAX_VALUE (" + Long.MAX_VALUE + ") yang habis dibagi 5 atau 6: ");
   
           //Mencari angka yang lebih besar dari Long.MAX_VALUE dan habis dibagi 5 atau 6
           while (count < angka) {
               n = n.add(new BigInteger("1")); //Menambahkan 1 pada n
               //Memeriksa apakah n habis dibagi 5 atau 6
               if ((n.remainder(five)).compareTo(zero) == 0 || (n.remainder(six)).compareTo(zero) == 0) {
                   System.out.println(n); //Menampilkan angka yang ditemukan
                   count++; //Menambah jumlah angka yang ditemukan
               }
           }
       }
   }
   