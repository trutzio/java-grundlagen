class Person {
    String nachname = "NONAME";
    String vorname = "NONAME";

    Adresse anschrift;

    

    Person(String n, String v) {
        System.out.println(n);
        System.out.println(v);
        nachname = n;
    }
}
