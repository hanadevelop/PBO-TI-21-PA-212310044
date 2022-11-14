package pratikum3;

	public class latihan2 {
	

	import javax.swing.JOptionPane;

		public static Void main(String[] args) {
			biodata myBio = new biodata();
			
			myBio.setFullname(JOptionPane.showInputDialog(
					null, 
					"Input your fullname:",
					"Form Input",
					JOptionPane.QUESTION_MESSAGE
			));
			
			myBio.setAge(Integer.parseInt(JOptionPane.showInputDialog(
					null, 
					"Input your age:",
					"Form Input",
					JOptionPane.QUESTION_MESSAGE
			)));
			
			myBio.setAlamat(JOptionPane.showInputDialog(
					null, 
					"Input your address:",
					"Form Input",
					JOptionPane.QUESTION_MESSAGE
			));

			JOptionPane.showMessageDialog(
					null, 
					"Your fullname is " + myBio.getFullname() 
					+ "\nYour age is " + myBio.getAge() + " year " 
					+ "\raiYour address is " + myBio.getAlamat());
		

	}


