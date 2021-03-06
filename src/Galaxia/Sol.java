package Galaxia;
import Helper.Coordenadas;
import Helper.Sentido;


public class Sol extends SistemaSolar implements Cuerpo {
	private Coordenadas coordenadas = new Coordenadas(0.0, 0.0);
	
	public Sol() {
		
	};
	
	public Sol(Coordenadas coordenadas) {
		this.coordenadas = coordenadas;
	}

	/**
	 * @return the coordenadas
	 */
	public Coordenadas getCoordenadas() {
		return coordenadas;
	}

	/**
	 * @param coordenadas the coordenadas to set
	 */
	public void setCoordenadas(Coordenadas coordenadas) {
		this.coordenadas = coordenadas;
	}
	
	public void rotate(Planeta planeta) {
		Double gradosIniciales = planeta.getGrados();
		Sentido sentido = planeta.getSentido();
		planeta.setGrados((gradosIniciales + sentido.getVelocidad()) % 360);
	}

	@Override
	public Integer getDistancia() {
		return 0;
	}

	@Override
	public Double getGrados() {
		return 0.0;
	}
	
}
