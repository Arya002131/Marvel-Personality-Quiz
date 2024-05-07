import javax.swing.JButton;

public class QPoints {
    
private String Choice;
public int LeaderPoints;
public int SocialPoints;
public int AngerPoints;


public void getButtonChoice(String C) {

    Choice = C;

}


    public void LeaderAddedPoints() {


        if (Choice.equals("Very Accurate") ) {

            LeaderPoints += 35;

        }

        else if (Choice.equals("Moderately Accurate")) {

            LeaderPoints += 15;

        }
        else if (Choice.equals("Not Accurate")) {

            LeaderPoints -= 20;

        }

        else {

            LeaderPoints += 0;

        }


    }

    public void SocialAddedPoints() {


        if (Choice.equals("Very Accurate") ) {

            SocialPoints += 35;

        }

        else if (Choice.equals("Moderately Accurate")) {

            SocialPoints += 15;

        }
        else if (Choice.equals("Not Accurate")) {

            SocialPoints -= 20;

        }

        else {

            SocialPoints += 0;

        }


    }


    public void AngerAddedPoints() {


        if (Choice.equals("Very Accurate") ) {

            AngerPoints += 35;

        }

        else if (Choice.equals("Moderately Accurate")) {

            AngerPoints += 15;

        }
        else if (Choice.equals("Not Accurate")) {

            AngerPoints -= 20;

        }

        else {

            AngerPoints += 0;

        }

    }

    


}
