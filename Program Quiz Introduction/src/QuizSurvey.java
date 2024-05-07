import java.util.Scanner;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class QuizSurvey implements ActionListener {

    private JButton Personality, Marvel;
    private JTextArea VisOutput;
    private JFrame NFrame;

public QuizSurvey() {

    JFrame NFrame = new JFrame();
    NFrame.setTitle("Survey Intro");


    GridBagConstraints GivConstraints = new GridBagConstraints();
    NFrame.setLayout(new GridBagLayout());

    

        VisOutput = new JTextArea(5, 30);
        VisOutput.setEditable(false);
        VisOutput.setText("Welcome to Our Quiz/Survey!\n \nPlease click on which Survey you would like to take: ");
        GivConstraints.insets = new Insets(15,10,10,10);
        GivConstraints.gridx = 0;
        GivConstraints.gridy = 0;
        NFrame.add(VisOutput, GivConstraints);

    GivConstraints.gridx = 10;
    GivConstraints.gridy = 20;
    Marvel = new JButton("Marvel");
    NFrame.add(Marvel);
    Marvel.addActionListener(this);

    NFrame.setLayout(new GridBagLayout());
    GivConstraints.gridx = 1;
    GivConstraints.gridy = 2;
    Personality = new JButton("Personality");
    NFrame.add(Personality);
    Personality.addActionListener(this);
   
    NFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    NFrame.pack();
    NFrame.setVisible(true);

}

  
    public static void main(String[] args) throws Exception {


        QuizSurvey StartPoint = new QuizSurvey();
        
       





    }

    @Override
    public void actionPerformed(ActionEvent arg0) {

        
        if (arg0.getSource() == Marvel) {
            MarvelGUI MarvelOpt = new MarvelGUI();
        
            JOptionPane.showMessageDialog(Marvel, "Make sure not close the Frame Windows unless you want to exit!");
            MarvelOpt.main(null);


        } else {

            PersonalityGUI PersonalityOpt = new PersonalityGUI();
        
            JOptionPane.showMessageDialog(Personality, "Make sure not close the Frame Windows unless you want to exit!");
            PersonalityOpt.main(null);
        }
        
    }

}
