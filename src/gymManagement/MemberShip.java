package gymManagement;

public record MemberShip
(
		String memberID,
		String name,
		int age,
		String phone,
		MembershipType type,
		String startDate,
		String endDate
){
	public String toString() {
		return String.format("id: %s | name: %s | age: %d | phone: %s | type: %s | start: %s | end: %s ", memberID,name
				,age,phone,type,startDate,endDate);
	}
}
