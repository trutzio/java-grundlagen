import java.util.HashMap;

public class App10 {
    public static void main(String[] args) {
        HashMap dictionary = new HashMap();
        dictionary.put("7", "ABC");
        dictionary.put("7", "ABD");
        System.out.println(dictionary.get("7"));
    }
    
}
