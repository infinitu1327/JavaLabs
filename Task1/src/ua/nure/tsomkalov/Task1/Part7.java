package ua.nure.tsomkalov.Task1;

public class Part7 {
    public static void main(String[] args){
        int m=Integer.parseInt(args[0]);

        int[] nums=new int[m];
        int j=2;
        int i=0;
        while (i<nums.length){
            if (Part3.isPrime(j)){
                nums[i]=j;
                i++;
                j++;
            }
            else{
                j++;
            }
        }

        for (int num: nums) {
            System.out.print(num+" ");
        }

        System.out.println();
    }
}
