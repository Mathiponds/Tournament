package personnes;

public class Double extends Competitor {
	private final Player p1;
	private final Player p2;
	
	public Double(Player p1, Player p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}

	@Override
	public int getClassement() {
		return p1.getClassement()+p2.getClassement();
	}

	@Override
	public boolean isBye() {
		return false;
	}

}
