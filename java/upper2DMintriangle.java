import java.io.*;
class upper2DMintriangle{
          void min() throws Exception{
          int arr[][]=new int[5][5],m,n,i,j,p,q;
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

          p=arr[0][0]; 
          for(i=0;i<=n-1;i++){
            for(j=0;j<=m-1;j++){
                 if(i+j<2){
                    if(arr[i][j]<p){
                         p=arr[i][j];
                    }
                 }
          
            }
          }
          q=arr[0][1];
          for(i=0;i<=n-1;i++){
            for(j=0;j<=m-1;j++){
                 if(j>i){
                    if(arr[i][j]<q){
                         q=arr[i][j];
                    }
                 }
          
            }
          }
            System.out.print("The minimum value from upper left triangle is: "+p+"\n");  
            System.out.print("The minimum value from upper right triangle is: "+q);    
         }         
       
          public static void main(String[] s) throws Exception{
              upper2DMintriangle ob =new upper2DMintriangle();
              ob.min();  
          }
}