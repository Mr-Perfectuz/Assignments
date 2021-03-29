package Interface;

public class Fish implements Prey,Predetor{
    @Override
    public void hunt() {
        System.out.println("This fish is hunting for a smaller fish");
    }

    @Override
    public void flee() {
        System.out.println("This fish fleeing from a larger fish");

    }
}