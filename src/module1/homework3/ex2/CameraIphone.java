package module1.homework3.ex2;

public class CameraIphone extends Camera {
    private boolean hasFlash;

    public CameraIphone(int zoom, boolean hasFlash) {
        super(zoom);
        this.hasFlash = hasFlash;
    }

    @Override
    public String toString() {
        return "CameraIphone{" +
                "zoom=" + zoom +
                ", hasFlash" +
                '}';
    }
}
