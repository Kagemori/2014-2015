package factoralex75;
public class FactoralEX75 {
    public static void main(String[] args) {
        double a = .1;
        double b = -.1;
        check(5);
        oneLn();
        System.out.println("Check for .1, 1, and 10:");
        oneLn();
        while(a < 11){
            check(a);
            oneLn();
            a = a*10;
        }
        oneLn();
        System.out.println("Check for -.1, -1, -10:"); //There seems to be an error when it checks for -1.
        while(b > -11){
            check(b);
            oneLn();
            b = b*10;
        }
    }
    public static int myExp(int n){
        if(n == 0){
            return 1;
        }else{
            int fact = myExp(n-1);
            int ans = n*fact;
            return ans;
        }
    }
    public static void check(double x){
        double mathpow = Math.exp(x);
        int mathexp = myExp((int) x);
        System.out.print("X: " + x + "\t  ");
        System.out.print("Euler's Number: " + mathpow + "\t");
        System.out.println("MyExp: " + mathexp);
    }
    public static void oneLn(){
        System.out.println("");
    }
}
