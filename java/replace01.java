import java.io.*;
class replace01{
        public static void main(String s[]) throws Exception{
               int arr[]= new int[20];
               int i,n;
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               System.out.print("Enter size = ");
               n=Integer.parseInt(br.readLine());
               System.out.print("Enter values = ");
               for(i=0;i<n;i++){
                  arr[i]=Integer.parseInt(br.readLine());  
               }
               System.out.print("Array is \n");
               for(i=0;i<n;i++){
                    System.out.print(arr[i]+"\t");
               }
               for(i=0;i<n;i++){
                      if(arr[i]%2==0){
                           arr[i]=0;
                      }
                      else
                           arr[i]=1;
               }
               System.out.print("\n New Array is \n");
               for(i=0;i<n;i++){
                    System.out.print(arr[i]+"\t");
               }
        }
}