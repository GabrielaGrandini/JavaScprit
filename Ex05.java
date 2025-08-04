import java.util.Scanner;

public class Ex05 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);

        String nomes[] = new String [5];

        for (int i = 0; i < nomes.length; i++){
            System.out.print("Informe o " + (i+1) + "º nome..: ");
            nomes[i] = ler.next();
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Os nomes são: " + nomes[i]);
        }

    }
}
