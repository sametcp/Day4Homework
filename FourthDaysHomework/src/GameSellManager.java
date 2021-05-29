
public class GameSellManager implements GameSellService {
	
	CampaignManager campaignManager;
	
	public GameSellManager(CampaignManager campaignManager) {
		this.campaignManager = campaignManager;
	}
	
	
	@Override
	public void sell(Gamer gamer, Game game, Campaign campaign) {

		System.out.println(gamer.getFirstName() + gamer.getLastName() +  " bought " + game.getName() + " with the " + campaign.getCampaignName()
				+ " campaign.");

	}

	@Override
	public void cancelTheSale(Gamer gamer, Game game) {

		System.out.println(gamer.getFirstName() +  gamer.getLastName() + " " +  game.getName() + " sale canceled");

	}

}
