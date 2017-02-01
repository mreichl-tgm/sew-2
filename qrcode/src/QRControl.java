import java.awt.event.*;

class QRControl implements ActionListener {
    private final QRModel m;
    private final QRView v;
    
    public QRControl() {
        this.m = new QRModel();
        this.v = new QRView(m, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == v.getB()) v.repaintQRCode();
    }
}