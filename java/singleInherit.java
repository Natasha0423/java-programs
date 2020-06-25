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
class singleInherit extends base{
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
                 singleInherit ob = new singleInherit();
                 System.out.print("\nSubtraction\n");
                 ob.sub();
                 System.out.print("\nAddition\n");
                 ob.add();
          }
}