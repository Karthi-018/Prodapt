package quizapplication;

public class QuizBank
{

        private String questions;

        private char answer;
        private String option1;
        private String option2;
        private String option3;
        private String option4;


        QuizBank(String questions,String option1,String option2,String option3,String option4,char answer)
        {
            this.questions=questions;
            this.answer=answer;
            this.option1=option1;
            this.option2=option2;
            this.option3=option3;
            this.option4=option4;
        }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public char getAnswer() {
        return answer;
    }

    public void setAnswer(char answer) {
        this.answer = answer;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }


    @Override
    public String toString()
    {
        return  questions+"\n"+ option1 + "\n"+option2+"\n"+option3+"\n"+option4;

    }
}






