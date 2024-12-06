package exemple;

public class Rotation extends Effet {
    private int repetitions;
    private double angle; // Angle de rotation en radians

    public Rotation(Bandeau bandeau, int repetitions, double angle) {
        super(bandeau);
        this.repetitions = repetitions;
        this.angle = angle;
    }

    @Override
    public void jouer() {
        bandeau.setMessage("On tourne...");
        for (int i = 0; i < repetitions; i++) {
            bandeau.setRotation(bandeau.getRotation() + angle);
            bandeau.sleep(200); // Temps pour observer chaque étape
        }
        bandeau.setRotation(0); // Réinitialisation après l'effet
    }
}
