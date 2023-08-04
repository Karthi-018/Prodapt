package org.example;

public class Quiz {
    private String ques;
    private int answer;

    public Quiz(String ques, int answer) {
        this.ques = ques;
        this.answer=answer;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public String getQues() {
        return ques;
    }

    public int getAnswer() {
        return answer;
    }



    @Override
    public String toString() {
        return "Quiz{" +
                "ques='" + ques + '\'' +
                ", answer='" + answer+ '\'' +
                '}';
    }
}
