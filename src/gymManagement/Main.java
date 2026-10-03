package gymManagement;

public class Main {
	final private static GymManager manage = new GymManager();
	
	public static void main(String[] args) {
		
		while(true) {
			gymManagementMenu();
			String choice = Exceptions.StringException("Enter choice: ");
			
			switch(choice) {
			case "1" -> manage.addMember();
			case "2" -> manage.removeMember();
			case "3" -> manage.searchMember();
			case "4" -> manage.viewMember();
			case "5" -> manage.addMemberShip();
			case "7" -> manage.viewMembership();
			
			}
				
		}
	}
	
	private static void gymManagementMenu() {
		System.out.println("1. Add Member");
		System.out.println("2. Remove Member");
		System.out.println("3. Search Member");
		System.out.println("4. View Members");
		System.out.println("5. Add Membership");
		System.out.println("6. Renew Membership");
		System.out.println("7. Check Membership");
		System.out.println("8. Record Attendance");
		System.out.println("9. Exit");
		
	}

}
