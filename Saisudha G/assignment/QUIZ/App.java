public class App {
    private String Question;
    private String Ans;

    public App(String question, String ans) {
        Question = question;
        Ans = ans;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAns() {
        return Ans;
    }

    public void setAns(String ans) {
        Ans = ans;
    }

    @Override
    public String toString() {
        return "App{" +
                "Question='" + Question + '\'' +
                ", Ans='" + Ans + '\'' +
                '}';
    }
}
