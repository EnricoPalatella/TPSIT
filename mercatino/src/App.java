import java.util.Date;
import java.text.DateFormat;


public class App {
    public static void main(String args[])
    {
        
} 


    public class Negoziante{
        
        String nome;
        String cognome;
        Integer età;
        Date data;
        String professione;
        Stand stand;

        public Negoziante(String n, String c, Integer e, Date d, String p, Stand s){
                this.nome = n;
                this.cognome = c;
                this.età = e;
                this.data = d;
                this.professione = p;
                this.stand = s;
        }

    }

    public class Stand{
        String nome;
        Negoziante negoziante;

        public Stand(String n, Negoziante neg){

            this.nome = n;
            this.negoziante = neg;
        }


    }

    public class Articolo{
        String nome;
        Integer quantità;
        Integer prezzo;

        public Articolo(String n, Integer q, Integer p){
            this.nome = n;
            this.quantità = q;
            this.prezzo = p;
        }

    }
}
