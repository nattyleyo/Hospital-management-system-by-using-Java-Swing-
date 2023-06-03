package GUI.AdminSide;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JPanel;

class ChatBubble extends JPanel {
    private int x, y;
    private String text;
    private boolean left;

    public ChatBubble(int x, int y, String text, boolean left) {
        this.x = x;
        this.y = y;
        this.text = text;
        this.left = left;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        int width = getWidth();
        int height = getHeight();
        int bubbleWidth = width - 30;
        int bubbleHeight = height - 20;
        int bubbleX = left ? 15 : width - bubbleWidth - 15;
        int bubbleY = 10;
        Polygon bubble = new Polygon();
        if (left) {
            bubble.addPoint(bubbleX + 20, bubbleY);
            bubble.addPoint(bubbleX + bubbleWidth, bubbleY);
            bubble.addPoint(bubbleX + bubbleWidth, bubbleY + bubbleHeight);
            bubble.addPoint(bubbleX, bubbleY + bubbleHeight);
            bubble.addPoint(bubbleX + 10, bubbleY + bubbleHeight / 2);
            bubble.addPoint(bubbleX, bubbleY);
        } else {
            bubble.addPoint(bubbleX, bubbleY);
            bubble.addPoint(bubbleX + bubbleWidth - 20, bubbleY);
            bubble.addPoint(bubbleX + bubbleWidth, bubbleY + bubbleHeight / 2);
            bubble.addPoint(bubbleX + bubbleWidth - 20, bubbleY + bubbleHeight);
            bubble.addPoint(bubbleX, bubbleY + bubbleHeight);
            bubble.addPoint(bubbleX, bubbleY);
        }
        g2d.setColor(Color.WHITE);
        g2d.fill(bubble);
        g2d.setColor(Color.BLACK);
        g2d.draw(bubble);
        g2d.drawString(text, left ? (bubbleX + 25) : (bubbleX + 5), (bubbleY + (bubbleHeight / 2)) + 5);
        g2d.dispose();
    }
}