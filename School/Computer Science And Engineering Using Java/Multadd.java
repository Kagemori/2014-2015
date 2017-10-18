package multadd;
/**
 *
 * @author keith_000
 */
public class Multadd {
    public static void multadd(double j, double k, double l) {
        double answer = j*k + l;
        System.out.println(answer);
    }
    public static void yikes(double p) {
        double a0 = p;
        double b0 = Math.exp(-p);
        double c0 = Math.sqrt(1.0 - b0);
        multadd(a0, b0, c0);
    }
    public static void newLine() { //I used the example from the book to separate the parts.
        System.out.println("");
    }
    public static void tripleLine() {
        newLine();
        newLine();
        newLine();
    }
    public static void main(String[] args) {
        System.out.print("Multadditionization Answer is: ");
        multadd(1.0, 2.0, 3.0);
        newLine();
        //I wanted to separate the parts on the program.
        double a = Math.cos(Math.PI/4.0);
        double b = 1.0/2.0;
        double c = Math.sin(Math.PI/4.0);
        System.out.print("The Answer to 'sin(pi/4)+(cos(pi/4)/2)' is ");
        multadd(a, b, c);
        System.out.print("The Rounded Answer is "); //The lengthy answer bothered me so I wanted to make it shorter.
        System.out.println(Math.round(a*b + c));
        newLine();
        //Separating again.
        double x = 1.0;
        double y = Math.log(10);
        double z = Math.log(20);
        System.out.print("The Answer to 'log(10)+log(20)' is ");
        multadd(x, y, z);
        System.out.print("The Rounded Answer is ");
        System.out.println(Math.round(x*y + z));
        tripleLine();
        
        System.out.print("'Yikes' Example Using 5: ");
        yikes(5);
    }
    
}
