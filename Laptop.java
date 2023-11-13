class Laptop extends Computer{
  
  public Laptop(String manufacturer, String os, int ram, int storage, String chipType, double weight, boolean touchscreen){
    super(manufacturer, os, ram, storage, chipType);
    
    this.weight = weight;
    this.touchscreen = touchscreen;
  }
}