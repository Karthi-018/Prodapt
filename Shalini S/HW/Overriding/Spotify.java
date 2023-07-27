import java.util.*;
class Spotify_parent{
    long year;
    public void welcome(){
        System.out.println("Welcome to spotify");
    }
    public void play(long year){
        System.out.println("Play old songs from the year "+(year));
    }
}
class Child extends Spotify_parent{
    long year;
    public void play(long year){
        if(year>2015){
            System.out.println("Play new songs from the year "+(year));
        }
    }
}
class Spotify{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        Spotify_parent obj=new Child();
        obj.welcome();
        obj.play(y);
    }
}