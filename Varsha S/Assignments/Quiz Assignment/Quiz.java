class Quiz
{
private String question;
private char answer;

public Quiz(String question, char answer)
{
this.question = question;
this.answer = answer;
}

public void setQuestion(String question)
{
this.question = question;
}
public String getQuestion()
{
return question;
}

public void setAnswer(char answer)
{
this.answer = answer;
}
public char getAnswer()
{
return answer;
}

public String toString()
{
return "Question: " + question + "\nAnswer: " + answer;
}
}