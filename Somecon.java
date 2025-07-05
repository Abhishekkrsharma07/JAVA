class Somecon{
    static void pairwisesum(int arr[], int n){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=arr[i]+arr[i+1];
            System.out.println(sum+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={2,3,5,7,9};
        int n=arr.length;
        pairwisesum(arr, n);
    }}