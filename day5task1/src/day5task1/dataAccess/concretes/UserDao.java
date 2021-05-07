package day5task1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5task1.dataAccess.abstracts.UserDaoService;
import day5task1.entities.concretes.User;

public class UserDao implements UserDaoService {

	List<User> users = new ArrayList<>();

	@Override
	public void add(User user) {

		users.add(user);
		System.out.println(user.getFirstName().toUpperCase() + " " + user.getLastName().toUpperCase()
				+ " adlı kullanıcı kayıt edildi.");

	}

	@Override
	public boolean checkEmail(User user) {
		for (User u : users) {
			if (u.geteMail() == user.geteMail()) {
				return false;
			}

		}
		return true;
	}

	@Override
	public boolean loginCheck(String email, String password) {
		for (User user : users) {
			if (user.geteMail() == email && user.getPassword() == password) {
				return true;
			}
		}
		return false;
	}

}
