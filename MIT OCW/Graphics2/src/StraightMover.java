import java.awt.Graphics;

public class StraightMover extends Movement implements Mover{

    /** Create a Bouncer that positions sprite at (startX, startY). */
    public StraightMover(int startX, int startY, Sprite sprite) {
        super(startX, startY, sprite);
    }

    /** Starts moving the object in the direction (xIncrement, yIncrement). */
    public void setMovementVector(int xIncrement, int yIncrement) {
        super.setMovementVector(xIncrement, yIncrement);
    }

    public void draw(Graphics graphics) {
        super.draw(graphics);
    }

}
