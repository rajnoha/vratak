package vratak;

import java.util.ArrayList;
import java.util.List;

public class UserList {
	private long lastId = 0;
	private List<User> users = new ArrayList<User>();

	public void addUser(User user) {
		if (user != null) {
			users.add(user);
			
			//pridanie auto id, aby sa dal user identifikovat 
			user.setId(++lastId);
		}	
	}

	public boolean validate(String chipId) {
		for (User u : users) {
			if (chipId.equals(u.getChipId())) {
				return true;
			}
		}
		return false;
	}

	public int usersCount() {
		return users.size();
	}

	public void deactivate(String chipId) {
		for (User u : users) {
			if (chipId.equals(u.getChipId())) {
				u.setActive(false);
			}
		}
	}
}
