import java.util.Arrays;

public class QuizApp {
    private String question;
    private String[] options;
    private char correctOption;
    private char userAnswer;
    public QuizApp(String question, String[] options, char correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public char getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(char userAnswer) {
        this.userAnswer = userAnswer;
    }

    public char getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(char correctOption) {
        this.correctOption = correctOption;
    }

    @Override
    public String toString() {
        return "QuizApp{" +
                "question='" + question + '\'' +
                ", options=" + Arrays.toString(options) +
                ", correctOption=" + correctOption +
                ", userAnswer=" + userAnswer +
                '}';
    }
}
