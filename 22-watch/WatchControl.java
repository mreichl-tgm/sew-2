public class WatchControl implements ActionListener {
    private WatchPanel wp1;
    private WatchLayout wl1;
    
    public WatchControl() {
        this.wp1 = new WatchPanel();
        this.wl1 = new WatchLayout(this.wp1, this);
    }

    // ActionPerformed
    public void actionPerformed(ActionEvent e) {
        // 
    }
}