
public class Lab2 {
	public static void main( String[] args ) {
		AddressBook addB = new AddressBook("Family");
		AddressBook addB2 = new AddressBook("Work Contacts");
		
		String path = "C:\\Users\\Connor Stack\\ClassLabs\\lab2_InputOutput\\data\\family.csv";
		String path2 = "data/work.csv";
		
		addB.loadContacts(path);
		addB2.loadContacts(path2);
		// Reminder: include a try/catch statement around your code in loadContacts
//		
//		AddressBook familyBook = new AddressBook( "Family" );
//		familyBook.loadContacts( "data/family.csv" );
//		System.out.println( familyBook );
//		
//		AddressBook workBook = new AddressBook( "Work Contacts" );
//		workBook.loadContacts( "data/work.csv" );
//		System.out.println( workBook );
		
	}
}
