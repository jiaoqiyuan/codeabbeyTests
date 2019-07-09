package codeabby;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

class test{
    public static void main(String[] args)throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int k=1,n=Integer.parseInt(reader.readLine());
        int[] mas=new int[200000];
        mas[0]=1;
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=1;i<2750131;i++){
            list.add(i);
        }
        for(int i=1;k<200000;i++){//list(1)=1; list(2)=2

            //检查下list下的第i个数是否有素数标志
            if(list.get(i-1)!=1){
                mas[k]=list.get(i-1);
                k++;
                //将i的倍数都设置为非素数标志
                for(int j=i+i;j<2750131-1;j=j+i){
                    list.set(j-1, 1);

                }
            }
        }


        String[] s=reader.readLine().split(" ");
        for(int i=0;i<n;i++){
            System.out.print(mas[Integer.parseInt(s[i])]+" ");
        }

    }
}