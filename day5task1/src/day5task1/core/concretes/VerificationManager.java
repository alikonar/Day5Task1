package day5task1.core.concretes;

import java.util.regex.Pattern;

import day5task1.core.abstracts.VerificationService;
import day5task1.entities.concretes.User;

public class VerificationManager implements VerificationService {

	public boolean isValidEmail(String email) {
		String regexEmail = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regexEmail);

		if (email == null) {
			return false;
		}
		return pattern.matcher(regexEmail).matches();
	}

	public boolean isValidPassword(String password) {
		if (password == null || password.length() <= 6) {
			return false;
		}
		return true;
	}

	public boolean isValidName(String name) {
		if (name == null || name.length() <= 2) {
			return false;
		}
		

		return true;
	}

	@Override
	public boolean isValid(User user) {

		if (!isValidEmail(user.geteMail())) {
			System.out.println("Yanlis email formati.");
			return false;
		}

		if (!isValidName(user.getFirstName())) {
			System.out.println("Isminiz en az 2 karakter olmali.");
			return false;
		}

		if (!isValidName(user.getLastName())) {
			System.out.println("Soyadiniz en az 2 karakter olmali.");
			return false;
		}

		if (!isValidPassword(user.getPassword())) {
			System.out.println("Sifre uzunlugunuz en az 6 karakter olmali.");
			return false;
		}
			return true;
	}

}
