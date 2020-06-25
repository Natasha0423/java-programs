import java.io.*;
class fib{
  
  public static void main(String s[]) throws Exception{
       int a,b,n,c,i;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the limit of series = ");
       n=Integer.parseInt(br.readLine());
       a=0;
       b=1;
       for(i=1;i<=n;i++){
           System.out.print(" "+a);
           c=a+b;
           a=b;
           b=c;
           
       }
   }
}