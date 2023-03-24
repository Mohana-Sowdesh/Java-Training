package questioneight;

import java.util.Scanner;

/* 2. Write program to calculate Area and volume depending on type of figure by implementing two interfaces for Calc and
volume*/

public class Shape {

	public static void main(String[] args) {
		Scanner jc = new Scanner(System.in);
		System.out.println("Enter the shape wish area & volume need to be calculated: ");
		String str_shape = jc.next();
		
		if(str_shape.equalsIgnoreCase("Circle"))
		{
			Circle c = new Circle();
			c.createCircle();
		}
		else if(str_shape.equalsIgnoreCase("Square"))
		{
			Square sq = new Square();
			sq.createSquare();
		}
		else if(str_shape.equalsIgnoreCase("Triangle"))
		{
			Triangle tri = new Triangle();
			tri.createTriangle();
		}
		else if(str_shape.equalsIgnoreCase("Sphere"))
		{
			Sphere sph = new Sphere();
			sph.createSphere();
		}
		else if(str_shape.equalsIgnoreCase("Cuboid"))
		{
			Cuboid cub = new Cuboid();
			cub.createCuboid();
		}
	}
}

class Circle implements CalcArea, CalcVolume {
	final float pi = 3.14f;
	public void createCircle() {
		Scanner jc = new Scanner(System.in);
		System.out.println("Enter radius of circle: ");
		int radius = jc.nextInt();
		calcArea(radius);
		calcVolume(radius);
	}
	
	@Override
	public void calcArea(int r) {
		float circle_area = pi*r*r;
		System.out.println("Area of circle is "+circle_area);
	}
	
	@Override
	public void calcVolume(int r) {
		double circle_vol = 1.3333*pi*r*r*r;
		System.out.println("Volume of circle is "+circle_vol);
	}
	
	@Override 
	public void calcArea(int side_a,int side_b,int side_c) {
	}
	
	@Override
	public void calcVolume(int a, int b, int c) {
	}
}

class Square implements CalcArea, CalcVolume {
	public void createSquare() {
		Scanner jc = new Scanner(System.in);
		System.out.println("Enter side of square: ");
		int side = jc.nextInt();
		calcArea(side);
		calcVolume(side);
	}
	
	@Override
	public void calcArea(int s) {
		float sq_area = s*s;
		System.out.println("Area of square is "+ sq_area);
	}
	
	@Override
	public void calcVolume(int s) {
		double sq_vol = s*s*s;
		System.out.println("Volume of square is "+ sq_vol);
	}
	
	@Override 
	public void calcArea(int side_a,int side_b,int side_c) {
	}
	
	@Override
	public void calcVolume(int a, int b, int c) {
	}
}

class Triangle implements CalcArea, CalcVolume {
	public void createTriangle() {
		Scanner jc = new Scanner(System.in);
		System.out.println("Enter side a of triangle: ");
		int side_a = jc.nextInt();
		System.out.println("Enter side b of triangle: ");
		int side_b = jc.nextInt();
		System.out.println("Enter side c of triangle: ");
		int side_c = jc.nextInt();
		calcArea(side_a,side_b,side_c);
		calcVolume(side_a,side_b,side_c);
	}
	
	@Override
	public void calcArea(int a, int b, int c) {
		double s = (a+b+c)/2;
		double tri_area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of triangle is "+ tri_area);
	}
	
	@Override
	public void calcVolume(int a, int b, int c) {
		double tri_vol = 0.5*a*b*c;
		System.out.println("Volume of triangle is "+ tri_vol);
	}
	
	@Override
	public void calcArea(int s) {
	}
	
	@Override
	public void calcVolume(int s) {
	}
}

class Sphere implements CalcArea, CalcVolume {
	final float pi = 3.14f;
	public void createSphere() {
		Scanner jc = new Scanner(System.in);
		System.out.println("Enter radius of sphere: ");
		int radius = jc.nextInt();
		calcArea(radius);
		calcVolume(radius);
	}
	
	@Override
	public void calcArea(int r) {
		float sphere_area = pi*r*r;
		System.out.println("Area of sphere is "+ sphere_area);
	}
	
	@Override
	public void calcVolume(int r) {
		double sphere_vol = 1.3333*pi*r*r*r;
		System.out.println("Volume of sphere is "+ sphere_vol);
	}
	
	@Override 
	public void calcArea(int side_a,int side_b,int side_c) {
	}
	
	@Override
	public void calcVolume(int a, int b, int c) {
	}
}

class Cuboid implements CalcArea, CalcVolume {
	public void createCuboid() {
		Scanner jc = new Scanner(System.in);
		System.out.println("Enter length of cuboid: ");
		int side_a = jc.nextInt();
		System.out.println("Enter height of cuboid: ");
		int side_b = jc.nextInt();
		System.out.println("Enter breadth of cuboid: ");
		int side_c = jc.nextInt();
		calcArea(side_a, side_b, side_c);
		calcVolume(side_a, side_b, side_c);
	}
	
	@Override
	public void calcArea(int s) {
	}
	
	@Override
	public void calcVolume(int s) {
	}
	
	@Override 
	public void calcArea(int l,int h,int b) {
		int cuboid_area = 2*((l*h)+(l*b)+(h*b));
		System.out.println("Area of cuboid: "+ cuboid_area);
	}
	
	@Override
	public void calcVolume(int l,int h,int b) {
		int cuboid_vol = l*b*h;
		System.out.println("Volume of cuboid: "+ cuboid_vol);
	}
}