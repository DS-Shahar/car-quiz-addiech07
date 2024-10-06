
public class CameraInfo {
	private int city;
	private int maxSpeed;
	private CarInfo[] cars;	
	
	public CameraInfo(int city, int maxSpeed, CarInfo[] cars) {
		super();
		this.city = city;
		this.maxSpeed = maxSpeed;
		this.cars = cars;
	}
	
	public int getCity() {
		return city;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}	
	
	public boolean allGood() {
		boolean found = false;
		int i = 0;
		while (i < cars.length && found) {
			if (cars[i].illegal() != flase) {
				found = true;
			}
			i++;
		}
		return found;
	}
}
