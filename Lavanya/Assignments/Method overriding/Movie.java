public class Movie {
    public static void main(String[] args) {
       Movie obj1=new Thriller();
       Movie obj2=new Comedy();
       obj1.Genre();
       obj2.Genre();
    }
    void Genre(){
        System.out.println("Many genres");
    }
}

class Thriller extends Movie {
    void Genre(){
        System.out.println("Thriller movies");
    }

}

class Comedy extends Movie{
    void Genre(){
        super.Genre();
        System.out.println("Comedy movies");
    }
}
