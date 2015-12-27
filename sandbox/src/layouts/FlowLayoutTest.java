package layouts;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Christian Preisner <preisner@white-paper-media.de>
 */
public class FlowLayoutTest extends JFrame implements ActionListener {

	/*
	 * Einige Buttons
	 */
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;

	/*
	 * Methode initialisiert Buttons, setzt jeweils einen ActionListener, und
	 * fügt die Buttons zu einem Panel hinzu. Aufgebauter Panel wird dem Frame
	 * übergeben, und somit dargestellt.
	 */
	public void initComponents() throws MalformedURLException {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());

		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);

		mainPanel.add(button1);
		mainPanel.add(button2);
		mainPanel.add(button3);
		mainPanel.add(button4);
		mainPanel.add(button5);

		getContentPane().add(mainPanel);

		URL url = ClassLoader.getSystemResource("layouts/test.png");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.createImage(url);
		setIconImage(img);

		setVisible(true); // Frame soll sichtbar sein
		setResizable(true); // Frame soll maximiert werden können
		setSize(new Dimension(1000, 500)); // Definition der initialen Größe des
											// Frames
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Anwendung soll geschlossen
													// werden, wenn das x
													// gedrückt wurde
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}

	public static void main(String[] args) throws MalformedURLException {
		FlowLayoutTest flt = new FlowLayoutTest();
		flt.initComponents();
	}
}