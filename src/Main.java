import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // fazer vetor de 2 dimensões com 4 posições relacionando o faturamento de uma empresa.
        // o ultimo indice de cada posiçao corresponde ao aturamento de cada trimestre
        // 1) calcular o total do faturamento do ano todo
        // 2) calcular o total do faturamento do meio de cada trimestre
        // 3) calcular o total do faturamento do início do ultimo trimestre, meio do segundo e final do primeiro

        double[][] matriz = new double[3][3];
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    matriz[i][j] = scan("M["+i+"]["+j+"] = ").nextDouble();
                }
                System.out.println("\t");
            }

            double[] total1 = new double[3];
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    total1[i] = total1[i] + matriz[i][j];
                }
                System.out.println(total1[i]);
            }

            double[] total2 = new double[3];
            for (int i = 0; i < 3; i++){
                total2[i] = total2[i] + matriz[i][1];
                System.out.println(total2[i]);
            }

            double total3 = 0;
                total3 = total3 + matriz[2][0] + matriz[1][1] + matriz[0][2];
        System.out.println("Faturamento do inicio do ultimo, meio do segundo e fim do primeiro: "+total3);

    }
    public static Scanner scan(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }
}