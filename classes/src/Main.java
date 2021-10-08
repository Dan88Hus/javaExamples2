public class Main {
    public static void main(String[] args){
        Car porsche = new Car();
        Car holden = new Car();
//        porsche.model = "Carrera"; we changed public to private

        porsche.setModel("porsche");
        System.out.println("Model is "+ porsche.getModel());

    }
}
