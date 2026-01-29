package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FrmTest extends JFrame {

	private JPanel contentPane;
	private DefaultListModel<String> dlm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmTest frame = new FrmTest();
					frame.setLocationRelativeTo(null);
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
	public FrmTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		setTitle("Prve Swing vezbe");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelNorth = new JPanel();
		panelNorth.setBackground(new Color(0, 97, 193));
		contentPane.add(panelNorth, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("Vezbe iz Swing-a");
		lblTitle.setFont(new Font("Arial", Font.BOLD, 22));
		panelNorth.add(lblTitle);
		
		JPanel panelSouth = new JPanel();
		panelSouth.setBackground(new Color(0, 97, 193));
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JButton btnPopup = new JButton("Popup Dugme");
		btnPopup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Pritisnuli ste popup dugme!");
			}
		});
		btnPopup.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panelSouth.add(btnPopup);
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(new Color(252, 238, 207));
		contentPane.add(panelCenter, BorderLayout.CENTER);
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[]{20, 0, 80, 0, 20, 0};
		gbl_panelCenter.rowHeights = new int[]{20, 0, 12, 0, 12, 0, 20, 0};
		gbl_panelCenter.columnWeights = new double[]{0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelCenter.rowWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		panelCenter.setLayout(gbl_panelCenter);
		
		JButton btnCrvena = new JButton("Crvena");
		btnCrvena.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnCrvena.setBackground(Color.red);
				btnCrvena.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnCrvena.setBackground(Color.white);
				btnCrvena.setForeground(Color.red);
			}
		});
		btnCrvena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCenter.setBackground(Color.red);
				dlm.add(0, dlm.size()+1 + ": " + btnCrvena.getText());
			}
		});
		btnCrvena.setBackground(new Color(255, 255, 255));
		btnCrvena.setForeground(new Color(255, 0, 0));
		btnCrvena.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnCrvena = new GridBagConstraints();
		gbc_btnCrvena.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCrvena.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrvena.gridx = 1;
		gbc_btnCrvena.gridy = 1;
		panelCenter.add(btnCrvena, gbc_btnCrvena);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 5;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 3;
		gbc_scrollPane.gridy = 1;
		panelCenter.add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		dlm = new DefaultListModel<String>();
		list.setModel(dlm);
		scrollPane.setViewportView(list);
		
		JButton btnPlava = new JButton("Plava");
		btnPlava.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPlava.setBackground(Color.blue);
				btnPlava.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnPlava.setBackground(Color.white);
				btnPlava.setForeground(Color.blue);
			}
		});
		btnPlava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCenter.setBackground(Color.blue);
				dlm.add(0, dlm.size()+1 + ": " + btnPlava.getText());
			}
		});
		btnPlava.setBackground(new Color(255, 255, 255));
		btnPlava.setForeground(new Color(0, 0, 255));
		btnPlava.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnPlava = new GridBagConstraints();
		gbc_btnPlava.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPlava.insets = new Insets(0, 0, 5, 5);
		gbc_btnPlava.gridx = 1;
		gbc_btnPlava.gridy = 3;
		panelCenter.add(btnPlava, gbc_btnPlava);
		
		JButton btnZuta = new JButton("Zuta");
		btnZuta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnZuta.setBackground(Color.yellow);
				btnZuta.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnZuta.setBackground(Color.white);
				btnZuta.setForeground(Color.yellow);
			}
		});
		btnZuta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelCenter.setBackground(Color.yellow);
				dlm.add(0, dlm.size()+1 + ": " + btnZuta.getText());
			}
		});
		btnZuta.setBackground(new Color(255, 255, 255));
		btnZuta.setForeground(new Color(255, 255, 0));
		btnZuta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_btnZuta = new GridBagConstraints();
		gbc_btnZuta.insets = new Insets(0, 0, 5, 5);
		gbc_btnZuta.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnZuta.gridx = 1;
		gbc_btnZuta.gridy = 5;
		panelCenter.add(btnZuta, gbc_btnZuta);
	}

}
