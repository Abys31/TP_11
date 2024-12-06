package exemple;

import java.util.ArrayList;

public class Scenario {
    private String nomScenario; // Nom du scénario
    private ArrayList<Effet> scenario; // Liste des effets

    public Scenario(String nomScenario) {
        this.nomScenario = nomScenario;
        this.scenario = new ArrayList<>();
    }

    // Ajoute un effet au scénario avec répétition
    public void ajouterEffet(Effet effet, int repetitions) {
        for (int i = 0; i < repetitions; i++) {
            scenario.add(effet);
        }
    }

    // Exécute tous les effets du scénario
    public void executerScenario() {
        for (Effet effet : scenario) {
            effet.jouer();
        }
    }
}
