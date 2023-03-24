package questionone;

import java.io.IOException;
/* 1. Create a class with a method throwing an object of the class 
 * IOException. Neither catch this object or use throws clause. Test
 * and see the result */

public class Main {

	public static void main(String[] args) {
		ExceptionHanding exp = new ExceptionHanding();
		exp.IOException();
	}

}

class ExceptionHanding {
	public void IOException() {
		IOException e = new IOException();
		try {
			throw e;
		}
		catch(Exception errMsg) {
			e.printStackTrace();
		}
	}
}