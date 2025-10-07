public class Screen{

	private String screenName;
	Seat [][]seats;

	Screen(){

	}

	Screen(String name){

		screenName = name;

		seats = new Seat[10][];

		for(int i = 0; i < seats.length; i++){

			seats[i] = new Seat[10 + i];

			for(int j = 0; j < seats[i].length; j++){

				seats[i][j] = new Seat(String.format("%d-%3d", i, j), SeatType.STANDARD, 500, true);

			}

		}

	}

	@Override
	public String toString(){

		StringBuilder str = new StringBuilder();

		str.append(screenName);

		for(int i = 0; i < seats.length; i++){

			for(int j = 0; j < seats[i].length; j++){

				str.append("\n"+seats[i][j].toString());

			}

		}

		return str.toString();

	}

}