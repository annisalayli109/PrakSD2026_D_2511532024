package pekan7_2511532024;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.Color;

public class MahasiswaGUI_2511532024 extends JFrame {

	// CLASS MAHASISWA
    class Mahasiswa_2024 {

        private String nama_2024;
        private String nim_2024;
        private String prodi_2024;

        public Mahasiswa_2024(String nama_2024, String nim_2024, String prodi_2024) {

            this.nama_2024 = nama_2024;
            this.nim_2024 = nim_2024;
            this.prodi_2024 = prodi_2024;
        }

        public String getNama_2024() {
            return nama_2024;
        }

        public String getNim_2024() {
            return nim_2024;
        }

        public String getProdi_2024() {
            return prodi_2024;
        }

        @Override
        public String toString() {
            return nama_2024;
        }
    }

    // ARRAYLIST
    ArrayList<Mahasiswa_2024> data_2024 = new ArrayList<>();

    // KOMPONEN
    JTextField txtNama_2024;
    JTextField txtNim_2024;
    JTextField txtProdi_2024;

    JComboBox<String> cmbSort_2024;

    JTable tabel_2024;
    DefaultTableModel model_2024;

    JTextArea areaProses_2024;

    JButton btnTambah_2024;
    JButton btnHapus_2024;
    JButton btnSort_2024;

    // CONSTRUCTOR
    public MahasiswaGUI_2511532024() {

        setTitle("Aplikasi Sorting Data Mahasiswa");
        setSize(950, 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout(10,10));

        Font fontLabel = new Font("Segoe UI", Font.PLAIN, 14);
        Font fontField = new Font("Segoe UI", Font.PLAIN, 14);
        Font fontButton = new Font("Segoe UI", Font.BOLD, 13);

        // PANEL INPUT
        JPanel panelInput_2024 = new JPanel(new GridLayout(5,2,10,10));

        panelInput_2024.setBorder(BorderFactory.createTitledBorder("Input Data Mahasiswa"));

        // NAMA
        JLabel lblNama_2024 = new JLabel("Nama");
        lblNama_2024.setFont(fontLabel);

        txtNama_2024 = new JTextField();
        txtNama_2024.setFont(fontField);

        panelInput_2024.add(lblNama_2024);
        panelInput_2024.add(txtNama_2024);

        // NIM
        JLabel lblNim_2024 = new JLabel("NIM");
        lblNim_2024.setFont(fontLabel);

        txtNim_2024 = new JTextField();
        txtNim_2024.setFont(fontField);

        panelInput_2024.add(lblNim_2024);
        panelInput_2024.add(txtNim_2024);

        // PRODI
        JLabel lblProdi_2024 = new JLabel("Program Studi");

        lblProdi_2024.setFont(fontLabel);

        txtProdi_2024 = new JTextField();
        txtProdi_2024.setFont(fontField);

        panelInput_2024.add(lblProdi_2024);
        panelInput_2024.add(txtProdi_2024);

        // COMBOBOX
        JLabel lblSort_2024 = new JLabel("Pilih Sorting");

        lblSort_2024.setFont(fontLabel);

        String pilihan_2024[] = {"Insertion Sort", "Selection Sort", "Bubble Sort"};

        cmbSort_2024 = new JComboBox<>(pilihan_2024);
        cmbSort_2024.setFont(fontField);

        panelInput_2024.add(lblSort_2024);
        panelInput_2024.add(cmbSort_2024);

        // PANEL BUTTON
        JPanel panelButton_2024 = new JPanel(new GridLayout(1,2,10,10));

        btnTambah_2024 = new JButton("Tambah");
        btnTambah_2024.setForeground(new Color(255, 255, 255));
        btnTambah_2024.setBackground(new Color(0, 128, 255));
        btnTambah_2024.setFont(fontButton);

        btnHapus_2024 = new JButton("Hapus");
        btnHapus_2024.setForeground(new Color(255, 255, 255));
        btnHapus_2024.setBackground(new Color(255, 0, 0));
        btnHapus_2024.setFont(fontButton);

        panelButton_2024.add(btnTambah_2024);
        panelButton_2024.add(btnHapus_2024);

        panelInput_2024.add(panelButton_2024);

        btnSort_2024 = new JButton("Mulai Sorting");
        btnSort_2024.setForeground(new Color(255, 255, 255));
        btnSort_2024.setBackground(new Color(35, 207, 79));

        btnSort_2024.setFont(fontButton);

        panelInput_2024.add(btnSort_2024);

        getContentPane().add(panelInput_2024, BorderLayout.NORTH);

        // TABEL
        model_2024 = new DefaultTableModel();

        model_2024.addColumn("Nama");
        model_2024.addColumn("NIM");
        model_2024.addColumn("Program Studi");

        tabel_2024 = new JTable(model_2024);

        tabel_2024.setFont(new Font("Segoe UI", Font.PLAIN, 13));

        tabel_2024.setRowHeight(25);

        JTableHeader header = tabel_2024.getTableHeader();

        header.setFont(new Font("Segoe UI", Font.BOLD, 14));

        JScrollPane scrollTable = new JScrollPane(tabel_2024);

        scrollTable.setBorder(BorderFactory.createTitledBorder("Data Mahasiswa"));

        getContentPane().add(scrollTable, BorderLayout.CENTER);

        // AREA PROSES
        areaProses_2024 = new JTextArea();
        areaProses_2024.setEditable(false);
        areaProses_2024.setFont(new Font("Monospaced", Font.PLAIN, 13));

        JScrollPane scrollProses = new JScrollPane(areaProses_2024);

        scrollProses.setBorder(BorderFactory.createTitledBorder("Proses Sorting"));
        scrollProses.setPreferredSize( new Dimension(100,200));
        getContentPane().add(scrollProses, BorderLayout.SOUTH);

        // AKSI BUTTON
        aksiButton_2024();
    }

