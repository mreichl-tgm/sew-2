import java.util.*;

public class test {
    public static void main() {
        Scanner s = new Scanner(System.in);
        int height;
        int width;        
        //Fragt nach Eingabe und prüft diese.
        do {
            try {
                System.out.println("Bitte die Höhe der Ausgabe festlegen zwischen 10 und 20");
                height = Integer.parseInt(s.nextLine());
                System.out.println("Bitte die Breite der Ausgabe festlegen zwischen 10 und 20");
                width = Integer.parseInt(s.nextLine());
                //Prüft Tabellenformat
                if ((height >= 10) && (height <= 20) && (width >= 10) && (width <= 20)) {
                    break;
                }else{
                    System.out.println("Format unzulässig!");
                }
            //Fängt NFE und E
            }catch (NumberFormatException e) {
                System.out.println("Bitte eine Zahl eingeben!");
            }catch (Exception e) {
                System.out.println("Eingabe unzulässig!");
            }
        }while (true);        
        //Füllt eine Tabelle vorgegebener Größe mit Zufallszeichen
        for (int i = 0; i < height; i++) {
            for ( int j = 0; j < width; j++) {
                System.out.print(rChar());
            }
            System.out.println();
        }
    }
    //Liefert ein zufälliges Zeichen
    public static char rChar(){
        int rNumber =(int)(Math.random()*(101+1)+100);
        char rChar = (char)rNumber;
        return rChar;
    }
}