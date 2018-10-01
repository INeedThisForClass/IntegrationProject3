package main;

public enum ItemType {
	Audio("AU"), Visual("VI"), AudioMobile("AM"), VisualMobile("VM");

	public final String type;

	private ItemType(String type) {
		this.type = type;
	}

}
