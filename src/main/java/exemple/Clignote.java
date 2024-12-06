package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class Clignote extends Effet {

    public Clignote() {
    }
    public void executer(Bandeau Bd){
        Bd.setMessage("Ca clignote!!");
        Color B= Bd.getBackground();
        Bd.setForeground(Color.BLACK);
        Color C=Bd.getForeground();
        Bd.setForeground(B);
        Bd.sleep(200);
        Bd.setForeground(C);
        Bd.sleep(200);
        Bd.setForeground(B);
        Bd.sleep(200);
        Bd.setForeground(C);
        Bd.sleep(200);
        Bd.setForeground(B);
        Bd.sleep(200);
        Bd.setForeground(C);
    }
}