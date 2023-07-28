 

class Math {
public void say() {
System.out.println("This is math class");
}

class Topic extends Math {
public void say() {
System.out.println("Its include all topics");
}
}
}
public class Main {
public static void main(String args[]) {
Math a = new Math(); 
Topic b = new Topic(); 
a.say();
b.say(); 
}
}
