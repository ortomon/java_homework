package homework3.ex2;

public class Factory {
    public AbstractPhone assemble(Samsung samsung) {
        AbstractPhone samsungGalaxy = new Samsung();
        samsungGalaxy.setOperatingSystem("Android");
        samsungGalaxy.setElectronicBoard(new ElectronicBoard ("j-108", 10, 12, 13));
        samsungGalaxy.setCamera(new Camera(20));
        return samsungGalaxy;
    }

    public AbstractPhone assemble(Iphone iphone) {
        AbstractPhone iphone15 = new Iphone();
        iphone15.setOperatingSystem("iOS");
        iphone15.setElectronicBoard(new ElectronicBoard("7uik", 15, 12, 13));
        iphone15.setCamera(new CameraIphone(15, true));
        return iphone15;
    }
}

