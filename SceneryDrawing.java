import java.awt.*;
import javax.swing.*;

public class SceneryDrawing extends JFrame {
    public SceneryDrawing() {
        add(new SceneryPanel());
    }

    public static void main(String[] args) {
        SceneryDrawing frame = new SceneryDrawing();
        frame.setTitle("Ilan's Scenery");
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class SceneryPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        
        g.setColor(new Color(135, 206, 235));
        g.fillRect(0, 0, getWidth(), getHeight());


        g.setColor(new Color(34, 139, 34));
        g.fillRect(0, getHeight() / 2, getWidth(), getHeight() / 2);

        g.setColor(Color.YELLOW);
        g.fillOval(getWidth() - 150, 50, 100, 100);


        int treeX = getWidth() - 100;
        int treeY = getHeight() / 2 - 100;
        g.setColor(new Color(139, 69, 19));
        g.fillRect(treeX, treeY, 30, 100);

        g.setColor(new Color(34, 139, 34));
        g.fillOval(treeX - 25, treeY - 50, 80, 80);
        g.fillOval(treeX - 50, treeY - 20, 80, 80);
        g.fillOval(treeX, treeY - 20, 80, 80);


        drawCloud(g, 200, 100);
        drawCloud(g, 500, 70);
        drawCloud(g, 350, 150);


        drawBird(g, 300, 200);
        drawBird(g, 400, 250);
        drawBird(g, 350, 220);
    }

    private void drawCloud(Graphics g, int x, int y) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y - 50, 50, 50);
        g.fillOval(x + 60, y - 60, 50, 50);
        g.fillOval(x + 30, y - 60, 50, 50);
    }

    private void drawBird(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.drawLine(x - 20, y - 40, x - 10, y - 50);
        g.drawLine(x - 10, y - 50, x, y - 40);
    }
}