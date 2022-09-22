package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorTest frame = new CalculatorTest();
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
	public CalculatorTest() {
		setTitle("나의 계산기 v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 311, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.BOLD, 16));
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0");
		textField.setBounds(12, 21, 261, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton.setBounds(12, 85, 56, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton_1.setBounds(80, 85, 56, 42);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton_2.setBounds(148, 85, 56, 42);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton_3.setBounds(216, 85, 56, 42);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton_4.setBounds(12, 137, 56, 42);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton_5.setBounds(80, 137, 56, 42);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton_6.setBounds(148, 137, 56, 42);
		contentPane.add(btnNewButton_6);
		
		JButton btnX = new JButton("X");
		btnX.setFont(new Font("Algerian", Font.BOLD, 14));
		btnX.setBounds(216, 137, 57, 42);
		contentPane.add(btnX);
		
		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setBounds(12, 189, 56, 42);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("2");
		btnNewButton_9.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton_9.setBounds(80, 189, 56, 42);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("3");
		btnNewButton_10.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton_10.setBounds(148, 189, 56, 42);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton_11.setBounds(216, 189, 56, 42);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("0");
		btnNewButton_12.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton_12.setBounds(12, 241, 56, 42);
		contentPane.add(btnNewButton_12);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("굴림", Font.BOLD, 14));
		btnC.setBounds(80, 241, 56, 42);
		contentPane.add(btnC);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton_14.setBounds(148, 241, 56, 42);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("+");
		btnNewButton_15.setFont(new Font("굴림", Font.BOLD, 14));
		btnNewButton_15.setBounds(216, 241, 56, 42);
		contentPane.add(btnNewButton_15);
	}
}
