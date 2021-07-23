import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class DrawGraphics {
    List<Mover> movingSprite = new ArrayList<>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        /*
        Rectangle box1 = new Rectangle(15, 20, Color.RED);
        movingSprite.add(new Bouncer(100, 170, box1));
         */

        Rectangle box2 = new Rectangle(25, 10, Color.BLUE);
        movingSprite.add(new Bouncer(200, 70, box2));

        Oval oval = new Oval(30, 20, Color.GREEN);
        movingSprite.add(new StraightMover(50, 200, oval));



        for (Mover sprite: movingSprite) {
            sprite.setMovementVector(3, 1);
        }
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (Mover sprite: movingSprite) {
            sprite.draw(surface);
        }
    }

}
