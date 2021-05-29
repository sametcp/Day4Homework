
public class Game {

	Campaign campaign = new Campaign();

	private int id;
	private String name;
	private double price;

	public Game() {

	}

	public Game(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = this.price - price;
	}




}
