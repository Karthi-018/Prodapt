package quizapplication; 

class QuizBank  
{ 
private String questions;

private char answer;

QuizBank(String questions)
{ 
this.questions=questions;
}
 
QuizBank(char answer)
{ 
this.answer=answer;
}

public void setQuestions(String questions)
{ 
this.questions=questions;
}

public void setAnswers(char answer) 
{ 
this.answer=answer;
} 

public String getQuestion() 
{ 
return questions;
} 

public char getAnswer() 
{ 
return answer;
}

}





