package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DlgIgrac extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldIme;
	private JTextField textFieldPrezime;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgIgrac dialog = new DlgIgrac();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgIgrac() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 0, 0, 0, 14, 0, 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 0, 14, 0, 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblIme = new JLabel("Ime");
			lblIme.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_lblIme = new GridBagConstraints();
			gbc_lblIme.insets = new Insets(0, 0, 5, 5);
			gbc_lblIme.gridx = 2;
			gbc_lblIme.gridy = 1;
			contentPanel.add(lblIme, gbc_lblIme);
		}
		{
			textFieldIme = new JTextField();
			textFieldIme.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char input = e.getKeyChar();

					if (!((input >= 65 && input <= 90) || (input >= 97 && input <= 122) || input == KeyEvent.VK_SPACE
							|| input == KeyEvent.VK_BACK_SPACE)) {
//						e.consume() sprecava ispisivanje u text field-u
						e.consume();
					}
				}
			});
			textFieldIme.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldIme = new GridBagConstraints();
			gbc_textFieldIme.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldIme.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldIme.gridx = 4;
			gbc_textFieldIme.gridy = 1;
			contentPanel.add(textFieldIme, gbc_textFieldIme);
			textFieldIme.setColumns(10);
		}
		{
			JLabel lblPrezime = new JLabel("Prezime");
			lblPrezime.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_lblPrezime = new GridBagConstraints();
			gbc_lblPrezime.insets = new Insets(0, 0, 5, 5);
			gbc_lblPrezime.gridx = 2;
			gbc_lblPrezime.gridy = 3;
			contentPanel.add(lblPrezime, gbc_lblPrezime);
		}
		{
			textFieldPrezime = new JTextField();
			textFieldPrezime.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char input = e.getKeyChar();

					if (!((input >= 65 && input <= 90) 
							|| (input >= 97 && input <= 122) 
							|| input == KeyEvent.VK_SPACE
							|| input == KeyEvent.VK_BACK_SPACE)) {
//						e.consume() sprecava ispisivanje u text field-u
						e.consume();
					}
				}
			});
			textFieldPrezime.setFont(new Font("Tahoma", Font.PLAIN, 16));
			GridBagConstraints gbc_textFieldPrezime = new GridBagConstraints();
			gbc_textFieldPrezime.insets = new Insets(0, 0, 5, 5);
			gbc_textFieldPrezime.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldPrezime.gridx = 4;
			gbc_textFieldPrezime.gridy = 3;
			contentPanel.add(textFieldPrezime, gbc_textFieldPrezime);
			textFieldPrezime.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
