package exemple;

import bandeau.Bandeau;

public class Rotation extends Effet {
    public int Rotation;

    public Rotation(int Rotation) {
        this.Rotation = Rotation;
    }


    public void executer (Bandeau Bd){
        Bd.setMessage("On tourne");
        double Anglerotation = Bd.getRotation();
        Bd.setRotation(Rotation+Anglerotation);
        Bd.sleep(35);
    }
}