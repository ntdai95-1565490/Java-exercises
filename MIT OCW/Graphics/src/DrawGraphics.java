import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class DrawGraphics {
    List<BouncingBox> box = new ArrayList<>();
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box.add(new BouncingBox(200, 50, Color.RED));
        box.add(new BouncingBox(200, 150, Color.BLUE));
        box.add(new BouncingBox(200, 250, Color.GREEN));

        for (int i = 0; i < this.box.size(); i++) {
            if (i == 0) {
                this.box.get(i).setMovementVector(1, 0);
            } else if (i == 1) {
                this.box.get(i).setMovementVector(0, -2);
            } else {
                this.box.get(i).setMovementVector(-3, 0);
            }
        }
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        surface.drawOval(20, 20, 20,20);
        surface.drawRoundRect(20, 100, 50, 50, 25, 25);
        surface.drawPolygon(new int[]{100, 100, 140}, new int[]{200, 240, 240}, 3);

        for (BouncingBox box: this.box) {
            box.draw(surface);
        }
    }
} 