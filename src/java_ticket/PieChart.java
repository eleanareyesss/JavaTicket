
package java_ticket;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PieChart extends JFrame {

    private int[] data;
    private Color[] colors = {new Color(255,197,155), new Color(255,182,219), new Color(125,201,255)};

    public PieChart(String title, int[] data) {
        super(title);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.data = data;

        setLocationRelativeTo(null);

        getContentPane().setBackground(new Color(255,255, 255));

        JLabel deportivo = new JLabel("Deportivo");
        deportivo.setForeground(new Color(255,197,155));
        JLabel religioso = new JLabel("Religioso");
        religioso.setForeground(new Color(255,182,219));
        JLabel musical = new JLabel("Musical");
        musical.setForeground(new Color(125,201,255));

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.add(deportivo);
        bottomPanel.add(religioso);
        bottomPanel.add(musical);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private void updateData() {
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 100);
        }

        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int total = 0;
        for (int value : data) {
            total += value;
        }

        int startAngle = 0;

        for (int i = 0; i < data.length; i++) {
            int arcAngle = (int) Math.round((double) data[i] / total * 360);

            g.setColor(colors[i % colors.length]);
            g.fillArc(50, 50, 300, 300, startAngle, arcAngle);

            startAngle += arcAngle;
        }
    }

    public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        PieChart pieChart = new PieChart("GRAFICO - CANTIDAD DE EVENTOS", new int[]{0,0,0});
        pieChart.setVisible(true);
    });
    }
}

