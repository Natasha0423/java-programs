import java.io.*;
class base {
         void add() throws Exception{
              int a,b,c;
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               System.out.print("Enter two number = ");
               a=Integer.parseInt(br.readLine());
               b=Integer.parseInt(br.readLine());
               c=a+b;
               System.out.print("\nSum is = "+c+"\n");
          }
}
class child extends base{
         void multiply() throws Exception{
              int a,b,c;
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               System.out.print("Enter two number = ");
               a=Integer.parseInt(br.readLine());
               b=Integer.parseInt(br.readLine());
               c=a*b;
               System.out.print("\nMultiplication is = "+c+"\n");
          }
           public static void main(String[] s) throws Exception{
                 child ob = new child();
                
                 System.out.print("\nAddition\n");
                 ob.add();
                 System.out.print("\nMultiplication\n");
                 ob.multiply();
          }
}
class hierarchicalInherit extends base{
          void sub() throws Exception{
              int a,b,c;
               System.out.print("Enter two number = ");
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               a=Integer.parseInt(br.readLine());
               b=Integer.parseInt(br.readLine());
               c=a-b;
               System.out.print("\nDifference is = "+c+"\n");
          }
          public static void main(String[] s) throws Exception{
                 multilevelInherit ob = new multilevelInherit();
                 System.out.print("\n Subtraction\n");
                 ob.sub();
                 System.out.print("\nAddition\n");
                 ob.add();
                
          }
}