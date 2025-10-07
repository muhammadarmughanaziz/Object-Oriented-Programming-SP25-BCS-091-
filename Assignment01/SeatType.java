public enum SeatType{

	STANDARD("Standard"), PREMIUM("Premium"), LUXURY("Luxury"), RECLINER("Recliner");

	private String type;

	SeatType(String type){

		this.type = type;

	}

	@Override
	public String toString(){

		return String.format("%s", type);

	}

}