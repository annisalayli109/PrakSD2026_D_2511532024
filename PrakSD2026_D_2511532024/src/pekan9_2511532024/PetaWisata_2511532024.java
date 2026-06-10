package pekan9_2511532024;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.RenderingHints;
import java.util.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class PetaWisata_2511532024 extends JFrame {

	private HashMap<String, List<String>> graph_2024;
    private HashMap<String, Point> posisiNode_2024;

    private JComboBox<String> cmbStart_2024;
    private JComboBox<String> cmbGoal_2024;

    private JButton btnBFS_2024;
    private JButton btnDFS_2024;
    private JButton btnReset_2024;

    private JTextArea txtHasil_2024;

    private GraphPanel_2024 panelGraph_2024;

    private List<String> jalur_2024;
    private List<String> nodeDikunjungi_2024;
    private Set<String> visitedNodes_2024;

    private int jumlahNodeDikunjungi_2024;

    public PetaWisata_2511532024() {

        setTitle("PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS");
        setSize(950, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        graph_2024 = new HashMap<>();
        posisiNode_2024 = new HashMap<>();

        jalur_2024 = new ArrayList<>();
        nodeDikunjungi_2024 = new ArrayList<>();
        visitedNodes_2024 = new HashSet<>();

        buatGraph_2024();
        buatGUI_2024();

        setVisible(true);
    }

    private void buatGraph_2024() {

        tambahEdge_2024("Pantai Padang", "Jembatan Siti Nurbaya");
        tambahEdge_2024("Pantai Padang", "Museum Adityawarman");
        tambahEdge_2024("Pantai Padang", "Masjid Raya Sumbar");

        tambahEdge_2024("Jembatan Siti Nurbaya", "Gunung Padang");
        tambahEdge_2024("Jembatan Siti Nurbaya", "Pantai Air Manis");

        tambahEdge_2024("Pantai Air Manis", "Pantai Nirwana");
        tambahEdge_2024("Pantai Nirwana", "Pelabuhan Teluk Bayur");

        tambahEdge_2024("Museum Adityawarman", "Kota Tua Padang");
        tambahEdge_2024("Kota Tua Padang", "Taman Budaya");

        tambahEdge_2024("Taman Budaya", "Masjid Raya Sumbar");
        tambahEdge_2024("Masjid Raya Sumbar", "Museum Adityawarman");

        tambahEdge_2024("Gunung Padang", "Pantai Nirwana");
        tambahEdge_2024("Gunung Padang", "Kota Tua Padang");

        tambahEdge_2024("Pelabuhan Teluk Bayur", "Pantai Air Manis");

        tambahEdge_2024("Taman Budaya", "Pantai Padang");

        posisiNode_2024.put("Pantai Padang", new Point(120, 70));
        posisiNode_2024.put("Jembatan Siti Nurbaya", new Point(300, 70));
        posisiNode_2024.put("Museum Adityawarman", new Point(480, 70));
        posisiNode_2024.put("Masjid Raya Sumbar", new Point(660, 70));
        posisiNode_2024.put("Pantai Air Manis", new Point(120, 180));
        posisiNode_2024.put("Gunung Padang", new Point(300, 180));
        posisiNode_2024.put("Kota Tua Padang", new Point(480, 180));
        posisiNode_2024.put("Pantai Nirwana", new Point(660, 180));
        posisiNode_2024.put("Taman Budaya", new Point(250, 290));
        posisiNode_2024.put("Pelabuhan Teluk Bayur", new Point(550, 290));
    }

    private void tambahEdge_2024(String asal_2024, String tujuan_2024) {
        graph_2024.putIfAbsent(asal_2024, new ArrayList<>());
        graph_2024.putIfAbsent(tujuan_2024, new ArrayList<>());
        graph_2024.get(asal_2024).add(tujuan_2024);
        graph_2024.get(tujuan_2024).add(asal_2024);
    }
    
    private void buatGUI_2024() {
        JPanel panelAtas_2024 = new JPanel(new BorderLayout());
        panelAtas_2024.setBackground(new Color(44, 62, 80));
        JLabel lblJudul_2024 = new JLabel("PENCARIAN JALUR MENGGUNAKAN BFS DAN DFS", SwingConstants.CENTER);
        lblJudul_2024.setForeground(Color.WHITE);
        lblJudul_2024.setFont(new Font("Arial", Font.BOLD, 22));
        panelAtas_2024.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
        panelAtas_2024.add(lblJudul_2024, BorderLayout.CENTER);
        add(panelAtas_2024, BorderLayout.NORTH);

        JPanel panelKontrol_2024 = new JPanel(new GridBagLayout());
        panelKontrol_2024.setBorder(BorderFactory.createTitledBorder("PENGATURAN PENCARIAN"));

        GridBagConstraints gbc_2024 = new GridBagConstraints();

        gbc_2024.insets = new Insets(5, 5, 5, 5);
        gbc_2024.anchor = GridBagConstraints.WEST;

        JLabel lblStart_2024 = new JLabel("Lokasi Awal :");
        lblStart_2024.setFont(new Font("Arial", Font.BOLD, 14));
        cmbStart_2024 = new JComboBox<>(graph_2024.keySet().toArray(new String[0]));

        cmbStart_2024.setPreferredSize(new Dimension(200, 30));
        JLabel lblGoal_2024 = new JLabel("Lokasi Tujuan :");
        lblGoal_2024.setFont( new Font("Arial", Font.BOLD, 14));

        cmbGoal_2024 = new JComboBox<>(graph_2024.keySet().toArray( new String[0]));

        cmbGoal_2024.setPreferredSize(new Dimension(200, 30));
        
        btnBFS_2024 = new JButton("BFS");
        btnBFS_2024.setBackground(new Color(46, 204, 113));
        btnBFS_2024.setForeground( Color.WHITE);
        btnBFS_2024.setFont(new Font("Arial", Font.BOLD, 13));
        btnDFS_2024 = new JButton("DFS");
        btnDFS_2024.setBackground(new Color(243, 156, 18));
        btnDFS_2024.setForeground(Color.WHITE);
        btnDFS_2024.setFont(new Font("Arial", Font.BOLD, 13));
        btnReset_2024 = new JButton("RESET");
        btnReset_2024.setBackground(new Color(231, 76, 60));
        btnReset_2024.setForeground(Color.WHITE);
        btnReset_2024.setFont(new Font("Arial", Font.BOLD, 13));

        gbc_2024.gridx = 0;
        gbc_2024.gridy = 0;
        panelKontrol_2024.add(lblStart_2024, gbc_2024);
        gbc_2024.gridx = 1;
        panelKontrol_2024.add(cmbStart_2024, gbc_2024);
        gbc_2024.gridx = 0;
        gbc_2024.gridy = 1;
        panelKontrol_2024.add(lblGoal_2024, gbc_2024);
        gbc_2024.gridx = 1;
        panelKontrol_2024.add(cmbGoal_2024, gbc_2024);
        gbc_2024.gridx = 2;
        gbc_2024.gridy = 0;
        panelKontrol_2024.add(btnBFS_2024, gbc_2024);
        gbc_2024.gridx = 3;
        panelKontrol_2024.add(btnDFS_2024, gbc_2024);
        gbc_2024.gridx = 4;
        panelKontrol_2024.add(btnReset_2024, gbc_2024);

        panelGraph_2024 = new GraphPanel_2024();
        panelGraph_2024.setPreferredSize( new Dimension(700, 350));
        panelGraph_2024.setBorder(BorderFactory.createTitledBorder("VISUALISASI GRAPH"));

        txtHasil_2024 = new JTextArea(8, 40);
        txtHasil_2024.setEditable(false);
        txtHasil_2024.setFont(new Font("Monospaced", Font.PLAIN, 14));
        txtHasil_2024.setText("Hasil Pencarian :\n" + "Jalur :\n" + "Node Dikunjungi :\n" +
                "Jumlah Node Dikunjungi : 0");

        JScrollPane scrollHasil_2024 = new JScrollPane(txtHasil_2024);
        scrollHasil_2024.setBorder(BorderFactory.createTitledBorder("HASIL PENCARIAN"));
        JPanel panelTengah_2024 =new JPanel(new BorderLayout());
        panelTengah_2024.add(panelKontrol_2024, BorderLayout.NORTH);
        panelTengah_2024.add(panelGraph_2024, BorderLayout.CENTER);
        panelTengah_2024.add(scrollHasil_2024, BorderLayout.SOUTH);
        add(panelTengah_2024, BorderLayout.CENTER);
        btnBFS_2024.addActionListener(e -> {
            String start_2024 = cmbStart_2024.getSelectedItem().toString();
            String goal_2024 = cmbGoal_2024.getSelectedItem().toString();
            BFS_2024(start_2024, goal_2024);
        });

        btnDFS_2024.addActionListener(e -> {
            String start_2024 = cmbStart_2024.getSelectedItem().toString();
            String goal_2024 = cmbGoal_2024.getSelectedItem().toString();
            DFS_2024(start_2024, goal_2024);
        });

        btnReset_2024.addActionListener(e -> {
            resetGraph_2024();
        });
    }
    
    private void BFS_2024(String start_2024, String goal_2024) {
    	Queue<String> queue_2024 = new LinkedList<>();
    	HashSet<String> visited_2024 = new HashSet<>();
    	HashMap<String, String> parent_2024 = new HashMap<>();

    	nodeDikunjungi_2024.clear();
    	visitedNodes_2024.clear();
    	jalur_2024.clear();

    	queue_2024.offer(start_2024);
    	visited_2024.add(start_2024);

    	boolean ditemukan_2024 = false;

    	while (!queue_2024.isEmpty()) {
    		String current_2024 = queue_2024.poll();
    		nodeDikunjungi_2024.add(current_2024);
    		visitedNodes_2024.add(current_2024);
    		if (current_2024.equals(goal_2024)) {
    			ditemukan_2024 = true;
    			break;
    		}

    		for (String tetangga_2024 : graph_2024.get(current_2024)) {
    			if (!visited_2024.contains(tetangga_2024)) {
    				visited_2024.add(tetangga_2024);
    				parent_2024.put(tetangga_2024, current_2024);
    				queue_2024.offer(tetangga_2024);
    			}
    		}
    	}

    	jumlahNodeDikunjungi_2024 = nodeDikunjungi_2024.size();
    	if (ditemukan_2024) {
    		String current_2024 = goal_2024;
    		while (current_2024 != null) {
    			jalur_2024.add(current_2024);
    			current_2024 = parent_2024.get(current_2024);
    		}

    		Collections.reverse(jalur_2024);
    	}

    	displayPath_2024("BFS");

    	panelGraph_2024.repaint();
    }
    
    private void DFS_2024(String start_2024, String goal_2024) {
    	Stack<String> stack_2024 = new Stack<>();
    	HashSet<String> visited_2024 = new HashSet<>();
    	HashMap<String, String> parent_2024 = new HashMap<>();

    	nodeDikunjungi_2024.clear();
    	visitedNodes_2024.clear();
    	jalur_2024.clear();

    	stack_2024.push(start_2024);
    	boolean ditemukan_2024 = false;

    	while (!stack_2024.isEmpty()) {
    		String current_2024 = stack_2024.pop();
    		if (visited_2024.contains(current_2024)) {
    			continue;
    		}

    		visited_2024.add(current_2024);
    		nodeDikunjungi_2024.add(current_2024);
    		visitedNodes_2024.add(current_2024);
    		if (current_2024.equals(goal_2024)) {
    			ditemukan_2024 = true;
    			break;
    		}

    		List<String> tetangga_2024 = graph_2024.get(current_2024);

    		for (int i_2024 = tetangga_2024.size() - 1; i_2024 >= 0; i_2024--) {
    			String next_2024 = tetangga_2024.get(i_2024);
    			if (!visited_2024.contains(next_2024)) {
    				parent_2024.put(next_2024, current_2024);
    				stack_2024.push(next_2024);
    			}
    		}
    	}

    	jumlahNodeDikunjungi_2024 = nodeDikunjungi_2024.size();

    	if (ditemukan_2024) {
    		String current_2024 = goal_2024;

    		while (current_2024 != null) {
    			jalur_2024.add(current_2024);
    			current_2024 = parent_2024.get(current_2024);
    		}

    		Collections.reverse(jalur_2024);
    	}

    	displayPath_2024("DFS");
    	panelGraph_2024.repaint();
    }
    
    private void displayPath_2024(String metode_2024) {
        StringBuilder hasil_2024 = new StringBuilder();
        hasil_2024.append("Metode : ").append(metode_2024).append("\n\n");
        if (jalur_2024.isEmpty()) {
            hasil_2024.append("Jalur : Tidak ditemukan\n\n");
        } else { hasil_2024.append("Jalur : ");
            hasil_2024.append(String.join(" → ", jalur_2024));
            hasil_2024.append("\n\n");
        }
        hasil_2024.append("Node Dikunjungi :\n");
        hasil_2024.append(String.join(" → ", nodeDikunjungi_2024));
        hasil_2024.append("\n\nJumlah Node Dieksplorasi : ");
        hasil_2024.append(jumlahNodeDikunjungi_2024);
        txtHasil_2024.setText(hasil_2024.toString());
    }
    
    private void resetGraph_2024() {
        jalur_2024.clear();
        nodeDikunjungi_2024.clear();
        visitedNodes_2024.clear();
        jumlahNodeDikunjungi_2024 = 0;
        txtHasil_2024.setText("Hasil Pencarian :\n" + "Jalur :\n" + "Node Dikunjungi :\n" + "Jumlah Node Dikunjungi : 0");
        panelGraph_2024.repaint();
    }
    
    class GraphPanel_2024 extends JPanel {
        @Override
        protected void paintComponent(Graphics g_2024) {
            super.paintComponent(g_2024);
            Graphics2D g2d_2024 = (Graphics2D) g_2024;
            int graphWidth_2024 = 600;
            int graphHeight_2024 = 300;
            int offsetX_2024 = (getWidth() - graphWidth_2024) / 2;
            int offsetY_2024 = (getHeight() - graphHeight_2024) / 2;
            g2d_2024.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d_2024.setStroke( new BasicStroke(2));

            // Menggambar edge
            for (String node_2024 : graph_2024.keySet()) {
                Point p1_2024 = posisiNode_2024.get(node_2024);
                for (String tetangga_2024 :  graph_2024.get( node_2024)) {
                    Point p2_2024 = posisiNode_2024.get(tetangga_2024);

                    g2d_2024.setColor(Color.GRAY);
                    g2d_2024.drawLine(p1_2024.x + offsetX_2024, p1_2024.y + offsetY_2024,
                            p2_2024.x + offsetX_2024, p2_2024.y + offsetY_2024);
                }
            }

            // Highlight jalur hasil pencarian
            if (jalur_2024.size() > 1) {
                g2d_2024.setStroke(new BasicStroke(4));
                for (int i_2024 = 0; i_2024 < jalur_2024.size() - 1; i_2024++) {
                    Point p1_2024 = posisiNode_2024.get(jalur_2024.get(i_2024));
                    Point p2_2024 = posisiNode_2024.get(jalur_2024.get(i_2024 + 1));

                    g2d_2024.setColor(new Color(46, 204, 113));
                    g2d_2024.drawLine(p1_2024.x + offsetX_2024, p1_2024.y + offsetY_2024,
                            p2_2024.x + offsetX_2024, p2_2024.y + offsetY_2024);
                }
            }

            // Menggambar node
            for (String node_2024 : posisiNode_2024.keySet()) {
                Point point_2024 =  posisiNode_2024.get(node_2024);
                if (jalur_2024.contains(node_2024)) {
                    g2d_2024.setColor(new Color(46, 204, 113));
                } 
                else if (visitedNodes_2024.contains(node_2024)) {
                    g2d_2024.setColor(new Color(52, 152, 219));
                } else {
                    g2d_2024.setColor(new Color(236, 240, 241));
                }

                int lebarNode_2024 = 130;
                int tinggiNode_2024 = 40;
                g2d_2024.fillRoundRect(point_2024.x + offsetX_2024 - (lebarNode_2024 / 2),
                    point_2024.y + offsetY_2024 - (tinggiNode_2024 / 2), lebarNode_2024,
                    tinggiNode_2024, 20, 20);

                g2d_2024.setColor(Color.BLACK);
                g2d_2024.drawRoundRect(point_2024.x + offsetX_2024 - (lebarNode_2024 / 2),
                	    point_2024.y + offsetY_2024 - (tinggiNode_2024 / 2), lebarNode_2024,
                	    tinggiNode_2024, 20, 20);

                g2d_2024.setFont(new Font("Arial", Font.BOLD, 11));
                FontMetrics fm_2024 = g2d_2024.getFontMetrics();
                int lebarTeks_2024 = fm_2024.stringWidth(node_2024);
                int tinggiTeks_2024 = fm_2024.getAscent();

                g2d_2024.drawString( node_2024, point_2024.x + offsetX_2024 - (lebarTeks_2024 / 2),
                    point_2024.y + offsetY_2024 + (tinggiTeks_2024 / 4));
            }

            // Keterangan warna
            g2d_2024.setFont(new Font("Arial", Font.PLAIN, 12));
            g2d_2024.setColor(new Color(236, 240, 241));
            g2d_2024.fillRect(20, 20, 15, 15);
            g2d_2024.setColor(Color.BLACK);
            g2d_2024.drawRect(20, 20, 15, 15);
            g2d_2024.drawString("Belum Dikunjungi", 45, 33);
            g2d_2024.setColor(new Color(52, 152, 219));
            g2d_2024.fillRect(20, 45, 15, 15);
            g2d_2024.setColor(Color.BLACK);
            g2d_2024.drawRect(20, 45, 15, 15);
            g2d_2024.drawString("Sudah Dikunjungi", 45, 58);
            g2d_2024.setColor(new Color(46, 204, 113));
            g2d_2024.fillRect(20, 70, 15, 15);
            g2d_2024.setColor(Color.BLACK);
            g2d_2024.drawRect(20, 70, 15, 15);
            g2d_2024.drawString("Jalur Ditemukan", 45, 83);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PetaWisata_2511532024();
        });
    }
}
    



