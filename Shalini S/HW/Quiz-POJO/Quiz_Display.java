import java.util.*;
public class Quiz_Display {
    Scanner sc=new Scanner(System.in);
    public void display(ArrayList<Pojo_Quiz> data){
        System.out.println(data.get(0).getQuest());
        System.out.println("Enter 2 for next:");
        int n = sc.nextInt();
        if(n==2) {
            System.out.println(data.get(1).getQuest());
            int i = 1;
            while (i < data.size()) {
                System.out.println("Enter 1 for previous:");
                System.out.println("Enter 2 for next");
                n = sc.nextInt();
                if (n == 1) {
                    System.out.println(data.get(i - 1).getQuest());
                    i = i - 1;
                } else if (n == 2) {
                    System.out.println(data.get(i + 1).getQuest());
                    i = i + 1;
                } else {
                    System.out.println("Invalid input");
                    i++;
                }
            }
        }
        System.out.println(data.get(9).getQuest());
        System.out.println("Enter 1 for previous:");
        n = sc.nextInt();
        if(n==1){
            System.out.println(data.get(8).getQuest());
        }

    }

}