import java.util.Arrays;
//Fing the largest number in an array\/
class Arraysort{
    static int sort(int arr []){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static void main(String[] args){

        int[] arr={5,3,9,6,7,4};
        System.out.println("The largest number in an arry is: "+sort(arr));
    }
}