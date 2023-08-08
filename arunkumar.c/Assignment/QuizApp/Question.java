package mcq;
public class Question {
    private String question;
    private String answer;
    private String option1;
    private String option2;
    private String option3;
    private String userGuess;

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }


    public String getUserGuess() {
        return userGuess;
    }

    public void setUserGuess(String userGuess) {
        this.userGuess = userGuess;
    }

    public Question(String question, String option1, String option2, String option3, String answer) {
        this.question = question;
        this.answer = answer;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
    }

    @Override
    public String toString() {
        return "Question\n" + question + "\n"+
                "A)" + option1 + "\n" +
                "B)" + option2 + "\n" +
                "C)" + option3 + "\n";
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
