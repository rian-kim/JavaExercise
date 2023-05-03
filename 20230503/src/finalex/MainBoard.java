package finalex;

import gamelevel.AdvancedLevel;
import gamelevel.Player;

public class MainBoard {

	public static void main(String[] args) {
		Player player = new Player();
//		Player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
//		player.upgradLevel(aLevel);
		player.play(2);
		
//		SuperLevel sLevel = new SuperLevel();
//		player.upgradeLevel(sLevel);
		player.play(3);
	}

}
