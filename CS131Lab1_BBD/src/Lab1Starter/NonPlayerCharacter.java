package Lab1Starter;
import java.security.SecureRandom;
import java.util.Random;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	protected boolean active;
	protected String intelligenceType;
public NonPlayerCharacter(){
	super();
	this.active=false;
	this.intelligenceType="AVERAGE";
}
public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
	
}
public void setActive(boolean active) {
	this.active=active;
}
public boolean getActive() {
	return active;
}
public void setIntelligenceType(String intelligenceType) {
	this.intelligenceType=intelligenceType;
}
public String getIntelligenceType() {
	return intelligenceType;
}
public String reportStructure() {
	super.reportStructure();
	StringBuilder sb = new StringBuilder("==================================\n");
	sb.append("UniqueID: "+getUniqueID()+"\n");
	sb.append("Personality: "+getPersonality()+"\n");
	sb.append("==================================\n");
	sb.append("Active: "+getActive()+"\n");
	sb.append("Intelligence: "+getIntelligenceType()+"\n");
	sb.append("==================================\n");
	
	
	return sb.toString();
}
public String introduce() {
	StringBuilder sb = new StringBuilder("Hello, my name is " + getUniqueID());
	return sb.toString();
}
public String exclaim() {
	Random gen = new Random();
	String arr[] = {"Dag Gummit", "Doggone it","Holy cow","Jeez","Well cheese and crackers"};
	int rand = gen.nextInt(arr.length);
	return arr[rand].toString();
	
}
	

}//end class
