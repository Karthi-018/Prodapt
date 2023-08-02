import java.util.Arrays;

public class QuizApp {
    private String question;
    private String[] options;
    private char crctOption;

    public QuizApp(String question, String[] options, char crctOption) {
        this.question = question;
        this.options = options;
        this.crctOption = crctOption;
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

    public char getCrctOption() {
        return crctOption;
    }

    public void setCrctOption(char crctOption) {
        this.crctOption = crctOption;
    }

    @Override
    public String toString() {
        return "QuizApp{" +
                "question='" + question + '\'' +
                ", options=" + Arrays.toString(options) +
                ", crctOption=" + crctOption +
                '}';
    }
}

