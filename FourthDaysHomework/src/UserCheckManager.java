
public class UserCheckManager implements UserCheckServices{

	@Override
	public boolean checkIfRealUser(Gamer gamer) {
		
		
		if(gamer.getNationalityId() == "42828823782" )   // rastgele bir kimlik numaras�
		{
			System.out.println("User identity verified : " + gamer.getFirstName() + gamer.getLastName());
			return true;
		}
		else
		{
			return false;
		}
		
		 
	}
	
	
	
}
