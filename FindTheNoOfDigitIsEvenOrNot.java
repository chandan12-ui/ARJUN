public class FindTheNoOfDigitIsEvenOrNot {
    public static void findevenorodd(int[]array){
        int even=0;
       for(int i=0;i<array.length;i++){
           int num=array[i];
           int digitcount=0;

           while(num>0){//find the number of digit count
               digitcount++;
               num=num/10;

           }
           //System.out.println("the no.of digit is"+array[i]+" "+digitcount);
           if(digitcount%2==0){//find the digit count no.is even oddd
               even++;
           }
       }
        System.out.println("the total no.of even digit no.in array is= "+even);
    }
    public static void main(String[] args){
        int[] array={1,12,123,1234,12345};
        findevenorodd(array);
    }
}
