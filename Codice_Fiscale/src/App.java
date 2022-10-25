import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String codFiscale = "";
        String vocali = "aeiouAEIOU";
        Map<String, String> Associazione_mesi = new HashMap<String, String>();
        Associazione_mesi.put("01", "a");
        Associazione_mesi.put("02", "b");
        Associazione_mesi.put("03", "c");
        Associazione_mesi.put("04", "d");
        Associazione_mesi.put("05", "e");
        Associazione_mesi.put("06", "h");
        Associazione_mesi.put("07", "l");
        Associazione_mesi.put("08", "m");
        Associazione_mesi.put("09", "p");
        Associazione_mesi.put("10", "r");
        Associazione_mesi.put("11", "s");
        Associazione_mesi.put("12", "t");

        System.out.println("Inserisci Nome");
        String nome = scanner.next();
        System.out.println("Inserisci Cognome");
        String cognome = scanner.next();
        System.out.println("Inserisci Sesso, M o F");
        String sesso = scanner.next();
        System.out.println("Inserisci Luogo di Nascita");
        String luogoNascita = scanner.next();
        System.out.println("Inserisci Provincia");
        String provincia = scanner.next();
        System.out.println("Inserisci giorno di nascita");
        String giorno_Nascita = scanner.next();

        for(int i=0; i < cognome.length(); i++){

            if(!vocali.contains("" + cognome.charAt(i))){
                codFiscale += cognome.charAt(i);
            }
            if(codFiscale.length() == 3)
                break;
        }
        for(int i=0; i < nome.length(); i++){
            if(!vocali.contains("" + nome.charAt(i))){
                codFiscale += nome.charAt(i);
            }
            if(codFiscale.length() == 6)
                break;
        }
        
        
        codFiscale += giorno_Nascita.substring(8,10) ; 
        codFiscale += Associazione_mesi.get(giorno_Nascita.substring(3,5));
        if(sesso.toUpperCase().contains("F"))
            codFiscale += (Integer.parseInt(giorno_Nascita.substring(0,2)) + 40);
        else
            codFiscale += giorno_Nascita.substring(0,2);



        
      File myObj = new File("comuni.txt");
      Scanner myReader = new Scanner(myObj);
      System.out.println(myReader);

        
         
        System.out.println(codFiscale);

        
    }
}
