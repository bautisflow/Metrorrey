package ia.practica;

public class Coordenada {
	double lat;
	double lng;
	
	// Constructor
	public Coordenada (double x, double y){
		this.lat = x;
		this.lng = y;
	}
	
	public double getLat(double x){
		return this.lat;
	}
	
	public double getLng (double y){
		return this.lng;
	}
	
//	public double distCoor (double lat1, double lng1, double lat2, double lng2){
//		return Math.sqrt((Math.pow((lat1 - lat2), 2) + Math.pow((lng1 - lng2), 2)));
//	}
	
	public double distancia(Coordenada c) {
		return 100000 * Math.sqrt((Math.pow(Math.abs(lat - c.lat), 2) + Math.pow(Math.abs(lng - c.lng), 2)));
	}
	
}