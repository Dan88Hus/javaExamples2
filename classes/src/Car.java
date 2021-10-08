import java.util.Locale;

public class Car {
    private int doors;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("porsche") || validModel.equals("hoden")){
            this.model = model;

        }else {
            this.model = "Unknown";
        }
    }
    public String getModel(){
        return this.model;
    }
}
