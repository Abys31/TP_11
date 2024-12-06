package exemple;

import java.awt.Color;

public class Clignote extends Effet {
    private int repetitions;
    private int duree;

    public Clignote(Bandeau bandeau, int repetitions, int duree) {
        super(bandeau); // Appel au constructeur parent
        this.repetitions = repetitions;
        this.duree = duree;
    }

    @Override
    public void jouer() {
        bandeau.setMessage("Ça clignote !!");
        Color couleurInitiale = bandeau.getForeground();

        for (int i = 0; i < repetitions; i++) {
            bandeau.setForeground(Color.BLACK);
            bandeau.sleep(duree);
            bandeau.setForeground(couleurInitiale);
            bandeau.sleep(duree);
        }

        bandeau.setForeground(couleurInitiale);
    }
}
