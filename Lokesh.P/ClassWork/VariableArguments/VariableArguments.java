public class VariableArguments {
    public int sum(int... args)
    {
        int total=0;
        for(int num:args)
        {
            total=total+num;
        }
        return total;
    }
    public static void main(String[] args)
    {
        VariableArguments va = new VariableArguments();
        System.out.println(va.sum(10,15));
        System.out.println(va.sum(5,10,15,20));
        System.out.println(va.sum(9,18,27));
    }
}
