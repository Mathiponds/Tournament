package competitions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import personnes.Competitor;

public class Competition {
	private final int nbGroups;
	private final int nbOutGroup;
	private final String categorie;
	private final List<Competitor> comp;
	private final int totalComp;
	
	private List<Group> groups;
	
	public Competition(String categorie, List<Competitor> comp, int  nbGroups, int nbOutGroup) {
		this.categorie =categorie;
		this.comp =comp;
		this.totalComp = comp.size();
		this.nbGroups = nbGroups;
		this.nbOutGroup = nbOutGroup;
		
		createGroups();
		
		for(Group g : groups) {
			g.prepareMatches();
		}
	}
	
	public void createGroups() {
		groups = new ArrayList<>();
		int nbMaxPerGroups = totalComp / nbGroups +1;
		List<Competitor> tmpComp = new ArrayList<>(comp);
		for(int i = 0;i <nbGroups; ++i) {
			groups.add(new Group(this, i+1));
			groups.get(i).add(comp.get(i)); 		//On met les têtes de séries;
		}
		List<Competitor> sublist;
		for(int i = 1 ; i<nbMaxPerGroups ; ++i){
			sublist = tmpComp.subList(i*nbGroups, Math.min((i+1)*nbGroups,tmpComp.size()));
			Collections.shuffle(sublist);
			for(int j=0 ;j<sublist.size(); ++j) {
				groups.get(nbGroups-j-1).add(tmpComp.get(i*nbGroups+j));	//ON met les derniers dans le group des moins favoris
			}
		}
	}	
}
