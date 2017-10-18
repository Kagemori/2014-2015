package rational;

public class Rational {
    
    int numerator, denominator;
    
    public Rational() {
        this.numerator = 0;
        this.denominator = 0;
    }
    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public static void space(){
        System.out.println();
    }
    public static void pntRat(Rational rational){
        System.out.println(rational.numerator + "/" + rational.denominator);
    }
    public static void negate(Rational rational){
        int numerator = rational.numerator;
        int negNumerator = -1 * numerator;
        rational.numerator = negNumerator;
    }
    public static void invert(Rational rational){
        int oldNum = rational.numerator;
        int oldDen = rational.denominator;
        rational.numerator = oldDen;
        rational.denominator = oldNum;
    }
    public static double toDouble(Rational rational){
        double num = rational.numerator;
        double den = rational.denominator;
        return num / den;
    }
    public static int GCD(int x, int y){
        if (y == 0){
            return x;
        }
        int z = x % y;
        return GCD(y,z);
    }
    public static void reduce(Rational rational){
        int gcd = GCD(rational.numerator,rational.denominator);
        rational.numerator = rational.numerator / gcd;
        rational.denominator = rational.denominator / gcd;
    }
    public static Rational add(Rational rationalA, Rational rationalB){
        int newNum = rationalA.numerator * rationalB.denominator + rationalA.denominator * rationalB.numerator;
        int newDen = rationalA.denominator * rationalB.denominator;
        Rational newRat = new Rational(newNum,newDen);
        reduce(newRat);
        return newRat;
    }
    public static void main(String[] args) {
        Rational rationalA = new Rational();
        rationalA.numerator = -2;
        rationalA.denominator = 3;
        pntRat(rationalA);
        
        space();
        
        Rational rationalB = new Rational(4,5);
        pntRat(rationalB);
        
        space();
        
        negate(rationalA);
        pntRat(rationalA);
        
        space();
        
        invert(rationalA);
        pntRat(rationalA);
        
        space();
        
        double dec = toDouble(rationalA);
        System.out.println(dec);
        
        space();
        
        Rational rationalC = new Rational(7,21);
        pntRat(rationalC);
        reduce(rationalC);
        pntRat(rationalC);
        
        space();
        
        pntRat(add(rationalB,rationalC));
    }
    
}
