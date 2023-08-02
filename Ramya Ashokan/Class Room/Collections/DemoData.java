
import java.util.*;
class DemoData
{
public static void main(String args[])
{
ArrayList<Integer> datas=new ArrayList<Integer>();
datas.add(1);
datas.add(5);
datas.add(4);
datas.add(2);
datas.add(3);
System.out.println(datas);
datas.remove(2);
System.out.println(datas);

datas.remove(1);
System.out.println(datas);
ArrayList<String> data=new ArrayList<String>();
data.add("abc");
data.add("aas");
data.add("sds");
data.add("sdd");
data.add("sdf");
System.out.println(data);
data.remove(2);
System.out.println(data);
data.remove("abc");
System.out.println(data);
System.out.println();
List<Object> data1=Arrays.asList(1,2,3.5,4,"ram");
System.out.println(data1);

}
}