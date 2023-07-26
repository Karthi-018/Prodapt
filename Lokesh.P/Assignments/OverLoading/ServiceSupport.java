public class ServiceSupport {
    private String HelpingNumber(int number)
    {
        return String.format("%d",number);
    }
    private String HelpingNumber(double number)
    {
        return String.format("%.2f",number);
    }
    private String HelpingNumber(String number)
    {
        return String.format("%.1f",Double.parseDouble(number));
    }
    public static void main(String[] args) {
        ServiceSupport support=new ServiceSupport();
        System.out.println(support.HelpingNumber(500));
        System.out.println(support.HelpingNumber(89.9934));
        System.out.println(support.HelpingNumber("550"));
    }
}
