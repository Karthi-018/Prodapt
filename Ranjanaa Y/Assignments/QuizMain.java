import java.util.*;
class Quiz
{
	String Ques;
	int Key;
	Quiz(String Ques,int Key)
	{
		this.Ques = Ques;
		this.Key = Key;
	}
	
}
class QuizMain
{
	public static void main(String args[])
	{
		QuizMain qm = new QuizMain();
		// creating array
		Quiz qarr[] = new Quiz[10];
		// framing question in string format;
		String s1 = "Which is the biggest continent in the world? :\n1.America 2. Asia 3. Australia";
		String s2 = "Which is the largest animal in the world? :\n1.Blue whale 2. shark 3. Dolphine";
		String s3 = "Which is largest animal on land? :\n1.Tiger 2. Elephant 3. crocodile";
		String s4 = "Tsunami is a word in which language? :\n1.Hindi 2. English 3. Japanese";
		String s5 = "Which is largest desert in the world? :\n1.Sahara 2. Gobi 3. Kalahari";
		String s6 = "How many letters are there in the English alphabet? :\n1.24 2. 22 3. 26";
		String s7 = "How many days are there in August? :\n1.30 2. 31 3. 29";
		String s8 = "Who is the first prime minister of India? :\n1.Nehru 2. Patil 3. Gandhi";
		String s9 = "How many colors are there in a rainbow? :\n1.8 2. 6 3. 7";
		String s10 = "Which is smallest planet in our solar system? :\n1.Earth 2. Mercury 3. Venus";
		// Storing the Question and answer in array
		qarr[0] = new Quiz(s1,2);
		qarr[1] = new Quiz(s2,1);
		qarr[2] = new Quiz(s3,2);
		qarr[3] = new Quiz(s4,3);
		qarr[4] = new Quiz(s5,1);
		qarr[5] = new Quiz(s6,3);
		qarr[6] = new Quiz(s7,2);
		qarr[7] = new Quiz(s8,1);
		qarr[8] = new Quiz(s9,3);
		qarr[9] = new Quiz(s10,2);
		qm.takeQuiz(qarr);
	}
	public void takeQuiz(Quiz qarr[])
	{
		int count=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<qarr.length;i++)
		{
			System.out.println(qarr[i].Ques);
			System.out.println("Enter your answer : ");
			int ans = sc.nextInt();
			if(ans == qarr[i].Key)
			{
				count ++;
			}
		}
		System.out.println("\nYour Score : "+count);
	}
}