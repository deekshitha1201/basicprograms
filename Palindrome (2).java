public class Palindrome
  {
    public static void main(String[] args){
      int a=12321;
      int rem;
      int rev=0;
      while(a>0){
        rem=a%10;
        rev=rev+rem*rem*rem;
        a=a/10;
      }
      if(a==rev)
      {
        System.out.println("it is palindrome");
      }
      else
      {
        System.out.println("it is not palindrome");
      }
    }
  }