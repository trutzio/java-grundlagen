class App13 {

    public static void main(String[] args) {
        try {
            try {
                Behausung behausung = null;
                System.out.println(behausung.toString());
            } catch (NullPointerException nullPointerException) {
                System.out.println("SONDERBEHANDLUNG");
                throw new RuntimeException("BLA");
            }
        } catch (RuntimeException runtimeException) {
            System.out.println("SONDERBEHANDLUNG II");
        }
        System.out.println("WEITER");
    }

}
