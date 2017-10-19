/*

    DEVELOPED BY MARKUS REICHL
    - 23.10.14
    # übertriebener Header ...

 */

import javax.swing.JOptionPane;
public class au01k
{
    public static void main()
    {
        String input = "";
        do {
            input = JOptionPane.showInputDialog("Bitte eine Email-Adresse im Format max.mustermann@provider.land eingeben");
        } while(input.indexOf('.') < 0 || input.indexOf('@') < 0);
        
        System.out.println("Land: "+land(input)+"");
        System.out.println("Name: "+vorname(input)+" "+nachname(input)+"");
        System.out.println("Provider: "+provider(input)+"");
    }
    
    public static String land(String input)
    {
        String land = input.substring(input.lastIndexOf('.') + 1, input.length());
        if(land.length() < 2) return "Ungültig";
        switch(land) {
            case "at": land = "Austria";
                       break;
            case "de": land = "Germany";
                       break;
            case "eu": land = "Europa";
                       break;
            default  : land = "Unbekannt";
        } 
        return land;
    }
    
    public static String vorname(String input)
    {
        String vorname = input.substring(0, input.indexOf('.'));
        if(vorname.length() < 2) return "Ungültig"; 
        return vorname;
    }
    
    public static String nachname(String input)
    {
        String nachname = input.substring(input.indexOf('.') + 1, input.indexOf('@'));
        if(nachname.length() < 2) return "Ungültig"; 
        return nachname;
    }
    
    public static String provider(String input)
    {
        String provider = input.substring(input.indexOf('@') + 1, input.lastIndexOf('.'));
        if(provider.length() < 3) return "Ungültig"; 
        return provider;
    }
}
