package abecedarian;
public class Abecedarian {
    public static void main(String[] args) {
        isAbecedarian();
    }
    public static void isAbecedarian(){
        String word = "Abdest";//Use this line to change the word.
        int index = 0;
        while (index <= word.length()){
            char letter = word.charAt(index);
            char letter2 = word.charAt(index+1);
            System.out.println(letter);
            System.out.println(letter2);
            System.out.println("");
            if(letter > letter2){
                System.out.println(word + " is NOT an Abecedarian Word.");
                return;
            }
            index++;
            if (letter2-1 > index && index == 5){
                System.out.println(word + " is an Abecedarian Word.");
                return;
            }
        }
    }
}
