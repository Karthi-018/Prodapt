class Pharma{
	String medicine_name;
	int Expiry_year;
	Pharma(String medicine_name,int Expiry_year){
		this.medicine_name=medicine_name;
		this.Expiry_year=Expiry_year;
		}
	
	public void lable_Details(){
		System.out.println("MEDICINE NAME:"+medicine_name);
		System.out.println("EXPIRY YEAR:"+Expiry_year+"yrs");
		}}
class Tablets extends Pharma{
	int dosage;
	Tablets(String medicine_name,int Expiry_year,int dosage){
		super(medicine_name,Expiry_year);
		this.dosage=dosage;
	}
	//@override
	public void lable_Details(){
	super.lable_Details();
	System.out.println("DOSAGE:"+dosage+"mg");
	}}
class Syrup extends Pharma{
	String flavour;
	Syrup(String medicine_name,int Expiry_year,int dosage,String flavour){
		super(medicine_name,Expiry_year);
		this.flavour=flavour;
		}
	//@override
	public void lable_Details(){
		super.lable_Details();
		System.out.println("SYRUP FLAVOUR:"+flavour);
	}}


class Pharmacompany{
	public static void main(String args[]){
		Pharma p1=new Tablets("citrazin",2,10);
		Pharma p2=new Syrup("Ascoril",3,5,"Mint");
		p1.lable_Details();
		p2.lable_Details();
}}
	
	
