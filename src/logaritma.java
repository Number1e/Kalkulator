import java.util.Scanner;

public class logaritma {
    public static double hitungLogaritma(double bilangan){
        if (bilangan > 0){
            return Math.log(bilangan);
        }else {
            throw new IllegalArgumentException("bilangan tidak boleh non-negatif");
        }
    }
    public static void kalkulatorLogaritma(){
        Scanner input = new Scanner(System.in);
        System.out.println("masukan angka yang akan diLogaritmakan : ");
        double bilangan = input.nextDouble();

        try {
            hitungLogaritma(bilangan);
            System.out.println("Logaritma dari " + bilangan + " adalah : " + hitungLogaritma(bilangan));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
