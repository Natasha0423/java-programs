import java.io.*;
class sort2Darray{
          void func() throws Exception{
          int arr[][]=new int[5][5],m,n,i,j,p,k,q;
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.print("Enter the number of rows anc column: ");
          n=Integer.parseInt(br.readLine());
          m=Integer.parseInt(br.readLine());
          System.out.print("Enter the values: ");
          for(i=0;i<=n-1;i++){
            for(j=0;j<=m-1;j++){
              arr[i][j]=Integer.parseInt(br.readLine());
          
            }
          }
          System.out.print("\n"); 

          for(i=0;i<=n-1;i++){
            for(j=0;j<=m-1;j++){
               System.out.print(arr[i][j]+"\t");     
            }
            System.out.print("\n");     
          }
          System.out.print("\n"); 
          for(i=0;i<n;i++){
            for(j=0;j<m-1;j++){
                  for(k=0;k<m-1-j;k++){
                    if(arr[i][k]>arr[i][k+1]){
                         q=arr[i][k];
                         arr[i][k]=arr[i][k+1];
                         arr[i][k+1]=q;
                    }
                  }
             }
          }
          System.out.print("The sorted array is :\n");
          for(i=0;i<=n-1;i++){
            for(j=0;j<=m-1;j++){
               System.out.print(arr[i][j]+"\t");     
            }
            System.out.print("\n");     
          }
             
         }         
       
          public static void main(String[] s) throws Exception{
              sort2Darray ob =new sort2Darray();
              ob.func();  
          }
}