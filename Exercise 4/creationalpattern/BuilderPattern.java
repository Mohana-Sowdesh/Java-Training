package creationalpattern;

public class BuilderPattern {

	public static void main(String[] args) {
		Car car = new Car.BuildCar()
					.setSteering(new Steering())
					.setBrake(new Brake())
					.setGear(new Gear())
					.setEngine(new Engine())
					.build();
		System.out.println(car);
	}

}

class Car {
	Steering steering;
	Brake brake;
	Gear gear;
	Engine engine;

	public Car(Steering steering, Brake brake, Gear gear, Engine engine) {
		this.steering = steering;
		this.brake = brake;
		this.gear = gear;
		this.engine = engine;
	}

	static class BuildCar { //CarBuilder
		Steering steering;
		Brake brake;
		Gear gear;
		Engine engine;

		public BuildCar setSteering(Steering steering) {
			this.steering = steering;
			return this;
		}

		public BuildCar setBrake(Brake brake) {
			this.brake = brake;
			return this;
		}

		public BuildCar setGear(Gear gear) {
			this.gear = gear;
			return this;
		}

		public BuildCar setEngine(Engine engine) {
			this.engine = engine;
			return this;
		}

		public Car build() {
			return new Car(steering, brake, gear, engine);
		}
	}

	@Override
	public String toString() {
		return "Car [Steering =" + steering + " Brake = " + brake + " Engine = " + engine + " Gear = " + gear + "]";
	}
}

class Steering {

}

class Brake {

}

class Gear {

}

class Engine {

}