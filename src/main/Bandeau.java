package bandeau;

import java.awt.Color;
import java.awt.Font;

public class Bandeau {
    private String message;
    private Font font;
    private Color foreground;
    private Color background;
    private double rotation;

    public Bandeau() {
        this.message = "";
        this.font = new Font("SansSerif", Font.PLAIN, 20);
        this.foreground = Color.BLACK;
        this.background = Color.WHITE;
        this.rotation = 0.0;
    }

    public void setMessage(String message) {
        this.message = message;
        System.out.println(message); // Pour la simulation visuelle (remplace l'affichage sur un vrai bandeau)
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public void setForeground(Color color) {
        this.foreground = color;
    }

    public void setBackground(Color color) {
        this.background = color;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }

    public void sleep(int millis) {
        try {
            Thread.sleep(millis); // Simule le délai entre les changements
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Font getFont() {
        return font;
    }

    public Color getForeground() {
        return foreground;
    }

    public Color getBackground() {
        return background;
    }

    public double getRotation() {
        return rotation;
    }

    public void close() {
        System.out.println("Fermeture du bandeau."); // Pour la simulation visuelle
    }
}
