package myquoter_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Stack;
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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JSpinner;

public class MyQuoter1_7 extends JFrame {

	private JPanel contentPane;
	private JComboBox<String> patterns;
	private JButton add_for_total_btn;
	private JRadioButton upsRadioBtn;
	private Box shipping_methods;
	private JScrollPane scrollPane_for_textfield;
	private JRadioButton usps_mediumbox;
	private JRadioButton usps_standard_shipping;
	private JRadioButton usps_express_shipping;
	private JTextArea total;
	private JTextField ups_textField;
	private JComboBox<String> bundles_and_wigs_lengths;
	private JComboBox<String> closure_and_frontal_lengths;
	private int quantity; 
	private Stack<String> orderStack = new Stack<String>();
	private JButton clearBtn;
	private JButton gobackBtn;
	private JSpinner spinner;
	
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
		setBounds(100, 100, 597, 665);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		upsRadioBtn = new JRadioButton("UPS/FedEx");
		
		shipping_methods = Box.createVerticalBox();
		
		scrollPane_for_textfield = new JScrollPane();
		
		bundles_and_wigs_lengths = new JComboBox<String>();
		bundles_and_wigs_lengths.setMaximumRowCount(11);
		bundles_and_wigs_lengths.addItem("10\"");bundles_and_wigs_lengths.addItem("12\"");bundles_and_wigs_lengths.addItem("14\"");bundles_and_wigs_lengths.addItem("16\"");bundles_and_wigs_lengths.addItem("18\"");
		bundles_and_wigs_lengths.addItem("20\"");bundles_and_wigs_lengths.addItem("22\"");bundles_and_wigs_lengths.addItem("24\"");bundles_and_wigs_lengths.addItem("26\"");bundles_and_wigs_lengths.addItem("28\"");bundles_and_wigs_lengths.addItem("30\"");
		
		
		closure_and_frontal_lengths = new JComboBox<String>();
		closure_and_frontal_lengths.setMaximumRowCount(6);
		closure_and_frontal_lengths.addItem("10\"");closure_and_frontal_lengths.addItem("12\"");closure_and_frontal_lengths.addItem("14\"");
		closure_and_frontal_lengths.addItem("16\"");closure_and_frontal_lengths.addItem("18\"");closure_and_frontal_lengths.addItem("20\"");
		
