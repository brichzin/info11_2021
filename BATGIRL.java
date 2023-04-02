/**
 * Beschreiben Sie hier die Klasse BATGIRL.
 * 
 * @author (Peter Brichzin) 
 * @version (2023 )
 */
public class BATGIRL extends SPIELFIGUR
{
    private String wahrerName;
    private boolean batmanKleidungAn;
    

    /**
     * Konstruktor für Objekte der Klasse CopyOfBATMAN
     */
    public BATGIRL()
    {
        super(12, 10, 10);
        wahrerName = "Barbara Gordon";
        batmanKleidungAn = false;
        
    }

    /**
     * Methode zur Rueckgabe einer Charakterbeschreibung
     * 
     * @return Charakterbeschreibung 
     */
    public String CharakterbeschreibungAlsZeichenketteGeben()
    {
        return "Batgirl gibt dem Verbrechen keine Chance!";
    }
    
    void EigenschaftenAusGeben()
    {
        System.out.println("Meinen wahren Namen verrate ich nicht!");
        System.out.println("Bin ich gerade in Action? " + batmanKleidungAn);
    }
    
}
