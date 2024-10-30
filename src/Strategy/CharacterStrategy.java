package Strategy;

public class CharacterStrategy {
    private FightingStrategy strategy;

    public void setStrategy(FightingStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        strategy.fight();
    }
}
