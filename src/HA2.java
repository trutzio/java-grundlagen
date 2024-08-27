class HA2 {
    public static void main(String[] args) {
    
        int n = 10_000; // kleine Korrektur von Christian

        int[] zahlen = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            zahlen [i] = i + 1;
        }
        
        for (int zahl : zahlen) {
            System.out.println(zahl);
        }
        System.out.println(zahlen[50]);
    }
    
}
