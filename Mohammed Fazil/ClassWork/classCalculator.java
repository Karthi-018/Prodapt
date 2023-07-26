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
            c.add(10,20);
            c.add(10,20,30);
        }
    }

