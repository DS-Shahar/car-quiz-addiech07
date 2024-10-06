
public boolean illegal(int maxSpeed) {
		if ((maxSpeed > speed) || (privateCar == true)) {
			return true;
		}
		else {
			return false;
		}
	}


public boolean allGood() {
	boolean found = false;
	int i = 0;
	while (i < cars.length && found) {
		if (cars[i].illegal() != false) {
			found = true;
		}
		i++;
	}
	return found;
}

