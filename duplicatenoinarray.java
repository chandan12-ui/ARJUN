public class duplicatenoinarray{
    public static void frequency(int[]array){
        int n=array.length;
         int[]arr=new int[n];
         int a=0;
         for(int i=0;i<array.length;i++){
            boolean duplicate=false;
            for(int j=0;j<a;j++){
                if(array[i]==arr[j]){//check the element is equal or not
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate){//insert the the element in array
                arr[a]=array[i];
                a++;
            }
         }
         for(int i=0;i<a;i++){
            System.out.println(arr[i]);
        
         }
         
    }
    public static void main(String[]args){
        int[]array={1,1,2,3,2,3,4};
        frequency(array);
    }
}
