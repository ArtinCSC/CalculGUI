
/**
 * Driver
 * A GUI calculator Program to evaluate simple expressions. simple expression may include +,-,*,/, ., and parenthesis.
 * Artin Malekian
 * Dr. Hoang
 * CSC 201 - Assignment#4
 * 12+1 December 2016
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {

	public static final int WIDTH = 250;
	public static final int HEIGHT = 300;
	private JTextField numberLineField;
	private double result = 0;

	public Calculator() {
		//super("calc");

		setSize(WIDTH, HEIGHT); // size of the window
		addWindowListener(new WindowDestroyer());
		setTitle("Calculator");
		Container contentPane = getContentPane();

		contentPane.setLayout(new FlowLayout());

		contentPane.setBackground(Color.LIGHT_GRAY);

		JPanel numberPanel = new JPanel();
		numberPanel.setLayout(new FlowLayout());

		numberLineField = new JTextField("0.00", 20); // size of the button
		numberPanel.add(numberLineField);
		contentPane.add(numberPanel, BorderLayout.NORTH);

		numberLineField.addKeyListener(new KeyAdapter() { // the keyboard that
															// user not allow to
															// click
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if ((((c < '(') || (c > '9')))

						&& (c != KeyEvent.VK_BACK_SPACE) // && (c !=
															// KeyEvent.VK_ENTER)

						|| (c == ',')) {
					e.consume(); // ignore event
				}
			}
		});

		JButton clearButton = new JButton("C");
		clearButton.addActionListener(this);
		contentPane.add(clearButton);

		JButton parenOpeButton = new JButton("(");
		parenOpeButton.addActionListener(this);
		contentPane.add(parenOpeButton);

		JButton parenCloButton = new JButton(")");
		parenCloButton.addActionListener(this);
		contentPane.add(parenCloButton);

		JButton dvidButton = new JButton("/");
		dvidButton.addActionListener(this);
		contentPane.add(dvidButton);

		JButton multipButton = new JButton("x");
		multipButton.addActionListener(this);
		contentPane.add(multipButton);

		JButton subtracButton = new JButton("-");
		subtracButton.addActionListener(this);
		contentPane.add(subtracButton);

		JButton equalButton = new JButton("=");
		equalButton.addActionListener(this);
		contentPane.add(equalButton);

		JButton periodButton = new JButton(".");
		periodButton.addActionListener(this);
		contentPane.add(periodButton);

		JButton addButton = new JButton("+");
		addButton.addActionListener(this);
		contentPane.add(addButton);

		JButton sevenButton = new JButton("7");
		sevenButton.addActionListener(this);
		contentPane.add(sevenButton);

		JButton eightButton = new JButton("8");
		eightButton.addActionListener(this);
		contentPane.add(eightButton);

		JButton nineButton = new JButton("9");
		nineButton.addActionListener(this);
		contentPane.add(nineButton);

		JButton fourButton = new JButton("4");
		fourButton.addActionListener(this);
		contentPane.add(fourButton);

		JButton fiveButton = new JButton("5");
		fiveButton.addActionListener(this);
		contentPane.add(fiveButton);

		JButton sixButton = new JButton("6");
		sixButton.addActionListener(this);
		contentPane.add(sixButton);

		JButton oneButton = new JButton("1");
		oneButton.addActionListener(this);
		contentPane.add(oneButton);

		JButton twoButton = new JButton("2");
		twoButton.addActionListener(this);
		contentPane.add(twoButton);

		JButton threeButton = new JButton("3");
		threeButton.addActionListener(this);
		contentPane.add(threeButton);

		JButton zeroButton = new JButton("0");
		zeroButton.addActionListener(this);
		zeroButton.setLayout(new GridLayout(10, 5));
		contentPane.add(zeroButton);

	}

	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if (actionCommand.equals("C")) {
			result = 0.00;
			numberLineField.setText("0.00");
		} else if (actionCommand.equals("=")) {
			result = ExpressionSolver.solve(numberLineField.getText());
			numberLineField.setText(Double.toString(result));
		} else if (e.getActionCommand().equals("(")) {
			numberLineField.setText(numberLineField.getText() + "(");
		} else if (actionCommand.equals(")")) {
			numberLineField.setText(numberLineField.getText() + ")");
		} else if (actionCommand.equals("/")) {
			numberLineField.setText(numberLineField.getText() + "/");
		} else if (actionCommand.equals("x")) {
			numberLineField.setText(numberLineField.getText() + "*");
		} else if (actionCommand.equals("-")) {
			numberLineField.setText(numberLineField.getText() + "-");
		} else if (actionCommand.equals("+")) {
			numberLineField.setText(numberLineField.getText() + "+");
		} else if (actionCommand.equals("1")) {
			numberLineField.setText(numberLineField.getText() + "1");
		} else if (actionCommand.equals("2")) {
			numberLineField.setText(numberLineField.getText() + "2");
		} else if (actionCommand.equals("3")) {
			numberLineField.setText(numberLineField.getText() + "3");
		} else if (actionCommand.equals("4")) {
			numberLineField.setText(numberLineField.getText() + "4");
		} else if (actionCommand.equals("5")) {
			numberLineField.setText(numberLineField.getText() + "5");
		} else if (actionCommand.equals("6")) {
			numberLineField.setText(numberLineField.getText() + "6");
		} else if (actionCommand.equals("7")) {
			numberLineField.setText(numberLineField.getText() + "7");
		} else if (actionCommand.equals("8")) {
			numberLineField.setText(numberLineField.getText() + "8");
		} else if (actionCommand.equals("9")) {
			numberLineField.setText(numberLineField.getText() + "9");
		} else if (actionCommand.equals("0")) {
			numberLineField.setText(numberLineField.getText() + "0");
		} else if (actionCommand.equals(".")) {
			numberLineField.setText(numberLineField.getText() + ".");
		}
	}

	public static void main(String[] args) {
		Calculator guiCalculator = new Calculator();
		guiCalculator.setVisible(true);
	}
}
