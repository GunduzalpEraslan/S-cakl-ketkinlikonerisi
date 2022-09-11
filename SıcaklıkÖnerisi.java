import java.util.Scanner;
/**
 * Sıcaklık Durumu
 */
public class SıcaklıkÖnerisi {
    public static void main(String[] args) {
        int valueoftemp;
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık değerini giriniz : ");
        valueoftemp=input.nextInt();

        if (valueoftemp <= 5) {
            System.out.println("Kayağa gidebilirsiniz.");}
        else if (valueoftemp<=5 && valueoftemp<=15) {
            System.out.println("Sinemaya gidebilirsiniz");}
        else if (valueoftemp<=15 && valueoftemp<=25) {
            System.out.println("Pikniğe gidebilirsiniz");}
        else if (valueoftemp<=25) {
            System.out.println("Yüzmeye gidebilirsiniz");}
    }
}


