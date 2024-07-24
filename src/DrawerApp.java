import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class DrawerApp {
    // fazer programa que pegue um nome aleatorio dentro de uma lista
    // permitir que o usuario digite os nomes a serem sorteados
    // GUARDAR PROGRAMA PQ EH SORTEADOR

    public static void main(String[] args) {

//        boolean start = true;
//        List<String> nomes = new ArrayList<>();
//
//        while (start) {
//            String nome = scan("Escreva um nome: ").nextLine();
//            nomes.add(nome);
//
//            System.out.println("Deseja continuar? Escreva 1 para NÃO ou qualquer outro valor para SIM");
//            int mod = scan("").nextInt();
//            if(mod == 1) start = false;
//        }

        // usuario inserir nome por nome com for
        int n = scan("Escreva quantos nomes voce deseja inserir: ").nextInt();
        List<String> nomes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String nome = scan("Escreva um nome: ").nextLine();
            nomes.add(nome);
        }

        // pegar nome aleatorio da lista

        int randomNum = (int) (Math.random() * nomes.size());
        System.out.println(nomes.get(randomNum));


    }

    public static Scanner scan(String message) {
        System.out.println(message);
        return new Scanner(System.in);
    }
}
