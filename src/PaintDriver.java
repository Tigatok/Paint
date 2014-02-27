import javax.swing.JFrame;

public class PaintDriver {
	public static void main(String[] args) {
		JFrame myApp = new JFrame("Paint");
		Paint np = new Paint();
		myApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myApp.add(np);
		myApp.setSize(500, 600);
		myApp.setResizable(false);
		myApp.setVisible(true);
	}
}
