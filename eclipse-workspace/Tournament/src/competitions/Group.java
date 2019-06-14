package competitions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import personnes.Bye;
import personnes.Competitor;

public class Group {
	private final Competition comp;
	private final int number;
	
	private List<Competitor> groupComp;
	private List<Competitor> standings;
	private final int nbComp;
	private final int nbMatchPerTurn;
	private ArrayDeque<Match> matchToPlay;
	private ArrayDeque<Match> matchPlayed;
	
	public Group(Competition comp, int number) {
		this.comp= comp;
		this.number = number;
		groupComp = new ArrayList<>();
		nbComp = groupComp.size();
		nbMatchPerTurn = nbComp/2;
		if(groupComp.size() %2 ==1)
			groupComp.add(new Bye());
		matchToPlay = new ArrayDeque<>();
		matchPlayed = new ArrayDeque<>();
	}
	
	public void prepareMatches() {
		for(int i = 0 ; i< groupComp.size()-1; ++i) {
			createMatch();
			turn();
		}
	}
	private void createMatch() {
		Competitor c1 ,c2;
		for(int i = 0; i<groupComp.size()/2; ++i) {
			c1 = groupComp.get(i); c2 = groupComp.get(nbComp-1-i);
			if(!c1.isBye() && !c2.isBye())
				matchToPlay.addLast(new Match(c1,c2));
		}
	}
	private void turn() {
		Competitor last = groupComp.remove(nbComp-1);
		groupComp.add(1,last);
	}
	public void add(Competitor c) {
		groupComp.add(c);
		standings.add(c);
	}
	public void updateStandings() {
		standings.sort((c1,c2)->{
			if(c1.getPoints()>c2.getPoints())
				return 1;
			else if(c1.getPoints()<c2.getPoints())
				return -1;
			else
				return (c1.getNbPLayed()<= c1.getNbPLayed())?1:-1;
		});
	}
}
