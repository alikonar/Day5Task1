package day5task1.dataAccess.abstracts;

import day5task1.entities.concretes.User;

public interface UserDaoService {

	void add(User user);

	boolean checkEmail(User user);

	boolean loginCheck(String email, String password);

}
