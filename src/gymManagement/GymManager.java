package gymManagement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class GymManager {
	private static Map<String,MemberShip> membership = new HashMap<>();
	private static Map<String,Member> member = new HashMap<>();

	
	private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	private static String getCurrentDateTime() {
		return LocalDate.now().format(formatter);
	}
	
	public void addMemberShip() {
		String id = Exceptions.idChecker(membership,"Enter id: ");
		String name = Exceptions.StringException("Enter name: ");
		int age = Exceptions.IntegerException("Enter age: ");
		String phone = Exceptions.StringException("Enter phone no.: ");
		
			MembershipType type;
			while(true) {
				System.out.println("--- Type ---");
				System.out.println("- BASIC (1 month)");
				System.out.println("- PREMUIM (6 months)");
				System.out.println("- VIP (1 year)");
				String typeInput = Exceptions.StringException("Enter choice: ");
				boolean isValid = Arrays.stream(MembershipType.values())
								.anyMatch(n -> n.name().equalsIgnoreCase(typeInput));
					
				if(!isValid) {
					System.out.println("Wrong Input! ");
					continue;	
				}
				
				type = MembershipType.valueOf(typeInput.toUpperCase());		
				break;
			}

			String endDate = LocalDate.now().plusMonths(type.getDurationMonth()).format(formatter);
			
			membership.put(id, new MemberShip(id,name,age,phone,type,getCurrentDateTime(),endDate));
			System.out.println("Succesfully added membership to the list! ");
			return;
		}
	
	public void addMember() {
		String id = Exceptions.idChecker(member,"Enter id: ");
		String name = Exceptions.StringException("Enter name: ");
		int age = Exceptions.IntegerException("Enter age: ");
		String phone = Exceptions.StringException("Enter phone no.: ");
		
		member.put(id, new Member(id,name,age,phone));
		System.out.println("Succesfully added member! ");
	}
	
	public void removeMember() {
		remove(member);
	}
	
	public void removeMemberShip() {
		remove(membership);
	}
	
	public void searchMember() {
		search(member);
	}
	
	public void searchMembership() {
		search(membership);
	}
	
	
	private static void remove(Map<String, ?> list) {
		String id = Exceptions.existingId(list, "Enter id: ");
		list.remove(id);
		System.out.println("Succesfully remove member! ");
	}
	
	public void search(Map<String, ?> list) {
		String id = Exceptions.existingId(list, "Enter id: ");
		
		System.out.println(list.get(id));
	}
	
	public void viewMember() {
		view(member);
	}
	
	public void viewMembership() {
		view(membership);
	}
	
	private static void view(Map<String, ?> lists) {
		
		for(Object list: lists.values()) {
			System.out.println(list);
		}
	}
}
