import javax.swing.JOptionPane;


public class MarvelGUI {
    public static void main(String[] args)
{
   String name = JOptionPane.showInputDialog("Lets go Marvel fans. \nPrepare to see who you are in the Marvel universe!!\n\n Before we get started here are somethings to keep in mind:\n\n 1. Make sure to Spell the word correctly.\n\n 2. Spelling the word wrong world result in a invalid result\n\n Lets get started\n What's your Name? \n");
   JOptionPane.showMessageDialog(null, "Hi " + name);
    String userChoice1 = JOptionPane.showInputDialog("Are you an Introvert or Extrovert \n \n (a) Introvert\n \n (b) Extrovert\n");
    JOptionPane.showMessageDialog(null, "You are " + userChoice1);

    String userChoice2 = JOptionPane.showInputDialog("Are you an Leader or Follower \n \n (a) Leader\n \n (b) Follower\n");
    JOptionPane.showMessageDialog(null, "You are " + userChoice2);
    
    String userChoice3 = JOptionPane.showInputDialog("Are you more Confident or Nervous \n \n (a) Confident\n \n (b) Nervous\n");
    JOptionPane.showMessageDialog(null, "You are " + userChoice3);

    String userChoice4 = JOptionPane.showInputDialog("Are you an Optimist or Pessimist \n \n (a) Optimist\n \n (b) Pessimist\n");
    JOptionPane.showMessageDialog(null, "You are " + userChoice4);

    String userChoice5 = JOptionPane.showInputDialog("Are you more Calculated or Impulsive \n \n (a) Calculated\n \n (b) Impulsive\n");
    JOptionPane.showMessageDialog(null, "You are " + userChoice5);

    String userChoice6 = JOptionPane.showInputDialog("Are you more Traditional or Unconventional \n \n (a) Traditional\n \n (b) Unconventional\n");
    JOptionPane.showMessageDialog(null, "You are " + userChoice6);
    
    String userChoice7 = JOptionPane.showInputDialog("Are you driven by your Goals or your Morals \n \n (a) Goals\n \n (b) Morals\n");
    JOptionPane.showMessageDialog(null, "You are " + userChoice7);

    String userChoice8 = JOptionPane.showInputDialog("Are you a Dreamer or Realist \n \n (a) Dreamer\n \n (b) Realist\n");
    JOptionPane.showMessageDialog(null, "You are " + userChoice8);

    String userChoice9 = JOptionPane.showInputDialog("Are you more Selfless or Self-Interested \n \n (a) Selfless\n \n (b) Self-Intrested\n");
    JOptionPane.showMessageDialog(null, "You are " + userChoice9);

    String userChoice10 = JOptionPane.showInputDialog("Are you more Forgiving or Vindictive \n \n (a) Forgiving\n \n (b) Vindictive\n");
    JOptionPane.showMessageDialog(null, "You are " + userChoice10);

    
    if ((userChoice1.equals("Introvert")) && (userChoice2.equals("Follower"))&& (userChoice3.equals("Nervous")) && (userChoice4.equals("Optimist")) && (userChoice5.equals("Calculated")))
          {
               if((userChoice6.equals("Traditional")) && (userChoice7.equals("Goals")) && (userChoice8.equals("Dreamer")) && (userChoice9.equals("Selfless")) && (userChoice10.equals("Forgiving")))
            JOptionPane.showMessageDialog(null," You are .... Spider-Man\nYou're just like Spider-Man himself, Peter Parker!\nYou're a pretty complex person — on the outside you come across as bold and confident like Spider-Man, but on the inside you're more introverted and shy like Peter.\nYou've got a very creative mind and wild imagination that's capable of conjuring up all kinds of new and brilliant ideas.\nYou put 110% into everything you do and never give up without a fight.\n");
            

              
}
else if((userChoice1.equals("Introvert")) && (userChoice2.equals("Leader")) && (userChoice3.equals("Confident")) && (userChoice4.equals("Pessimist")) && (userChoice5.equals("Impulsive")))
      {
           if((userChoice6.equals("Unconventional")) && (userChoice7.equals("Morals")) && (userChoice8.equals("Realist")) && (userChoice9.equals("Self-interested")) && (userChoice10.equals("Vindictive")))
           JOptionPane.showMessageDialog(null, "You are ....Iron Man \n You're just like Iron Man himself, Tony Stark!\n You're super charming, incredibly smart, and sharp as a tack.\n You're known for your sarcasm and quick wit, but behind it all you've got a giant heart.\n");
          
      
        }
  
        else if((userChoice1.equals("Extrovert")) && (userChoice2.equals("Leader")) && (userChoice3.equals("Confident")) && (userChoice4.equals("Pessimist")) && (userChoice5.equals("Impulsive")))
      {
           if((userChoice6.equals("Unconventional")) && (userChoice7.equals("Morals")) && (userChoice8.equals("Realist")) && (userChoice9.equals("Self-interested")) && (userChoice10.equals("Vindictive")))
           JOptionPane.showMessageDialog(null, "You are ....Iron Man \n You're just like Iron Man himself, Tony Stark! \n You're super charming, incredibly smart, and sharp as a tack.\n You're known for your sarcasm and quick wit, but behind it all you've got a giant heart.\n");
          
      
        }
  
        else if((userChoice1.equals("Extrovert")) && (userChoice2.equals("Leader")) && (userChoice3.equals("Confident")) && (userChoice4.equals("Optimist")) && (userChoice5.equals("Impulsive")))
      {
           if((userChoice6.equals("Traditional")) && (userChoice7.equals("Morals")) && (userChoice8.equals("Realist")) && (userChoice9.equals("Self-interested")) && (userChoice10.equals("Forgiving")))
           JOptionPane.showMessageDialog(null, "You are ....Thor Odinson \n You're just like Thor, God of Thunder!\n You have a big personality and an even bigger heart.\n You're always the funniest person in the room and others are constantly drawn to your positive energy.\n You often doubt and second guess yourself, but you're capable of so much more than you could ever imagine!");
        }
        else if((userChoice1.equals("Introvert")) && (userChoice2.equals("Leader")) && (userChoice3.equals("Confident")) && (userChoice4.equals("Optimist")) && (userChoice5.equals("Impulsive")))
        {
             if((userChoice6.equals("Unconventional")) && (userChoice7.equals("Goals")) && (userChoice8.equals("Dreamer")) && (userChoice9.equals("Self-interested")) && (userChoice10.equals("Vindictive")))
             JOptionPane.showMessageDialog(null, "You are ....Loki Odinson\n You're just like Loki, God of Mischiefs! \nYou thrive on chaos and aren't afraid to march to the beat of your own drum. \n You don't often let people in, but you'd do just about anything for those you care about.\n You have big dreams and big plans to make them a reality...even if it gets you into a little trouble along the way. \n");
          }
          else if((userChoice1.equals("Introvert")) && (userChoice2.equals("Leader")) && (userChoice3.equals("Confident")) && (userChoice4.equals("Optimist")) && (userChoice5.equals("Calculated")))
        {
             if((userChoice6.equals("Unconventional")) && (userChoice7.equals("Morals")) && (userChoice8.equals("Realist")) && (userChoice9.equals("Selfless")) && (userChoice10.equals("Vindictive")))
             JOptionPane.showMessageDialog(null, "You are ....Captain Marvel \n You're just like Captain Marvel, Carol Danvers! \n You're one tough cookie who never backs down from a fight.\n You're not afraid to go against the tide and be yourself.\n People often underestimate you, but you're quick to prove them wrong. You're clever, determined, and the most loyal friend a person could ask for.\n");
           
          }
  
          else if((userChoice1.equals("Introvert")) && (userChoice2.equals("Leader")) && (userChoice3.equals("Confident")) && (userChoice4.equals("Optimist")) && (userChoice5.equals("Calculated")))
          {
               if((userChoice6.equals("Unconventional")) && (userChoice7.equals("Morals")) && (userChoice8.equals("Realist")) && (userChoice9.equals("Selfless")) && (userChoice10.equals("Vindictive")))
               JOptionPane.showMessageDialog(null, "You are ....Captain Marvel \n You're just like Captain Marvel, Carol Danvers! \nYou're one tough cookie who never backs down from a fight.\nYou're not afraid to go against the tide and be yourself.\n People often underestimate you, but you're quick to prove them wrong. You're clever, determined, and the most loyal friend a person could ask for.");
            }
  
            else if((userChoice1.equals("Introvert")) && (userChoice2.equals("Leader")) && (userChoice3.equals("Confident")) && (userChoice4.equals("Optimist")) && (userChoice5.equals("Calculated")))
            {
                 if((userChoice6.equals("Unconventional")) && (userChoice7.equals("Morals")) && (userChoice8.equals("Realist")) && (userChoice9.equals("Selfless")) && (userChoice10.equals("Vindictive")))
                 JOptionPane.showMessageDialog(null, "You are ....Captain Marvel \nYou're just like Captain Marvel, Carol Danvers! \n You're one tough cookie who never backs down from a fight. \n You're not afraid to go against the tide and be yourself. \nPeople often underestimate you, but you're quick to prove them wrong. You're clever, determined, and the most loyal friend a person could ask for.");
             
              }
              else if((userChoice1.equals("Extrovert")) && (userChoice2.equals("Follower")) && (userChoice3.equals("Confident")) && (userChoice4.equals("pessimist")) && (userChoice5.equals("Impulsive")))
              {
                   if((userChoice6.equals("Unconventional")) && (userChoice7.equals("Goals")) && (userChoice8.equals("Dreamer")) && (userChoice9.equals("Self-interested")) && (userChoice10.equals("Vindictive")))
                   JOptionPane.showMessageDialog(null, "You are ....Ant-Man. \n You're just like Ant-Man, Scott Lang! \n You tend to cope with stressful situations by using your sense of humour.\n You don't take yourself, or life, too seriously, and are often pretty self-deprecating.\n You have a certain charm that means people open up to you pretty easily, and you're known as a fun person to be around. You value your close relationships highly, and while you know how to have a laugh, you're also very supportive of your loved ones during their tougher moments.:)\n");
                }
  
                else if((userChoice1.equals("Introvert")) && (userChoice2.equals("Leader")) && (userChoice3.equals("Confident")) && (userChoice4.equals("pessimist")) && (userChoice5.equals("Calculated")))
                {
                     if((userChoice6.equals("Traditional")) && (userChoice7.equals("Goals")) && (userChoice8.equals("Realist")) && (userChoice9.equals("Selfless")) && (userChoice10.equals("Forgiving")))
                     JOptionPane.showMessageDialog(null, "You are ....Black Widow\n You're just like Black Widow ,Natasha Romanoff! \nYou're not afraid to kick someone's ass if you need to! \n You're the mom of your group and that's why everyone loves and respects you.\nNot to mention, you're incredibly selfless and loyal to the end.");
                   
                  }
                  else if((userChoice1.equals("Introvert")) && (userChoice2.equals("Follower")) && (userChoice3.equals("Confident")) && (userChoice4.equals("optimist")) && (userChoice5.equals("Impulsive")))
                  {
                       if((userChoice6.equals("Unconventional")) && (userChoice7.equals("Goals")) && (userChoice8.equals("Dreamer")) && (userChoice9.equals("Self-interested")) && (userChoice10.equals("Vindictive")))
                       JOptionPane.showMessageDialog(null, "You are ....Wanda Maximoff \n You're just like Wanda Maximoff, Scarlet Witch! \n You're very headstrong and can take many of the punches the world throws at you.\n Life probably hasn't been easy for you, but you don't let that get to you.\nThose experiences only made you stronger!");
                     
                    }
  
                    else if((userChoice1.equals("Introvert")) && (userChoice2.equals("Follower")) && (userChoice3.equals("Confident")) && (userChoice4.equals("optimist")) && (userChoice5.equals("Calculated")))
                    {
                         if((userChoice6.equals("Traditional")) && (userChoice7.equals("Goals")) && (userChoice8.equals("Realist")) && (userChoice9.equals("Self-interested")) && (userChoice10.equals("Vindictive")))
                         JOptionPane.showMessageDialog(null, "You are .... Hawkeye \n You're just like  Hawkeye, Clint Barton! \n You're a total bad ass.\n You don't take anyone's BS. \n You stick to yourself and are stronger for it. watch out for brainwashing, though — that'll get ya.");
                    
                      }
  
                      else if((userChoice1.equals("Extrovert")) && (userChoice2.equals("Follower")) && (userChoice3.equals("Confident")) && (userChoice4.equals("pessimist")) && (userChoice5.equals("Impulsive")))
                    {
                         if((userChoice6.equals("Unconventional")) && (userChoice7.equals("Goals")) && (userChoice8.equals("Dreamer")) && (userChoice9.equals("Selfless")) && (userChoice10.equals("Vindictive")))
                         JOptionPane.showMessageDialog(null, "You are .... Hulk\n You're just like  Hulk, Bruce Banner!\n You're a bit of a meanie, but you're loved. \n When you have your bad moments, you find your people and work on yourself. \n You're an overall good person who just doesn't have the best grasp on their anger.\n");
                      }
  
  
                      else {
                        JOptionPane.showMessageDialog(null, "Sorry ... \n You are not matching the Marvel personalities \n");
                      }
  
}
}
