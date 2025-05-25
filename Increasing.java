

public class Increasing {
    static int increment(int[] val){
        int max=0;
        for(int i=0;i<val.length;i++){
            if(val[i]<max){
                max=val[i];
            }
            else{
                val[i]++;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        int[] val={1,2,3,4,5,6};
        System.out.println("TRUE"+increment(val));
    }
}
