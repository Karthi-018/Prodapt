class Food {
    void eat(String foodname1) {
        System.out.println("The food is " + foodname1);
    }
    void eat(String foodname2 ,int price) {
        System.out.println("The  food is " +" "+  foodname2 + " "+"and price "+" " +price);
    }
}
class Main{
    public static void main(String[] args){
       Food f = new Food();
       f.eat("Biriyani"); 
       f.eat("meals", 120); 
    }
}