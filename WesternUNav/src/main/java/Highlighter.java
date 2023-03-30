import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

public class Highlighter extends JComponent {
  
  private Rectangle rect;
  
  public Highlighter(int x, int y, int width, int height) {
    this.rect = new Rectangle(x, y, width, height);
    setBounds(rect);
  }
  
  @Override
  protected void paintComponent(Graphics g) {
    Graphics2D g2d = (Graphics2D) g.create();
    g2d.setColor(new Color(255, 255, 0, 128));
    g2d.fillRect(0, 0, getWidth(), getHeight());
    g2d.setColor(Color.YELLOW);
    g2d.drawRect(0, 0, getWidth() - 1, getHeight() - 1);
    g2d.dispose();
  }
  
}