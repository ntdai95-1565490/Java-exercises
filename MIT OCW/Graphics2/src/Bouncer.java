import java.awt.Graphics;

public class Bouncer extends Movement implements Mover {

    /** Create a Bouncer that positions sprite at (startX, startY). */
    public Bouncer(int startX, int startY, Sprite sprite) {
        super(startX, startY, sprite);
    }

    /** Starts moving the object in the direction (xIncrement, yIncrement). */
    public void setMovementVector(int xIncrement, int yIncrement) {
        super.setMovementVector(xIncrement, yIncrement);
    }

    /** Draws the sprite at its current position on to surface. */
    public void draw(Graphics surface) {
        super.draw(surface);

        // If we have hit the edge and are moving in the wrong direction, reverse direction
        // We check the direction because if a box is placed near the wall, we would get "stuck"
        // rather than moving in the right direction
        if ((x <= 0 && xDirection < 0) ||
                (x + sprite.getWidth() >= SimpleDraw.WIDTH && xDirection > 0)) {
            xDirection = -xDirection;
        }
        if ((y <= 0 && yDirection < 0) ||
                (y + sprite.getHeight() >= SimpleDraw.HEIGHT && yDirection > 0)) {
            yDirection = -yDirection;
        }
    }

}
