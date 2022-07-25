import java.util.Scanner;

public class Hesap {

    public static void main(String[] args) {

        double brkenar,ikenar,uckenar,cevre,alan;

        Scanner sc=new Scanner(System.in);
        System.out.println("Ucgenin birinci kenari:");
        brkenar=sc.nextDouble();
        System.out.println("Ucgenin ikinci kenari");
        ikenar=sc.nextDouble();
        System.out.println("Ucgenin ucuncu kenari");
        uckenar=sc.nextDouble();

        cevre=2*((brkenar+ikenar+uckenar)/2);
        alan=alan = cevre * (cevre - brkenar) * (cevre - ikenar) * (cevre - uckenar);

        System.out.println("Ucgenin Cevresi: " + cevre);
        System.out.println("Ucgenin Alani: " +alan);
    }
}
