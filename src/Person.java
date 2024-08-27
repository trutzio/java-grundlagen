class Person {
    String nachname;
    String vorname;


    Adresse anschrift;
    Person(Adresse m, String n, String v) {
        anschrift = m;
        nachname = n;
        vorname = v;
        System.out.println(m.strasse);
    }

    Person(String n, String v) {
        System.out.println(n);
        System.out.println(v);
        nachname = n;
        vorname = v;
    }
   
   

}
