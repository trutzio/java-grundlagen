class App2 {
    public static void main(String[] args) {

        Person tabea = new Person();
        Person christian = new Person();

        tabea.nachname = "Kaempf";
        christian.nachname = "Trutz";
        tabea.vorname = "Tabea";
        christian.vorname = "Christian";

        Adresse anschrift = new Adresse();
        anschrift.hausnummer = 24;
        anschrift.postleitzahl = 45772;
        
        tabea.anschrift = anschrift;
        christian.anschrift = anschrift;

        System.out.println(tabea.nachname);
        System.out.println(tabea.vorname);

        System.out.println(christian.nachname);
        System.out.println(christian.vorname);

        System.out.println(tabea.anschrift.strasse);
        System.out.println(tabea.anschrift);
        System.out.println(christian.anschrift);
    }
    
}
