import java.io.*;
class sort{
           public static void main(String s[]) throws Exception{
                 int arr[]= new int[20];
                 int i,n,temp,j;
                 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                 System.out.print("Enter the size of array = ");
                 n=Integer.parseInt(br.readLine());
                 System.out.print("Enter values ");
                 for( i=0;i<n;i++){
                        arr[i]=Integer.parseInt(br.readLine());     
                 }
                 System.out.print("Array is \n");
                 for(i=0;i<n;i++){
                       System.out.print(arr[i]+"\t");
                 }
                 for(i=0;i<n-1;i++){
                     for(j=0;j<n-i-1;j++){
                           if(arr[j]>arr[j+1]){    
                               temp=arr[j];
                               arr[j]=arr[j+1];
                               arr[j+1]=temp;
                           }
                     }
                 }
                 System.out.print("\nNew array is \n");
                 for(i=0;i<n;i++){
                       System.out.print(arr[i]+"\t");
                 }
           }
}