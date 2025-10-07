public class Seat{

	private String id;
	private SeatType seatType;
	private double price;
	private boolean isAvailable;

	Seat(){

	}

	Seat(String id, SeatType seatType, double price, boolean isAvailable){

		this.id = id;
		this.seatType = seatType;
		this.price = price;
		this.isAvailable = isAvailable;

	}

	@Override
	public String toString(){

		return String.format("%s %s %.2f %b", id, seatType, price, isAvailable);

	}

	public boolean isAvailable(){

		return isAvailable;

	}

	public boolean bookSeat(){

		isAvailable = false;

		return isAvailable;

	}

	public boolean cancelBooking(){

		isAvailable = true;

		return isAvailable;

	}

	public String getID(){

		return id;

	}

	public SeatType getSeatType(){

		return seatType;

	}

	public double getPrice(){

		return price;

	}

	public void setSeatType(SeatType seatType){

		this.seatType = seatType;

	}

	public void setPrice(double price){

		this.price = price;

	}

}