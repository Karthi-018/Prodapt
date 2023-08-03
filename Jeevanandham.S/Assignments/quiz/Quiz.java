package org.example.quiz;

public class Quiz {
    String qn;
    char actAns;
    //char userAns;
    String optionA;
    String optionB;
    String optionC;
    String optionD;

    public Quiz(String qn, String optionA, String optionB, String optionC, String optionD, char actAns) {
        this.qn = qn;
        this.actAns = actAns;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
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

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    @Override
    public String toString() {
        return "Question. "+qn+
                "\na . "+optionA+
                "\nb . "+optionB+
                "\nc . "+optionC+
                "\nd . "+optionD;
    }
}
