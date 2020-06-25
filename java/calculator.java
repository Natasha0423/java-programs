import java.io.*;
class calculator
{
  void func() throws Exception{
       
       char ch;
       int a,b;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("+ Add\n- Subtract\n* Multiply\n/ Divide\nEnter your symbol = ");
       ch=(char)br.read();
       System.out.print("Enter two values =");  
	BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
	a=Integer.parseInt(br1.readLine());
       b=Integer.parseInt(br1.readLine());
              switch(ch){
       case '+':
		System.out.print("Result is "+ (a+b));
                 break;
       case '-':

		System.out.print("Result is "+(a-b));
                 break;
       case '*':

		System.out.print("Result is "+(a*b));
                 break;
       case '/':

		System.out.print("Result is "+(a/b));
                 break;
       default : System.out.print("Invalid symbol");
}
       
       

   }
  public static void main(String s[]) throws Exception{
    calculator ob = new calculator();
    ob.func();
   }
}