package streamAPI;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

class Member{
	String name;
	LocalDate expiryDate;
	
	public Member(String name, LocalDate expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
	}
	
	
}

public class FilteringExpiringMembers {

	public static void main(String[] args) {
		
		List<Member> members = Arrays.asList(
				new Member("John", LocalDate.now().plusDays(10)),
                new Member("Alice", LocalDate.now().plusDays(40)),
                new Member("Bob", LocalDate.now().plusDays(25)),
                new Member("Emma", LocalDate.now().plusDays(5)));
		
		LocalDate now = LocalDate.now();
		LocalDate expiryDate = LocalDate.now().plusDays(30);
		
		members.stream().filter(m->m.expiryDate.isAfter(now) && m.expiryDate.isBefore(expiryDate))
		.forEach(m->System.out.println(m.name + " expires on " + m.expiryDate));
	}

}
