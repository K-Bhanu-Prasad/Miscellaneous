package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class UserTest {

	public static void main(String[] args) {

		User user1 = new User();
		user1.setUsername("tpage");
		user1.setPassword("1233");

		User user2 = new User();
		user2.setUsername("Zpage");
		user2.setPassword("1233");
		List<User> list  = new ArrayList<>();


		list.add(user1);
		list.add(user2);
		Collections.sort(list);

		System.out.println(list.get(0).getUsername());



	}


}
