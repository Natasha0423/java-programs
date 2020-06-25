import java.io.*;
class maxtomin{
           public static void main(String s[]) throws Exception{
                 int arr[]= new int[20];
                 int i,n,min,max,temp,p=0,q=0;
                 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                 System.out.print("Enter the size of array = ");
                 n=Integer.parseInt(br.readLine());
                 System.out.print("Enter values");
                 for( i=0;i<n;i++){
                        arr[i]=Integer.parseInt(br.readLine());     
                 }
                 System.out.print("Array is \n");
                 for(i=0;i<n;i++){
                       System.out.print(arr[i]+"\t");
                 }
                 min=arr[0];
                 max=arr[0];
                 for(i=1;i<n;i++){
                       if(arr[i]<min){
                          min=arr[i];
                          q=i;
                        }
                 }
                 for(i=1;i<n;i++){
                       if(arr[i]>max){
                          max=arr[i];
                          p=i;
                       }
                 }
                 temp=arr[p];
                 arr[p]=arr[q];
                 arr[q]=temp;
                 System.out.print("\nNew array is \n");
                 for(i=0;i<n;i++){
                       System.out.print(arr[i]+"\t");
                 }
           }
}