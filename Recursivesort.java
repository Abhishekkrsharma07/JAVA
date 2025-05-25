public class Recursivesort {
    static int Maxvale(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int arr[]={2,3,6,9,5,10,0};
        System.err.println("The max value is : "+ Maxvale(arr));
    }
}
