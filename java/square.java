import java.io.*;
class square{
  void area() throws Exception{
       int s,a;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the side of square = ");
       s=Integer.parseInt(br.readLine());
       a=s*s; 
       System.out.print("Area of square is = "+a);

   }
  public static void main(String s[]) throws Exception{
    square ob = new square();
    ob.area();
   }
}