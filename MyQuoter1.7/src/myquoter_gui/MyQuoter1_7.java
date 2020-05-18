package myquoter_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyQuoter1_7 extends JFrame {

	private JPanel contentPane;
	private JTextField quantity_textField;
	private JComboBox<String> patterns;
	private JButton add_for_total_btn;
	private JRadioButton upsRadioBtn;
	private Box shipping_methods;
	private JButton calculate_btn;
	private JScrollPane scrollPane_for_textfield;
	private JRadioButton usps_mediumbox;
	private JRadioButton usps_standard_shipping;
	private JRadioButton usps_express_shipping;
	private JTextArea result_textfield;
	private JTextField ups_textField;
	private JComboBox<String> bundles_and_wigs_lengths;
	private JComboBox<String> closure_and_frontal_lengths;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyQuoter1_7 frame = new MyQuoter1_7();
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
	public MyQuoter1_7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 796, 665);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		quantity_textField = new JTextField();
		quantity_textField.setText("Quantity");
		quantity_textField.setColumns(10);
		
		add_for_total_btn = new JButton("Add For Total");
		
		upsRadioBtn = new JRadioButton("UPS");
		
		shipping_methods = Box.createVerticalBox();
		
		calculate_btn = new JButton("Calculate");
		calculate_btn.setFont(new Font("Open Sans Extrabold", Font.PLAIN, 24));
		
		scrollPane_for_textfield = new JScrollPane();
		
		bundles_and_wigs_lengths = new JComboBox<String>();
		bundles_and_wigs_lengths.addItem("10\"");bundles_and_wigs_lengths.addItem("12\"");bundles_and_wigs_lengths.addItem("14\"");bundles_and_wigs_lengths.addItem("16\"");bundles_and_wigs_lengths.addItem("18\"");
		bundles_and_wigs_lengths.addItem("20\"");bundles_and_wigs_lengths.addItem("22\"");bundles_and_wigs_lengths.addItem("24\"");bundles_and_wigs_lengths.addItem("26\"");bundles_and_wigs_lengths.addItem("28\"");bundles_and_wigs_lengths.addItem("30\"");
		
		closure_and_frontal_lengths = new JComboBox<String>();
		closure_and_frontal_lengths.addItem("10\"");closure_and_frontal_lengths.addItem("12\"");closure_and_frontal_lengths.addItem("14\"");
		closure_and_frontal_lengths.addItem("16\"");closure_and_frontal_lengths.addItem("18\"");closure_and_frontal_lengths.addItem("20\"");
		
		patterns = new JComboBox<>();
		patterns.setMaximumRowCount(20);
		patterns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent choose) {
				try {
					if(patterns.getSelectedIndex() >= 0 && patterns.getSelectedIndex() <= 7) {
						bundles_and_wigs_lengths.setEnabled(true);
						closure_and_frontal_lengths.setEnabled(false);
					}
					if(patterns.getSelectedIndex() >= 8 && patterns.getSelectedIndex() <= 28) {
						closure_and_frontal_lengths.setEnabled(true);
						bundles_and_wigs_lengths.setEnabled(false);
					}
					if(patterns.getSelectedIndex() >= 29 && patterns.getSelectedIndex() <= 42) {
						bundles_and_wigs_lengths.setEnabled(true);
						closure_and_frontal_lengths.setEnabled(false);
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		
						
		//bundles
		patterns.addItem("Straight");patterns.addItem("Loose Wave");patterns.addItem("Body Wave");patterns.addItem("Deep Wave");
		patterns.addItem("Rare Curly");patterns.addItem("Steam #1");patterns.addItem("Steam #2");patterns.addItem("Blonde");
		//closures 
		patterns.addItem("Straight Closure");patterns.addItem("Loose Wave Closure");patterns.addItem("Body Wave Closure");
		patterns.addItem("Deep Wave Closure");patterns.addItem("Rare Curly Closure");patterns.addItem("Steam #1 Closure");
		patterns.addItem("Steam #2 Closure");patterns.addItem("Blonde Closure");
		
		patterns.addItem("Straight 5x5 Closure");patterns.addItem("Loose Wave 5x5 Closure");patterns.addItem("Body Wave 5x5 Closure");
		patterns.addItem("Deep Wave 5x5 Closure");patterns.addItem("Rare Curly 5x5 Closure");
		
		//frontals
		patterns.addItem("Straight Frontal");patterns.addItem("Loose Wave Frontal");patterns.addItem("Body Wave Frontal");
		patterns.addItem("Deep Wave Frontal");patterns.addItem("Rare Curly Frontal");patterns.addItem("Steam #1 Frontal");patterns.addItem("Steam #2 Frontal");
		patterns.addItem("Blonde Frontal");
		
		//wigs
		patterns.addItem("Straight Closure Wig");patterns.addItem("Loose Wave Closure Wig");patterns.addItem("Body Wave Closure Wig");
		patterns.addItem("Deep Wave Closure Wig");patterns.addItem("Rare Curly Closure Wig");patterns.addItem("Steam #1 Closure Wig");patterns.addItem("Steam #2 Closure Wig");
		
		patterns.addItem("Straight Frontal Wig");patterns.addItem("Loose Wave Frontal Wig");patterns.addItem("Body Wave Frontal Wig");
		patterns.addItem("Deep Wave Frontal Wig");patterns.addItem("Rare Curly Frontal Wig");patterns.addItem("Steam #1 Frontal Wig");patterns.addItem("Steam #2 Frontal Wig");
		
		ups_textField = new JTextField();
		ups_textField.setColumns(10);
	
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(patterns, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
								.addComponent(quantity_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(bundles_and_wigs_lengths, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(closure_and_frontal_lengths, Alignment.LEADING, 0, 115, Short.MAX_VALUE)))
							.addGap(113)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(shipping_methods, GroupLayout.PREFERRED_SIZE, 224, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(10)
											.addComponent(calculate_btn, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(28)
											.addComponent(add_for_total_btn, GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
											.addGap(77)))
									.addGap(80))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(ups_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(upsRadioBtn, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
							.addGap(256))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(scrollPane_for_textfield, GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
							.addGap(165))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(77)
							.addComponent(patterns, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(bundles_and_wigs_lengths, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(72)
									.addComponent(quantity_textField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(closure_and_frontal_lengths, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(151))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(39)
							.addComponent(add_for_total_btn, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
							.addGap(28)
							.addComponent(shipping_methods, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(ups_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(upsRadioBtn, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
							.addGap(23)
							.addComponent(calculate_btn, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
					.addGap(18)
					.addComponent(scrollPane_for_textfield, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
					.addGap(18))
		);
		
		result_textfield = new JTextArea();
		result_textfield.setWrapStyleWord(true);
		result_textfield.setLineWrap(true);
		scrollPane_for_textfield.setViewportView(result_textfield);
		
		usps_mediumbox = new JRadioButton("USPS Medium Box");
		shipping_methods.add(usps_mediumbox);
		
		usps_standard_shipping = new JRadioButton("USPS Standard Shipping ");
		shipping_methods.add(usps_standard_shipping);
		
		usps_express_shipping = new JRadioButton("USPS Express Shipping ");
		shipping_methods.add(usps_express_shipping);
		contentPane.setLayout(gl_contentPane);
	}
}
