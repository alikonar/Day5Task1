package day5task1.business.abstracts;

import day5task1.entities.concretes.User;

public interface UserService {

	void register(User user);

	void login(String email, String password);

}
