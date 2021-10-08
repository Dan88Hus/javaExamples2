public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int tail, int teeth, String coat, int legs) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;

    }
    private void chew(){
        System.out.println("dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat override called");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("dog walk called");
        super.move(5); //or move();


    }
    public void run(){
        System.out.println("dog run called");
        move(10);

    }
}
