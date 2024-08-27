class HA2 {
    public static void main(String[] args) {
    
        int[] zahlen = new int[10_000];
        for (int i = 0; i <= 9_999; i++) {
            zahlen [i] = i + 1;
        }
        
        for (int zahl : zahlen) {
            System.out.println(zahl);
        }
        System.out.println(zahlen[50]);
    }
    
}
