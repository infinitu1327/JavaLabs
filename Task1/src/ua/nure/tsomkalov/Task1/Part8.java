package ua.nure.tsomkalov.Task1;

public class Part8 {
    public static void main(String[] args){
        int m=Integer.parseInt(args[0]);
        int n=Integer.parseInt(args[1]);

        char[][] table=new char[m][n];

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (i%2==0){
                    if (j%2==0){
                        table[i][j]='Ч';
                    }
                    else{
                        table[i][j]='Б';
                    }
                }
                else{
                    if (j%2==0){
                        table[i][j]='Б';
                    }
                    else{
                        table[i][j]='Ч';
                    }
                }
            }
        }

        for (char[] row: table) {
            for (char sym: row) {
                System.out.print(sym+" ");
            }

            System.out.println();
        }
    }
}
