import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      boolean ulang = true;
      while (ulang) {
          Scanner input = new Scanner(System.in);
          System.out.println("===========PROGRAM KALKULATOR SEDERHANA==============");
          System.out.println("1. Akar kuadrat");
          System.out.println("2. Pangkat");
          System.out.println("3. Logaritma ");
          System.out.println("4. Faktorial");
          System.out.println("5. Keluar");
          System.out.println("Pilih Operasi 1/2/3/4/5 : ");
          int pilih = input.nextInt();
          switch (pilih) {
              case 1 :
                  akarKuadrat.kalkulatorAkarKuadrat();
                  break;
              case 2 :
                  pangkat.kalkulatorPangkat();
                  break;
              case 3 :
                  logaritma.kalkulatorLogaritma();
                  break;
              case 4 :
                  faktorial.kalkulatorAkarKuadrat();
                  break;
              case 5 :
                  ulang = false;
                  break;
              default:
                  System.out.println("pilihan tidak valid");
          }
          System.out.println();

      }
    }
}