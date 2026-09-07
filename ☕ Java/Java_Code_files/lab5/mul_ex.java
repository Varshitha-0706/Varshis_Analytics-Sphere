package lab5;

interface Character {  
    void attack();  
}  
  
interface Weapon {  
    void use();  
}  
  
class Warrior implements Character, Weapon {  
    public void attack() {  
        System.out.println("Warrior attacks with a sword.");  
    }  
  
    public void use() {  
        System.out.println("Warrior uses a sword.");  
    }  
}  
  
class Mage implements Character, Weapon {  
    public void attack() {  
        System.out.println("Mage attacks with a wand.");  
    }  
  
    public void use() {  
        System.out.println("Mage uses a wand.");  
    }  
}  
  
public class mul_ex{  
    public static void main(String[] args) {  
        Warrior w = new Warrior();  
        Mage m = new Mage();  
  
       w.attack(); // Output: Warrior attacks with a sword.  
        w.use(); // Output: Warrior uses a sword.  
  
        m.attack(); // Output: Mage attacks with a wand.  
        m.use(); // Output: Mage uses a wand.  
    }  
}  
