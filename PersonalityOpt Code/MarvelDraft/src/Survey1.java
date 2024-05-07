import java.util.Scanner;
import java.util.Random;

public class Survey1 {
    private int TotalScore;

    public static String LeaderQuestions(int Numloop) {

        Random randGen = new Random();
        String Question = "temp";

        int RandChoice;
    
        RandChoice = randGen.nextInt(2) + Numloop;

        
        int test;
        switch (RandChoice) {

            case 0:
                Question = "              I value cooperation over competition.";
                break;

            case 1:
                Question = "              I confront my opinions of others upfront.";
                break;

            case 2:
                Question = "              I would rather take action in a situation than stay idle and see what happens.";
                break;

            case 3:
                Question = "              I am really good at captivating people and being social.";
                break;

            case 4:
                Question = "              I don't wait for others to lead the way.";
                break;

            case 5:
                Question = "              I find it really easy to motivate myself.";
                break;

            case 6:
                Question = "              I don't like to evaluate others and would rather evaluate myself.";
                break;

            case 7:
                Question = "              I love to face challenges, the harder the better.";
                break;

            case 8:
                Question = "              I find it easy to de-escalate situations.";
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

    public static int ResponseChoice(int PointsGained) {
        Scanner scrn = new Scanner(System.in);
        int Test;
        String Ans;
        String VA = "Very Accurate";
        String MA = "Moderately Accurate";
        String NA = "Not Accurate";
        System.out.println();
        System.out.println("     [] Very Accurate (VA)   [] Moderately Accurate (MA)  [] Not Accurate (NA)  ");
        System.out.println();
        System.out.println();

        Ans = scrn.nextLine();
        if ((Ans.equals(VA)) || (Ans.equals(MA)) || (Ans.equals(NA)) || (Ans.equals("VA")) || (Ans.equals("MA"))
                || (Ans.equals("NA"))) {

            if ((Ans.equals(VA)) || (Ans.equals("VA"))) {
                PointsGained += 35;
                return PointsGained;
            }

            else if ((Ans.equals(MA)) || (Ans.equals("MA"))) {
                PointsGained += 15;
                return PointsGained;
            }

            else {
                PointsGained -= 20;
                return PointsGained;
            }

        } else {

            System.out.println("You answered incorrectly. Points for this question will not be counted.");
            System.out.println();
            PointsGained += 0;
            return PointsGained;
        }

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Feedback AngerAns = new Feedback();
        Feedback LeaderAns = new Feedback();
        Feedback SocialAns = new Feedback();
        String UserAns;
        int LeaderPoints = 0;
        int AngerPoints = 0;
        int SocialPoints = 0;

        int i;

        System.out.println("Welcome to the Personality Survey!");
        System.out.println();
        System.out.println(
                "Please type one of the shown options or abbreviations that best suits you for each question.");
        System.out.println();
        System.out.println();

        for (i = 0; i < 10; i += 2) {

            System.out.println(LeaderQuestions(i));

            LeaderPoints = ResponseChoice(LeaderPoints);
        }
        System.out.println();
        System.out.println();
        // System.out.print("Your Points: " + LeaderPoints);
        System.out.println();

        for (i = 0; i < 10; i += 2) {

            System.out.println(AngerQuestions(i));

            AngerPoints = ResponseChoice(AngerPoints);
        }
        System.out.println();
        System.out.println();
        // System.out.print("Your Points: " + AngerPoints);
        System.out.println();

        for (i = 0; i < 10; i += 2) {

            System.out.println(SocialQuestions(i));

            SocialPoints = ResponseChoice(SocialPoints);
        }
        System.out.println();
        System.out.println();
        // System.out.print("Your Points: " + SocialPoints);

        //LeaderAns.setPoints(LeaderPoints);
       // AngerAns.setPoints(AngerPoints);
      //  SocialAns.setPoints(SocialPoints);
        LeaderAns.setLFeedback();
        AngerAns.setAFeedback();
        SocialAns.setSFeedback();
    }

}
