import java.io.*;
class pattern5{
  
  public static void main(String s[]) throws Exception{
       int i,j,n;
       char ch;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter a number = ");
       n=Integer.parseInt(br.readLine());
       for(i=1;i<=n;i++){
           ch='A';
           for(j=1;j<=n-i;j++){
               System.out.print(" ");
           } 
           for(j=1;j<=i;j++){
               System.out.print(ch);
            ch=(char)(ch+1);
           } 
        System.out.print("\n");
       }
   }
}