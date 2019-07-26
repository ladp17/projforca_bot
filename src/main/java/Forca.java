import java.util.ArrayList;
import java.util.List;

public class Forca {


    public void printForca(int i) {
        int tamforca = 8; //tamanho de vforca
        List<String> vforca= new ArrayList<String>();

        if (i < tamforca) {

            vforca.add("|——-    \n" +
                       "|       \n" +
                       "|       \n" +
                       "|       \n" +
                       "|       \n" +
                       "|__     ");

            vforca.add("|——-    \n" +
                       "|   ô   \n" +
                       "|       \n" +
                       "|       \n" +
                       "|       \n" +
                       "|__     ");

            vforca.add("|——-    \n" +
                       "|   ô   \n" +
                       "|   |   \n" +
                       "|       \n" +
                       "|       \n" +
                       "|__     ");

            vforca.add("|——-    \n" +
                       "|   |   \n" +
                       "|   ô   \n" +
                       "|  /|   \n" +
                       "|       \n" +
                       "|__     ");

            vforca.add("|——-    \n" +
                       "|   ô   \n" +
                       "|  /|\\ \n" +
                       "|       \n" +
                       "|       \n" +
                       "|__     ");

            vforca.add("|——-    \n" +
                       "|   ô   \n" +
                       "|  /|\\ \n" +
                       "|  /    \n" +
                       "|       \n" +
                       "|__     ");

            vforca.add("|——-    \n" +
                       "|   ô   \n" +
                       "|  /|\\ \n" +
                       "|  / \\ \n" +
                       "|       \n" +
                       "|__     ");

            vforca.add("|——-    \n" +
                       "|   |   \n" +
                       "|   x   \n" +
                       "|  /|\\ \n" +
                       "|  / \\ \n" +
                       "|_<     ");

            System.out.println(vforca.get(i));

        }





    }

    public void start(){

        Hidden palavra = new Hidden();
        Letra letra = new Letra();


        //inicia coisas relevantes pra forca
        palavra.setPalavra();
        palavra.criaHidden();
        printForca(0);
        palavra.printHidden();


        //jogo
        boolean errou;
        int limite = 7;
        int erro = 0;



        letra.setLetra();
        errou = palavra.preencheHidden(letra.getLetra());
        if (errou){
            erro++;
        }

        while (palavra.checkLeft() && (erro < limite)) {

            printForca(erro);
            letra.printJaTentadas();
            palavra.printHidden();
            letra.setLetra();
            errou = palavra.preencheHidden(letra.getLetra());
            if (errou){
                erro++;
            }

        }


        printForca(erro);
        letra.printJaTentadas();
        palavra.printHidden();

        if (erro == limite) {
            System.out.println("mais sorte na proxima");

        }
        else{
            System.out.println("parabens vc ganhou!");
        }

    }

}
