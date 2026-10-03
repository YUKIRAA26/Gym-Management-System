package gymManagement;

public enum MembershipType {
	BASIC(500,1),
	PREMUIM(2000,6),
	VIP(5000, 12);
	
	private double price;
	private int durationMonth;
	
	MembershipType(int i, int j) {
		this.price = i;
		this.durationMonth = j;
	}
	public double getPrice() {
		return price;
	}
	public int getDurationMonth() {
		return durationMonth;
	}
	
}
