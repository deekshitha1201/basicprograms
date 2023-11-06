import java.util.Scanner;

public class Prime {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the starting value");
    int num1=sc.nextInt();
    System.out.println("enter the ending value");
    int num2=sc.nextInt();
    System.out.println("prime numbers between 20 and 30 are:");
    for(int i=20;i<=num2;i++)
      {
        int count=0;
        for(int j=1;j<=i;j++){
          if(i%j==0)
            count++;
        }
        if(count==2)
          System.out.println(i+" ");
        }
      }
  }