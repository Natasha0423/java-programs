import java.io.*;
class sumarr{
      public static void main(String d[]) throws Exception{
            int s=0,n;
            int arr[]=new int[20];
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the size of array = ");
            n=Integer.parseInt(br.readLine());
            System.out.print("Enter values");
            for(int i=0;i<n;i++){
                 arr[i]=Integer.parseInt(br.readLine());
                 s=s+arr[i]; 
            }
            System.out.print("Sum is ="+s);
      }
}
