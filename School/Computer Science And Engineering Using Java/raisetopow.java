package raiseToPow;
public class raisetopow{    
    public static int raiseToPow (double x, double w) {
        double xw;
        xw = Math.pow((double)x, (double)w);
        return (int)xw;
    }
       
    public static void checkFermat(double a, double b, double c, double n){
        double a1 = raiseToPow(a,n);
        double b1 = raiseToPow(b,n);
        double c1 = raiseToPow(c,n);
        double answer = a1+b1;
        if (answer == c1){
            if (n > 2){
                System.out.println("Holy Smokes! Fermat was wrong!");
            }else{
                System.out.println("Nope, that didn't work... But the answer was equal!");
            }
        }else if (n > 2){
            System.out.println("Nope, that didn't work... But " + n + " is greater than 2!");
        }else{
            System.out.println("Nope, that didn't work...");
        }
    }
    
    public static void main(String[] args){
        checkFermat(3,4,5,2);
    }
}

