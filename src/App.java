import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aprendendo sobre Collections em Java.");

        //Lista que permite elementos duplicados mantém ordem de inserção
        List<String> nomes = new ArrayList<>();
        //Inserindo os elementos
        nomes.add("Maria");
        nomes.add("Gabi");
        nomes.add("João");

        //Acessando os elementos pelo índice
        System.out.println("ArrayList<> - Segundo elemento: " + nomes.get(1));

        //Removendo elemento
        nomes.remove(2);

        //Percorrendo a lista
        for(String nome: nomes) {
            System.out.println("Elemento "+nomes.indexOf(nome)+": " + nome);
        }

    }
}
