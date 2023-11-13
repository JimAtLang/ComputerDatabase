class Desktop extends Computer{ 
  int monitors;
  boolean wired;

  public Desktop(String manufacturer, String os, int ram, int storage, String chipType, int monitors, boolean wired){
    super(manufacturer, os, ram, storage, chipType);
    this.monitors = monitors;
    this.wired = wired;

  }

}
