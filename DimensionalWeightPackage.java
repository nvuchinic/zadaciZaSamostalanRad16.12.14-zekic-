
public class DimensionalWeightPackage extends Package {
	
	/**
	 * funkcija koja vraca 4000
	 * @return
	 */
	public double getFactor(){
		return 4000;
	}
	/**
	 * funkcija koja vraca double vrijednost koja predstavlja proizvod sirine,duzine,visine paketa,
	 *  sve podijeljeno sa rezultatom funkcije getFactor
	 * @return double
	 */
public double	getDimensionalWeight(){
	return (getWidth() * getHeight() * getLength()) / getFactor();
	}

public double getWeight(){
	return super.getWeight();
}


}
