import java.util.LinkedList;

public class App9 {
    public static void main(String[] args) {
        LinkedList liste = new LinkedList();
        System.out.println(liste.size());
        liste.add("Nektarinen");
        liste.add("Äpfel");
        System.out.println(liste.size());
        System.out.println(liste.getLast());
    }
    
}
