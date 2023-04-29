package vehicles;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("twingo");
		Vehicle v2 = new Vehicle("Edict");
		Vehicle.Engine v3 = new Vehicle.Engine("Fortune");

		v2.setMAKE("Seer");
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println(v3.toString());
		System.out.println("\n Number of vehicles manufactured   " + Vehicle.numVehicles);

	}
}
