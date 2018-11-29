package MainTest;

public class User {
	private String ID;
	private String PW;
	private int GameMoney;
	private int level;
	private static User instance = null;

	public static User getInstance() {
		if (instance == null) {
			synchronized (User.class) {
				if (instance == null) {
					instance = new User();
				}
			}
		}

		return instance;
	}

	public int getGameMoney() {
		return GameMoney;
	}

	public void setGameMoney(int gameMoney) {
		GameMoney = gameMoney;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

}
