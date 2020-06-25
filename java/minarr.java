import java.io.*;
class minarr{
           public static void main(String s[]) throws Exception{
                 int arr[]= new int[20];
                 int i,n,min;
                 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                 System.out.print("Enter the size of array = ");
                 n=Integer.parseInt(br.readLine());
                 System.out.print("Enter values");
                 for( i=0;i<n;i++){
                        arr[i]=Integer.parseInt(br.readLine());     
                 }
                 min=arr[0];
                 for(i=1;i<n;i++){
                       if(arr[i]<min)
                          min=arr[i];
                 }
                 System.out.print("Minimum value from the array is ="+ min);
           }
}