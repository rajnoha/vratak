package vratak;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
	private long lastId = 0;

	private List<User> users = new ArrayList<User>();

	public void addUser(User user) {
		if (user != null) {
			users.add(user);

			// pridanie auto id, aby sa dal user identifikovat
			user.setId(++lastId);
		}

	}

	public List<User> getAll() {
		return users;
	}
}
