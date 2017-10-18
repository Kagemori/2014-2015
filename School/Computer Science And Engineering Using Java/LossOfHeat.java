package loss.of.heat;

public class LossOfHeat {

    public static void main(String[] args) {
        lossOfHeat(1,97,120);
    }
    public static void lossOfHeat(int m, int Tair, int Temp){
        int ans = Temp-Tair;
        int answer = Temp-m*ans;
        if (m == 1){
            System.out.println("The Temperature at " + m + " Minute is " + answer + " Degrees.");
            lossOfHeat(m+1,Tair,Temp);
        } else if (m != 61 && m != 1){
            System.out.println("The Temperature at " + m + " Minutes is " + answer + " Degrees.");
            lossOfHeat(m+1,Tair,Temp);
        }
    }
}
