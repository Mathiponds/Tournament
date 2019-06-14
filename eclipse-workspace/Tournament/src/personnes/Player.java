package personnes;

public class Player extends Competitor{
	private final String name;
	private final int classement;
	private final String club;
	
	public Player(String name, int classement, String club) {
		super();
		this.name = name;
		this.classement = classement ;
		this.club = club;
	}

	@Override
	public int getClassement() {
		return classement;
	}

	@Override
	public boolean isBye() {
		return false;
	}
	
}
