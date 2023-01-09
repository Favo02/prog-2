import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    List<PavimentazioneInt> pav = new ArrayList<>();

    while (in.hasNext()) {
      switch (in.next()) {
      case "Q":
        pav.add(new PiastrellaQuadrata(in.nextInt(), in.nextInt()));
        break;
      case "R":
        pav.add(new PiastrellaRomboidale(in.nextInt(), in.nextInt(), in.nextInt()));
        break;
      case "T":
        pav.add(new PiastrellaTriangolare(in.nextInt(), in.nextInt(), in.nextInt()));
        break;
      case "P":
        Pavimentazione p = new Pavimentazione();
        while (in.hasNextInt()) {
          int qty = in.nextInt();
          int index = in.nextInt();
          p.addPavimentazione(pav.get(index), qty);
        }
        pav.add(p);
        break;
      }
    }
    
    for (PavimentazioneInt p : pav) {
      if (p instanceof Pavimentazione) {
        System.out.println(p.getSuperficie() + "\t" + p.getCosto());
      }
    }

  }

}
