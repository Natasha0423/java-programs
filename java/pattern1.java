import java.io.*;
class pattern1{
  
  public static void main(String s[]) throws Exception{
       int i,j,n;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter a number = ");
       n=Integer.parseInt(br.readLine());
       for(i=1;i<=n;i++){
           for(j=1;j<=i;j++){
               System.out.print("*");
           } 
        System.out.print("\n");
       }
   }
}