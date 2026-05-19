package pekan7_2511532024;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class InsertionSortGUI_2511532024 extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane_2024;
	private int[] array_2024;
	private JLabel[] labelArray_2024;
	JButton stepButton_2024;
	private JButton resetButton_2024;
	JButton setButton_2024;
	private JTextField inputField_2024;
	private JPanel panelArray_2024;
	private JTextArea stepArea_2024;
	
	private int i_2024 = 1, j_2024;
	private boolean sorting_2024 = false;
	private int stepCount_2024 = 1;
	

	/**
	 * Create the frame.
	 */
	public InsertionSortGUI_2511532024() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 307);
		contentPane_2024 = new JPanel();
		contentPane_2024.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_2024);
		contentPane_2024.setLayout(null);
		setTitle("Insertion sort langkah per langkah");
		setSize(750, 400);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		// panel input
		JPanel inputPanel = new JPanel(new FlowLayout());
		inputField_2024 = new JTextField(30);
		setButton_2024 = new JButton ("Set Array");
		inputPanel.add(new JLabel("Masukkan angka (pisahkan dengan koma): "));
		inputPanel.add(inputField_2024);
		inputPanel.add(setButton_2024);
		
		// panel array visual
		panelArray_2024 = new JPanel();
		panelArray_2024.setLayout(new FlowLayout());
		
		// panel kontrol
		JPanel controlPanel = new JPanel();
		stepButton_2024 = new JButton("Langkah Selanjutnya");
		resetButton_2024 = new JButton("Reset");
		stepButton_2024.setEnabled(false);
		controlPanel.add(stepButton_2024);
		controlPanel.add(resetButton_2024);
		
		// area teks untuk log langkah-langkah
		stepArea_2024 = new JTextArea(8,60);
		stepArea_2024.setEditable(false);
		stepArea_2024.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane = new JScrollPane(stepArea_2024);
		
		// tambahkan ke panel ke frame
		add(inputPanel, BorderLayout.NORTH);
		add(panelArray_2024, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);
		add(scrollPane, BorderLayout.EAST);
		
		// event set array
		setButton_2024.addActionListener(e -> setArrayFromInput_2024());
		
		// event langkah selanjutnya
		stepButton_2024.addActionListener(e -> performStep_2024());
		
		// event reset
		resetButton_2024.addActionListener(e -> reset_2024());
		
	}
	
	private void setArrayFromInput_2024 () {
		String text = inputField_2024.getText().trim();
		if (text.isEmpty()) return;
		String[] parts = text.split(",");
		array_2024 = new int[parts.length];
		try {
			for (int k_2024 = 0; k_2024 < parts.length; k_2024++) {
				array_2024[k_2024] = Integer.parseInt(parts[k_2024].trim()); }
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkah " + "dengan koma!", "Error",
						JOptionPane.ERROR_MESSAGE);
				return;	}
		i_2024 = 1;
		stepCount_2024 = 1;
		sorting_2024 = true;
		stepButton_2024.setEnabled(true);
		stepArea_2024.setText("");
		panelArray_2024.removeAll();
		labelArray_2024 = new JLabel[array_2024.length];
		for (int k_2024 = 0; k_2024 < array_2024.length; k_2024++) {
			labelArray_2024[k_2024] = new JLabel (String.valueOf(array_2024[k_2024]));
			labelArray_2024[k_2024].setFont(new Font ("Arial", Font.BOLD, 24));
			labelArray_2024[k_2024].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_2024[k_2024].setPreferredSize(new Dimension(50, 50));
			labelArray_2024[k_2024].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_2024.add(labelArray_2024[k_2024]);
		}
		panelArray_2024.revalidate();
		panelArray_2024.repaint();
	}
	
	private void performStep_2024() {
		if (i_2024 < array_2024.length && sorting_2024) {
			int key_2024 = array_2024[i_2024];
			j_2024 = i_2024 - 1;
			
			StringBuilder stepLog = new StringBuilder();
			stepLog.append("Langkah ").append(stepCount_2024).
			append(": memasukkan ").append(key_2024).append("\n");
			
			while (j_2024 >= 0 && array_2024[j_2024] > key_2024) {
				array_2024[j_2024 + 1] = array_2024[j_2024];
				j_2024--;
			}
			
			array_2024[j_2024 + 1] = key_2024;
			
			updateLabels_2024();
			stepLog.append("Hasil: ").append(arrayToString_2024(array_2024)).append("\n\n");
			stepArea_2024.append(stepLog.toString());
			
			i_2024++;
			stepCount_2024++;
			
			if (i_2024 == array_2024.length) {
				sorting_2024 = false;
				stepButton_2024.setEnabled(false);
				JOptionPane.showMessageDialog(this, "Sorting selesai!");
			}
		}
	}

	private void updateLabels_2024() {
		for (int k_2024 = 0; k_2024 < array_2024.length; k_2024++) {
			labelArray_2024[k_2024].setText(String.valueOf(array_2024[k_2024]));
		}
	}
	
	private void reset_2024() {
		inputField_2024.setText("");
		panelArray_2024.removeAll();
		panelArray_2024.revalidate();
		panelArray_2024.repaint();
		stepArea_2024.setText("");
		stepButton_2024.setEnabled(false);
		sorting_2024 = false;
		i_2024 = 1;
		stepCount_2024 = 1;
	}
	
	private String arrayToString_2024(int[] arr) {
		StringBuilder sb = new StringBuilder();
		for (int k_2024 = 0; k_2024 < arr.length; k_2024++) {
			sb.append(arr[k_2024]);
			if (k_2024 < arr.length - 1) sb.append(", ");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			InsertionSortGUI_2511532024 gui = new InsertionSortGUI_2511532024();
			gui.setVisible(true);
		});
	}
}


