package odev_3;

public class Campaign {

	String campaingCode;
	String name;
	int campaignPercentage;
	
	
	public Campaign(String campaingCode, String name, int campaignPercentage) {
		super();
		this.campaingCode = campaingCode;
		this.name = name;
		this.campaignPercentage = campaignPercentage;
	}
	
	
	public String getCampaingCode() {
		return campaingCode;
	}
	public void setCampaingCode(String campaingCode) {
		this.campaingCode = campaingCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCampaignPercentage() {
		return campaignPercentage;
	}
	public void setCampaignPercentage(int campaignPercentage) {
		this.campaignPercentage = campaignPercentage;
	}
}
