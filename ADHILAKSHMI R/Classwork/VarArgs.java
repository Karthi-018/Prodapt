public class VarArgs {
    public int sum(int... args)
    {
        int sum=0;
        for(int num:args)
        {
            sum=sum+num;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        VarArgs s = new VarArgs();
        System.out.println(s.sum(5));
        System.out.println(s.sum(8,35));
        System.out.println(s.sum(7,56,453));
        System.out.println(s.sum(0,36,657,4536));
    }
}