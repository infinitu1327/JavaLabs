package ua.nure.tsomkalov.Task1;

public class Part2 {
    public static void main(String[] args){
        int m=Integer.parseInt(args[0]);

        int res=0;

        while (m>0){
            res+=m%10;
            m=(m-(m%10))/10;
        }

        System.out.println(res);
    }
}
