class conv{
    public static void main(String[] args) {
        conv1 c = new conv1();
        System.out.println(c.convToCentimeters(2.5)); 
        System.out.println(c.convToCentimeters(5)); 
    }
}
class conv1{
    public double convToCentimeters(double meters){
        return meters*100;
    }
    public double convToCentimeters(int inches) {
        return inches*2.54;
    }

}


