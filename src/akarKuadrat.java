import java.util.Scanner;

public class akarKuadrat {
    public static double hitungAkarKuadrat(double bilangan){
        if (bilangan >= 0){
            return Math.sqrt(bilangan);
        }else {
            throw new IllegalArgumentException("bilangan harus non-negatif");
        }
    }
    public static void kalkulatorAkarKuadrat(){
        Scanner input = new Scanner(System.in);
        System.out.println("masukan angka yang akan diakar kuadratkan : ");
        double bilangan = input.nextDouble();

        try {
            hitungAkarKuadrat(bilangan);
            System.out.println("akar kuadrat dari " + bilangan + " adalah : " +hitungAkarKuadrat(bilangan));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
