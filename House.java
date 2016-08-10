package com.house;

public class House {
	
	public int outsideDoors = 0;
	public int windows = 0;
	public int interiorDoors = 0;
	public int firePlaces = 0;
	public int bedRooms = 0;
	public int bathRooms = 0;
	public int yardAcres = 0;
	public String color = null;
	public String style = null;
	public String location = null;
	
	public House(int outsideDoors, int windows, int interiorDoors, int firePlaces, int bedrooms, int bathrooms,
			int yardAcres, String color, String style, String location) {
		this.outsideDoors = outsideDoors;
		this.windows = windows;
		this.interiorDoors = interiorDoors;
		this.firePlaces = firePlaces;
		this.bedRooms = bedrooms;
		this.bathRooms = bathrooms;
		this.yardAcres = yardAcres;
		this.color = color;
		this.style = style;
		this.location = location;
	}
	public House(){
	}

	public int getOutsideDoors() {
		return outsideDoors;
	}

	public void setOutsideDoors(int outsideDoors) {
		this.outsideDoors = outsideDoors;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	public int getInteriorDoors() {
		return interiorDoors;
	}

	public void setInteriorDoors(int interiorDoors) {
		this.interiorDoors = interiorDoors;
	}

	public int getFirePlaces() {
		return firePlaces;
	}

	public void setFirePlaces(int firePlaces) {
		this.firePlaces = firePlaces;
	}

	public int getBedrooms() {
		return bedRooms;
	}

	public void setBedrooms(int bedrooms) {
		this.bedRooms = bedrooms;
	}

	public int getBathrooms() {
		return bathRooms;
	}

	public void setBathrooms(int bathrooms) {
		this.bathRooms = bathrooms;
	}

	public int getyardAcres() {
		return yardAcres;
	}

	public void setYardAcres(int yardAcres) {
		this.yardAcres = yardAcres;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String housePart) {
		this.color = housePart;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setColor(int housePart) {
		// TODO Auto-generated method stub
		
	}
	public void setStyle(int housePart) {
		// TODO Auto-generated method stub
		
	}
	public void setLocation(int housePart) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Hmmmm..let me get this right.  You want your house to be built on " + yardAcres + " acres in " + location + ".  This will be a " + bedRooms + " bedroom " + bathRooms + " bathroom home.  There will be " + outsideDoors + " doors to gain entrance to your " + color + " home.  There will be " + windows + " windows to provide plenty of light.  There will be " + interiorDoors + " interior doors to separate living areas and " + firePlaces + " fireplaces.....hmmm....let me think......";
	}
	 
	 
	
	 
	
}
