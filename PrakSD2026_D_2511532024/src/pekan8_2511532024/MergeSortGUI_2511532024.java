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
import java.util.LinkedList;
import java.util.Queue;

public class MergeSortGUI_2511532024 extends JFrame {

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
	private Queue<int[]> mergeQueue_2024 = new LinkedList<>();

	private boolean isMerging_2024 = false;
	private boolean copying_2024 = false;
	private int left_2024;
	private int mid_2024;
	private int right_2024;
	private int k_2024;
	private int[] temp_2024;

	/**
	 * Create the frame.
	 * @return 
	 */
	public MergeSortGUI_2511532024() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane_2024 = new JPanel();
		contentPane_2024.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_2024);
		contentPane_2024.setLayout(null);
		setTitle("Merge sort langkah per langkah");
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
	        for (int i_2024 = 0; i_2024 < parts_2024.length; i_2024++) {
	            array_2024[i_2024] = Integer.parseInt(parts_2024[i_2024].trim());
	        }
	    } catch (NumberFormatException e_2024) {
	        JOptionPane.showMessageDialog(this, "Masukkan hanya angka!", "Error", JOptionPane.ERROR_MESSAGE);
	        return;
	    }

	    labelArray_2024 = new JLabel[array_2024.length];
	    panelArray_2024.removeAll();

	    for (int i_2024 = 0; i_2024 < array_2024.length; i_2024++) {
	        labelArray_2024[i_2024] = new JLabel(String.valueOf(array_2024[i_2024]));
	        labelArray_2024[i_2024].setFont(new Font("Arial", Font.BOLD, 24));
	        labelArray_2024[i_2024].setOpaque(true);
	        labelArray_2024[i_2024].setBackground(Color.WHITE);
	        labelArray_2024[i_2024].setBorder(BorderFactory.createLineBorder(Color.BLACK));
	        labelArray_2024[i_2024].setPreferredSize(new Dimension(50, 50));
	        labelArray_2024[i_2024].setHorizontalAlignment(SwingConstants.CENTER);
	        panelArray_2024.add(labelArray_2024[i_2024]);
	        
	        mergeQueue_2024.clear();
	        generateMergeSteps_2024(0, array_2024.length - 1);

	        stepButton_2024.setEnabled(true);
	        stepArea_2024.setText("");

	        stepCount_2024 = 1;
	        isMerging_2024 = false;

	        panelArray_2024.revalidate();
	        panelArray_2024.repaint();
	    }
	 }
	    private void generateMergeSteps_2024(int left_2024, int right_2024) {
	        if (left_2024 >= right_2024) {
	            return;
	        }
	        int mid_2024 = (left_2024 + right_2024) / 2;
	        generateMergeSteps_2024(left_2024, mid_2024);
	        generateMergeSteps_2024(mid_2024 + 1, right_2024);
	        mergeQueue_2024.offer(new int[] {
	                left_2024, mid_2024, right_2024
	            });
	    }
	    
	    private void performStep_2024() {
	    resetHighlights_2024();
	    if (!isMerging_2024 && !mergeQueue_2024.isEmpty()) {
	        int[] range_2024 = mergeQueue_2024.poll();
	        left_2024 = range_2024[0];
	        mid_2024   = range_2024[1];
	        right_2024 = range_2024[2];
	        temp_2024 = new int[right_2024 - left_2024 + 1];
	        i_2024 = left_2024;
	        j_2024 = mid_2024 + 1;
	        k_2024 = 0;
	        copying_2024 = false;
	        isMerging_2024 = true;
	        stepArea_2024.append("Langkah " + stepCount_2024++ + ": Mulai merge dari " + left_2024 + " ke "
	                + right_2024 + "\n");

	        return;
	    }

	    if (isMerging_2024 && !copying_2024) {
	        if (i_2024 <= mid_2024 && j_2024 <= right_2024) {
	            labelArray_2024[i_2024].setBackground(Color.CYAN);
	            labelArray_2024[j_2024].setBackground(Color.CYAN);
	            if (array_2024[i_2024] <= array_2024[j_2024]) {
	                temp_2024[k_2024++] = array_2024[i_2024++];
	            } else {
	                temp_2024[k_2024++] = array_2024[j_2024++];
	            }
	            stepArea_2024.append("Langkah " + stepCount_2024++ + ": Bandingkan dan salin elemen\n");
	            return;
	        } else if (i_2024 <= mid_2024) {
	            temp_2024[k_2024++] = array_2024[i_2024++];
	            stepArea_2024.append("Langkah " + stepCount_2024++ + ": Salin sisa kiri\n");
	            return;
	        } else if (j_2024 <= right_2024) {
	            temp_2024[k_2024++] = array_2024[j_2024++];
	            stepArea_2024.append("Langkah " + stepCount_2024++ + ": Salin sisa kanan\n");
	            return;
	        } else {
	            copying_2024 = true;
	            k_2024 = 0;
	            return;
	        }
	    }
	    
	    if (copying_2024 && k_2024 < temp_2024.length) {
	        array_2024[left_2024 + k_2024] = temp_2024[k_2024];
	        labelArray_2024[left_2024 + k_2024].setText(String.valueOf(temp_2024[k_2024]));
	        labelArray_2024[left_2024 + k_2024].setBackground(Color.GREEN);
	        k_2024++;
	        stepArea_2024.append("Langkah " + stepCount_2024++ + ": Tempelkan ke array utama\n");
	        return;
	    }
	    
	    if (copying_2024 && k_2024 == temp_2024.length) {
	        isMerging_2024 = false;
	        copying_2024 = false;
	    }
	    
	    if (mergeQueue_2024.isEmpty() && !isMerging_2024) {
	        stepArea_2024.append("Selesai.\n");
	        stepButton_2024.setEnabled(false);
	        JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
	    }
	}
	    
	    private void resetHighlights_2024() {
	        if (labelArray_2024 == null) return;
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
	        mergeQueue_2024.clear();
	        isMerging_2024 = false;
	        stepCount_2024 = 1;
	    }
	    public static void main(String[] args) {
			SwingUtilities.invokeLater(() -> {
				MergeSortGUI_2511532024 gui = new MergeSortGUI_2511532024();
				gui.setVisible(true);
			});
	    }
}
