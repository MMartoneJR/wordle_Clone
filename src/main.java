import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String[] tentativas = new String[6];
        dicionario dicionario = new dicionario();
        String[] input = new String[6];
        String escolhida;
        int count = 0;
        int decisao = 0;

        System.out.println("Wordle / Termooo Clone");
        escolhida = dicionario.palavraAleatoria();
        System.out.println("Termo roletado: "+ escolhida);
        System.out.println();

        for (int i=0 ; i<tentativas.length ; i++ ){
            System.out.printf("Tentativa %d: ", i+1);
            System.out.println(tentativas[i]);
        }
        System.out.println();

        while(count != 6) {
            System.out.printf("%da Tentativa: ", (count+1));
                input[count] = sc.nextLine();
                //dicionario.validacao(input[count]);

            System.out.println();

            for (int i=0 ; i<tentativas.length ; i++ ){
                System.out.printf("Tentativa %d: ", i+1);
                tentativas[i] = input[i];
                System.out.println(tentativas[i]);
            }
            if(Objects.equals(input[count], escolhida)){
                decisao = 1;
                count = 6;
            }
            else {
                count++;
            }
        }
        System.out.println();

        if (decisao == 1){
            System.out.println("Você venceu!");
        }
        else{
            System.out.println("Tente outra vez.");
        }
    }
}
