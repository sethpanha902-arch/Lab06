package Challenge;

class Character {

    protected String name;

    public Character(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(name + " attacks!");
    }
}

class Spell {

    public void cast() {
        System.out.println("Casting Fireball!");
    }
}

class Weapon {

    public void use() {
        System.out.println("Using Sword!");
    }
}

class Wizard extends Character {

    private Spell spell;

    public Wizard(String name, Spell spell) {
        super(name);
        this.spell = spell;
    }

    public void useSpell() {
        System.out.println(name + " uses magic.");
        spell.cast();
    }
}

class Warrior extends Character {

    private Weapon weapon;

    public Warrior(String name, Weapon weapon) {
        super(name);
        this.weapon = weapon;
    }

    public void useWeapon() {
        System.out.println(name + " uses a weapon.");
        weapon.use();
    }
}

public class Challenge6 {
    public static void main(String[] args) {

        Spell spell = new Spell();
        Weapon weapon = new Weapon();

        Wizard wizard = new Wizard("Merlin", spell);
        Warrior warrior = new Warrior("Arthur", weapon);

        wizard.attack();
        wizard.useSpell();

        System.out.println();

        warrior.attack();
        warrior.useWeapon();
    }
}

