package State;

public class Character {
    private CharacterState state;

    public Character() {
        this.state = new NormalState();
    }

    public void setState(CharacterState state) {
        this.state = state;
    }

    public void attack() {
        state.attack();
    }
}
