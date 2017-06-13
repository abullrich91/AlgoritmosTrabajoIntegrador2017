import java.util.List;

public interface MovimientosCosmicos {
	public Boolean arePlanetsAlignedWithEachOther(SistemaSolar sistemaSolar);
	public Boolean arePlanetsAlignedWithSun(List<Planeta> planeta);
	public Boolean isWithinPlanetsArea(SistemaSolar sistemaSolar);
	public Coordenadas getCoordenadas(Planeta planeta, Integer dias);
}
