public class Sort
{
  static String[][] responses = { 
      {"why","So basically because it relates to the physics in the mind","Mr. D himself said so","That is just how physics works"},
      {"is","Yes you are correct","Sorry, that is not right","Give me a piece of paper so it's easier to describe"},
      {"momentum","Mass times velocity","Two objects interact","How much friction exists"},
      {"optics","There is light","Look at the waves","Observe the lens"},
      {"force","Two objects interact","There are electric force and magnetic force","The force is inversely proportional"},
      {"progress","It will take 50 minutes","Set of 20 questions","It is not difficult"},
      {"checks","It will take 50 minutes","Set of 20 questions","Write down explanations"},
      {"explain","So basically flux is b times a","Does any one know what gravity is","Density of the fluid based on material"},
      {"circuits","Current inside the loop","You have the highest score asim","You'll get a square root curve"},
      {"lab","We have a lab today","You got a 100","I extended the due date for the lab"},
      {"warm","You can do it on a google docs","Speed of a wave is wavelenght times frequency","No one got 100 on the test"},
      {"up","On positive physics","Yeah, exactly","Sam stop playing with the lab equipment"},
      {"alright","The flux in the loop","Oberve the frequency displayed","Observe the wavelength"},
      {"ap","All my students get 5s on the ap exam","Sam please don't take the ap exam","Yes the test will be on ap classroom"},
      {"classroom","You have 3 progress checks due","We will take the test on ap classroom","They will lock by the end of the period"},
      {"quiz","It will be on friday","It will be on Wendesday","It will be on positive physics"},
      {"test","The test is today","Positive Physics","AP Classroom"},
      {"frq","FRQ is three parts","It will be 15 minutes","State the obvious"},
      {"mcq","There are 20 questions","There are 11 questions","Pace yourself well"},
      {"sam","Stop fooling around","Stop playing with lab equipment","Please do not take the ap test"},
      {"we","Remember to do the mcq","Doing a lab today","Work on positive physics"},
      {"have","No I have not","I have a spring","So we are taking the test on positive physics"},
      {"who","Your friend ","The greatest teacher","How do you not know who I am?"},
      {"where","Bottom of the bottle","inside your beautiful mind","Near earth's surface"},
      {"how","Use the right hand rule and it will 100% give you the answer","It just is","Let me ask Carter"},
      {"which","So we are using conventional current","There are two right hand rules","Don't do vocab and concepts"},
      {"yeah","If you look here","You get one point for this","FRQ is three parts"},
      {"fluid","Use bernoulli's equation","Fluid is only 20% of the AP exam","You should know this already"},
      {"have","Static is visible","Sound waves travel far","Create longitudinal waves"},
      {"come","The robot slides linearly","The robot slides horizontally","The robot strafes back and forth"},
      {"if","The curent flips direction","The velocity flips direction","Magnetix flux is zero"},
      {"get","Oh you got a good point","by not being a samuel kim","Of course you got the highest score"},
      {"to","Place the spring on the ground","Increase speed","Be careful and don't hold the end of the spring"},
      {"tell","Static is visible","Does anyone know the difference between dot product and cross product","Can anyone tell me what is 1+1"},
      {"give","There are 11 questions","You don't have to turn in work","We really need to move on"},
      {"provide","I want you to write multiple sentences","Current inside the loop","The test will be friday"},
      {"when","The test will be friday","I won't be here next monday","All we are doing tomorrow is positive physics"},
      {"did","I unlocked the test","I changed the due date","Work on positive physics"},
      {"can","Work on positive physics","We really need to move on","Yes, you can"},   
      {"so","Current inside the loop","The object exists","Electric force i traveling"},
      {"what","the universal law of physics will tell you ","a chemical reaction will occur","let me ask carter"},
      };
  
  public static void reArrange(int keyword, int rating1, int rating2, int rating3)
  {
    int rank1 = 0;
    int rank2 = 0;
    int rank3 = 0;

    if (rating1 >= rating2 && rating1 >= rating3) {
      rank1 = 1;
      if (rating2 >= rating3) {
        rank2 = 2;
        rank3 = 3;
      } else {
        rank2 = 3;
        rank3 = 2;
      }
    } else if (rating2 >= rating1 && rating2 >= rating3) {
      rank2 = 1;
      if (rating1 >= rating3) {
        rank1 = 2;
        rank3 = 3;
      } else {
        rank1 = 3;
        rank3 = 2;
      }
    } else {
      rank3 = 1;
      if (rating1 >= rating2) {
        rank1 = 2;
        rank2 = 3;
      } else {
        rank1 = 3;
        rank2 = 2;
      }
    }

    for (int i=1; i<=3; i++) {
      if (rank1 == i) System.out.println(responses[keyword][1]);
      if (rank2 == i) System.out.println(responses[keyword][2]);
      if (rank3 == i) System.out.println(responses[keyword][3]);
    }
   
  }
}