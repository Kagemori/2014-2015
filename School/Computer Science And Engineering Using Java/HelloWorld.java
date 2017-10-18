import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JOptionPane;

     /**

      * The HelloWorld class implements an applet that

      * simply displays "Hello World!".

      */

     public class HelloWorld extends Applet {
         
         String Input1 = JOptionPane.showInputDialog("Enter First Number");
         int number1 = Integer.parseInt(Input1);
         
         String Input2 = JOptionPane.showInputDialog("Enter Second Number");
         int number2 = Integer.parseInt(Input2);
         
         String Input3 = JOptionPane.showInputDialog("Enter Third Number");
         int number3 = Integer.parseInt(Input3);
         
         int total = number1 + number2 + number3;
         int average = total/3;
         
         public void paint(Graphics g) {

             g.drawString("Hello World Applet", 50, 20);
             
             g.drawString("Keith Estrella", 50, 45);
             
             super.paint(g);
             g.drawRect(45,5,110,70);
             g.drawString("The Average is: " + average, 50, 70);
         }
     }