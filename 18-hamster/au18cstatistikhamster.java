// Super.anzSchritte kommt aus der Hauptklasse
public class StatistikHamster extends MeinHamster() {
    private int anzSchritte = 0;
    private int anzBonusKoerner = 0;
    private String[] blickRichtung = {"Norden", "Osten", "Süden", "Westen"};
    private int counter = 0; // Zählt mein Array weil sich der Aufwand für eine Map oder ein Dictionary nicht lohnt. 
    
    public void vor() {
        this.anzSchritte++;
    }
    
    public void nimm() {
        this.anzBonusKoerner++;
    }
    
    public void linksUm() {
        this.counter++;
        
        if (this.counter == 3) {
            this.counter = 0;
        }
    }
        
    public void schreibStatistik() {
        super.schreib("Schritte: " + this.anzSchritte + "\n" + "Körner: " + this.anzBonusKoerner + "Blickrichtung: " + this.blickRichtung[this.counter]);
    }
}