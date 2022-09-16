import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	private String book;
	ArrayList<Contact>contacts;
	
	public AddressBook(String book) {
		this.book = book;
	}
	
	public String toString() {
		return "";
	}
	
	public void addContact(Contact contact) {
		
	}
	
	public void loadContacts(String filename) { 
		Scanner scan = null;
		Contact temp = null;
		try{
			scan = new Scanner(new File(filename));	
			while(scan.hasNext()) {
				String record = scan.nextLine();
				String[] data = record.split(",");
				if(this.book.equals("Family")) {
					temp = new FamilyMember(data[0], data[1], data[2], data[3]);
					contacts.add(temp);
					
				}else if(this.book.equals("Work Contacts")) {
					temp = new WorkContact(data[0], data[1], data[2]);
					contacts.add(temp);
				}
			}
			scan.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
			
}
