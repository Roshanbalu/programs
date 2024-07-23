
public class twosum{
    public static void main(String[]args){
        int[] arr = {2,3,4};
        int target = 6;
        for(int i = 0; i<arr.length; i++){   // i=1    j=2
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == target){
                    System.out.print(i+" "+j);
                }
            }
        }
    }
}

