package Visitor;
import State.Character;

public interface EffectVisitor {
    void applyBoost(Character character);
    void applyDamage(Character character);
}
