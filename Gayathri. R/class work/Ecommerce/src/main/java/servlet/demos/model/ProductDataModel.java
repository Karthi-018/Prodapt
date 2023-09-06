package servlet.demos.model;

public class ProductDataModel {
	int pid;
	String pname;
	String pdes;
	double price;
	int quan;
	
	
	public ProductDataModel() {
		
	}
	public ProductDataModel(int pid, String pname, String pdes, double price, int quan) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdes = pdes;
		this.price = price;
		this.quan = quan;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdes() {
		return pdes;
	}
	public void setPdes(String pdes) {
		this.pdes = pdes;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuan() {
		return quan;
	}
	public void setQuan(int quan) {
		this.quan = quan;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pdes=" + pdes + ", price=" + price + ", quan=" + quan
				+ "]";
	}
	

}
