package personnes;

public abstract class Competitor {
	private int nbPoints;
	private int matchPlayed;
	public Competitor() {
		nbPoints = 0;
		matchPlayed = 0;
	}
	public abstract int getClassement();
	public abstract boolean isBye();
	public int getPoints() {
		return nbPoints;
	}
	public int getNbPLayed() {
		return matchPlayed;
	}
}
