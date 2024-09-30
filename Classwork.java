public class Classwork
{
  public static void main(String[] args)
  {
    String x = new String("dictionary");
    int length = x.length();
    int n = 1;
    firstLastN(x, n);
    delEnd(x, n);
    
  }

  public static void firstLastN(String x, int n)
  {
    String strg1 = x.substring(0, n);
    String strg2 = x.substring(x.length() - n);
    System.out.println("apple");
  }

  // write solutions to problems below
//DelEnd

public static void delEnd(String x, int n)
{
  
  int stoppingIndex = x.length() - n;
  String output = x.substring(0, stoppingIndex);
  System.out.print(output);
}

}
