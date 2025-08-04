import java.util.Scanner;

public class Ex02 {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Informe o primeiro número: ");
        n1 = ler.nextInt();
        System.out.print("Informe o segundo número: ");
        n2 = ler.nextInt();
        if (n1 == n2){
            System.out.print("Informe outro número diferente: ");
            n2 = ler.nextInt();
        }
        System.out.print("Informe o terceiro número: ");
        n3 = ler.nextInt();
        if (n3 == n2 || n1 == n3) {
            System.out.print("Informe outro número diferente: ");
            n3 = ler.nextInt();
        }

        if (n1 > n2 && n1 > n3) {
            System.out.print("O maior número é: " + n1);
        }
        else if (n2 > n1 &&  n2 > n3){
            System.out.print("O maior número é: " + n2);
        }
        else {
            System.out.print("O maior número é: " + n3);
        }

    }
}
