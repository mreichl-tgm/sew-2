public class ZaehlHamster extends MeinHamster {
    private anzSchritte = 0;
    
    public void vor() {
        anzSchritte++;
    }
    
    public void schreibSchritte(anzSchritte) {
        super.schreib("Das waren " + anzSchritte + " Schritte");
    }
}