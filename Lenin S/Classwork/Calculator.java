class Calculator
{
    public void add(int...num)
    {
        int sum = 0;
        for(int i : num)
        {
            sum=sum+i;
        }
        System.out.println("The sum of "+ num.length +" is "+sum);
    }
}
    class Main {

        public static void main(String[] args)
        {
            Calculator c = new Calculator();
            c.add(100,200);
            c.add(100,200,300);
        }
    }