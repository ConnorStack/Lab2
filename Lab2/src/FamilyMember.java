
public class FamilyMember extends Contact {
	private String relationship;
	private String location;
	
	public FamilyMember(String name, String phoneNumber, String relationship, String location) {
		super(name, phoneNumber);
		this.relationship = relationship;
		this.location = location;
	}
	public String toString() {
		return "(" + relationship + ", " + location + ")";
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
}
