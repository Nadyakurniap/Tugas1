/* NIM  : 13020210121
Nama    : St. Nadya Kurnia Prihandani
Hari/Tgl: Kamis, 9 Maret 2023
Waktu   : 20:47 */

import java.util.Scanner;

public class BacaData{

    /**
    * @param args
     */

     public static void main(String[] args){
        //TODO Auto-generated method stub
        /* KAMUS */
        int a;
        Scanner masukan;

        /* Program */
        System.out.print("Contoh membaca dan menulis, ketik nilai integer : \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); Apa akibatnya?*/

        System.out.print("Nilai yang dibaca : " +a);

     }
}
