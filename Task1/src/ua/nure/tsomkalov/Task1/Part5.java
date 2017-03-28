package ua.nure.tsomkalov.Task1;

import java.util.ArrayList;

public class Part5 {
    public static void main(String[] args){
        int m=Integer.parseInt(args[0]);
        int count=0;

        for (double i=Math.pow(10,m-1);i<Math.pow(10,m);i++){
            int num=(int)i;
            ArrayList<Integer> numsList=new ArrayList<>();

            while (num>0){
                numsList.add(num%10);
                num=(num-(num%10))/10;
            }

            double res1=0,res2=0;
            int size=numsList.size()/2;

            for (int j=0;j<size;j++){
                res1+=numsList.get(j);
                res2+=numsList.get(j+size);
            }

            if (res1==res2){
                count++;
            }
        }

        System.out.println(count);
    }
}
