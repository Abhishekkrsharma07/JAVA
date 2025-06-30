import java.util.*;
class MaxSubarray {

    public static void Maxsum(int number[]){
        int curSum=0;
        int MaxSum = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++){
            int start=i;
            for(int j=i; j<number.length; j++){
                int end=j;
                curSum=0;
                for(int k=start; k<end; k++){
                    curSum+=number[k];

            }
                System.out.println(curSum);
                if(MaxSum<curSum){
                    MaxSum=curSum;
                }
            }
            
        }

        System.out.println("MaximumSum: "+MaxSum);
    }
    public static void main(String[] args){
        int number[]={1,2,-1,6,8};
        Maxsum(number);
    }
}
