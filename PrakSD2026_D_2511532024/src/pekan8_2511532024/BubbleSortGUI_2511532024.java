package pekan8_2511532024;

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

import pekan7_2511532024.InsertionSortGUI_2511532024;

public class BubbleSortGUI_2511532024 extends JFrame {

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
	public BubbleSortGUI_2511532024() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane_2024 = new JPanel();
		contentPane_2024.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_2024);
		contentPane_2024.setLayout(null);
		setTitle("Bubble sort langkah per langkah");
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
	private void setArrayFromInput_2024() {
	    String text_2024 = inputField_2024.getText().trim();
	    if (text_2024.isEmpty()) return;
	    String[] parts_2024 = text_2024.split(",");
	    array_2024 = new int[parts_2024.length];

	    try {
	        for (int k_2024 = 0; k_2024 < parts_2024.length; k_2024++) {
	            array_2024[k_2024] = Integer.parseInt(parts_2024[k_2024].trim());
	        }
	    } catch (NumberFormatException e_2024) {
	        JOptionPane.showMessageDialog(this, "Masukkan hanya angka " + "yang dipisahkan koma!", "Error",
	                JOptionPane.ERROR_MESSAGE);
	        return;
	    }

	    i_2024 = 0;
	    j_2024 = 0;
	    stepCount_2024 = 1;
	    sorting_2024 = true;

	    stepButton_2024.setEnabled(true);
	    stepArea_2024.setText("");
	    panelArray_2024.removeAll();

	    labelArray_2024 = new JLabel[array_2024.length];
	    for (int k_2024 = 0; k_2024 < array_2024.length; k_2024++) {
	        labelArray_2024[k_2024] = new JLabel(String.valueOf(array_2024[k_2024]));
	        labelArray_2024[k_2024].setFont( new Font("Arial", Font.BOLD, 24));
	        labelArray_2024[k_2024].setOpaque(true);
	        labelArray_2024[k_2024].setBackground(Color.WHITE);
	        labelArray_2024[k_2024].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	        labelArray_2024[k_2024].setPreferredSize(new Dimension(50, 50));
	        labelArray_2024[k_2024].setHorizontalAlignment(SwingConstants.CENTER);
	        panelArray_2024.add(labelArray_2024[k_2024]);
	    }

	    panelArray_2024.revalidate();
	    panelArray_2024.repaint();
	}
	
	private void performStep_2024() {
	    if (!sorting_2024 || i_2024 >= array_2024.length - 1) {
	        sorting_2024 = false;
	        stepButton_2024.setEnabled(false);
	        JOptionPane.showMessageDialog(this, "Sorting selesai!");
	        return;
	    }

	    resetHighlights_2024();
	    StringBuilder stepLog_2024 = new StringBuilder();
	    labelArray_2024[j_2024].setBackground(Color.CYAN);
	    labelArray_2024[j_2024 + 1].setBackground(Color.CYAN);

	    if (array_2024[j_2024] > array_2024[j_2024 + 1]) {
	        // Swap
	        int temp_2024 = array_2024[j_2024];
	        array_2024[j_2024] = array_2024[j_2024 + 1];
	        array_2024[j_2024 + 1] = temp_2024;
	        labelArray_2024[j_2024].setBackground(Color.RED);
	        labelArray_2024[j_2024 + 1].setBackground(Color.RED);

	        stepLog_2024.append("Langkah ").append(stepCount_2024).append(": Menukar elemen ke-")
	                .append(j_2024).append(" (").append(array_2024[j_2024 + 1]).append(") dengan ke-")
	                .append(j_2024 + 1).append(" (").append(array_2024[j_2024]).append(")\n");
	    } else {
	        stepLog_2024.append("Langkah ").append(stepCount_2024).append(": Tidak ada pertukaran antara ke-")
	                .append(j_2024).append(" dan ke-").append(j_2024 + 1).append("\n");
	    }

	    stepLog_2024.append("Hasil: ").append(arrayToString_2024(array_2024)).append("\n\n");
	    stepArea_2024.append(stepLog_2024.toString());
	    updateLabels_2024();
	    j_2024++;

	    if (j_2024 >= array_2024.length - i_2024 - 1) {
	        j_2024 = 0;
	        i_2024++;
	    }

	    stepCount_2024++;

	    if (i_2024 >= array_2024.length - 1) {
	        sorting_2024 = false;
	        stepButton_2024.setEnabled(false);
	        JOptionPane.showMessageDialog(this, "Sorting selesai!");
	    }
	}
	
	private void updateLabels_2024() {
	    for (int k_2024 = 0; k_2024 < array_2024.length; k_2024++) {
	        labelArray_2024[k_2024].setText(String.valueOf(array_2024[k_2024]));
	    }
	}

	private void resetHighlights_2024() {
	    for (JLabel label_2024 : labelArray_2024) {
	        label_2024.setBackground(Color.WHITE);
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
	    i_2024 = 0;
	    j_2024 = 0;
	    stepCount_2024 = 1;
	}

	private String arrayToString_2024(int[] arr_2024) {
	    StringBuilder sb_2024 = new StringBuilder();
	    for (int k_2024 = 0; k_2024 < arr_2024.length; k_2024++) {
	        sb_2024.append(arr_2024[k_2024]);
	        if (k_2024 < arr_2024.length - 1) {
	            sb_2024.append(", ");
	        }
	    }
	    return sb_2024.toString();
	}
	    public static void main(String[] args) {
			SwingUtilities.invokeLater(() -> {
				BubbleSortGUI_2511532024 gui = new BubbleSortGUI_2511532024();
				gui.setVisible(true);
			});
	}
}
