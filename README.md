## QuizNest

The QuizNest is an engaging quiz application that helps users discover more about themselves based on their choices. Users can select between two exciting options:

• Marvel Quiz: Find out which Marvel character best matches your personality.

• Personality Survey: Explore insights into your personality traits, including         
leadership, anger, and social tendencies.

Our project focuses on delivering an interactive experience using a Graphical User Interface (GUI), various Java classes, and functionalities that make the application dynamic and fun.





## Features

1. Quiz Intro
• Interface: A welcoming frame labeled Survey Intro with two interactive buttons:
        
        • Marvel Quiz
        • Personality Survey
• Action Handling: Each button triggers a specific class depending on the user’s choice using the getSource() method to differentiate actions.

2. Marvel Quiz
• Functionality: 
    
        • Users answer 10 questions designed to determine their Marvel character match.
        • Implemented using JOptionPane for inputs and outputs with 11 total pop-ups.
        • Conditional logic includes if-else statements and switch cases to evaluate        
        answers.
• Highlight: Tells the user which Marvel character they resemble based on their responses.

3. Personality Quiz
• Functionality: 
    
        • Users answer 10 questions designed to determine their Marvel character match.
        After selecting the Personality Survey, the program calls PersonalityGUI, which 
        utilizes features like JFrame and GridBagConstraints.
        • The survey comprises three sections:
            • Leader
            • Anger
            • Social
        • Each section evaluates traits based on user choices.     
        • The program generates randomized questions on every run using a randNumber 
        feature for a fresh experience.

• User Interface:

        • Uses JLabels, JButtons, and GridBagConstraints to display questions and choices.
        Tells the user which Marvel character they resemble based on their responses.
• Feedback Mechanism:

        • After each selection, the program calls a Feedback class derived from QPoints to 
        provide results.


## Technical Highlights 
• Object-Oriented Design:

        • Multiple classes, including QuizSurvey, MarvelGUI, 
        PersonalityGUI, Feedback, and QPoints.

        • Public variables in QPoints ensure seamless       
        integration between classes.
• Dynamic GUI:

        • Implements a variety of GUI components such as 
        JOptionPane, JFrame, GridBagConstraints, spinners,   
        and buttons for an interactive user experience.

• Reusable Code:

        • Methods and variables are defined outside the main 
        method to improve code readability and reusability.

