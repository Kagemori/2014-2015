package can;

public class Can {

    public static void main(String[] args) {
        double v = 355;
        
        double r = Math.cbrt((2*v)/(4*Math.PI));
        double h = (v)/(Math.PI*Math.pow(r,2));
        double sa = (2*Math.PI*Math.pow(r,2)) + ((2*v)/r);
        double minsa = (4*Math.PI*r) + (2*v)/Math.pow(r,2);
        
        System.out.println("I recommend that the cans' dimensions should be changed to have a radius of: " + r + " and a height of: " + h);
        System.out.println("The surface area of the can is: " + sa);
        System.out.println("The minimum surface are of the can is: " + minsa);
        
        packageLayout(2,2,3,r,v); //Adjust the 3 Numbers, Length, Width, Height.
        
    }
    
    public static void packageLayout(double x, double y, double z, double r, double v){
        if(x*y*z != 12){
            System.out.println("This arrangement cannot work.");
        } else {
            double l = (r*2)*(x);
            double w = (r*2)*(y);
            double h = (v)/(Math.PI*Math.pow(r,2))*(z);
            double sarp = (2*l*h) + (2*w*h) + (2*l*w);
            
            System.out.println("The Surface Area of the Can Arrangement is: " + sarp);
        }
    }
}
