
public boolean illegal(int maxSpeed) {
		if ((maxSpeed < speed) || (privateCar == true)) {
			return true;
		}
		else {
			return false;
		}
	}


public boolean allGood() {
	boolean found = false;
	int i = 0;
	while (i < cars.length && !found) {
		if (cars[i].illegal(maxSpeed) != false) {
			found = true;
		}
		i++;
	}
	return !found;
}

public static int legalCities( CameraInfo[] cameras) {
	boolean citiesChecked[] = new boolean [100];
	for (int i = 0; i < 100; i++)
		citiesChecked[i] = false;
	int numLegalCities = 0;

	for (int j = 0; j < cameras.length ; j++) {
		int cityNumber = cameras[j].getCity;
		if ( citiesChecked[cityNumber] == false ) {
			citiesChecked[cityNumber] = true;
			int k = 0;
			cityIsLegal = true; 
			while (k < cameras.length && cityIsLegal) {
				if ((cameras[k].getCity()==cityNumber) && !cameras[k].allGood ){
					cityIsLegal = false;
				k++;
				}
			if (cityIsLegal)
				numLegalCities++;
			}
		}
	}
	return numLegalCities;
}



