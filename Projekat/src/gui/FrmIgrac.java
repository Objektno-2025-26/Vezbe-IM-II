package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrmIgrac extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private DefaultListModel<String> dlm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmIgrac frame = new FrmIgrac();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmIgrac() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 398);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorth = new JPanel();
		panelNorth.setBackground(new Color(197, 197, 226));
		contentPane.add(panelNorth, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("Forma za dodavanje igraca");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panelNorth.add(lblTitle);
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(new Color(197, 197, 226));
		contentPane.add(panelCenter, BorderLayout.CENTER);
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[]{30, 0, 20, 0, 20, 0, 30, 0};
		gbl_panelCenter.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panelCenter.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelCenter.rowWeights = new double[]{2.0, 1.0, 1.0, 1.0, 2.0, Double.MIN_VALUE};
		panelCenter.setLayout(gbl_panelCenter);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Dodaj igraca");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(chckbxNewCheckBox.isSelected());
			}
		});
		chckbxNewCheckBox.setBackground(new Color(197, 197, 226));
		chckbxNewCheckBox.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 1;
		gbc_chckbxNewCheckBox.gridy = 1;
		panelCenter.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char input = e.getKeyChar();
				
				if( !((input >= 65 && input <= 90) || (input>=97 && input <= 122)
						|| input == KeyEvent.VK_ENTER 
						|| input == KeyEvent.VK_SPACE
						|| input == KeyEvent.VK_BACK_SPACE)
						) {
					System.out.print(input + " ");
//					e.consume() sprecava ispisivanje u text field-u
					e.consume();
				}else{
					if(input == KeyEvent.VK_ENTER) {
						dlm.add(0, textField.getText());
						textField.setText("");
					}
				};
			}
		});
		textField.setEnabled(false);
		textField.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 1;
		panelCenter.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.gridheight = 3;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 5;
		gbc_scrollPane.gridy = 1;
		panelCenter.add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		dlm = new DefaultListModel<String>();
		list.setModel(dlm);
		list.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		scrollPane.setViewportView(list);
		
		JLabel lblNewLabel = new JLabel("Igraci");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 3;
		panelCenter.add(lblNewLabel, gbc_lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.add(0, comboBox.getSelectedItem().toString());
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Erling Haland", "Mohamed Salah", "Kilijan Mbape"}));
		comboBox.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 3;
		panelCenter.add(comboBox, gbc_comboBox);
		
		JPanel panelSouth = new JPanel();
		panelSouth.setBackground(new Color(197, 197, 226));
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JButton btnAdd = new JButton("Dodaj igraca");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelSouth.add(btnAdd);
		
		JButton btnModify = new JButton("Modifikacija");
		btnModify.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelSouth.add(btnModify);
	}

}
