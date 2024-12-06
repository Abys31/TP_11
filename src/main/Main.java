package exemple;

import bandeau.Bandeau;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bandeau bandeau = new Bandeau();

        // Création des effets
        Clignote effetClignote = new Clignote(bandeau);
        ChangerCouleur effetCouleur = new ChangerCouleur(bandeau, 200);
        Rotation effetRotation = new Rotation(bandeau, 3, Math.PI / 4);

        // Création du scénario
        Scenario scenario = new Scenario("Mon premier scénario");
        scenario.ajouterEffet(effetClignote, 1);
        scenario.ajouterEffet(effetCouleur, 1);
        scenario.ajouterEffet(effetRotation, 2);

        // Exécution du scénario
        scenario.executerScenario();

        // Fermeture du bandeau
        bandeau.close();
    }
}
