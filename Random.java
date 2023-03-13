public class Random
{
  public static int generateNum(int min, int max)
  {
    return (int)(Math.random()*(max-min+1)+min);  
  }
}