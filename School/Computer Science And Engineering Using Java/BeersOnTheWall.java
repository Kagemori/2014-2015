package beersonthewall;

/**
 *
 * @author keith_000
 */
public class BeersOnTheWall {

    public static void lyrics2(){ //This separate method was so that instead of the last lyric saying '0', it says 'no more'
            System.out.print("1 bottle of beer on the wall, 1 bottle of beer, ya' take one");
            System.out.println("down, ya' pass it around, no more bottles of beer on the wall.");
            System.out.print("No bottles of beer on the wall, no bottles of beer, ya' can't take");
            System.out.println("one down, ya' can't pass it around, 'cause there are no more ");
            System.out.println("bottles of beer on the wall");
    }
    
    public static void lyrics(int z){
        int current = z;
        int next = z-1;
            System.out.print(current + " bottles of beer on the wall, " + current + " bottles of beer, ya' take one");
            System.out.println("down, ya' pass it around, " + next + " bottles of beer on the wall.");
            if (next != 1){
                lyrics(next);
            }else if (next == 1){
                lyrics2();
            }
        }   
    public static void main(String[] args) {
        lyrics(99); //Change the number to adjust the amount of beers on the wall.
    }
    
}
