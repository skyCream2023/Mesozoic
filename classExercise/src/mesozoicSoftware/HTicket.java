package mesozoicSoftware;


public class HTicket {
	private int price;
	private String visitname;
	private double visitdate;
	
	public HTicket(int price, String viname, double vidate){
		this.price = price;
		this.visitname = visitname;
		this.visitdate = visitdate;
		}
	public int getPrice() {
		return this.price;
	}
	public String getViname() {
		return this.visitname;
	}

	public double getvidate() {
		return this.visitdate;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
