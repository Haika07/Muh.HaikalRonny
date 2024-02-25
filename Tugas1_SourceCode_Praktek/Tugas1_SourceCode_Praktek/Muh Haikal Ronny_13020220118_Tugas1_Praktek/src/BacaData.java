/*
Nim  : 13020220118
Nama : Muh Haikal Ronny
--Sabtu, 23/02/2024--
 */
import java.util.Scanner;
public class BacaData {
    public static void main(String[] args) {
        int a;
        Scanner masukan;
        System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt();
        System.out.print ("Nilai yang dibaca : "+ a);
    }
}
