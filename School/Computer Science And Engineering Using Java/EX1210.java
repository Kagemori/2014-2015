package ex12.pkg10;

public class EX1210 {
    
    public static void main(String[] args) {
        int[] testArray;
        testArray = new int[5];
        testArray[0] = 2;
        testArray[1] = testArray[0]*3;
        testArray[2] = 1;
        testArray[3] = testArray[2] + 1;
        testArray[4] = 0;
        
        sortArray(testArray);
    }
    public static int indexOfMaxInRange(int[] a, int low, int high){
        int iMax = low;
        for(int i = low+1; i <= high; i++){
            if(a[i] > a[iMax]){
                iMax = i;
            }
        }
        return iMax;
    }
    public static void swapElement(int[] b, int i1, int i2){
        int z = b[i1];
        b[i1] = b[i2];
        b[i2] = z;
    }
    public static void sortArray(int[] c){
        int length = c.length;
        for(int i = 0; i < length-1; i++){
            int iMax = indexOfMaxInRange(c, i, length-1);
            swapElement(c, i, iMax);
        }
    }
}
