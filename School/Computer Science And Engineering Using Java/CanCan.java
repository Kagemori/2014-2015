/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancan;

import java.util.Scanner;

/**
 *
 * @author 15waitera
 */
public class CanCan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            double V, x, y, z, arr;
        System.out.print ("What is the Volume of the can? ");
        V = reader.nextDouble ();
        
        double r = Math.cbrt((2*V)/(4*Math.PI));
        //Finds the 'Radius' based on the 'Volume'
        double h = (V)/(Math.PI*Math.pow(r,2));
        //Finds the 'Height' based on the 'Radius' and 'Volume'
        double sa = (2*Math.PI*Math.pow(r,2)) + ((2*V)/r);
        //Finds the 'Surface Area' of the can. (This is an added feature)
        double minsa = (4*Math.PI*r) + (2*V)/Math.pow(r,2);
        //Finds the 'Minimum Surface Area' of the can. (This is an added feature)
        System.out.println ("Radius = " + r);
        System.out.println ("Height = " + h);
        
        System.out.print ("Length of Box: ");
        x = reader.nextDouble ();
        //Dimension of the 'x Coordinate'
        System.out.print ("Width of Box: ");
        y = reader.nextDouble ();
        //Dimension of the 'y Coordinate'
        System.out.print ("Height of Box: ");
        z = reader.nextDouble ();
        //Dimension of the 'z Coordinate'
        System.out.print ("Total number of cans per box: ");
        arr = reader.nextDouble ();
        //Can's 'Arrangement Number' (Total number of cans per box)
        if(x*y*z != arr){
            //Equation for 'Can Arrangement'
            System.out.println("This arrangement cannot work.");
            //The Dimension must equal 12 or else it will not work.
        } else {
            double lgth = (r*2)*(x);
            //Equation for 'Length'
            double wide = (r*2)*(y);
            //Equation for 'Width'
            double hght = (V)/(Math.PI*Math.pow(r,2))*(z);
            //Equation for 'Height'
            double sarp = (2*lgth*hght) + (2*wide*hght) + (2*lgth*wide);
            //'Surface Area' for 'Can Arrangement'
           
            System.out.println("I recommend that the cans' dimensions should be changed");
            System.out.println("to have a radius of: " + r + " and a height of: " + h);
            System.out.println(" ");
            System.out.println("The surface area of the can is: " + sa);
            System.out.println("The minimum surface area of the can is: " + minsa);
            System.out.println("The Surface Area of the Can Arrangement is: " + sarp);
        }
    }
    
}
