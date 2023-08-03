import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class quizzz {
    static Scanner sc = new Scanner(System.in);
    static String[] ans = new String[10];
    static String[] strAns = {"B", "B", "B","C","A","A","B","B","B","B"};
    static int i=0;
    public  static void sd(String j){
        //boolean r= true;



            ans[i] = j;
            //System.out.println(i);
            i=i+1;


        //i=i+1;
    }

    public static int countMatch(String[] a, String[] b) {
        List<String> list1 = new ArrayList(Arrays.asList(a));
        List<String> list2 = Arrays.asList(b);
        list1.retainAll(list2);
        return list1.size();
    }
    //static int total=0;
    
    /*
    public static void compare(String[] ans, String[] strAns){
        int total=0;
        for (int e=0;e<10;e++) {



            if (strAns[e] == ans[e]) {
                total++;
                System.out.println("1");

                System.out.println(total);

            }

        }






    }*/
    public static int count_pairs(String s1[], String s2[]
                                  ) {

        // Initialise a variable count = 0
        int count = 0;

        // Generate all the pair
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                // Check if this pair is already considered
                // if true, then continue
                if (s2[j] == "-1")
                    continue;

                // Check if pair satisfy the given condition
                if (s1[i].equals(s2[j])) {

                    // Replace the string in s2 with -1,
                    // just to mark that we have consider
                    // this string with some pair
                    s2[j] = "-1";

                    // Increment the count by 1
                    count++;
                    break;
                }

            }
        }
        return count;
    }

    public static void main(String args[]){
        System.out.println("welcome to quizzzz");
        System.out.println("get ready");
        int key=1;
        int total=0;


        //qpojo q=new qpojo();
        switch (key){
            case 1:
                System.out.println("Q 1 - Can we compare int variable with a boolean variable?\n" +
                        "\n" +
                        "A - True\n" +
                        "\n" +
                        "B - False");

                //boolean r=false;
                sd(sc.next());

                //String answer1="b";

            case 2:
                System.out.println("Q 2 - What is the size of short variable?\n" +
                        "\n" +
                        "A - 8 bit\n" +
                        "\n" +
                        "B - 16 bit\n" +
                        "\n" +
                        "C - 32 bit\n" +
                        "\n" +
                        "D - 64 bit");
                sd(sc.next());
            case 3:
                System.out.println("Q 3 - What is the default value of short variable?\n" +
                        "\n" +
                        "A - 0.0\n" +
                        "\n" +
                        "B - 0\n" +
                        "\n" +
                        "C - null\n" +
                        "\n" +
                        "D - not defined\n" +
                        "\n");
                sd(sc.next());
            case 4:
                System.out.println("Q 4 - What is the default value of Object variable?\n" +
                        "\n" +
                        "A - undefined\n" +
                        "\n" +
                        "B - 0\n" +
                        "\n" +
                        "C - null\n" +
                        "\n" +
                        "D - not defined");
                sd(sc.next());
            case 5:
                System.out.println("Q 5 - What is local variable?\n" +
                        "\n" +
                        "A - Variables defined inside methods, constructors or blocks are called local variables.\n" +
                        "\n" +
                        "B - Variables defined outside methods, constructors or blocks are called local variables.\n" +
                        "\n" +
                        "C - Static variables defined outside methods, constructors or blocks are called local variables.\n" +
                        "\n" +
                        "D - None of the above.");
                sd(sc.next());
            case 6:
                System.out.println("Q 6 - Composition represents\n" +
                        "\n" +
                        "A - HAS-A relationship.\n" +
                        "\n" +
                        "B - IS-A relationship.");
                sd(sc.next());
            case 7:
                System.out.println("Q 7 - Dynamic binding uses which information for binding?\n" +
                        "\n" +
                        "A - type.\n" +
                        "\n" +
                        "B - object.\n" +
                        "\n" +
                        "C - Both of the above.\n" +
                        "\n" +
                        "D - None of the above.");
                sd(sc.next());
            case 8:
                System.out.println("Q 8 - What happens when thread's sleep() method is called?\n" +
                        "\n" +
                        "A - Thread returns to the ready state.\n" +
                        "\n" +
                        "B - Thread returns to the waiting state.\n" +
                        "\n" +
                        "C - Thread starts running.\n" +
                        "\n" +
                        "D - None of the above.\n" +
                        "\n");
                sd(sc.next());
            case 9:
                System.out.println("Q 9 - What will happen if static modifier is removed from the signature of the main method?\n" +
                        "\n" +
                        "A - Compilation Error.\n" +
                        "\n" +
                        "B - RunTime Error: NoSuchMethodError.\n" +
                        "\n" +
                        "C - Program will compile and run without any output.\n" +
                        "\n" +
                        "D - Program will compile and run to show the required output.\n" +
                        "\n");
                sd(sc.next());
            case 10:
                System.out.println("Q 10 - Which of the following is a thread safe?\n" +
                        "\n" +
                        "A - StringBuilder\n" +
                        "\n" +
                        "B - StringBuffer\n" +
                        "\n" +
                        "C - Both of the above\n" +
                        "\n" +
                        "D - none of the above");
                sd(sc.next());
            default:
                //System.out.println("you have scored "+ total);
                //compare(ans,strAns);
                for(int t=0;t<10;t++){
                    System.out.println(ans[t]);
                }
                //System.out.println(countMatch(ans,strAns));
                System.out.println(count_pairs(ans,strAns));
        }

        /*
        for(int h=0;h<10;h++){
            System.out.println(ans[h]);
        }*/


    }
}
