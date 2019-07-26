import java.util.ArrayList;
import java.util.List;

public class Hidden extends Palavra{

    private String hidden;
    private int i = 0;


    public void criaHidden(){

        this.hidden = "_";

        for (i = 1; i < this.getTam(); i++) {

            this.hidden = this.hidden + " _";


        }

        preencheHidden(' ');

    }

    public boolean preencheHidden(char letra){
        List<Integer> v= new ArrayList<Integer>();

         v = this.checkLeter(letra);

        StringBuilder s = new StringBuilder(this.hidden);

        if (v.isEmpty()){             //confere se a letra foi encontrada alguma vez na palavra. senao retorna true.

            return true;
        }




        for (Integer i : v){           //substiu a letra no lugar correto

            s.setCharAt(i*2, letra);

        }

        this.hidden = s.toString();

        return false;
    }

    public boolean checkLeft(){

        for (int i = 0; i < this.getTam(); i++) {

            if (this.hidden.charAt(i*2) == '_') {
                return true;
            }


        }

        return false;
    }

    public void printHidden()
    {

        System.out.println(hidden);

    }

}
