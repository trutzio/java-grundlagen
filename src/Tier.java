abstract class Tier {

    String name = "NONAME";

    int hoehe;

    Behausung behausung;

    void wachse() {
        hoehe = hoehe + 1;
    }
   abstract void bewege(); 
}
