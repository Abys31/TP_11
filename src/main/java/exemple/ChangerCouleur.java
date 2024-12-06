package exemple;
import java.awt.Color;

import bandeau.Bandeau;


public class ChangerCouleur extends Effet{
    public ChangerCouleur() {

    }
    public void executer(Bandeau Bd)
    {
            Bd.setMessage("On change de couleur");
            for(int i = 0;i<255;i+=15) {
                Bd.setForeground(new Color(i,150,230));
                Bd.sleep(200);
            }
        Bd.sleep(1000);
    }
}