import java.util.Scanner;

public class pangkat {
    public static double hitungPangkat(double bilangan, double pangkat){
            return Math.pow(bilangan, pangkat);
    }
    public static void kalkulatorPangkat(){
        Scanner input = new Scanner(System.in);
        System.out.println("masukan angka yang akan dipangkatkan : ");
        double bilangan = input.nextDouble();
        System.out.println("masukan pangkat : ");
        double pangkat = input.nextDouble();

        try {
            hitungPangkat(bilangan, pangkat);
            System.out.println(+bilangan + "dipangkatkan " + pangkat + " adalah : " + hitungPangkat(bilangan, pangkat));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
