import java.io.*;
class palindromeSeries{
  
  public static void main(String d[]) throws Exception{
       int i,j,n,a,b,c=0,f,s;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the initial and final number = ");
       s=Integer.parseInt(br.readLine());
       f=Integer.parseInt(br.readLine());
       n=s;
       while(n>=s && n<=f){
           i=n;
           c=0;
           while(i!=0){
                b=i%10;
                c=c*10+b;
                i=i/10;

            
           }
           if(c==n)
                 System.out.print(n +" is palindrome\n");
           else
                 System.out.print(n +" is not palindrome\n");
           n++;
      }  
   }
}