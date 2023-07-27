public class Cloths {
    public static void main(String[] args) {
        Cloths obj=new Cloths();
        obj.Tshirt("H&M");
        obj.Tshirt("H&M","black");
    }
    void Tshirt(String BrandName){
        System.out.println("Name of the brand : "+BrandName);;
    }
    void Tshirt(String BrandName,String color){
        System.out.println("Name of the brand : "+BrandName+" and the color : "+color);
    }
}
