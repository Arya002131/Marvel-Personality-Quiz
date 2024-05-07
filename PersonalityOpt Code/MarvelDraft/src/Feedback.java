public class Feedback extends QPoints {

    private String LFeedback;
    private String AFeedback;
    private String SFeedback;

  /*   public void setLPoints(int LeaderPoints) {
        SeperatePoints = LeaderPoints;

    }  */

    public String setLFeedback() {

        if (LeaderPoints < 50) {

            LFeedback = "Your leadership skills could possibly be lacking or in needs of improvement. You prefer not to lead and have others lead you especially when facing difficult situations and may be more timid than normal. ";

            

        }

        else if ((LeaderPoints >= 50) && (LeaderPoints <= 80)) {

            LFeedback = "Your leadership skills are not too shabby.\nAlthough you may lack in areas that make an absolute and strong leader, you are generally good at being social when the opportunity calls for it and may have a love for competing. ";

    
            

        }

        else if (LeaderPoints > 80) {

            LFeedback = "Your leadership skills are really good. You love to take action and dislike it when others lead. You also have alot of determination and can maybe be a little too competitive. ";

            

        }

        else {

            LFeedback = "Your leadership skills are glitched. ";
        }
        return "Your Leadership Score: " + LFeedback;

    }

    public String setAFeedback() {

        if (AngerPoints < 50) {

            AFeedback = "Your anger control as well as your humbleness towards other people is astounding. You are a very peaceful person and find it easy to give up doing things you're way.\nYou also may be too passive or meek to let others know how you feel and/ or your opinions. ";

            

        }

        else if ((AngerPoints >= 50) && (AngerPoints <= 80)) {

            AFeedback = "Your anger control is OK. You still may find it hard to control how you treat people you dislike,\nyour are averagely calm and are more likely to \"agree to disagree\" than force things and or people to be or think your way. ";

            

        }

        else if (AngerPoints > 80) {

            AFeedback = " You have very low control and empathy when it comes to your anger and dislike for other people. You are very vocal in your views and opinions and have a huge anger problem.\nYou also feel as though if it is not done your way then it's not done right. You are also more prone to violence than the normal standard. ";

            
        }

        else {

            AFeedback = "Your anger skills are glitched. ";
        }

        return "Your Anger Score: " + AFeedback;

    }

    public String setSFeedback() {

        if (SocialPoints < 50) {

            SFeedback = "You are a very extroverted person and would prefer to do anything but spend your free-time or weekends by yourself.\nYou don't have trouble socializing and being yourself around people or in crowds, and you enjoy the idea of having many friends. The bigger the better. ";


        }

        else if ((SocialPoints>= 50) && (SocialPoints <= 80)) {

            SFeedback = "You can be introverted at times although you still generally like doing activicties with large crowds.\nYou don't usually have troble making and keeping conversations, but even so you can still value and enjoy having alone time  . ";

  

        }

        else if (SocialPoints > 80) {

            SFeedback = "You are a natural born introvert and your social life as well as skills if there is one is most likely very small or lacking.\nYou can easily etertain yourself for long periods of time and don't need the company of other people to maintain satisfied. You also don't like crowded places and prefer private places during your free time.";

        }

        else {

            SFeedback = "Your social skills are glitched. ";
        }

        return "Your Social Score: " + SFeedback;

    }



}
