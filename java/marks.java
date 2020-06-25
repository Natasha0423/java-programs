import java.io.*;
class marks{
  void stu() throws Exception{
       int s1,s2,s3,s4,s5,total,percent;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter marks of five subjects = ");
       s1=Integer.parseInt(br.readLine());
       s2=Integer.parseInt(br.readLine());
       s3=Integer.parseInt(br.readLine());
       s4=Integer.parseInt(br.readLine());
       s5=Integer.parseInt(br.readLine());
       total=s1+s2+s3+s4+s5;
       percent=(total/5); 
       System.out.print("Total marks  = "+total+" and percentage = "+percent);
   }
  public static void main(String s[]) throws Exception{
    marks ob = new marks();
    ob.stu();
   }
}