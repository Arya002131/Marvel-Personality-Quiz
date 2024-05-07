import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import java.awt.Color;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PersonalityGUI implements ActionListener {
    GridBagConstraints GBC = new GridBagConstraints();
    GridBagConstraints GBC2 = new GridBagConstraints();
    private JFrame NFrame;
    private JLabel Questions;
    private JButton VA;
    private JButton NA;
    private JButton MA;
    Feedback Personality = new Feedback();
    private int LoopCount;
    private JTextArea Results;
    private JScrollPane Pane;


    public static String LeaderQuestions(int Numloop) {

        Random randGen = new Random();
        String Question = "temp";

        int RandChoice;
    
        RandChoice = randGen.nextInt(2) + Numloop;

        
        int test;
        switch (RandChoice) {

            case 0:
                Question = "I value cooperation over competition. ";
                break;

            case 1:
                Question = "I confront my opinions of others upfront. ";
                break;

            case 2:
                Question = "I would rather take action in a situation than stay idle and see what happens.  ";
                break;

            case 3:
                Question = "I am really good at captivating people and being social.  ";
                break;

            case 4:
                Question = "I don't wait for others to lead the way.  ";
                break;

            case 5:
                Question = "I find it really easy to motivate myself.  ";
                break;

            case 6:
                Question = "I don't like to evaluate others and would rather evaluate myself.  ";
                break;

            case 7:
                Question = "I love to face challenges, the harder the better.  ";
                break;

            case 8:
                Question = "I find it easy to de-escalate situations.  ";
                break;

            case 9:
                Question = "              I don't feel anxious or worried to draw attention to myself. ";
                break;

            default:
                Question = "-1";
                break;

        }
        return Question;

    }

    public static String AngerQuestions(int Numloop) {

        Random randGen = new Random();
        String Question = "temp";

        int RandChoice;

        RandChoice = randGen.nextInt(2) + Numloop;

        int test;
        switch (RandChoice) {

            case 0:
                Question = "              I sometimes gossip or treat badly the people I don't like.";
                break;

            case 1:
                Question = "              I am easily annoyed, but quickly calm down. ";
                break;

            case 2:
                Question = "              I don't like to help people unless they respect me first.";
                break;

            case 3:
                Question = "              I feel as though I do not get everything that I deserve sometimes.";
                break;

            case 4:
                Question = "              If I don't approve of what my friends are doing or their behavior, I let them know.";
                break;

            case 5:
                Question = "              Depending on the situation, I feel as though violence is necessary.";
                break;

            case 6:
                Question = "              I can be perceived as condescending to other people's flaws.";
                break;

            case 7:
                Question = "              If I don't like an established rule, I feel the want to break it.";
                break;

            case 8:
                Question = "              I relate to the phrase, \"an eye for an eye\" or \"a tooth for a tooth\".VA";
                break;

            case 9:
                Question = "              I find myself arguing or disagreeing with people on a daily basis.";
                break;

            default:
                Question = "-1";
                break;

        }

        return Question;
    }


    public static String SocialQuestions(int Numloop) {

        Random randGen = new Random();
        String Question = "temp";

        int RandChoice;

        RandChoice = randGen.nextInt(2) + Numloop;

        int test;
        switch (RandChoice) {

            case 0:
                Question = "              I am a very private person.";
                break;

            case 1:
                Question = "              I don't like to be open about my feelings.";
                break;

            case 2:
                Question = "              I generally dont act comfortable with others.";
                break;

            case 3:
                Question = "              I prefer to do activities alone than with others.";
                break;

            case 4:
                Question = "              I can live without having the company of others.";
                break;

            case 5:
                Question = "              I find it very easy to keep myself amused.";
                break;

            case 6:
                Question = "              I usually let other people start the conversations.";
                break;

            case 7:
                Question = "              I prefer quiet places rather than loud ones.";
                break;

            case 8:
                Question = "              I am often told that I don't talk enough.";
                break;

            case 9:
                Question = "              I prefer to be in the background rather than being the center of interest.";
                break;

            default:
                Question = "-1";
                break;

        }

        return Question;
    }


    public PersonalityGUI() {


        int i;
        NFrame = new JFrame();
        
   
        NFrame.setLayout(null);
       NFrame.setSize(700, 250);
        NFrame.setTitle("Personality Survey");
        NFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //NFrame.pack();
        NFrame.setVisible(true);
        

        
        NFrame.setLayout(new GridBagLayout());
        
        GBC.insets = new Insets(10, 10, 50, 100);
        GBC.gridx = 0;
        GBC.gridy = 0;  
        Questions = new JLabel();

       for (i = 0; i < 10; i += 2) {


            Questions = new JLabel( (LeaderQuestions(i)) );
            
            NFrame.add(Questions, GBC);
      
    ++GBC.gridy;

        }  


    

       for (i = 0; i < 10; i += 2) {

            //GBC = new GridBagConstraints();

            Questions = new JLabel( (AngerQuestions(i)) );
            
            NFrame.add(Questions, GBC);
      
      
      ++GBC.gridy;

        } 
        GridBagConstraints GBC2 = new GridBagConstraints();
        //GBC2.insets = new Insets(10, 10, 30, 1000);
        GBC2.gridx = 3;
        GBC2.gridy = 0; 


        for (i = 0; i < 10; i += 2) {

            //GBC = new GridBagConstraints();

            Questions = new JLabel( (SocialQuestions(i)) );
            
            NFrame.add(Questions, GBC2);
      
      
      ++GBC2.gridy;

        }
        
        GBC2 = new GridBagConstraints();
        GBC2.insets = new Insets(20, 2, 5, 500);
        GBC2.gridx = 0;
        GBC2.gridy = 0;

        
        

        for (i = 0; i < 10; ++i) {

        VA = new JButton("Very Accurate");
        VA.addActionListener(this);

        NFrame.add(VA, GBC2);
        
        ++GBC2.gridy;
        }

        


        GBC2 = new GridBagConstraints();
        GBC2.insets = new Insets(20, 2, 5, 100);
        GBC2.gridx = 0;
        GBC2.gridy = 0;

        for (i = 0; i < 10; ++i) {

            MA = new JButton("Moderately Accurate");
            MA.addActionListener(this);
    
            NFrame.add(MA, GBC2);
            
            ++GBC2.gridy;
            }

        

        GBC2 = new GridBagConstraints();
        GBC2.insets = new Insets(20, 2, 5, -300);
        GBC2.gridx = 0;
        GBC2.gridy = 0;

        for (i = 0; i < 10; ++i) {

            NA = new JButton("Not Accurate");
            NA.addActionListener(this);
    
            NFrame.add(NA, GBC2);
            
            ++GBC2.gridy;
            }

            GBC2 = new GridBagConstraints();
            GBC2.insets = new Insets(60, 100, 5, 500);
            GBC2.gridx = 3;
            GBC2.gridy = 0; 
            
            for (i = 0; i < 5; ++i) {

                VA = new JButton("Very Accurate");
                VA.addActionListener(this);
        
                NFrame.add(VA, GBC2);
                
                ++GBC2.gridy;
                }
            
                GBC2 = new GridBagConstraints();
                GBC2.insets = new Insets(60, 100, 5, 100);
                GBC2.gridx = 3;
                GBC2.gridy = 0; 

                for (i = 0; i < 5; ++i) {

                    MA = new JButton("Moderately Accurate");
                    MA.addActionListener(this);
            
                    NFrame.add(MA, GBC2);
                    
                    ++GBC2.gridy;
                    }

            GBC2 = new GridBagConstraints();
            GBC2.insets = new Insets(60, 100, 5, -300);
            GBC2.gridx = 3;
            GBC2.gridy = 0; 
                
            for (i = 0; i < 5; ++i) {

                NA = new JButton("Not Accurate");
                NA.addActionListener(this);
        
                NFrame.add(NA, GBC2);
                
                ++GBC2.gridy;
                } 
            

                Results = new JTextArea(10, 3);
                Results.setEditable(false);
                Pane = new JScrollPane(Results);

                GBC2 = new GridBagConstraints();
                GBC2.insets = new Insets(60, 20, 5, 5);
                GBC2.gridx = 3;
                GBC2.gridy = 5;
                NFrame.add(Results, GBC2);


     
                
                



    }

    public static void main(String[] args) {
    
        PersonalityGUI StartUp = new PersonalityGUI();
       

       /* JPanel Panel = new JPanel();

        Panel.setBackground(Color.RED);
        Panel.setBounds(0, 0, 1050, 1050);
        Panel.setLayout(null);
        
        JScrollPane Scrolli = new JScrollPane(Panel);*/
  

        



    }

    @Override
    public void actionPerformed(ActionEvent arg0) {

        
        ++LoopCount;

        if ( LoopCount < 5 ) {
        
        if ((arg0.getActionCommand()).equals("Very Accurate")) {

            Personality.getButtonChoice("Very Accurate");
            Personality.LeaderAddedPoints();
       

            
        }

        else if ((arg0.getActionCommand()).equals("Moderately Accurate")) {

            Personality.getButtonChoice("Moderately Accurate");
            Personality.LeaderAddedPoints();
       
            
        }

        else if ((arg0.getActionCommand()).equals("Not Accurate")) {

            Personality.getButtonChoice("Not Accurate");
            Personality.LeaderAddedPoints();
        }

        else {

        System.out.println("Button broke");
        }

    }

    else if (LoopCount < 10) {

        if ((arg0.getActionCommand()).equals("Very Accurate")) {

            Personality.getButtonChoice("Very Accurate");
            Personality.AngerAddedPoints();
       

            
        }

        else if ((arg0.getActionCommand()).equals("Moderately Accurate")) {

            Personality.getButtonChoice("Moderately Accurate");
            Personality.AngerAddedPoints();
       
            
        }

        else if ((arg0.getActionCommand()).equals("Not Accurate")) {

            Personality.getButtonChoice("Not Accurate");
            Personality.AngerAddedPoints();
        }

        else {

        System.out.println("Broken");



    }

    

         }

    
         else if (LoopCount < 15) {

            if ((arg0.getActionCommand()).equals("Very Accurate")) {
    
                Personality.getButtonChoice("Very Accurate");
                Personality.SocialAddedPoints();
           
    
                
            }
    
            else if ((arg0.getActionCommand()).equals("Moderately Accurate")) {
    
                Personality.getButtonChoice("Moderately Accurate");
                Personality.SocialAddedPoints();
           
                
            }
    
            else if ((arg0.getActionCommand()).equals("Not Accurate")) {
    
                Personality.getButtonChoice("Not Accurate");
                Personality.SocialAddedPoints();
            }
    
            else {
    
            
                System.out.println("2Broken");
    
    
        }
    
        
    
     }
      
        else {

 

            Results.setText(Personality.setLFeedback() + "\n\n");

            Results.append(Personality.setAFeedback() + "\n\n");
            Results.append(Personality.setSFeedback());

           // NFrame.add(Results, GBC2);
         /*    Personality.setLFeedback();
            System.out.println();
            System.out.println();
            Personality.setAFeedback();
            System.out.println();
            System.out.println();
            Personality.setSFeedback();  */
        }



  
    }
}

