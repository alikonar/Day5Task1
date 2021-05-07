package day5task1;

import day5task1.business.abstracts.UserService;
import day5task1.business.concretes.UserManager;
import day5task1.core.concretes.GoogleUserVerificationAdapter;
import day5task1.core.concretes.ValidatorManager;
import day5task1.core.concretes.VerificationManager;
import day5task1.dataAccess.concretes.UserDao;
import day5task1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		User user1 = new User("Ali", "Konar", "Ali.14@hotmail.com", "24421412411");

		User user2 = new User("Enes", "Kadumi", "enes.kadumi@gmail.com", "enes0");
		
		User user3= new User("Melek Nur", "Gül", "meleknur@gmail.com", "melek22ali28");
		
		UserService service =new UserManager(new VerificationManager(),new UserDao(),new ValidatorManager());

		
		System.out.println("Basarili kayit");
		System.out.println("---------");
		service.register(user1);
		service.login(user1.geteMail(), user1.getPassword());
		
		System.out.println("---------");
		System.out.println("Basarisiz kayit");
		System.out.println("---------");
		service.register(user2);
		service.login(user2.geteMail(), user2.getPassword());
		
		UserService service2= new UserManager(new GoogleUserVerificationAdapter(), new UserDao(), new ValidatorManager());
		
		System.out.println("---------");
		System.out.println("Basarili GOOGLE kayit");
		System.out.println("---------");
		service2.register(user3);
		service2.login(user3.geteMail(), user3.getPassword());
		
		
		
		
	}
	
	

}
