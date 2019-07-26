import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palavra{

    private int tam;
    private String palavra;

    public void setPalavra(){

        Scanner scanner = new Scanner(System.in);
        this.palavra = scanner.nextLine().toLowerCase();
        if (this.palavra.isEmpty()){
            System.out.println("Palavra invalida. tente novamente");
            this.setPalavra();
        }

    }

    public String getPalavra(){

        return this.palavra;

    }


    public int getTam(){
        return this.palavra.length();
    }


    public List<Integer> checkLeter(char letra){  // preciso trocar o tipo disso aqui da mt bo

        List<Integer> v= new ArrayList<Integer>();; //vetor q guarda os indices onde foi encontrada a letra, mas num unico int. suponha q foi encontrada no i=0 e i=4 entao v = 400. tem um 0 de guarda como primeiro digito para evitar problemas


        for (int i = 0; i < this.getTam(); i++) {

            if (this.palavra.charAt(i) == letra) {
                v.add(i);
            }


        }

        return v;
    }



}

