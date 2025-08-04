import java.util.Scanner;

public class Ex06 {
    public static void main (String[] args) {
        Scanner ler = new Scanner (System.in);
        int soma = 0;
        int v[] = new int [10];

        for (int i = 0; i < v.length; i++){
            System.out.println("Informe o " + (i+1) + "º Valor..: ");
            v[i] = ler.nextInt ();
            soma = soma + v [i];
        }
        if (soma >15){
            System.out.println("A soma dos valores do vetor é: " + soma);
        } else {
            System.out.println("A soma dos valores é menor que 15");
        }
    }
}
