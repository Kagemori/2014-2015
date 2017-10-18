package euclid.s.algorithm;

public class EuclidsAlgorithm {

    public static void main(String[] args) {
        gcd(36,20);
    }
    public static void gcd(int x, int y){
        int r = x%y;
        if (r != 0){
            gcd(y,r);
        } else if (r == 0){
            System.out.println("The GCD is " + y);
        }
    }
}
