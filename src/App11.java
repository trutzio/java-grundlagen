public class App11 {
  public static void main(String[] args) {
    Tier cleo = new Katze();
    cleo.wachse();
    System.out.println(cleo.hoehe);
    ((Katze)cleo).miau();
  } 
   
}
