import java.util.*;

public class Logging
{
  static int logKeyword[][] = {
    {0,0}, //{Keyword index, frequency of keyword}
    {1,0},
    {2,0},
    {3,0},
    {4,0},
    {5,0},
    {6,0},
    {7,0},
    {8,0},
    {9,0},
    {10,0},
    {11,0},
    {12,0},
    {13,0},
    {14,0},
    {15,0},
    {16,0},
    {17,0},
    {18,0},
    {19,0},
    {20,0},
    {21,0},
    {22,0},
    {23,0},
    {24,0},
    {25,0},
    {26,0},
    {27,0},
    {28,0},
    {29,0},
    {30,0},
    {31,0},
    {32,0},
    {33,0},
    {34,0},
    {35,0},
    {36,0},
    {37,0},
    {38,0},
    {39,0},
    {40,0},
    
    {41,0}, //41 stores nonkeyword responses
  };
  
  static int logResponse[][] = {
    {0,0,0,0}, //{keyword index, frequency of response 1, frequency of response 2, frequency of response 3}
    {1,0,0,0},
    {2,0,0,0},
    {3,0,0,0},
    {4,0,0,0},
    {5,0,0,0},
    {6,0,0,0},
    {7,0,0,0},
    {8,0,0,0},
    {9,0,0,0},
    {10,0,0,0},
    {11,0,0,0},
    {12,0,0,0},
    {13,0,0,0},
    {14,0,0,0},
    {15,0,0,0},
    {16,0,0,0},
    {17,0,0,0},
    {18,0,0,0},
    {19,0,0,0},
    {20,0,0,0},
    {21,0,0,0},
    {22,0,0,0},
    {23,0,0,0},
    {24,0,0,0},
    {25,0,0,0},
    {26,0,0,0},
    {27,0,0,0},
    {28,0,0,0},
    {29,0,0,0},
    {30,0,0,0},
    {31,0,0,0},
    {32,0,0,0},
    {33,0,0,0},
    {34,0,0,0},
    {35,0,0,0},
    {36,0,0,0},
    {37,0,0,0},
    {38,0,0,0},
    {39,0,0,0},
    {40,0,0,0},
    
    {41,0,0,0},
  };
  
  static int logRating[][] = {
    {0,0,0,0}, //{keyword index, rating of response 1, rating of response 2, rating of response 3}
    {1,0,0,0},
    {2,0,0,0},
    {3,0,0,0},
    {4,0,0,0},
    {5,0,0,0},
    {6,0,0,0},
    {7,0,0,0},
    {8,0,0,0},
    {9,0,0,0},
    {10,0,0,0},
    {11,0,0,0},
    {12,0,0,0},
    {13,0,0,0},
    {14,0,0,0},
    {15,0,0,0},
    {16,0,0,0},
    {17,0,0,0},
    {18,0,0,0},
    {19,0,0,0},
    {20,0,0,0},
    {21,0,0,0},
    {22,0,0,0},
    {23,0,0,0},
    {24,0,0,0},
    {25,0,0,0},
    {26,0,0,0},
    {27,0,0,0},
    {28,0,0,0},
    {29,0,0,0},
    {30,0,0,0},
    {31,0,0,0},
    {32,0,0,0},
    {33,0,0,0},
    {34,0,0,0},
    {35,0,0,0},
    {36,0,0,0},
    {37,0,0,0},
    {38,0,0,0},
    {39,0,0,0},
    {40,0,0,0},
    
    {41,0,0,0},

  };

  //this is never used
  public int getFeedback()
  {
    Scanner input = new Scanner(System.in);
    System.out.println("How would you rate this response from 1-5");
    return input.nextInt();
      
  }
  
  public static void log(int keyword, int response, int rating)
  {
    logKeyword[keyword][1]++;
    logResponse[keyword][response]++;
    logRating[keyword][response] = logRating[keyword][response] + rating;
 
  }

  public static void printlog()
  {
    System.out.println("Keyword log{Keyword index, frequency of keyword}:"); 
    for(int i = 0; i < 42; i++) //print logKeyword
    {
      for (int j = 0; j < 2; j++)
      {
        System.out.print(logKeyword[i][j] + ", ");     
      }
      System.out.print("\n"); 
    }
    System.out.print("\n"); 

    System.out.println("Response log{keyword index, frequency of response 1, fq of response 2, fq of response 3}:");
    for(int i = 0; i < 42; i++) //print logResponse
    {
      for (int j = 0; j < 4; j++)
      {
        System.out.print(logResponse[i][j] + ", ");       
      }
      System.out.print("\n"); 
    }
    System.out.print("\n"); 

    System.out.println("Rating log{keyword index, rating of response 1, rating of response 2, rating of response 3}:");
    for(int i = 0; i < 42; i++) //print rating
    {
      for (int j = 0; j < 4; j++)
      {
        System.out.print(logRating[i][j] + ", "); 
      }
      System.out.print("\n"); 
    }
  }
}