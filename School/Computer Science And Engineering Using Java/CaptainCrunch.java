package captaincrunch;
public class CaptainCrunch {

    public static void main(String[] args) {
        CrunchCode(13);//Change 13 to Change the Rotation
    }
    public static void CrunchCode(int n){
        String Word = "Pncgnva Pehapu Qrpbqre Zrgubq/Cebtenz";
        String Message = "";
        n = n%26;
        int index = 0;
        while(index < Word.length()){
            char curLetter = Word.charAt(index);
            if('a'<= curLetter && curLetter <= 'z'){
                int newLetter = curLetter + n;
                if(newLetter > 'z'){
                    newLetter = (newLetter - 'z') + 'a' - 1;
                } else if(newLetter < 'a') {
                    newLetter = 'z' - ('a' - newLetter) + 1;
                }
                Message = Message + (char)newLetter;
            } else if('A' <= curLetter && curLetter <= 'Z'){
                int newLetter = curLetter + n;
                if(newLetter > 'Z'){
                    newLetter = (newLetter - 'Z') + 'A' - 1;
                } else if(newLetter < 'A'){
                    newLetter = 'Z' - ('A' - newLetter) + 1;
                }
                Message = Message + (char)newLetter;
            } else {
                Message = Message + (char)curLetter;
            }
            index++;
        }
        System.out.println(Message);
    }
}