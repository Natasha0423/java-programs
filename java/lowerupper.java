import java.io.*;
class lowerupper
{
     void func()throws Exception
     {
          char ch;
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.print("Enter a character = ");
          ch=(char)br.read();
          if(ch<='Z' && ch>='A')
             System.out.print("Character is uppercase");
          else if(ch<='z' && ch>='a')
             System.out.print("Character is lowercase");
          else
             System.out.print("Character is symbol");

      }
     public static void main(String s[])throws Exception
     {
           lowerupper ob= new lowerupper();
           ob.func();
     }



}