import java.awt.*;

public class Oval implements Sprite {
    private int width;
    private int height;
    private Color color;

    /**
     * Create an oval that has dimensions width and height, filled with
     * startColor.
     */
    public Oval(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(Graphics surface, int leftX, int topY) {
        // Draw the object
        surface.setColor(color);
        surface.fillOval(leftX, topY, width, height);
        surface.setColor(Color.BLACK);
        ((Graphics2D) surface).setStroke(new BasicStroke(3.0f));
        surface.drawOval(leftX, topY, width, height);

    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

}
