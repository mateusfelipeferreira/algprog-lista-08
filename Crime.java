import java.util.Scanner;
import java.util.ArrayList;

public class Crime {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<String> perguntas = new ArrayList<>();

        perguntas.add("Telefonou para a vitima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vitima?");
        perguntas.add("Devia para a vitima?");
        perguntas.add("Ja trabalhou com a vitima?");

        ArrayList<String> respostas = new ArrayList<>();

        int positivas = 0;

        for (int i = 0; i < perguntas.size(); i++) {
            System.out.println(perguntas.get(i));
            System.out.print("Digite s para sim ou n para nao: ");

            String resposta = entrada.nextLine().toLowerCase();

            respostas.add(resposta);

            if (resposta.equals("s")) {
                positivas++;
            }
        }

        if (positivas == 2) {
            System.out.println("Classificacao: Suspeita");
        } else if (positivas == 3 || positivas == 4) {
            System.out.println("Classificacao: Cumplice");
        } else if (positivas == 5) {
            System.out.println("Classificacao: Assassino");
        } else {
            System.out.println("Classificacao: Inocente");
        }
    }
}
