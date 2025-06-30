public class Reeversearr {
    public static void Reverse(int arr[]){
        int first=0, last=arr.length-1;

        while(first<last){
            //Apply swapping method

            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            //increse first number and decreasing the last arr
            first++;
            last--;
        }
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,88};
        Reverse(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
