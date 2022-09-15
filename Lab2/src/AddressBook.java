import java.util.ArrayList;

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
		
		//System.out.println("in loadContact...book is: "+ book);//debug DELETE LATER
		try{
			scan = new Scanner(new File(filename));	
			System.out.println("filename is: " + filename);//debug DELETE LATER
			while(scan.hasNext()) {
				//System.out.println("in loadContact while...");//ddebug DELETE LATER
				String record = scan.nextLine();
				String[] data = record.split(",");
				if(this.book.equals("Family")) {
					temp = new FamilyMember(data[0], data[1], data[2], data[3]);
					System.out.println("if statement");//debug DELETE LATER
					contacts.add(temp);
					
				}else if(this.book.equals("Work Contacts")) {
					temp = new WorkContact(data[0], data[1], data[2]);
					contacts.add(temp);
				}
				//System.out.println(data[0] + data[1] + data[2] + data[3]);debug DELETE LATER
			}
			scan.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
			
}
