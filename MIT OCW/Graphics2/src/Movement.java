import java.awt.*;

public class Movement {
    protected int x;
    protected int y;
    protected int xDirection;
    protected int yDirection;
    protected Sprite sprite;

    public Movement(int startX, int startY, Sprite sprite) {
        x = startX;
        y = startY;
        this.sprite = sprite;
    }

    public void setMovementVector(int xIncrement, int yIncrement) {
        xDirection = xIncrement;
        yDirection = yIncrement;
    }

    public void draw(Graphics graphics) {
        sprite.draw(graphics, x, y);

        // Move the center of the object each time we draw it
        x += xDirection;
        y += yDirection;
    }

}
