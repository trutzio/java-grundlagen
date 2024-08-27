class App8 {

    public static void main(String[] args) {
        App8 calculator = new App8();
        assert(calculator.fac(1) == 1);
        assert(calculator.fac(2) == 2);
        assert(calculator.fac(3) == 6);
        assert(calculator.fac(4) == 24);
        assert(calculator.fac(10) == 3_628_800);
        int result = calculator.fac(2);
        System.out.println(result);
    }

    int fac(int n) {
        if(n==1) {
            return 1;
        }
        if(n==2) {
            return 2;
        }
        if(n>2) {
            int result = 1;
            for(int i=n; i>=2; i--) {
                result = i * result;
            }
            return result;
        }
        return 0;
    }
    
}
