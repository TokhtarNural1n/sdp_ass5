package Template;

public abstract class GameAction {
    public final void executeAction() {
        prepare();
        action();
        complete();
    }

    protected abstract void action();

    private void prepare() {
        System.out.println("Preparing action...");
    }

    private void complete() {
        System.out.println("Completing action...");
    }
}
