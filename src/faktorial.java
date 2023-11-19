import java.util.Scanner;

public class faktorial {

    public static double hitungFaktorial(int bilangan){
        if (bilangan == 0 || bilangan == 1){
            return 1;
        } else if (bilangan > 1) {
            long hasil = 1;
            for (int i = 2 ; i <= bilangan; i++){
                hasil *= i;
            }
            return hasil;
        } else {
            throw new IllegalArgumentException("bilangan tidak boleh non-negatif");
        }
    }
    public static void kalkulatorAkarKuadrat(){
        Scanner input = new Scanner(System.in);
        System.out.println("masukan angka yang akan difaktorialkan : ");
        int bilangan = input.nextInt();

        try {
            hitungFaktorial(bilangan);
            System.out.println("faktorial dari " + bilangan + " adalah : " + hitungFaktorial(bilangan));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
