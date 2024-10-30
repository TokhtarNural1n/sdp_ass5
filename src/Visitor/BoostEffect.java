package Visitor;
import State.Character;

public class BoostEffect implements EffectVisitor {
    public void applyBoost(Character character) {
        System.out.println("Character boosted!");
    }

    public void applyDamage(Character character) {
    }
}
