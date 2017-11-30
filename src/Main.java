import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Main extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame();
		f.setResizable(false);
		
		Wolfy p=new Wolfy();
		f.setContentPane(p);
		f.setVisible(true);
		f.pack();
		f.setTitle("Sprite");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.initialise();
		
	}

}
