package Visitor;
import State.Character;

public class DamageEffect implements EffectVisitor {
    public void applyDamage(Character character) {
        System.out.println("Character took damage!");
    }

    public void applyBoost(Character character) {
    }
}
