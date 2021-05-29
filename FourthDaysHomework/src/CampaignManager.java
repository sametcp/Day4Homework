
public class CampaignManager implements CampaignServices{

	@Override
	public void addCampaign(Campaign campaign) {
		
		System.out.println("Campaign added : " + campaign.getCampaignName());
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		
		System.out.println("Campaign deleted : " + campaign.getCampaignName());
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		
		System.out.println("Campaign has been updated : " + campaign.getCampaignName());
		
	}
	
	
	
}
