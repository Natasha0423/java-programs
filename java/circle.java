import java.io.*;
class circle{
  void area() throws Exception{
       int r,a;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the radius of circle = ");
       r=Integer.parseInt(br.readLine());
       a=(int)(2*3.14*r); 
       System.out.print("Area of circle is = "+a);

   }
  public static void main(String s[]) throws Exception{
    circle ob = new circle();
    ob.area();
   }
}