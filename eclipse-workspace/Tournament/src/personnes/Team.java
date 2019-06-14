package personnes;

import java.util.ArrayList;

public class Team extends Competitor{
	private static final int ERROR_1 = -1;
	private static final int NB_OF_IMPORTANT_PLAYER = 3;
	private final String teamName;
	private ArrayList<Competitor> teamMember;
	
	public Team(String name) {
		super();
		this.teamName = name;
	}
	
	public void addCompetitor(Competitor c) {
		teamMember.add(c);
	}
	
	@Override
	public int getClassement() {
		if(teamMember.size()<NB_OF_IMPORTANT_PLAYER)
			return ERROR_1;
		int total = 0 ;
		for(int i =0;i<NB_OF_IMPORTANT_PLAYER;++i) {
			total+= teamMember.get(i).getClassement();
		}
		return total;
	}

	@Override
	public boolean isBye() {
		return false;
	}

}
