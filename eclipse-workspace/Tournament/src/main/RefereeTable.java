package main;

import java.util.ArrayList;
import java.util.List;

import competitions.Competition;
import competitions.Match;
import personnes.Competitor;

public class RefereeTable {
	//Quand on crée une competition la liste qu'on doit mettre est une liked list ;
	private final int nbTerrain;
	private Match salle [] ;
	private List<Competition> compets;
	
	public RefereeTable(int nbTerrain) {
		this.nbTerrain = nbTerrain;
		salle = new Match[nbTerrain];
		compets = new ArrayList<>();
	}
	
	public void createCompet(String categorie, List<Competitor> comp, int  nbGroups, int nbOutGroup) {
		compets.add(new Competition(categorie,comp,nbGroups,nbOutGroup));
	}
}
