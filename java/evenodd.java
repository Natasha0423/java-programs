import java.io.*;
class evenodd{
  void func() throws Exception{
       int s;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the number = ");
       s=Integer.parseInt(br.readLine());
       if(s%2==0)
         System.out.print("Number is even");
       else
         System.out.print("Number is odd");
       

   }
  public static void main(String s[]) throws Exception{
    evenodd ob = new evenodd();
    ob.func();
   }
}