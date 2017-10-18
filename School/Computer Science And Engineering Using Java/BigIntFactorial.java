/*****************************************************************
** BigIntFactorial - compute the factorial of an (big) integer
**
** Below is a sample dialogue:
**
**    PROMPT>java BigIntFactorial
**    Big Integer Factorial Program
**    =============================
**    Enter an integer: 35
**    35! = 10333147966386144929666651337523200000000
**
** (c) Scott MacKenzie, 1998                             
******************************************************************/
import java.math.BigInteger;
import java.io.*;

public class BigIntFactorial
{
   public static void main(String[] args) throws IOException
   {
      // open keyboard for input (call it 'stdin')
      BufferedReader stdin =
         new BufferedReader(new InputStreamReader(System.in), 1);

      // print a banner
      System.out.println("Big Integer Factorial Program");
      System.out.println("=============================");

      // get the integer
      System.out.print("Enter an integer: ");
      String s = stdin.readLine();

      // instantiate a BigInteger object
      BigInteger bi = new BigInteger(s); 

      // compute and print the factorial
      System.out.println(s + "! = " + factorial(bi));
   }

   /* recursion takes too much memory -- if n is large!
   *public static BigInteger factorial(BigInteger n)
   *{
   *   if (n.equals(ZERO))
   *      return ONE;
   *   else
   *      return n.multiply(factorial(n.subtract(ONE)));
   *}
   */


   // use the standard iterative algorithm for factorial
   public static BigInteger factorial(BigInteger n)
   {
      if (n.equals(ZERO))
         return ONE;

      BigInteger i = n.subtract(ONE);
      while (i.compareTo(ZERO) > 0)
      {
         n = n.multiply(i);
         i = i.subtract(ONE);
      }
      return n;
   }
      
   public static final BigInteger ONE  = new BigInteger("1");
   public static final BigInteger ZERO = new BigInteger("0");

}
