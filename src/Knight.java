
public class Knight {
	double defence;
	double damage;
	
	Sword sword;
	Spear spear;
	Shield scheld;
	Helmet helmet;
	Armor armor;
	Bow bow;
	
	double totalWeight() {
		double totalWeight = sword.weight+spear.weight+bow.weight;
		return totalWeight;
	}
	
}