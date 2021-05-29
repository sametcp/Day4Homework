
public class GamerManager implements GamerServices{
	
	
	private UserCheckServices userChechServices;  // baþka bir doðrulama sistemi vs. gelirse
	
	
	public GamerManager(UserCheckServices userCheckService) {
		this.userChechServices = userCheckService;
	}
	
	
	@Override
	public void signUp(Gamer gamer) {
		
		if(userChechServices.checkIfRealUser(gamer)) {
			System.out.println(gamer.getFirstName() + " has been added");
		}
		
	}

	@Override
	public void check(Gamer gamer) {
		
		if(userChechServices.checkIfRealUser(gamer)) {
			System.out.println(gamer.getFirstName()+ gamer.getLastName() + " checked by e-devlet");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		if(userChechServices.checkIfRealUser(gamer)) {
			System.out.println(gamer.getFirstName()+ "account deleted");
		}
		
	}


	@Override
	public void update(Gamer gamer) {
		
		if(userChechServices.checkIfRealUser(gamer)) {
			System.out.println(gamer.getFirstName()+ "account updated");
		}
		
	}
	
	
	
	
}
