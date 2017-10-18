package squareroot;
public class SquareRoot {
    public static void main(String[] args) {
        squareRoot(9,6,0);
    }
    public static void squareRoot(double a, double x, double n){
        double p1 = (x+a/x);
        double root = p1/2;
        System.out.println(root);
        if (n != 10){
            squareRoot(a,root,n+1);
        } else if (n == 10){
        }
    }
}
