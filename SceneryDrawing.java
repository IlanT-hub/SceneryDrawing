
import java.awt.*;
import javax.swing.*;


public class SceneryDrawing extends JFrame {
    public SceneryDrawing() {
         add(new SceneryPanel());

    }
     public static void main(String[] args) {
        SceneryDrawing frame = new
        SceneryDrawing();
        frame.setTitle("Ilans Scenery");
        frame.setSize( 800,600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation
                (JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

     }
}
class SceneryPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(new Color(135, 235, 232));
        g2d.fillRect(0, 0, getWidth()/2, getHeight()/2);
        g2d.setColor(new Color);

    }
}