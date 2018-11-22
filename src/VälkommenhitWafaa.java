import javax.swing.*;

public class TextDemo1 {
    public static void main (String[] args) {
      String s1;
    		s1 = "Välkommen";
    		String s2;
    		s2 = s1;	
    		s2 = s2 + "hit";
    		s2 = s2 + "Wafaa" + System.getProperty("user.name");
			JOptionPane.showMessageDialog(null, s2);
    }
}