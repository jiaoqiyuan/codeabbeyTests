package codeabby;
import java.util.Scanner;

public class TicTacToe46_good {
    private static Scanner in;

    public static void main(String[] args){
        in = new Scanner(System.in);
        int N=in.nextInt();
        for(int i=0;i<N;i++){
            int input[]=new int[9];
            char grid[]=new char[9];
            for(int j=0;j<9;j++){
                grid[j]='-';
                input[j]=in.nextInt();
            }
            int step=1;
            for(int j=0;j<9;j++){
                if((j+1)%2!=0) grid[input[j]-1]='X';
                else grid[input[j]-1]='O';
                if(!isTris(grid))step++;
            }
            if(!isTris(grid))step=0;
            System.out.print(step+" ");
        }

    }

    public static Boolean isTris(char[] g){
        for(int k=0;k<9;k=k+3){
            if(g[k]==g[k+1] && g[k]==g[k+2] && g[k]!='-'){
                return true;
            }
        }
        for(int k=0;k<3;k++){
            if(g[k]==g[k+3] && g[k]==g[k+6] && g[k]!='-'){
                return true;
            }
        }
        if(g[0]==g[4] && g[0]==g[8] && g[0]!='-') return true;
        if(g[2]==g[4] && g[2]==g[6] && g[2]!='-') return true;
        return false;
    }
}