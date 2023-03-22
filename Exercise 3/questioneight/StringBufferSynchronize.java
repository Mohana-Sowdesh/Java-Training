package questioneight;

public class StringBufferSynchronize extends Thread{

	StringBuffer stringBuffer;
	
	public StringBufferSynchronize(StringBuffer stringBuffer) {
	    this.stringBuffer = stringBuffer;
	}
	
	@Override
	public void run(){
	    synchronized (stringBuffer) {
	        System.out.println(Thread.currentThread().getName());
	        for(int i = 1; i <= 100; i++)
	        {
	            System.out.print(stringBuffer);
	        }
	
	        System.out.println("\n");
	        stringBuffer.setCharAt(0, (char)(stringBuffer.charAt(0) + 1));
	    }
	}
	
	public static void main(String[] args) {
	    StringBuffer stringBuffer = new StringBuffer("A");
	    StringBufferSynchronize thread1 = new StringBufferSynchronize(stringBuffer);
	    StringBufferSynchronize thread2 = new StringBufferSynchronize(stringBuffer);
	    StringBufferSynchronize thread3 = new StringBufferSynchronize(stringBuffer);
	
	    thread1.start();
	    thread2.start();
	    thread3.start();
	}
}
