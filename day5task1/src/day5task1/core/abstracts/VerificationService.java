package day5task1.core.abstracts;

import day5task1.entities.concretes.User;

public interface VerificationService {

	boolean isValid(User user);

}
