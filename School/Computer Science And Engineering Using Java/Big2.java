import java.math.BigInteger

public static void main(String[] args){
  int x = 30
  while(x => 0){
    fact(x);
    x = x-1;
  }
}
public static void fact(int f){
  BigInteger factoral = BigInteger.valueOf(f);
  if(factoral == 0){
    return 1;
  }else{
    BigInteger fact1 = fact(f-1);
    BigInteger ans = f*fact1;
    return ans;
  }
}