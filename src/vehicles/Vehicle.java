package vehicles;

public class Vehicle {
	public static String MAKE = new String("Augur");
	public static int numVehicles = 0;
	private String ChassisNo;
	private String model;

	public Vehicle(String model) {

		numVehicles++;
		ChassisNo = "ch" + numVehicles;
		this.model = model;
		System.out.println("Vehicle manufactured");
	}

	public static class Engine extends Vehicle {

		private String model;

		public Engine(String model) {
			super(model);
			this.model = model;
		}

		private static final String MAKE = "Predicter";
		private static final int CAPACITY = 1600;

		public static String getMake() {
			return MAKE;
		}

		public static int getCapacity() {
			return CAPACITY;
		}

		public String toString() {
			return "Vehicle number ch" + getNumVehicles() + " is a " + getModel()
					+ " model and has an engine capacity of " + CAPACITY + "cc";
		}
	}

	public String toString() {
		return "\nVehicle is manufactered by  " + MAKE + "\n The model type is " + model + "\n the Chassis number is  "
				+ ChassisNo + "\n the engine make is " + Engine.getMake() + "\n the engine capacity is "
				+ Engine.getCapacity() + "cc";

	}

	public String getChassisNo() {
		return ChassisNo;
	}

	public void setChassisNo(String chassisNo) {
		ChassisNo = chassisNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public static String getMakee() {
		return MAKE;
	}

	public static void setMAKE(String mAKE) {
		MAKE = mAKE;
	}

	public static int getNumVehicles() {
		return numVehicles;
	}

	public static void setNumVehicles(int numVehicles) {
		Vehicle.numVehicles = numVehicles;
	}

}
