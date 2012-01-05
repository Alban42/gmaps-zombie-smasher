package fr.alma.ihm.gmapszombiesmasher.model.components;

import fr.alma.ihm.gmapszombiesmasher.model.Entity;

/**
 * 
 * Artificial intelligence of an Entity if it do have one. Citizen will move to
 * the chopper if one is around
 * 
 */
public class CAICitizen extends Component implements ICAI {

	public CAICitizen(Entity parent) {
		super(parent);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

		// Chercher le CGoal du parent
		// Si aucun , alors le cr�er

		// Si la valeur du CGoal est null
		// Alors chercher si une entit� de chopper existe, la mettre dans le
		// CGoal

		// Modifier par effet de bord les CCoordinates en fonction de la
		// CMovespeed
		// (Prendre en compte le deltaTime) et se diriger vers l helicopt�re
		// grace
		// a la route trouv�e par Gmap

	}

}