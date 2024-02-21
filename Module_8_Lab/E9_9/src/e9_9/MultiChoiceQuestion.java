package e9_9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MultiChoiceQuestion extends Question {
    private Set<String> correctChoices;

    @Override
    public void setAnswer(String correctResponse) {
        this.correctChoices = new HashSet<>(Arrays.asList(correctResponse.split(" ")));
    }

    @Override
    public boolean checkAnswer(String response) {
        Set<String> responseChoices = new HashSet<>(Arrays.asList(response.split(" ")));
        return correctChoices.equals(responseChoices);
    }
}

