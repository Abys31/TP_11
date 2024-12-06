package exemple;

import bandeau.Bandeau;

abstract public class Effet {
    protected Bandeau bandeau; // Le bandeau sur lequel l'effet est appliqué

    // Constructeur pour initialiser le bandeau
    public Effet(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    // Méthode abstraite que chaque effet doit implémenter
    abstract public void jouer();
}
