public class Palindromenumber
  {
    public static void main(String[] args){
      int a=12321;
      int rem;
      int sum=0;
      int t=a;
      while(a>0){
        rem=a%10;
        sum=sum*10+rem;
        a=a/10;
      }
      if(t==sum)
      {
        System.out.println("it is palindrome");
      }
      else
      {
        System.out.println("it is not palindrome");
      }
    }
  }