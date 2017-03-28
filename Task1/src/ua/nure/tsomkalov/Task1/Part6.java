package ua.nure.tsomkalov.Task1;

public class Part6 {
    public static void main(String[] args){
        int m=Integer.parseInt(args[0]);

        if (m==1){
            System.out.print (1);
        }
        else{
            int[] fib=new int[m];
            fib[0]=1;
            fib[1]=1;
            for (int i=2;i<m;i++){
                fib[i]=fib[i-1]+fib[i-2];
            }

            for (int num: fib) {
                System.out.print (num+" ");
            }
        }

        System.out.println();
    }
}
