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
    public void pntRat(){
        System.out.println(numerator + "/" + denominator);
    }
    public void negate(){
        int negNumerator = -1 * numerator;
        numerator = negNumerator;
    }
    public void invert(){
        int oldNum = numerator;
        int oldDen = denominator;
        numerator = oldDen;
        denominator = oldNum;
    }
    public double toDouble(){
        double num = numerator;
        double den = denominator;
        return num / den;
    }
    public static int GCD(int x, int y){
        if (y == 0){
            return x;
        }
        int z = x % y;
        return GCD(y,z);
    }
    public void reduce(){
        int gcd = GCD(numerator,denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }
    public Rational add(Rational that){
        int newNum = numerator * that.denominator + denominator * that.numerator;
        int newDen = denominator * that.denominator;
        Rational newRat = new Rational(newNum,newDen);
        newRat.reduce();
        return newRat;
    }
    public static void main(String[] args) {
        Rational rationalA = new Rational();
        rationalA.numerator = -2;
        rationalA.denominator = 3;
        rationalA.pntRat();
        
        space();
        
        Rational rationalB = new Rational(4,5);
        rationalB.pntRat();
        
        space();
        
        rationalA.negate();
        rationalA.pntRat();
        
        space();
        
        rationalA.invert();
        rationalA.pntRat();
        
        space();
        
        double dec = rationalA.toDouble();
        System.out.println(dec);
        
        space();
        
        Rational rationalC = new Rational(7,21);
        rationalC.pntRat();
        rationalC.reduce();
        rationalC.pntRat();
        
        space();
        
        Rational rationalD = rationalB.add(rationalC);
        rationalD.pntRat();
    }
}

/*  15.4 Part 3
        Object methods to me is useful since parameters are not as necessary.
        The only problem with it is that you have to know which object the method is referring to such as this. or that..
        I prefer to use parameters but I do know it requires slightly more coding.
        Object methods are more concise but I feel more comfortable using class methods.
        Overall both methods are useful it's just that object methods are somewhat new to me so I don't really use it.
*/