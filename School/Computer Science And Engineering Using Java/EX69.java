package ex6.pkg9;
class EX69 {
    public static void main(String[] args) {
        power(2,3);
    }
    public static int power(double x, int n){
        double xn = Math.pow(x,n);
        System.out.println(xn);
        if (n != 0){
            return (int) (x*power(x,n-1));
        }
        return 0;
    }
}
