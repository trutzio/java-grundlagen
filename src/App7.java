class App7 {

    public static void main(String[] args) {
        int[] zahlen = {9, 5, 4, 5};
        zahlen[0] = 20; // schreibender Zugriff
        for (int zahl : zahlen) {
            System.out.println(zahl);
        }
        System.out.println(zahlen[0]); // lesender Zugriff
        
    }

}
