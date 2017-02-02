
package java2dpack;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Surface extends JPanel {
    
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        this.setBackground(Color.WHITE);
        
        g.setColor(Color.GRAY);
        g.fillRect(25, 25, 150, 150);
        
        g.setColor(Color.WHITE);
        g.fillOval(25, 25, 150,150);
        
        g.setColor(Color.GREEN);
         int x[] = {35,100,165};
         int y[] = {150,25,150};
        
        g.fillPolygon(x, y, 3);
        
        g.setColor(Color.BLUE);
        int x1[] = {35,100,165};
        int y1[] = {50,150,50};
        
        g.fillPolygon(x1, y1, 3);
        
        g.setColor(Color.YELLOW);
        g.fillRect(200,25,150,150);
        
        g.setColor(Color.WHITE);
        g.fillOval(200, 25, 150, 150);
        
        g.setColor(Color.PINK);
        int x2[] = {200,200,275};
        int y2[] = {50, 150,100};
        
        g.fillPolygon(x2, y2, 3);
        
        g.setColor(Color.GREEN);
        int x3[] = {350, 350, 275};
        int y3[] = {50,150,100};
        
        g.fillPolygon(x3, y3, 3);
        }
    }

