package encryptionex95;

import java.math.BigInteger;

public class EncryptionEX95 {

    public static void main(String[] args) {
        pow(1020304050, 10000);
    }
    public static BigInteger pow(int x, int n){
        BigInteger z = BigInteger.valueOf(x);
        BigInteger One = BigInteger.valueOf(1);
        if (n == 0) {
            System.out.println(One);
            return One;
        }
        BigInteger t = pow(x, n/2);
        if (n%2 == 0){
            System.out.println(t.multiply(t));
            return t.multiply(t);
        } else {
            System.out.println(t.multiply(t).multiply(z));
            return t.multiply(t).multiply(z);
        }
    }
}
