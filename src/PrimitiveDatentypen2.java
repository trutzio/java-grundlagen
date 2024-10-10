public class PrimitiveDatentypen2 {
    public static void main (String[] args){
        //Gegeben ist  boolean hans = false;  
        //Mache aus hans ein byte. Als Initialwert soll der Wert 0 drin stehen.

        byte hans  = 0;

        //hans soll  jetzt den  Wert 1 bekommen.
         hans = 1; 

        //Ann.:  wissen nicht, was in hans  drin; soll nur um 1 erhöht werden

        hans = hans + 1; //1 versteht der Compiler als integer  (nächster Datentyp)
        //muss 1  in ein byte verwandeln

        hans = hans + 1b;
        hans = hans + (byte)1;
        //in andern Programiersprachen  klappt das wohl, hier aber nicht, wohl Sonderfall mit short

        //Weise  hans Wert 200 zu.
        hans = 200; //Christian dachte, dass es klappt ;-)

        //Mache aus  byte den  Datentyp  short
    
    }
}
