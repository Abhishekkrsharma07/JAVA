import java.util.Scanner;
public class fibo {
    public static void main(String[] args){
        int abhi,a=0,b=1,c;

        // taking user input

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the term: ");
        //storing the values...................
        abhi=sc.nextInt();
        
        for(int i=1;i<=abhi;i++){
        c=a+b;
        a=b;
        b=c;
        System.out.print(a+" ");
        }
    }
}
