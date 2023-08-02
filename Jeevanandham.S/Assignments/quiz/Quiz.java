package org.example.quiz;

public class Quiz {
    String qn;
    char actAns;
    char userAns;

    public Quiz(String qn, char actAns, char userAns) {
        this.qn = qn;
        this.actAns = actAns;
        this.userAns = userAns;
    }

    public String getQn() {
        return qn;
    }

    public void setQn(String qn) {
        this.qn = qn;
    }

    public char getActAns() {
        return actAns;
    }

    public void setActAns(char actAns) {
        this.actAns = actAns;
    }

    public char getUserAns() {
        return userAns;
    }

    public void setUserAns(char userAns) {
        this.userAns = userAns;
    }

    @Override
    public String toString() {
        return "Question. "+qn+
                "\nActual answer = "+actAns+
                "\nYour answer = "+userAns;

    }
}
