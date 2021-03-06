

	import java.awt.Container;
	import java.awt.FlowLayout;
	import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ContainerListener;
	import java.awt.event.KeyEvent;
	import java.awt.event.KeyListener;
	import java.awt.event.MouseListener;

	import javax.swing.AbstractAction;
	import javax.swing.Action;
	import javax.swing.JButton;
	import javax.swing.JComponent;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JPanel;
	import javax.swing.JTabbedPane;
	import javax.swing.JTextArea;
	import javax.swing.JTextField;

	/**
	 * 
	 */

	/**
	 * @author dranz
	 *
	 */
	@SuppressWarnings("serial")
	public class Alarm extends JFrame{

		/**
		 * @param args
		 * @return 
		 */
		
		//JButton a1 = new JButton("Distance");
		//JButton a2 = new JButton("Energy");
		
		
		private static JFrame frame = null;
		static String time = null;
		static String date = null;
		static String title = null;
		static JButton addAlarm = new JButton("Add Alarm");
		static JButton addAlarm2 = new JButton("Add Alarm2");
		static JButton addAlarm3 = new JButton("Add Alarm3");
		static JPanel panel1;
		static JPanel panel2;
		static JTextField dateInput = null;
		static JTextField timeInput = null;
		static JTextField nameInput = null;
		static JTextField msgInput = null;
		static GridBagLayout grid = new GridBagLayout();
		static GridBagConstraints c = new GridBagConstraints();
		public Alarm()
		{
			frame = new JFrame("Alarms");
			frame.setSize(600, 600);
		//	Font f = new Font("Roman", Font.PLAIN, 13);
			JTabbedPane tabbedPane = new JTabbedPane();
			//panel1.setLayout(new GridLayout());
			tabbedPane.addTab("Set Alarm", Add());
			tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
			tabbedPane.addTab("Alarms", Energy());
			tabbedPane.setMnemonicAt(0, KeyEvent.VK_2);
			//panel1.setLayout(new GridLayout());
			//GridBagConstraints c = new GridBagConstraints();
			
			//panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
			frame.add(tabbedPane);
			
			
		}
		
		private static JComponent Add()
		{
			JLabel labelDate = new JLabel("Date");
			JLabel labelTime = new JLabel("Time");
			JLabel labelName = new JLabel("Alarm Name");
			JLabel labelMsg = new JLabel("Opt Message");
			dateInput = new JTextField(5);
			dateInput.setEditable(true);
			timeInput = new JTextField(5);
			timeInput.setEditable(true);
			nameInput = new JTextField(5);
			nameInput.setEditable(true);
			msgInput = new JTextField(5);
			msgInput.setEditable(true);
			 panel1 = new JPanel();
			 panel1.setLayout(grid);
			 c.fill = GridBagConstraints.CENTER;
			 c.weightx = 1;
			 c.gridx = 1;
			 c.gridy = 4;
			 grid.setConstraints(addAlarm, c);
			 panel1.add(addAlarm);
			 c.weightx = 0.5;
			 c.gridx = 1;
			 c.gridy = 2;
			 grid.setConstraints(labelName, c);
			 panel1.add(labelName);
			 c.weightx = 0.5;
			 c.gridx = 1;
			 c.gridy = 3;
			 grid.setConstraints(nameInput, c);
			 panel1.add(nameInput);
			 c.gridx = 2;
			 c.gridy = 2;
			 grid.setConstraints(labelDate, c);
			 panel1.add(labelDate);
			 c.gridx = 2;
			 c.gridy = 3;
			 grid.setConstraints(dateInput, c);
			 panel1.add(dateInput);
			 c.gridx = 3;
			 c.gridy = 2;
			 grid.setConstraints(labelTime, c);
			 panel1.add(labelTime);
			 c.gridx = 3;
			 c.gridy = 3;
			 grid.setConstraints(timeInput, c);
			 panel1.add(timeInput);
			 c.gridx = 4;
			 c.gridy = 2;
			 grid.setConstraints(labelMsg, c);
			 panel1.add(labelMsg);
			 c.gridx = 4;
			 c.gridy = 3;
			 grid.setConstraints(msgInput, c);
			 panel1.add(msgInput);
			 
			return panel1;
			
			
		}
		private static JComponent Energy()
		{
			 panel2 = new JPanel();

			return panel2;
			
			
		}
		
		
		
		
		    
		
		
		
		public static void main(String[] args) {
			
			
			Alarm f = new Alarm();
			//f.setSize(600, 600);
			//f.setVisible(true);
			//frame.setSize(600, 600);
			frame.setVisible(true);
			
			
		}

		

	}




