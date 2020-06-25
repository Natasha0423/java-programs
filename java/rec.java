import java.io.*;
class rec{
  void area() throws Exception{
       int l,b,a;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the length and breadth of rectangle = ");
       l=Integer.parseInt(br.readLine());
       b=Integer.parseInt(br.readLine());
       a=l*b; 
       System.out.print("Area of rectangle is = "+a);

   }
  public static void main(String s[]) throws Exception{
    rec ob = new rec();
    ob.area();
   }
}