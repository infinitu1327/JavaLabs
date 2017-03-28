package ua.nure.tsomkalov.Task1;

public class Part1 {
    public static void main(String[] args){
        int m=Integer.parseInt(args[0]);
        int n=Integer.parseInt(args[1]);

        if (n==0){
            System.out.println(m);
        }
        else{
            while (m%n!=0){
                int t=m%n;
                m=n;
                n=t;
            }
            System.out.println(n);
        }
    }
}
