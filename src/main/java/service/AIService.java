package service;

public class AIService {

    public static String analyzeFeedback(String feedback) {

        String text = feedback.toLowerCase();

        String sentiment;
        String summary;
        String suggestion;


        if(text.contains("good") ||
           text.contains("excellent") ||
           text.contains("great") ||
           text.contains("helpful") ||
           text.contains("clear") ||
           text.contains("satisfied")) {

            sentiment = "Positive";
            summary = "Student is satisfied with the overall learning experience.";
            suggestion = "Continue the current approach and include more practical examples.";

        }

        else if(text.contains("bad") ||
                text.contains("poor") ||
                text.contains("difficult") ||
                text.contains("issue") ||
                text.contains("problem")) {

            sentiment = "Negative";
            summary = "Student has reported some concerns about the learning experience.";
            suggestion = "Improve practical sessions and address student difficulties.";

        }

        else {

            sentiment = "Neutral";
            summary = "Student provided general feedback about the course.";
            suggestion = "Collect more detailed feedback for further improvement.";

        }


        return 
        "AI Feedback Analysis\n\n" +
        "Sentiment: " + sentiment + "\n\n" +
        "Summary: " + summary + "\n\n" +
        "Suggestions: " + suggestion;
    }
}