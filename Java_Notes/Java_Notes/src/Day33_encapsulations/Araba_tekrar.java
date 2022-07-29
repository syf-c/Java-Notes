package Day33_encapsulations;

public class Araba_tekrar {
          String marka = "Marka belirtilmedi";
  private String model = "Model belirtilmedi";
  private String yakit = "Elektrikli";

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getYakit() {
        return yakit;
    }
}
