import java.util.Scanner;

public class Letra {

    private String letra;
    private char c;
    private String jaTentadas = "";

    public void setLetra() {

        Scanner scanner = new Scanner(System.in);
        this.letra = scanner.nextLine().toLowerCase();
        if ((this.letra.isEmpty()) || (this.letra.length() != 1) || (this.jaTentadas.contains(this.letra)) || (false /*aqui caso queira acrescentar restrição de caracteres utilizados*/)) {
            System.out.println("Letra invalida. tente novamente");
            this.setLetra();
        }
        else {

            this.c = this.letra.charAt(0);
            this.jaTentadas += this.c + " ";
        }
    }

        public char getLetra() {
        return this.c;
    }


    public void printJaTentadas(){
        System.out.println(this.jaTentadas);
    }

}
