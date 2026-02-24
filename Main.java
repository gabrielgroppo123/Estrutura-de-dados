import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception{
        Vetor vetor = new Vetor(5);
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        System.out.println("Quantidade de dados no vetor: " + vetor.tamanho());
        System.out.println("Dados do vetor: " + vetor.toString());
        System.out.println("Dado na Segunda posicao do vetor: " + vetor.busca(1));
        System.out.println("Posicao da informacao do vetor: " + vetor.busca1("elemento 2"));

        vetor.adicionarInicio(0, "elemento 0");
        System.out.println("Quantidade de dados no vetor: " + vetor.tamanho());
        System.out.println("Dados no vetor: " + vetor.toString());
    }
}