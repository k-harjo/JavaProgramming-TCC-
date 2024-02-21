package e9_8;

public class AnyCorrectChoiceQuestion extends Question {
    private String[] correctChoices;


    @Override
    public void setAnswer(String correctResponse) {
        this.correctChoices = correctResponse.split(" ");
    }

    @Override
    public boolean checkAnswer(String response) {
        for (String correctChoice : correctChoices) {
            if (response.trim().equalsIgnoreCase(correctChoice.trim())) {
                return true;
            }
        }
        return false;
    }


public static void main(String[] args) {
    AnyCorrectChoiceQuestion question = new AnyCorrectChoiceQuestion();
    question.setText("Which of the following are fruits? (Provide any one correct answer)\nApple Banana Chair Table");
    question.setAnswer("Apple Banana");

    // Test
    System.out.println(question.checkAnswer("Apple"));  // Should return true
    System.out.println(question.checkAnswer("Banana")); // Should return true
    System.out.println(question.checkAnswer("Chair"));  // Should return false
}
}
