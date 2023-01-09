import java.util.HashSet;

public class Pavimentazione implements PavimentazioneInt {

  private HashSet<PavimentazioneInt> pavimentazioni;

  public Pavimentazione() {
    pavimentazioni = new HashSet<>();
  }

  public void addPavimentazione(PavimentazioneInt pavimentazione) {
    pavimentazioni.add(pavimentazione);
  }

  @Override
  public int getCostoTot() {
    int costoTot = 0;
    for (PavimentazioneInt p : pavimentazioni) {
      costoTot = p.getCostoTot();
    }
    
    return costoTot;
  }

  @Override
  public int getSuperficieTot() {
    int supTot = 0;
    for (PavimentazioneInt p : pavimentazioni) {
      supTot = p.getSuperficieTot();
    }
    
    return supTot;
  }
  
}