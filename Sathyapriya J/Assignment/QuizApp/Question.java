class Question 
{
    int questionNo;
    String question;
    String options [];
    private int correctAns;

    Question(int questionNo,String question,String options [],int correctAns)
    {
        this.questionNo= questionNo;
        this.question = question;
        this.options = options;
        this.correctAns = correctAns;
    }

    public boolean answerCheck(int selectedAns)
    {
        if(correctAns == selectedAns)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


}