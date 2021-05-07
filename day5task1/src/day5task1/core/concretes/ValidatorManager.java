package day5task1.core.concretes;

import day5task1.core.abstracts.ValidatorService;

public class ValidatorManager implements ValidatorService {

	@Override
	public void verificationMail() {
		System.out.println("Dogrulama maili yollandi.E Postanizi kontrol ediniz.");
		
	}

}
