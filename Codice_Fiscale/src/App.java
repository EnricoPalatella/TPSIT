import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String Codice_Fiscale = "";
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
        String Nome = scanner.next();
        System.out.println("Inserisci Cognome");
        String Cognome = scanner.next();
        System.out.println("Inserisci Sesso, M o F");
        String Sesso = scanner.next();
        System.out.println("Inserisci Luogo di Nascita");
        String Luogo_di_Nascita = scanner.next();
        System.out.println("Inserisci Provincia");
        String Provincia = scanner.next();
        System.out.println("Inserisci giorno di nascita");
        String Giorno_Nascita = scanner.next();

        for(int i=0; i < Cognome.length(); i++){
            if(!vocali.contains(""+Cognome.charAt(i))){
                Codice_Fiscale += Cognome.charAt(i);
            }
            if( Codice_Fiscale.length() == 3)
                break;
        }
        for(int i=0; i < Nome.length(); i++){
            if(!vocali.contains(""+Nome.charAt(i))){
                Codice_Fiscale += Nome.charAt(i);
            }
            if( Codice_Fiscale.length() == 6)
                break;
        }
        
        
        Codice_Fiscale += Giorno_Nascita.substring(8,10) ; 
        Codice_Fiscale += Associazione_mesi.get(Giorno_Nascita.substring(3,5));
        if(Sesso.toUpperCase().contains("F"))
        Codice_Fiscale += (Integer.parseInt(Giorno_Nascita.substring(0,2)) + 40);
        else
        Codice_Fiscale += Giorno_Nascita.substring(0,2);
         
        System.out.println(Codice_Fiscale);

        
    }
}
