public class Computer {
    String manufacturer;
    String os;
    int ram;
    int storage;
    String chipType;
    public Computer(String manufacturer, String os, int ram, int storage, String chipType) {
        this.manufacturer = manufacturer;
        this.os = os;
        this.ram = ram;
        this.storage = storage;
        this.chipType = chipType;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }
    public String getChipType() {
        return chipType;
    }
    public void setChipType(String chipType) {
        this.chipType = chipType;
    }
  
}
