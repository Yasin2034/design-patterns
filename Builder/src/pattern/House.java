package pattern;

public class House {
	private int numBedrooms;
	private int numBathrooms;
	private boolean kitchenPresent;
	private boolean garagePresent;

	public House(HouseBuilder builder) {
		this.numBedrooms = builder.numBedrooms;
		this.numBathrooms = builder.numBathrooms;
		this.kitchenPresent = builder.kitchenPresent;
		this.garagePresent = builder.garagePresent;
	}

	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isKitchenPresent() {
		return kitchenPresent;
	}

	public void setKitchenPresent(boolean kitchenPresent) {
		this.kitchenPresent = kitchenPresent;
	}

	public boolean isGaragePresent() {
		return garagePresent;
	}

	public void setGaragePresent(boolean garagePresent) {
		this.garagePresent = garagePresent;
	}
	
	

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("House [numBedrooms=");
		buffer.append(numBedrooms);
		buffer.append(", numBathrooms=");
		buffer.append(numBathrooms);
		buffer.append(", kitchenPresent=");
		buffer.append(kitchenPresent);
		buffer.append(", garagePresent=");
		buffer.append(garagePresent);
		buffer.append("]");
		return buffer.toString();
	}



	public static class HouseBuilder {
		
		private int numBedrooms;
		private int numBathrooms;
		private boolean kitchenPresent;
		private boolean garagePresent;
		
		
		
		public HouseBuilder numBedrooms(int numBedrooms) {
			this.numBedrooms = numBedrooms;
			return this;
		}
		
		public HouseBuilder numBathrooms(int numBathrooms) {
			this.numBathrooms = numBathrooms;
			return this;
		}
		
		public HouseBuilder kitchenPresent(boolean kitchenPresent) {
			this.kitchenPresent = kitchenPresent;
			return this;
		}
		
		public HouseBuilder garagePresent(boolean garagePresent) {
			this.garagePresent = garagePresent;
			return this;
		}
		
		public House build() {
			   House house = new House(this);
	           return house;
	        }
	}

}
