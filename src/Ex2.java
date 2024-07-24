public class Ex2 {
    public static void main(String[] args) {
        String[] nome = {"Samira", "Carolina", "Cecília", "PG"};
        String[][] aprovados = {
                {"V", "F", "V", "F", "V"},
                {"V", "F", "F", "F", "V"},
                {"F", "F", "F", "V", "F"},
                {"F", "V", "V", "F", "V"}
            };
        double[] cont = new double[4];

        for (int i = 0; i < nome.length; i++){
            for (int j = 0; j < 5; j++){
                if (aprovados[i][j] == "V")
                    cont[i]++;
            }
            if(cont[i]*100/5 >= 50)
                System.out.println(nome[i]+" foi aprovado!");
            else System.out.println(nome[i]+" foi reprovado!");
        }
    }

}
