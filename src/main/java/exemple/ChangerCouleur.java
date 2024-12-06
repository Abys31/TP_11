package exemple;

import java.awt.Color;

public class ChangerCouleur extends Effet {
    private int duree;

    public ChangerCouleur(Bandeau bandeau, int duree) {
        super(bandeau);
        this.duree = duree;
    }

    @Override
    public void jouer() {
        bandeau.setMessage("On change de couleur");
        for (int i = 0; i <= 255; i += 15) {
            bandeau.setForeground(new Color(i, 150, 230));
            bandeau.sleep(duree);
        }
    }
}
