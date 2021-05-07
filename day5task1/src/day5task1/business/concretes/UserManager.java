package day5task1.business.concretes;

import day5task1.business.abstracts.UserService;
import day5task1.core.abstracts.ValidatorService;
import day5task1.core.abstracts.VerificationService;
import day5task1.dataAccess.abstracts.UserDaoService;
import day5task1.entities.concretes.User;

public class UserManager implements UserService {

	VerificationService verificationService;
	UserDaoService userDaoService;
	ValidatorService validatorService;

	public UserManager(VerificationService verificationService, UserDaoService userDaoService,
			ValidatorService validatorService) {

		super();
		this.verificationService = verificationService;
		this.userDaoService = userDaoService;
		this.validatorService = validatorService;
	}

	@Override
	public void register(User user) {
		if (!verificationService.isValid(user)) {
			System.out.println("istenilen formata uymadınız. Kayıt Basarisiz !!!!!!");
		} else if (!userDaoService.checkEmail(user)) {
			System.out.println("Bu mail adresi alinmis. Baska bir email deneyiniz.");
		}else {
			userDaoService.add(user);
			validatorService.verificationMail();
		}

	}

	@Override
	public void login(String email, String password) {
		if(userDaoService.loginCheck(email, password)) {
			System.out.println("Login succes.");
		}else {
			System.out.println("Login failed.");
		
		}

	}

}
