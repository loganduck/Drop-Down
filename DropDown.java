import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 * Implements a drop down menu inside of the JFrame. 
 * Button click shows the option selected by the user.
 * @author LoganDuck (logan.duck@yahoo.com)
 * @version 07/11/18
 */
public class DropDown extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	static JComboBox<String> dropDown;
	static JButton button;
	static JLabel label;
	
	/* constructor */
	public DropDown() {
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(300, 150));
		setMaximumSize(new Dimension(300, 150));
		setLocationRelativeTo(null);
		
		String[] options = {"", "Option 1", "Option 2", "Option 3"};
		dropDown = new JComboBox<String>(options);
		dropDown.setBounds(19, 30, 120, 30);
		add(dropDown);
		
		button = new JButton("What is selected?");
		button.setBounds(139, 30, 152, 30);
		button.addActionListener(this);
		add(button);
		
		label = new JLabel();
		label.setBounds(101, 70, 98, 16);
		add(label);

		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            		new DropDown();
            }
        });
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			switch (dropDown.getSelectedItem().toString()) {
			case "Option 1":
				label.setText("one");
				break;
			case "Option 2":
				label.setText("two");
				break;
			case "Option 3":
				label.setText("three");
				break;
			case "Option 4":
				label.setText("four");
				break;
			default:
				label.setText("nothing, moron");
			}
		}
	}
}