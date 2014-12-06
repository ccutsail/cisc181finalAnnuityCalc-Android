import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class MCalcGUI{

	protected JFrame frame;
	protected JTextField GrossIncome;
	protected JTextField totmodebt;
	protected JTextField intrate;
	protected JTextField dpmt;
	private JTextField afrdbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MCalcGUI window = new MCalcGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MCalcGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGrossIncome = new JLabel("Total Gross Income");
		lblGrossIncome.setBounds(10, 29, 111, 14);
		frame.getContentPane().add(lblGrossIncome);
		
		JLabel lblMonthlyDebt = new JLabel("Total Monthly Debt");
		lblMonthlyDebt.setBounds(10, 66, 137, 14);
		frame.getContentPane().add(lblMonthlyDebt);
		
		JLabel lblInterestRate = new JLabel("Interest Rate");
		lblInterestRate.setBounds(10, 101, 91, 14);
		frame.getContentPane().add(lblInterestRate);
		
		JLabel lblTerm = new JLabel("Term");
		lblTerm.setBounds(10, 133, 46, 14);
		frame.getContentPane().add(lblTerm);
		
		GrossIncome = new JTextField();
		GrossIncome.setBounds(181, 26, 86, 20);
		frame.getContentPane().add(GrossIncome);
		GrossIncome.setColumns(10);
		
		totmodebt = new JTextField();
		totmodebt.setBounds(181, 63, 86, 20);
		frame.getContentPane().add(totmodebt);
		totmodebt.setColumns(10);
		
		intrate = new JTextField();
		intrate.setBounds(181, 98, 86, 20);
		frame.getContentPane().add(intrate);
		intrate.setColumns(10);
		dpmt = new JTextField();
		dpmt.setText("0");
		dpmt.setBounds(181, 165, 86, 20);
		frame.getContentPane().add(dpmt);
		dpmt.setColumns(10);
		
		final JTextField afrdbl = new JTextField();
		afrdbl.setBounds(181, 208, 86, 20);
		frame.getContentPane().add(afrdbl);
		afrdbl.setColumns(14);
		afrdbl.setEditable(false);
		
		

		ArrayList<Integer> terms = new ArrayList<Integer>();
		terms.add(10);
		terms.add(15);
		terms.add(20);
		terms.add(30);
		final JComboBox<Object> n = new JComboBox<Object>(terms.toArray());
		n.setBounds(181, 130, 56, 20);
		frame.getContentPane().add(n);
		 n.addActionListener(new java.awt.event.ActionListener(){


			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Integer term = (Integer)n.getSelectedItem();
				String grosIncome = GrossIncome.getText();
				String monthDebt = totmodebt.getText();
				String intRate = intrate.getText();
				String downPmt = dpmt.getText();
				Integer grossIncome = Integer.parseInt(grosIncome);
				Integer monthlyDebt = Integer.parseInt(monthDebt);
				Double r = Double.parseDouble(intRate);
				Integer dwnPmt = Integer.parseInt(downPmt);
				double eighteen_percent = Calc.HousingPayment(grossIncome);
				double thirtysix = Calc.debtPayments(grossIncome, monthlyDebt);
		        double pmtAllowed = Calc.canSpend(eighteen_percent, thirtysix);
		        Double mortgage = Calc.mortgageAllowed(pmtAllowed, dwnPmt,r, term);
		        DecimalFormat format = new DecimalFormat("#0.00");
		        String mrg = format.format(mortgage);
		        afrdbl.setText(mrg);
			}});
		 
		JLabel lblDownPayment = new JLabel("Down Payment");
		lblDownPayment.setBounds(10, 168, 91, 14);
		frame.getContentPane().add(lblDownPayment);
		
		
		JLabel lblAffordableHousePrice = new JLabel("Affordable House Price");
		lblAffordableHousePrice.setBounds(10, 211, 137, 14);
		frame.getContentPane().add(lblAffordableHousePrice);
	}


		}
