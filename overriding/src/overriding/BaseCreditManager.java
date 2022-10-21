package overriding;

public class BaseCreditManager {
	
	public double hesapla(double tutar) {
		return tutar * 1.18 ;
	}
}
//overridable

/*public final  double hesapla(double tutar) {
	return tutar * 1.18 ;
}          ---OVERRİDE EDİLEMEZ final dan dolayı--- !!
*/

