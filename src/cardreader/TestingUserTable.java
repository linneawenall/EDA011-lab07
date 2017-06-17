package cardreader;

public class TestingUserTable {

	public static void main(String[] args) {
		UserTable t = new UserTable ();
		User u4 = new User(1234, "Jens");
		t.add(u4);
		t.print();
		t.getNbrUsers();
		User u1 = t.find (24073);
		System.out.println(u1);
		User u2 = t.find (24074);
		System.out.println(u2);
		User u3 = t.findByName("Jens Holmgren");
		System.out.println(u3);
		t.testFind(); //TestFind gör inte så mycket?? Den skriver inte ut något varken innan eller efter find fungerar
		
		
	

	}

}
