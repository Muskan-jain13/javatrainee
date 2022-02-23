package oops;
interface i4{
	void show();
}
class Y implements i4{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
	}
	
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
	Y a = new Y();
	a.show();
	}

}
