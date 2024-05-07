import java.util.Scanner;

public class MarvelQuizSurvey {


  public static void main(String[] args) {
  
    Scanner scrn = new Scanner(System.in);

  
         
       
       
       
       
       
       System.out.println("Lets go Marvel fans.");
       System.out.println();
         System.out.println("Prepare to see who you are in the Marvel universe!!"); 
          System.out.println();
          System.out.println("Before we get started here are somethings to keep in mind:");
          System.out.println("1. Make sure to Spell the word correctly.");
          System.out.println("2. Spelling the word wrong world result in a invalid result");
          System.out.println();
          System.out.println("Lets get started");
          System.out.println();
  
  
         
         
         
         
         String userChoice1;
        System.out.println("Question 1 :");
        System.out.println("Are you an Introvert or Extrovert ?");
        System.out.println("(a)Introvert");
        System.out.println("(b)Extrovert");
        System.out.println();
        System.out.print("Enter your Choice: ");
  
        userChoice1 = scrn.next();
        
        System.out.println( "You are an " + userChoice1);
         
        System.out.println();
       
          
          String userChoice2;
        System.out.println("Question 2 :");
        System.out.println("Are you a Follower or Leader?");
        System.out.println("(a)Leader");
        System.out.println("(b)Follower");
        System.out.println();
        System.out.print("Enter your Choice: ");
        
        userChoice2 = scrn.next();
        
        System.out.println("You are " + userChoice2);
        System.out.println();
  
  
        String choice1C = "Confident";
          String choice2C = "Nervous";
          String userChoice3;
        System.out.println("Question 3 :");
        System.out.println("Are you more Confident or Nervous?");
        System.out.println("(a)Confident");
        System.out.println("(b)Nervous");
        System.out.println();
        System.out.print("Enter your Choice: ");
        userChoice3 = scrn.next();
        
        System.out.println("You are more " + userChoice3);
        System.out.println();
  
  
        String userChoice4;
        System.out.println("Question 4 :");
        System.out.println("Are you an Optimist or Pessimist?");
        System.out.println("(a)Optimist");
        System.out.println("(b)Pessimist");
        System.out.println();
        System.out.print("Enter your Choice: ");
        userChoice4 = scrn.next();
        
        System.out.println("You are more " + userChoice4);
        System.out.println();
  
        String userChoice5;
        System.out.println("Question 5 :");
        System.out.println("Are you more Calculated or Impulsive?");
        System.out.println("(a)Calculated");
        System.out.println("(b)Impulsive");
        System.out.println();
        System.out.print("Enter your Choice: ");
        userChoice5 = scrn.next();
        
        System.out.println("You are more " + userChoice5);
        System.out.println();
       
        String userChoice6;
        System.out.println("Question 6 :");
        System.out.println("Are you more Traditional or Unconventional?");
        System.out.println("(a)Traditional");
        System.out.println("(b)Unconventional");
        System.out.println();
        System.out.print("Enter your Choice: ");
        userChoice6 = scrn.next();
        
        System.out.println("You are more " + userChoice6);
        System.out.println();
         
  
  
        String userChoice7;
        System.out.println("Question 7 :");
        System.out.println("Are you driven by your Goals or your Morals?");
        System.out.println("(a)Goals");
        System.out.println("(b)Morals");
        System.out.println();
        System.out.print("Enter your Choice: ");
        userChoice7 = scrn.next();
        
        System.out.println("You are more " + userChoice7);
        System.out.println();
        
  
  
        String userChoice8;
        System.out.println("Question 8 :");
        System.out.println("Are you a Dreamer or realist?");
        System.out.println("(a)Dreamer");
        System.out.println("(b)Realist");
        System.out.println();
        System.out.print("Enter your Choice: ");
        userChoice8 = scrn.next();
        
        System.out.println("You are more " + userChoice8);
        System.out.println();
  
        String userChoice9;
        System.out.println("Question 9 :");
        System.out.println("Are you more selfless or Self-interested?");
        System.out.println("(a)Selfless");
        System.out.println("(b)Self-interested");
        System.out.println();
        System.out.print("Enter your Choice: ");
        userChoice9 = scrn.next();
  
  
  
        
        System.out.println("You are more " + userChoice9);
        System.out.println();
  
  
        String userChoice10;
        System.out.println("Question 10 :");
        System.out.println("Are you more Forgiving or Vindictive?");
        System.out.println("(a)Forgiving");
        System.out.println("(b)Vindictive");
        System.out.println();
        System.out.print("Enter your Choice: ");
        userChoice10 = scrn.next();
        
  
  
        
        System.out.println("You are more " + userChoice10);
        System.out.println();
  
      if ((userChoice1.equals("Introvert")) && (userChoice2.equals("Follower"))&& (userChoice3.equals("Nervous")) && (userChoice4.equals("Optimist")) && (userChoice5.equals("Calculated")))
          {
               if((userChoice6.equals("Traditional")) && (userChoice7.equals("Goals")) && (userChoice8.equals("Dreamer")) && (userChoice9.equals("Selfless")) && (userChoice10.equals("Forgiving")))
            System.out.println("You are .... Spider-Man");
               
              System.out.println("You're just like Spider-Man himself, Peter Parker!");
              System.out.println("You're a pretty complex person — on the outside you come across as bold and confident like Spider-Man, but on the inside you're more introverted and shy like Peter.");
              System.out.println( "You've got a very creative mind and wild imagination that's capable of conjuring up all kinds of new and brilliant ideas.");
              System.out.println("You put 110% into everything you do and never give up without a fight.");
              System.out.println();
          
            }
      else if((userChoice1.equals("Introvert")) && (userChoice2.equals("Leader")) && (userChoice3.equals("Confident")) && (userChoice4.equals("Pessimist")) && (userChoice5.equals("Impulsive")))
      {
           if((userChoice6.equals("Unconventional")) && (userChoice7.equals("Morals")) && (userChoice8.equals("Realist")) && (userChoice9.equals("Self-interested")) && (userChoice10.equals("Vindictive")))
        System.out.println("You are ....Iron Man");
           
          System.out.println("You're just like Iron Man himself, Tony Stark!");
          System.out.println("You're super charming, incredibly smart, and sharp as a tack.");
          System.out.println("You're known for your sarcasm and quick wit, but behind it all you've got a giant heart.");
          System.out.println();
      
        }
  
        else if((userChoice1.equals("Extrovert")) && (userChoice2.equals("Leader")) && (userChoice3.equals("Confident")) && (userChoice4.equals("Pessimist")) && (userChoice5.equals("Impulsive")))
      {
           if((userChoice6.equals("Unconventional")) && (userChoice7.equals("Morals")) && (userChoice8.equals("Realist")) && (userChoice9.equals("Self-interested")) && (userChoice10.equals("Vindictive")))
        System.out.println("You are ....Iron Man");
           
          System.out.println("You're just like Iron Man himself, Tony Stark!");
          System.out.println("You're super charming, incredibly smart, and sharp as a tack.");
          System.out.println("You're known for your sarcasm and quick wit, but behind it all you've got a giant heart.");
          System.out.println();
      
        }
  
        else if((userChoice1.equals("Extrovert")) && (userChoice2.equals("Leader")) && (userChoice3.equals("Confident")) && (userChoice4.equals("Optimist")) && (userChoice5.equals("Impulsive")))
      {
           if((userChoice6.equals("Traditional")) && (userChoice7.equals("Morals")) && (userChoice8.equals("Realist")) && (userChoice9.equals("Self-interested")) && (userChoice10.equals("Forgiving")))
        System.out.println("You are ....Thor Odinson");
           
          System.out.println("You're just like Thor, God of Thunder!");
          System.out.println("You have a big personality and an even bigger heart.");
          System.out.println("You're always the funniest person in the room and others are constantly drawn to your positive energy.");
          System.out.println("You often doubt and second guess yourself, but you're capable of so much more than you could ever imagine!");
          System.out.println();
        }
        else if((userChoice1.equals("Introvert")) && (userChoice2.equals("Leader")) && (userChoice3.equals("Confident")) && (userChoice4.equals("Optimist")) && (userChoice5.equals("Impulsive")))
        {
             if((userChoice6.equals("Unconventional")) && (userChoice7.equals("Goals")) && (userChoice8.equals("Dreamer")) && (userChoice9.equals("Self-interested")) && (userChoice10.equals("Vindictive")))
          System.out.println("You are ....Loki Odinson");
             
            System.out.println("You're just like Loki, God of Mischiefs!");
            System.out.println("You thrive on chaos and aren't afraid to march to the beat of your own drum.");
            System.out.println("You don't often let people in, but you'd do just about anything for those you care about.");
            System.out.println("You have big dreams and big plans to make them a reality...even if it gets you into a little trouble along the way.");
            System.out.println();
          }
          else if((userChoice1.equals("Introvert")) && (userChoice2.equals("Leader")) && (userChoice3.equals("Confident")) && (userChoice4.equals("Optimist")) && (userChoice5.equals("Calculated")))
        {
             if((userChoice6.equals("Unconventional")) && (userChoice7.equals("Morals")) && (userChoice8.equals("Realist")) && (userChoice9.equals("Selfless")) && (userChoice10.equals("Vindictive")))
          System.out.println("You are ....Captain Marvel");
             
            System.out.println("You're just like Captain Marvel, Carol Danvers!");
            System.out.println("You're one tough cookie who never backs down from a fight.");
            System.out.println("You're not afraid to go against the tide and be yourself.");
            System.out.println(" People often underestimate you, but you're quick to prove them wrong. You're clever, determined, and the most loyal friend a person could ask for.");
            System.out.println();
          }
  
          else if((userChoice1.equals("Introvert")) && (userChoice2.equals("Leader")) && (userChoice3.equals("Confident")) && (userChoice4.equals("Optimist")) && (userChoice5.equals("Calculated")))
          {
               if((userChoice6.equals("Unconventional")) && (userChoice7.equals("Morals")) && (userChoice8.equals("Realist")) && (userChoice9.equals("Selfless")) && (userChoice10.equals("Vindictive")))
            System.out.println("You are ....Captain Marvel");
               
              System.out.println("You're just like Captain Marvel, Carol Danvers!");
              System.out.println("You're one tough cookie who never backs down from a fight.");
              System.out.println("You're not afraid to go against the tide and be yourself.");
              System.out.println(" People often underestimate you, but you're quick to prove them wrong. You're clever, determined, and the most loyal friend a person could ask for.");
              System.out.println();
            }
  
            else if((userChoice1.equals("Introvert")) && (userChoice2.equals("Leader")) && (userChoice3.equals("Confident")) && (userChoice4.equals("Optimist")) && (userChoice5.equals("Calculated")))
            {
                 if((userChoice6.equals("Unconventional")) && (userChoice7.equals("Morals")) && (userChoice8.equals("Realist")) && (userChoice9.equals("Selfless")) && (userChoice10.equals("Vindictive")))
              System.out.println("You are ....Captain Marvel");
                 
                System.out.println("You're just like Captain Marvel, Carol Danvers!");
                System.out.println("You're one tough cookie who never backs down from a fight.");
                System.out.println("You're not afraid to go against the tide and be yourself.");
                System.out.println(" People often underestimate you, but you're quick to prove them wrong. You're clever, determined, and the most loyal friend a person could ask for.");
                System.out.println();
              }
              else if((userChoice1.equals("Extrovert")) && (userChoice2.equals("Follower")) && (userChoice3.equals("Confident")) && (userChoice4.equals("pessimist")) && (userChoice5.equals("Impulsive")))
              {
                   if((userChoice6.equals("Unconventional")) && (userChoice7.equals("Goals")) && (userChoice8.equals("Dreamer")) && (userChoice9.equals("Self-interested")) && (userChoice10.equals("Vindictive")))
                System.out.println("You are ....Ant-Man");
                System.out.println("You're just like Ant-Man, Scott Lang!"); 
                  System.out.println("You tend to cope with stressful situations by using your sense of humour.");
                  System.out.println("You don't take yourself, or life, too seriously, and are often pretty self-deprecating.");
                  System.out.println("You have a certain charm that means people open up to you pretty easily, and you're known as a fun person to be around. You value your close relationships highly, and while you know how to have a laugh, you're also very supportive of your loved ones during their tougher moments.:)");
                  System.out.println();
                }
  
                else if((userChoice1.equals("Introvert")) && (userChoice2.equals("Leader")) && (userChoice3.equals("Confident")) && (userChoice4.equals("pessimist")) && (userChoice5.equals("Calculated")))
                {
                     if((userChoice6.equals("Traditional")) && (userChoice7.equals("Goals")) && (userChoice8.equals("Realist")) && (userChoice9.equals("Selfless")) && (userChoice10.equals("Forgiving")))
                  System.out.println("You are ....Black Widow");
                  System.out.println("You're just like Black Widow ,Natasha Romanoff!"); 
                    System.out.println("You're not afraid to kick someone's ass if you need to!");
                    System.out.println(" You're the mom of your group and that's why everyone loves and respects you.");
                    System.out.println("Not to mention, you're incredibly selfless and loyal to the end.");
                    System.out.println();
                  }
                  else if((userChoice1.equals("Introvert")) && (userChoice2.equals("Follower")) && (userChoice3.equals("Confident")) && (userChoice4.equals("optimist")) && (userChoice5.equals("Impulsive")))
                  {
                       if((userChoice6.equals("Unconventional")) && (userChoice7.equals("Goals")) && (userChoice8.equals("Dreamer")) && (userChoice9.equals("Self-interested")) && (userChoice10.equals("Vindictive")))
                    System.out.println("You are ....Wanda Maximoff");
                    System.out.println("You're just like Wanda Maximoff, Scarlet Witch!"); 
                      System.out.println("You're very headstrong and can take many of the punches the world throws at you.");
                      System.out.println("Life probably hasn't been easy for you, but you don't let that get to you.");
                      System.out.println("Those experiences only made you stronger!");
                      System.out.println();
                    }
  
                    else if((userChoice1.equals("Introvert")) && (userChoice2.equals("Follower")) && (userChoice3.equals("Confident")) && (userChoice4.equals("optimist")) && (userChoice5.equals("Calculated")))
                    {
                         if((userChoice6.equals("Traditional")) && (userChoice7.equals("Goals")) && (userChoice8.equals("Realist")) && (userChoice9.equals("Self-interested")) && (userChoice10.equals("Vindictive")))
                      System.out.println("You are .... Hawkeye");
                      System.out.println("You're just like  Hawkeye, Clint Barton!"); 
                        System.out.println("You're a total bad ass.");
                        System.out.println("You don't take anyone's BS.");
                        System.out.println(" You stick to yourself and are stronger for it. watch out for brainwashing, though — that'll get ya.");
                        System.out.println();
                      }
  
                      else if((userChoice1.equals("Extrovert")) && (userChoice2.equals("Follower")) && (userChoice3.equals("Confident")) && (userChoice4.equals("pessimist")) && (userChoice5.equals("Impulsive")))
                    {
                         if((userChoice6.equals("Unconventional")) && (userChoice7.equals("Goals")) && (userChoice8.equals("Dreamer")) && (userChoice9.equals("Selfless")) && (userChoice10.equals("Vindictive")))
                      System.out.println("You are .... Hulk");
                      System.out.println("You're just like  Hulk, Bruce Banner!"); 
                        System.out.println("You're a bit of a meanie, but you're loved.");
                        System.out.println(" When you have your bad moments, you find your people and work on yourself.");
                        System.out.println(" You're an overall good person who just doesn't have the best grasp on their anger.");
                        System.out.println();
                      }
  
  
                      else {
                        System.out.println("Sorry ...");
                        System.out.println("You are not matching the Marvel personalities");
                      }
  
  
                    
  
  
  
  
  
  
          }
        }
      



      
     

