package com.GurpreetKaur;
public class StringWords {
    public static void main(java.lang.String[] args){
        java.lang.String str = "hello hello how Are you HELLO are there happy test you";
        System.out.println("Original String:"+str);
        java.lang.String[] words=str.split(" ");
        int count=1;
        for(int x=0;x<words.length;x++)
        {
            for(int y=x+1;y<words.length;y++)
            {
                if(words[x].toLowerCase().equals(words[y].toLowerCase()))
                {
                    count=count+1;
                    words[y]="0";
                }
            }
            if(!words[x].equals("0")) {
                System.out.println(words[x].toLowerCase() + "->" + count);
            }
            count=1;
        }
    }
}
