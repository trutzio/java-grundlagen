public class Katze extends Tier {
 void miau () {
    System.out.println("Miau!");
 } 
 void bewege() {
    System.out.println("Bewege dich!");
 } 
 void wachse() {
    super.wachse();
    super.wachse();
}
}
