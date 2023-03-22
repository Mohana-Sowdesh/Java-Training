package questionfive;

//8. write a program to create Singleton Class (Program should not allow more than one instance at a time)

public class Singleton {
	
	private static Singleton is_instance = null;
	
	int num;
	
	private Singleton() {
		num = 98;
	}
	
	public static synchronized Singleton checkInstances() {
		if(is_instance == null)
			is_instance = new Singleton();
		return is_instance;
	}
	
	public static void main(String[] args) {

		Singleton a = Singleton.checkInstances();
		Singleton b = Singleton.checkInstances();
		Singleton c = Singleton.checkInstances();
		Singleton d = Singleton.checkInstances();
		
		a.num = 43;
		System.out.println("a: "+ a.num);
		
		b.num = 82;
		System.out.println("b: "+ b.num);
		
		c.num = 117;
		System.out.println("c: "+ c.num);
		
		d.num = 23;
		System.out.println("d: "+ d.num);
		
		System.out.println("\na: "+ a.num);
		System.out.println("b: "+ b.num);
		System.out.println("c: "+ c.num);
		System.out.println("c: "+ d.num);
		
		System.out.println("\na: "+ a.hashCode());
		System.out.println("b: "+ b.hashCode());
		System.out.println("c: "+ c.hashCode());
		System.out.println("c: "+ d.hashCode());
	}

}
