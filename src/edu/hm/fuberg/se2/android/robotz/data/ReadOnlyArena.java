package edu.hm.fuberg.se2.android.robotz.data;

/**
 * The Interface ReadonlyItem restricts the access to Arena data for other layers.
 * @author Stephanie Ehrenberg
 * @author Robert Fuess
 */
public interface ReadOnlyArena {

	//	/**					//Zugriff noch unbekannt
	//	 * Gets the item.
	//	 *
	//	 * @return the item
	//	 */
	//	Item getItem();

	/**
	 * Gets the width of the Areana.
	 *
	 * @return the width of the Arena
	 */
	double getWidth();

	/**
	 * Gets the height of the Arena.
	 *
	 * @return the height of the Arena
	 */
	double getHeight();

	/**
	 * Gets the state of the Game.
	 *
	 * @return the state of the Game
	 */
	GameState getState();

}