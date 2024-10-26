import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        // Taksimetre KM başına 2.20 TL tutmaktadır.
        // Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        // Taksimetre açılış ücreti 10 TL'dir.

        int km;
        double perkm = 2.20, total;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextInt();

        total = 10 + (km * perkm);
        total = total < 20 ? 20 : total;
        System.out.println("Toplam Tutar : " + total);
    }
}