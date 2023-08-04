import java.util.Scanner;
public class Quiz {
    String Ques;
    String op1;
    String op2;
    String op3;

    String op4;
    int ans;

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }


    public String getQues() {
        return Ques;
    }

    public void setQues(String ques) {
        Ques = ques;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public String getOp4() {
        return op4;
    }

    public void setOp4(String op4) {
        this.op4 = op4;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "Ques='" + Ques + '\'' +
                ", op1='" + op1 + '\'' +
                ", op2='" + op2 + '\'' +
                ", op3='" + op3 + '\'' +
                ", op4='" + op4 + '\'' +
                '}';
    }

    public Quiz(String ques, String op1, String op2, String op3, String op4, int ans) {
        Ques = ques;
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
        this.op4 = op4;
        this.ans = ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int i = 0;
        Quiz[] a = new Quiz[3];
        a[0] = new Quiz("\nThe ______ keyword is used to call the constructor of the parent class", "1 this",
                "2 parent class name", "3 super", "4 parent", 3);
        a[1] = new Quiz("\nWhich of the following options compares only object references", "1 toString()",
                "2 equals()", "3 ==", "4 hashCode()", 3);
        a[2] = new Quiz("\nNumber of primitive data types in Java are", "1 6", "2 7", "3 8", "4 9", 3);

        while (true) {
            System.out.println(a[i]);
            System.out.println("Enter your answer : ");
            int answer = scan.nextInt();
            System.out.println("Enter your choice as prev or next : ");
            String choice = scan.next();
            if (choice.equalsIgnoreCase("next")) {
                i++;
                if (i >=a.length) {
                    System.out.println("Quiz over");
                    break;
                }
                if (answer == a[i].getAns()) {
                    count++;
                }

               /* else{
                    System.out.println(a[i]);
                    System.out.println("Enter your answer : ");
                    answer = scan.nextInt();
                    if (answer == a[i].getAns()) {
                        count++;
                    }
                   // i++;
                    if(i>=a.length)
                    {
                        System.out.println("Quiz over");
                        break;
                    }
                }*/
            }
            else if (choice.equalsIgnoreCase("prev")) {
                if(i==0){
                    System.out.println("its 1st question");
                    i++;
                    break;
                }
                i--;
                if (answer == a[i].getAns()) {
                    count++;
                }

//                else{
//                    System.out.println(a[i]);
//                    i+=2;
//                    if(i>=a.length){
//                        break;
//                    }
//
//                }
            }
        }
        System.out.println(count);
    }
}

