import java.io.*;
class palindrome{
  
  public static void main(String s[]) throws Exception{
       int i,j,n,a,b,c=0;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter a number = ");
       n=Integer.parseInt(br.readLine());
       i=n;
       while(i!=0){
            b=i%10;
            c=c*10+b;
            i=i/10;

            
       }
       if(c==n)
          System.out.print("Number is palindrome");
       else
          System.out.print("Number is not palindrome");
   }
}