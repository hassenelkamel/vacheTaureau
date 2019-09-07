/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vache.taureau;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class VacheTaureau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n;
        int e,i,j,k;
        int ent;
        int [] str1=new int[4];
        int [] str2 = new int [4];
        do {
        n = Math.random()*10001;
        } while (n<1000);
        e = (int) n;
        System.out.println("le nombre est :"+e);
        str1[0]=e/1000;
        str1[1]=(e%1000)/100;
        str1[2]=((e%1000)%100)/10;
        str1[3]=((e%1000)%100)%10;
          
       do
       {
           int t=0,v=0;
           System.out.println("Donner un nombre : ");
           Scanner sc = new Scanner (System.in);
           ent = sc.nextInt();
        str2[0]=ent/1000;
        str2[1]=(ent%1000)/100;
        str2[2]=((ent%1000)%100)/10;
        str2[3]=((ent%1000)%100)%10;
                
                for (j=0;j<4;++j)
                {
                    for (k=0;k<4;++k)
                    {
              
                        if ((j==k) && (str1[j]==str2[k]))
                        {
                                t++;
                        }
                        else if ((j!=k) && (str1[j]==str2[k]))
                        {
                                v++;
                        }
                    }
                }
                System.out.println ("Vache : "+v);
                System.out.println ("Taureau : "+t);
       } while (e!=ent);
    }
    
}
