package day5task1.core.concretes;

import day5task1.core.abstracts.VerificationService;
import day5task1.entities.concretes.User;
import day5task1.googleUserValidationService.GoogleVerificationService;

public class GoogleUserVerificationAdapter implements VerificationService {

	@Override
	public boolean isValid(User user) {
		GoogleVerificationService googleUserValid= new GoogleVerificationService();
		return googleUserValid.isValidGoogle();
	}

}