    // METHOD BUTTON
    void aksiButton_2024() {

        // TAMBAH DATA
        btnTambah_2024.addActionListener(e -> {
            String nama_2024 = txtNama_2024.getText();
            String nim_2024 = txtNim_2024.getText();
            String prodi_2024 = txtProdi_2024.getText();

            Mahasiswa_2024 mhs_2024 = new Mahasiswa_2024(nama_2024, nim_2024, prodi_2024);
            data_2024.add(mhs_2024);
            model_2024.addRow(new Object[]{nama_2024, nim_2024, prodi_2024});

            txtNama_2024.setText("");
            txtNim_2024.setText("");
            txtProdi_2024.setText("");
        });

        // HAPUS DATA
        btnHapus_2024.addActionListener(e -> {
            int baris_2024 = tabel_2024.getSelectedRow();
            if(baris_2024 != -1){
                data_2024.remove(baris_2024);
                model_2024.removeRow(baris_2024);
            }
        });

        // SORTING
        btnSort_2024.addActionListener(e -> {
            areaProses_2024.setText("");
            ArrayList<Mahasiswa_2024> temp_2024 = new ArrayList<>(data_2024);
            String pilih_2024 = cmbSort_2024.getSelectedItem().toString();
            if(pilih_2024.equals("Insertion Sort")){
                insertionSort_2024(temp_2024);
            }
            else if(pilih_2024.equals("Selection Sort")){
                selectionSort_2024(temp_2024);
            }
            else{
                bubbleSort_2024(temp_2024);
            }
        });
    }

    // INSERTION SORT
    void insertionSort_2024(
            ArrayList<Mahasiswa_2024> list_2024){
    	
        areaProses_2024.append("=== INSERTION SORT ===\n");

        for(int i_2024 = 1;
            i_2024 < list_2024.size(); i_2024++){
        	
        	Mahasiswa_2024 key_2024 = list_2024.get(i_2024);
            int j_2024 = i_2024 - 1;
            while(j_2024 >= 0 && list_2024.get(j_2024).getNama_2024().compareToIgnoreCase(
                key_2024.getNama_2024()) > 0){

                list_2024.set(j_2024 + 1, list_2024.get(j_2024)); j_2024--;
            }

            list_2024.set(j_2024 + 1, key_2024);
            areaProses_2024.append("Langkah " + i_2024 + " : " + ambilNama_2024(list_2024) + "\n");
        }
    }

    // SELECTION SORT
    void selectionSort_2024(
            ArrayList<Mahasiswa_2024> list_2024){

        areaProses_2024.append("=== SELECTION SORT ===\n");

        for(int i_2024 = 0; i_2024 < list_2024.size()-1; i_2024++){
            int min_2024 = i_2024;

            for(int j_2024 = i_2024 + 1; j_2024 < list_2024.size(); j_2024++){

                if(list_2024.get(j_2024).getNama_2024().compareToIgnoreCase(
                   list_2024.get(min_2024).getNama_2024()) < 0){
                   min_2024 = j_2024;
                }
            }

            Mahasiswa_2024 temp_2024 = list_2024.get(i_2024);

            list_2024.set(i_2024, list_2024.get(min_2024));

            list_2024.set( min_2024, temp_2024);

            areaProses_2024.append( "Pass " + (i_2024+1) + " : " + ambilNama_2024(list_2024) + "\n");
        }
    }

    // BUBBLE SORT
    void bubbleSort_2024(
            ArrayList<Mahasiswa_2024> list_2024){

        areaProses_2024.append("=== BUBBLE SORT ===\n");

        for(int i_2024 = 0; i_2024 < list_2024.size()-1; i_2024++){
            for(int j_2024 = 0; j_2024 < list_2024.size()-i_2024-1; j_2024++){
                if(list_2024.get(j_2024).getNama_2024().compareToIgnoreCase(
                   list_2024.get(j_2024+1).getNama_2024()) > 0){

                    Mahasiswa_2024 temp_2024 = list_2024.get(j_2024);

                    list_2024.set(j_2024, list_2024.get(j_2024+1));

                    list_2024.set(j_2024+1, temp_2024);
                }
            }

            areaProses_2024.append("Pass " + (i_2024+1) + " : " + ambilNama_2024(list_2024) + "\n");
        }
    }

    // AMBIL NAMA
    String ambilNama_2024(ArrayList<Mahasiswa_2024> list_2024){

        String hasil_2024 = "[ ";
        for(Mahasiswa_2024 m_2024 : list_2024){

            hasil_2024 += m_2024.getNama_2024() + ", ";
        }
        hasil_2024 += "]";
        return hasil_2024;
    }

    // MAIN
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {new MahasiswaGUI_2511532024()
        	.setVisible(true);
        });
    }
}


