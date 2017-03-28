package ua.nure.tsomkalov.Task1;

public class Part9 {
    public static void main(){
        int[][][][][] arr= new int[2][2][2][2][2];
        for (int i=1;i<=32;i++){
            arr[i/16%2][i/8%2][i/4%2][i/2%2][i%2]=i;
        }

        for (int i=1;i<=32;i++){
            System.out.print(arr[i/16%2][i/8%2][i/4%2][i/2%2][i%2] + " ");
        }
        System.out.println();
    }
}
