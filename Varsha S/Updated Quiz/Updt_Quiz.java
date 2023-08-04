public class Updt_Quiz {
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String correctopt;

    public Updt_Quiz(String question, String opt1, String opt2, String opt3, String correctopt)
    {
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.correctopt = correctopt;
    }

    public String getQuestion()
    {
        return question;
    }

    public void setQuestion(String question)
    {
        this.question = question;
    }

    public String getOpt1()
    {
        return opt1;
    }

    public void setOpt1(String opt1)
    {
        this.opt1 = opt1;
    }

    public String getOpt2()
    {
        return opt2;
    }

    public void setOpt2(String opt2)
    {
        this.opt2 = opt2;
    }

    public String getOpt3()
    {
        return opt2;
    }

    public void setOpt3(String opt3)
    {
        this.opt3 = opt3;
    }
    public String getCorrectopt()
    {
        return correctopt;
    }

    public void setCorrectopt(String correctopt)
    {
        this.correctopt = correctopt;
    }

    @Override
    public String toString()
    {
        return "Question : " + question + '\n' + " A. " + opt1 + '\t' + " B. " + opt2 + '\t' + " C. " + opt3;
    }
}
