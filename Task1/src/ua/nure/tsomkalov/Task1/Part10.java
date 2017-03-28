package ua.nure.tsomkalov.Task1;

public class Part10 {
    public static void main(String[] args){
        int m=Integer.parseInt(args[0]);

        int[][] triangle=new int[m][];

        for (int i=0;i<m;i++){
            triangle[i]=new int[i+1];
            int num=1;
            triangle[i][0]=num;
            System.out.print(num);

            for (int j=1;j<=i;j++){
                num*=(i-j+1);
                num/=j;
                triangle[i][j]=num;
                System.out.print(num);
            }

            System.out.println();
        }
    }
}
