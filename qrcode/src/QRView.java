import java.awt.*;
import java.util.*;
import javax.swing.*;

class QRView {   
    // Graphics
    private final JFrame f;
    private final JButton b;
    private final QRPanel p;
    
    public QRView(QRModel m, QRControl c) {    
        // Initialization
        f = new JFrame("QRCode");
        f.setSize(1024, 720);
        f.setLayout(new BorderLayout());
        
        b = new JButton("Repaint");
        b.addActionListener(c);
        
        p = new QRPanel(m, c);
        
        f.add(b, BorderLayout.PAGE_END);
        f.add(p);
        
        f.setDefaultCloseOperation(3);
        f.setVisible(true);
    }
    
    public JButton getB() { 
        return this.b;
    }
    
    public void repaintQRCode() {
        f.repaint();
    }
}

class QRPanel extends JPanel {
    private final Random r;
    private final int smallRect;
    private final int bigRect;
    private final int QRSize;
    
    public QRPanel(QRModel m, QRControl c) {
        r = new Random();

        this.smallRect = m.getSmallRect();
        this.bigRect = m.getBigRect();
        this.QRSize = m.getQRSize();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // QRBackground
        for (int x = 0; x < QRSize; x += smallRect) {
            for (int y = 0; y < QRSize; y += smallRect) {
                if (r.nextBoolean() == true) g.setColor(Color.white);
                else g.setColor(Color.black);
                
                g.fillRect(x, y, smallRect, smallRect);
            }
        }
        // QRRects
        drawQRRect(g, 0, 0);
        drawQRRect(g, 0, QRSize - bigRect);
        drawQRRect(g, QRSize - bigRect, 0);
    }
    
    public void drawQRRect(Graphics g, int x, int y) {
        g.setColor(Color.white);
        g.fillRect(x, y, bigRect, bigRect);
        
        g.setColor(Color.black);
        g.fillRect(bigRect / 10 + x, bigRect / 10 +  y, bigRect / 10 * 8, bigRect / 10 * 8);
        
        g.setColor(Color.white);
        g.fillRect(bigRect / 10 * 2 + x, bigRect / 10 * 2 + y, bigRect / 10 * 6, bigRect / 10 * 6);
        
        g.setColor(Color.black);
        g.fillRect(bigRect / 10 * 3 + x, bigRect / 10 * 3 + y, bigRect / 10 * 4, bigRect / 10 * 4);
    }
}