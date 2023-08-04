import java.util.*;
public class Quiz_Display {
    Scanner sc=new Scanner(System.in);
    public void display(ArrayList<Pojo_Quiz> data){
        List d=new ArrayList();
        System.out.println(data.get(0).getQuest());
        char a=sc.next().charAt(0);
        d.add(0,a);
        System.out.println("Enter 2 for next:");
        int n = sc.nextInt();
        if(n==2) {
            System.out.println(data.get(1).getQuest());
            a=sc.next().charAt(0);
            d.add(1,a);
            int i = 1;
            while (i < data.size()-2) {
                System.out.println("Enter 1 for previous:");
                System.out.println("Enter 2 for next");
                n = sc.nextInt();
                if (n == 1) {
                    System.out.println(data.get(i - 1).getQuest());
                    a=sc.next().charAt(0);
                    d.add(i,a);
                    i = i - 1;
                } else if (n == 2) {
                    System.out.println(data.get(i + 1).getQuest());
                    a=sc.next().charAt(0);
                    d.add(i,a);
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
            a=sc.next().charAt(0);
            d.add(8,a);
            System.out.println("Enter 2 for next:");
            n=sc.nextInt();
            System.out.println(data.get(9).getQuest());
            a=sc.next().charAt(0);
            d.add(9,a);
        }
        else {
            int x=0;
            //System.out.println(d);
            for(int i=0;i<10;i++){
                char ans=data.get(i).getAns();
                if(d.get(i).equals(ans)){
                    x+=1;
                }
            }
            System.out.println("You have scored:"+x);
        }
    }

}