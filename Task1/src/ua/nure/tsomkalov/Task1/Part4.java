package ua.nure.tsomkalov.Task1;

public class Part4 {
    public static void main(String[] args){
        int m=Integer.parseInt(args[0]);

        int res=m;

        for (int i=m;i>1;i--){
            res=(i-1)*(1-res);
        }

        System.out.println(res);
    }
}
