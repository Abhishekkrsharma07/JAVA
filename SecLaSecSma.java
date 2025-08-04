
import java.util.Arrays;

//Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn't exist.
class SecLaSecSma {
    public static int findthenum(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=arr[arr.length-1]){
                return arr[arr.length-2];

            }
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]==arr[0]){
                    return arr[1];
                }
            }
        }
        return 1;
    }
    
    public static void main(String[] args){
        int arr[]={1,2,4,5,6,7,8};
        System.out.println("the alrgest number is:" + findthenum(arr[i]));
    }
    
}
