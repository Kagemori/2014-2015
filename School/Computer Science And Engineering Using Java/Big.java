package big;

import java.math.BigInteger;

public class Big {
    public static void main(String[] args) {
        BigInteger input = BigInteger.valueOf(30);
        factorial(input);
        }
    public static BigInteger factorial(BigInteger f){
        BigInteger One = BigInteger.valueOf(1);
        BigInteger Zero = BigInteger.valueOf(0);
        BigInteger Fact0 = f.multiply(f.subtract(One));
        int count = 30;
        if(f.equals(Zero)){
            return One;
        }
        while (f.compareTo(Zero) > 0){
            System.out.print(count + " : ");
            count--;
            f = f.subtract(One);
            Fact0 = Fact0.multiply(f);
            System.out.println(Fact0);
        }
        return f.multiply(f.subtract(One));
    }
}