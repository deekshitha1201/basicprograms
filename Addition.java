import java.util.Scanner;
public class Addition
  {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      int a=sc.nextInt();
      int b=sc.nextInt();
      int[][] arr1=new int[a][b];
      int[][] arr2=new int[a][b];
      System.out.println("enter the elements");
      for(int i=0;i<a;i++)
        {
          for(int j=0;j<b;j++)
            {
              arr1[i][j]=sc.nextInt();
            }
        }
      System.out.println("enterb the elements");
      for(int i=0;i<a;i++)
        {
          for(int j=0;j<b;j++)
            {
              arr2[i][j]=sc.nextInt();
            }
        }
      
              for(int i=0;i<a;i++)
              {
              for(int j=0;j<b;j++)
              {
              System.out.println(arr1[i][j]+arr2[i][j]);
              }
          System.out.println();
        }
       
    
    }
  }