//  faça um programa que permita cadastrar nomes e sobrenome e numeros de telefone
//  nao deve armazenar nomes repetidos e nem numeros repetidos
//  o programa nao pode aceitar numeros de telefone sem o ddd

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.*;


public class YellowPageApp {
    public static void main(String[] args) {

        // declaraçao da setlist
        // set p impedir que os dados dentro da matriz se repitam, pq arraylist permite
        // por que tem que colocar (Set<Set<String>>) antes da declaraçao das listas
        Set<Set<String>> dados =    (Set<Set<String>>)
                                    List.of(List.of("Isabela", "Samira", "Raiani"),
                                    List.of("3492222222", "11982888332", "33748394732"));
                                    // primeiro coleta nomes, depois coleta numeros

        for(int indice = 0; indice < dados.size(); indice++){
            System.out.println(dados.get(indice));
        }







    }
    public static Scanner scan(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}
