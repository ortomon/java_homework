package Homework3.ex2;

public class Camera {
    protected int zoom;

    public Camera(int zoom) {
        this.zoom = zoom;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "zoom=" + zoom +
                '}';
    }
}
