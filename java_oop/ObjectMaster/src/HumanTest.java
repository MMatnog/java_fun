
public class HumanTest {

	public static void main(String[] args) {
		Human man = new Human();
		Human enemy = new Human();
		
		int enemyHP = enemy.getHealth();
		System.out.println(enemyHP);
		man.attack(enemy);
		int newEnemyHP = enemy.getHealth();
		System.out.println(newEnemyHP);
	}

}
