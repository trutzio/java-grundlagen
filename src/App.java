class App {
    public static void main(String[] args) {

        Tier affe1 = new Tier();
        Tier affe2 = new Tier();
        affe1.hoehe = 100;
        affe2.hoehe = 20;
        affe1.wachse();
        affe2.wachse();
        affe2.wachse();
        System.out.println(affe1.hoehe);
        System.out.println(affe2.hoehe);
        affe2.wachse();

        affe2.behausung = new Behausung();
        System.out.println(affe2.behausung);

        affe2.behausung.name = "Palme";


    }
}