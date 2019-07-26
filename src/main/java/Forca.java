import java.util.ArrayList;
import java.util.List;

public class Forca {


    public void printForca(int i) {
        int tamforca = 5; //tamanho de vforca
        List<String> vforca= new ArrayList<String>();

        if (i < tamforca) {

            vforca.add("");
            vforca.add("");
            vforca.add("");
            vforca.add("");
            vforca.add("");
            System.out.println(vforca.get(i));

        }





    }

    public void start(){

        Hidden palavra = new Hidden();
        Letra letra = new Letra();


        //inicia coisas relevantes pra forca
        palavra.setPalavra();
        palavra.criaHidden();
        palavra.printHidden();


        //jogo
        boolean errou;
        int limite = 5;
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
