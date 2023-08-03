
import java.util.*;

public class collectionDemo
{
public static void main(String[] args){

Collection<String> data = new ArrayList<String>();
data.add("Stu1");
data.add("Stu2");
data.add("Stu3");
data.add("Stu4");
data.add("Stu5");
data.add("Stu6");
data.add("Stu7");
data.add("Stu8");
data.add("Stu9");
data.add("Stu10");
Collections.sort(data);

data.forEach(System.out::println);  

}
}

