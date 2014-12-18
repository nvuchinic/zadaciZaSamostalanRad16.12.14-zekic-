/*klasa FedExPackage  nasljedjuje klasu DimensionalWeight( koja implementira metodu getDimensionalWeight, 
 * pa zato nema potrebe da ista metoda bude implementirana ovdje)
 */
public class FedExPackage extends DimensionalWeightPackage {
	@Override
	public double getFactor(){
		return 6000;
		}
	
	/**
	 * metoda za racunanje dimenzionalne tezine - bila je potrebna dok ova klasa nije bila nasljedjivala 
	 * klasu DimensionalWeightPackage, koja je i sama implementirala takvu metodu.
	 * Posto se u zadatku izricito trazilo da klasa DHLPackage nasljedjuhe klasu DimensionalWeightPackage,
	 * to nije vise bilo potrebe da ova metoda bude implementirana u ovoj klasi.
	 *//*
	public double getDimensionalWeight() {
		
		return getWidth() * getHeight() * getLength() / 6000;
		}*/
	
	/**
	 * override funkcije getWeight iy roditeljske klase. Ova implementacija vraca vecu od dvije velicine:
	 * jedna je rezultat poziva metode getWeight roditeljske klase, a druga je rezultat poziva naslijedjene GetDimensionalWeight metode
	 */
	@Override
	public double getWeight() {
		return Math.max(super.getWeight(), getDimensionalWeight());
	}
}