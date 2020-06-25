import java.io.*;
class maxarr{
           public static void main(String s[]) throws Exception{
                 int arr[]= new int[20];
                 int i,n,max;
                 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                 System.out.print("Enter the size of array = ");
                 n=Integer.parseInt(br.readLine());
                 System.out.print("Enter values ");
                 for( i=0;i<n;i++){
                        arr[i]=Integer.parseInt(br.readLine());     
                 }
                 max=arr[0];
                 for(i=1;i<n;i++){
                       if(arr[i]>max)
                          max=arr[i];
                 }
                 System.out.print("Maximum value from the array is ="+ max);
           }
}