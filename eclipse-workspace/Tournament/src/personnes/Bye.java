package personnes;

public final class Bye extends Competitor {
	@Override
	public int getClassement() {
		return 0;
	}

	@Override
	public boolean isBye() {
		return true;
	}
}
