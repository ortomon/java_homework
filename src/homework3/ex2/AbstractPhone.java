package homework3.ex2;

public abstract class AbstractPhone {
    private String model;
    private String operatingSystem;
    private ElectronicBoard electronicBoard;
    private Camera camera;

    public AbstractPhone(String model) {
        this.model = model;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setElectronicBoard(ElectronicBoard electronicBoard) {
        this.electronicBoard = electronicBoard;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "AbstractPhone{" +
                "model='" + model + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", electronicBoard=" + electronicBoard +
                ", camera=" + camera +
                '}';
    }
}
