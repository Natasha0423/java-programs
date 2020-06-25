import java.io.*;
class swap{
  
  public static void main(String s[]) throws Exception{
       int a,b;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter two number = ");
       a=Integer.parseInt(br.readLine());
       b=Integer.parseInt(br.readLine());
       a=a+b;
       b=a-b;
       a=a-b;
       System.out.print("Numbers after swapping are "+ a+" and "+ b);
       
   }
}