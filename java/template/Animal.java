package template;

public abstract class Animal {

    public final void execute() {
        greetings();
        makeASound();
        colorTail();
    }

    private void greetings() {
        System.out.println("Hello guys!");
    }

    
    public abstract void makeASound();
    public abstract void colorTail();
}
