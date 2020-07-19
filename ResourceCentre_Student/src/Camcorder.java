// Camcorder inherit the attributes of Item
public class Camcorder extends Item{
	private int opticalZoom;
	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		//Added by Larry 
		String info = super.toString();
		return String.format("%-63s %-20d", info, getOpticalZoom());
	}
}

