public class App14 {
    public static void main(String[] args) {
        try {
            new App14().test();
        } catch (IllegalAccessException illegalAccessException) {

        }
    }

    void test() throws IllegalAccessException {
        throw new IllegalAccessException();
    }
}
