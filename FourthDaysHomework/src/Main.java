
public class Main {

	public static void main(String[] args) {

		Campaign campaign = new Campaign("Summer discount", 30);
		Game game = new Game(1, "Counter Strike 1.6", 10);
		game.setPrice(game.getPrice() * campaign.getDiscountRate() / 100);

		System.out.println(game.getPrice());

		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Samet Berk");
		gamer1.setLastName(" Þimþek");
		gamer1.setYearOfBirth(2001);
		gamer1.setNationalityId("42828823782");

		// Gamer gamer2 = new Gamer(2, "Semih ", "Aydoðan", 2001, "93459175042");

		GamerManager gamerManager = new GamerManager(new UserCheckManager());
		gamerManager.check(gamer1);

		System.out.println("-----------------------------");

		GameSellManager gameSellManager = new GameSellManager(new CampaignManager());
		gameSellManager.sell(gamer1, game, campaign);
		gameSellManager.cancelTheSale(gamer1, game);

		System.out.println("----------------");

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign);
		campaignManager.deleteCampaign(campaign);
		campaignManager.updateCampaign(campaign);

	}

}
