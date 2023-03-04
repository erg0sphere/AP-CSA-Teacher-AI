import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class GUI implements ActionListener
  {
    
    //sets up elements in the GUI
    private JLabel prompt = new JLabel("Whatz up guys! I am Mr. Daugherty. Does anyone have any questions?");
    private JLabel ansLabel = new JLabel("Answer: ");
    private JFrame frame = new JFrame();
    private JTextField inputBox = new JTextField(20); 

    JButton button = new JButton("Ask"); 
    JButton button2 = new JButton("Rate"); 

    int keywordIndex;
    int responseIndex;
    int rating = 0;



    public GUI() 
    {

      // the clickable button
      
      button.addActionListener(this);
      button2.addActionListener(this);

      // the panel with the button and text
      JPanel panel = new JPanel();
      panel.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));
      panel.setLayout(new GridLayout(0, 1));
      panel.add(prompt);
      panel.add(inputBox);
      panel.add(button);
      panel.add(button2);
      panel.add(ansLabel);
        
      // set up the frame and display it
      frame.add(panel, BorderLayout.CENTER);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setTitle("GUI");
      frame.pack();
      frame.setVisible(true);
      button2.setVisible(false);

    
    }

    // process the button clicks
    public void actionPerformed(ActionEvent e) 
    {
      if(e.getSource() == button)
      {
        String input = inputBox.getText();
        input = input.toLowerCase();
        
        process(input);

        prompt.setText("How would you rate this response?");
        inputBox.setText("");
        button.setVisible(false);
        button2.setVisible(true);
        
      }
      else if(e.getSource() == button2)
      {
        System.out.println("button 2 is pressed");
        
        String strRating = inputBox.getText();
        rating = Integer.parseInt(strRating);
        
        System.out.print("\033[H\033[2J");

        System.out.println("keyword index = " + keywordIndex);
        System.out.println("response index = " + responseIndex);
        System.out.println("rating  = " + rating);
        
        Logging.log(keywordIndex, responseIndex, rating);
        Logging.printlog();
        
        prompt.setText("Whatz up guys! I am Mr. Daugherty. Does anyone have any questions?");
        inputBox.setText("");
        button.setVisible(true);
        button2.setVisible(false);
        ansLabel.setText("Answer: ");
        
      }
        
      
     
        
    }
    public void process(String input)
    {
      //2D array containing responses
      String[][] ai = { 
      {"is","That is correct","No he is not","I want your work on paper"},
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
      {"test","We really need to move on to next unit","Positive Physics","AP Classroom"},
      {"frq","FRQ is three parts","It will be 15 minutes","State the obvious"},
      {"mcq","There are 20 questions","There are 11 questions","Pace yourself well"},
      {"sam","Stop fooling around","Stop playing with lab equipment","Please do not take the ap test"},
      {"we","Remember to do the mcq","Doing a lab today","Work on positive physics"},
      {"have","No I have not","I have a spring","So we are taking the test on positive physics"},
      {"who","Your friend ","The greatest teacher","How do you not know who I am?"},
      {"why","So basically flux is b times a","Current is going clockwise","Charge following electric field"},
      {"where","Bottom of the bottle","Current inside the loop","Near earth's surface"},
      {"how","Use the right hand rule","It just is","Let me ask Carter"},
      {"which","So we are using conventional current","There are two right hand rules","Don't do vocab and concepts"},
      {"yeah","If you look here","You get one point for this","FRQ is three parts"},
      {"fluid","Use bernoulli's equation","Fluid is only 20% of the AP exam","You should know this already"},
      {"have","Static is visible","Sound waves travel far","Create longitudinal waves"},
      {"come","The robot slides linearly","The robot slides horizontally","The robot strafes back and forth"},
      {"if","The curent flips direction","The velocity flips direction","Magnetix flux is zero"},
      {"get","Oh you got a 13 mason","Elkan you got a 12","Of course you got the highest score"},
      {"to","Place the spring on the ground","Increase speed","Be careful and don't hold the end of the spring"},
      {"tell","Static is visible","Does anyone know the difference between dot product and cross product","Can anyone tell me what is 1+1"},
      {"give","There are 11 questions","You don't have to turn in work","We really need to move on"},
      {"provide","I want you to write multiple sentences","Current inside the loop","The test will be friday"},
      {"when","The test will be friday","I won't be here next monday","All we are doing tomorrow is positive physics"},
      {"did","I unlocked the test","I changed the due date","Work on positive physics"},
      {"can","Work on positive physics","We really need to move on","Yes, you can"},   
      {"so","Current inside the loop","The object exists","Electric force i traveling"},
      {"what","An object that floats ","Magnetic field in the area","Distribute current in the circuit"},
      };
 
      //loops though array to search keyword
      int randnum1 = Random.generateNum(0, 41);
      responseIndex = Random.generateNum(1, 3);
      
      for(int i = 0; i < 41; i++)
      {
        if(input.contains(ai[i][0]))
        {
          //randomly selects a response based on keyword
          keywordIndex = i;
          String ans = ai[keywordIndex][responseIndex];
          ansLabel.setText("Answer: " + ans);
          System.out.print("1");
          System.out.println(ans);
          
          
          break;
        } 
        else if(i == 40) //null condition
        {
          keywordIndex = 41;
          String ans2 = ai[randnum1][responseIndex];
          
          ansLabel.setText("Answer: " + ans2);
          System.out.print("2");
          System.out.println(ans2);
          
        
        }
      }
    }

    
    
}
