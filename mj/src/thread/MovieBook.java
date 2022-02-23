package thread;

class BookSeat{
	int total_seat=10;
	synchronized void bookSeat(int seats){
		if(total_seat>=seats) {
		  System.out.println(seats+"seats booked successfully");
		  total_seat=total_seat-seats;
		  System.out.println("seats left"+total_seat);
		}
		else {
			System.out.println("seats cannot be booked");
			System.out.println("seats left"+total_seat);
		}
	}
}

public class MovieBook extends Thread {
	static BookSeat b;
	int seats;
	public void run()
	{
		b.bookSeat(seats);
	}

	public static void main(String[] args) {
		 b=new BookSeat();
		MovieBook t=new MovieBook();
		t.seats=7;
		t.start();
		MovieBook m=new MovieBook();
		m.seats=2;
		m.start();

	}
}

