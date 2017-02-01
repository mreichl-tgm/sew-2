class QRModel {
    private final int QRSize;
    private final int smallRect;
    private final int bigRect;
    
    public QRModel() {
        QRSize = 200;
        smallRect = 5;
        bigRect = 50;
    }
    
    public int getQRSize() {
        return QRSize;
    }
    
    public int getSmallRect() {
        return smallRect;
    }

    public int getBigRect() {
        return bigRect;
    }
}