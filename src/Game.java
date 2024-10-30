import State.PoweredUpState;
import Strategy.CharacterStrategy;
import Strategy.MeleeStrategy;
import Template.AttackAction;
import Template.GameAction;
import Visitor.BoostEffect;
import Visitor.DamageEffect;
import State.Character;

public class Game {
    public static void main(String[] args) {
        Character character = new Character();
        character.attack();
        character.setState(new PoweredUpState());
        character.attack();

        CharacterStrategy characterWithStrategy = new CharacterStrategy();
        characterWithStrategy.setStrategy(new MeleeStrategy());
        characterWithStrategy.executeStrategy();

        GameAction attack = new AttackAction();
        attack.executeAction();

        BoostEffect boost = new BoostEffect();
        DamageEffect damage = new DamageEffect();
        boost.applyBoost(character);
        damage.applyDamage(character);
    }
}