		patterns = new JComboBox<>();
		patterns.setMaximumRowCount(30);
		patterns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent choose) {
				try {
										
					if(patterns.getSelectedIndex() >= 0 && patterns.getSelectedIndex() <= 8) {
						bundles_and_wigs_lengths.setEnabled(true);
						closure_and_frontal_lengths.setEnabled(false);
					}
					if(patterns.getSelectedIndex() >= 9 && patterns.getSelectedIndex() <= 29) {
						closure_and_frontal_lengths.setEnabled(true);
						bundles_and_wigs_lengths.setEnabled(false);
					}
					if(patterns.getSelectedIndex() >= 30 && patterns.getSelectedIndex() <= 43) {
						bundles_and_wigs_lengths.setEnabled(true);
						closure_and_frontal_lengths.setEnabled(false);
					}
					if(patterns.getSelectedIndex() >= 44 && patterns.getSelectedIndex() <= 46) {
						bundles_and_wigs_lengths.setEnabled(true);
						closure_and_frontal_lengths.setEnabled(false);
					}
					
					//orderStack.push(patterns.getItemAt(patterns.getSelectedIndex()));
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		
						
		//bundles
		patterns.addItem("Straight");patterns.addItem("Loose Wave");patterns.addItem("Body Wave");patterns.addItem("Deep Wave");
		patterns.addItem("Rare Curly");patterns.addItem("Steam #1");patterns.addItem("Steam #2");patterns.addItem("Blonde");patterns.addItem("Grey");
		//closures 
		patterns.addItem("Straight Closure");patterns.addItem("Loose Wave Closure");patterns.addItem("Body Wave Closure");
		patterns.addItem("Deep Wave Closure");patterns.addItem("Rare Curly Closure");patterns.addItem("Steam #1 Closure");
		patterns.addItem("Steam #2 Closure");patterns.addItem("Blonde Closure");patterns.addItem("Grey Closure");
		
		patterns.addItem("Straight 5x5 Closure");patterns.addItem("Loose Wave 5x5 Closure");patterns.addItem("Body Wave 5x5 Closure");
		patterns.addItem("Deep Wave 5x5 Closure");patterns.addItem("Rare Curly 5x5 Closure");
		
		//frontals
		patterns.addItem("Straight Frontal");patterns.addItem("Loose Wave Frontal");patterns.addItem("Body Wave Frontal");
		patterns.addItem("Deep Wave Frontal");patterns.addItem("Rare Curly Frontal");patterns.addItem("Steam #1 Frontal");patterns.addItem("Steam #2 Frontal");
		patterns.addItem("Blonde Frontal");patterns.addItem("Grey Frontal");
		
		//wigs
		patterns.addItem("Straight Closure Wig");patterns.addItem("Loose Wave Closure Wig");patterns.addItem("Body Wave Closure Wig");
		patterns.addItem("Deep Wave Closure Wig");patterns.addItem("Rare Curly Closure Wig");patterns.addItem("Steam #1 Closure Wig");patterns.addItem("Steam #2 Closure Wig");
		
		patterns.addItem("Straight Frontal Wig");patterns.addItem("Loose Wave Frontal Wig");patterns.addItem("Body Wave Frontal Wig");
		patterns.addItem("Deep Wave Frontal Wig");patterns.addItem("Rare Curly Frontal Wig");patterns.addItem("Steam #1 Frontal Wig");patterns.addItem("Steam #2 Frontal Wig");
		
		//clip-in
		patterns.addItem("Body wave clip-in");patterns.addItem("Rare curly clip-in");patterns.addItem("Steam curly clip-in");
		
		add_for_total_btn = new JButton("ADD FOR TOTAL");
		add_for_total_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent add) {
				try {

					if(!orderStack.contains(patterns.getItemAt(patterns.getSelectedIndex())))
					{
						if(bundles_and_wigs_lengths.isEnabled() == true && closure_and_frontal_lengths.isEnabled() == false) {
							orderStack.push(patterns.getItemAt(patterns.getSelectedIndex()));
							orderStack.push(bundles_and_wigs_lengths.getItemAt(bundles_and_wigs_lengths.getSelectedIndex()) + " x " + spinner.getValue().toString());
						}
						if(bundles_and_wigs_lengths.isEnabled() == false && closure_and_frontal_lengths.isEnabled() == true) {
							orderStack.push(patterns.getItemAt(patterns.getSelectedIndex()));
							orderStack.push(closure_and_frontal_lengths.getItemAt(closure_and_frontal_lengths.getSelectedIndex()) + " x " + spinner.getValue().toString());
						}
						total.append(
								patterns.getItemAt(patterns.getSelectedIndex()) + "\n" +
								bundles_and_wigs_lengths.getItemAt(bundles_and_wigs_lengths.getSelectedIndex()) + " x " + spinner.getValue().toString() + "\n");
					}
					else 
					{
						if(bundles_and_wigs_lengths.isEnabled() == true && closure_and_frontal_lengths.isEnabled() == false) {
							orderStack.push(bundles_and_wigs_lengths.getItemAt(bundles_and_wigs_lengths.getSelectedIndex()) + " x " + spinner.getValue().toString());
						}
						if(bundles_and_wigs_lengths.isEnabled() == false && closure_and_frontal_lengths.isEnabled() == true) {
							orderStack.push(closure_and_frontal_lengths.getItemAt(closure_and_frontal_lengths.getSelectedIndex()) + " x " + spinner.getValue().toString());
						}
						total.append(bundles_and_wigs_lengths.getItemAt(bundles_and_wigs_lengths.getSelectedIndex()) + " x " + spinner.getValue().toString() + "\n");

					}

				}catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		
		ups_textField = new JTextField();
		ups_textField.setColumns(10);
		
		clearBtn = new JButton("CLEAR");
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				patterns.setSelectedIndex(0);
				bundles_and_wigs_lengths.setSelectedIndex(0);
				closure_and_frontal_lengths.setSelectedIndex(0);
				bundles_and_wigs_lengths.setEnabled(true);
				closure_and_frontal_lengths.setEnabled(false);
				spinner.setValue(0);
				usps_mediumbox.setSelected(false);
				usps_standard_shipping.setSelected(false);
				usps_express_shipping.setSelected(false);
				ups_textField.setText(null);
				upsRadioBtn.setSelected(false);
				total.setText(null);
				orderStack.removeAllElements();
			}
		});
		
		gobackBtn = new JButton("GO BACK");
		gobackBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderStack.pop();
				total.setText(null);
				for(String str : orderStack) {
					total.append(str+"\n");
				}
			}
		});
		
		spinner = new JSpinner();
	
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(scrollPane_for_textfield, GroupLayout.PREFERRED_SIZE, 518, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(add_for_total_btn, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
										.addComponent(patterns, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(bundles_and_wigs_lengths, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(closure_and_frontal_lengths, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
											.addGap(123)))
									.addGap(27))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(shipping_methods, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(gobackBtn)
										.addComponent(clearBtn)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(ups_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(upsRadioBtn, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)))))
							.addContainerGap(36, Short.MAX_VALUE))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addComponent(patterns, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(bundles_and_wigs_lengths, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(closure_and_frontal_lengths, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(14)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(add_for_total_btn, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(clearBtn, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(gobackBtn, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
									.addGap(8))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(shipping_methods, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(ups_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(upsRadioBtn, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))))
					.addGap(18)
					.addComponent(scrollPane_for_textfield, GroupLayout.PREFERRED_SIZE, 314, GroupLayout.PREFERRED_SIZE)
					.addGap(22))
		);
		total = new JTextArea();
		total.setWrapStyleWord(true);
		total.setLineWrap(true);
		scrollPane_for_textfield.setViewportView(total);
		
		usps_mediumbox = new JRadioButton("USPS Medium Box");
		shipping_methods.add(usps_mediumbox);
		
		usps_standard_shipping = new JRadioButton("USPS Standard Shipping ");
		shipping_methods.add(usps_standard_shipping);
		
		usps_express_shipping = new JRadioButton("USPS Express Shipping ");
		shipping_methods.add(usps_express_shipping);
		contentPane.setLayout(gl_contentPane);
		
	}
}
