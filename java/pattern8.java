import java.io.*;
class pattern8{
  
  public static void main(String s[]) throws Exception{
       int i,j,n;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter a number = ");
       n=Integer.parseInt(br.readLine());
       for(i=n;i>=1;i--){
           for(j=1;j<=i;j++){
               System.out.print(j);
           } 
           for(j=1;j<=n-i;j++){
               System.out.print(" ");
           } 
           for(j=1;j<=n-i;j++){
               System.out.print(" ");
           } 
           for(j=i;j>=1;j--){
               System.out.print(j);
           }
        System.out.print("\n");
       }
   }
}