package oops;

     class Test {

			private int a;
			private int b;

			public void input() {
				a = 10;
				b = 20;
			}

			public void output() {
				System.out.println(+a);
				System.out.println(+b);
			}

			@Override
			public String toString() {
				return "Test [a=" + a + ", b=" + b + "]";
			}
		}
		public class Test1 {

			public static void main(String[] args) {
				Test t = new Test();
//				t.input();
				System.out.println(t);

			}


	}


