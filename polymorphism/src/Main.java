//polymorphisim is switch case and inheritance by overriding
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}
class Jaws extends Movie{
    public Jaws(){
        super ("Jaws");
    }
    public String plot(){
        return "A shark eats lot of people";
    }

}
class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens atttampts to take over planet earth";
    }
}
class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}
class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }

}
class Forgetable extends Movie{
    public Forgetable() {
        super("Forgetable");
    }
// No plot in here
}

public class Main {
    public static void main(String[] args) {
        for (int i=0; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie# "+i+": "+movie.getName()+"\n"+"Plot:"+movie.plot()+"\n");
        }

    }
    public static Movie randomMovie(){ //this will return Movie
    int randomNumber = (int) (Math.random()*5)+1; //Normally random returns double thats why we casting int
        System.out.println("Random Number Generated "+randomNumber );
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
            default:
                return null;
        }

    }
}
