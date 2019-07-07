
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.FontMetrics;

public class BarGraph {
    private JFrame frame;

    public BarGraph() {
        frame = new JFrame("Bar Graph");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(frame.getSize());
        frame.add(new DrawBars(frame.getSize()));
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String... argv) {
        new BarGraph();
    }

    public static class DrawBars extends JPanel  implements MouseListener {
        /*
         * Declare Class Variables Here
         */
        int x = 20;
        int y = 200;
        double[] phila = {2.85,6.02,4.74,3.94,5.21,3.34,3.06,4.11,8.35,3.08,9.03,6.38};
        double[] seattle = {8.12,2.16,2.44,5.69,0.12,0.63,0.05,0.2,0.98,3.78,5.42,6.08};

        public DrawBars(Dimension dimension) {
            setSize(dimension);
            setPreferredSize(dimension);
            addMouseListener(this);

        }

        @Override
        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;//g2 is the graphics object that we need to use
            //to draw things to the screen
            Dimension d = getSize();
            //create a background
            g2.setColor(Color.white);
            g2.fillRect(0, 0, d.width, d.height);
            /**/        
            
            //phila variables
            // all variables are multipilied by 10
            double jan = 28.5;
            double feb = 60.2;
            double mar = 47.4;
            double apr = 39.4;
            double may = 52.1;
            double jun = 33.4;
            double jul = 30.6;
            double aug = 41.1;
            double sep = 83.5;
            double oct = 30.8;
            double nov = 90.3;
            double dec = 63.8;;

            //seattle variables
            double Jan = 81.2;
            double Feb = 21.6;
            double Mar = 24.4;
            double Apr = 56.9;
            double May = 1.2;
            double Jun = 6.3;
            double Jul = 0.5;
            double Aug = 2.0;
            double Sep = 9.8;
            double Oct = 37.8;
            double Nov = 54.2;
            double Dec = 60.8;
            Color purple= new Color(102,0, 102); //instance variable purple
            g2.setColor(purple);
            //philly rain bar graphs
            g2.fillRect (50,150,15,(int) jan);
            g2.fillRect (90,150,15,(int) feb);
            g2.fillRect (130,150,15,(int) mar);
            g2.fillRect (170,150,15,(int) apr);
            g2.fillRect (210,150,15,(int) may);
            g2.fillRect (250,150,15,(int) jun);
            g2.fillRect (290,150,15,(int) jul);
            g2.fillRect (330,150,15,(int) aug);
            g2.fillRect (370,150,15,(int) sep);
            g2.fillRect (410,150,15,(int) oct);
            g2.fillRect (450,150,15,(int) nov);
            g2.fillRect (490,150,15,(int) dec);
            Color green = new Color(10,255, 102); //instance variable purple
            g2.setColor(green);
            x = 5;
            //seattle Bar graphs
            g2.fillRect (30,150,15,(int) Jan);
            g2.fillRect (70,150,15,(int) Feb);
            g2.fillRect (110,150,15,(int) Mar);
            g2.fillRect (150,150,15,(int) Apr);
            g2.fillRect (190,150,15,(int) May);
            g2.fillRect (230,150,15,(int) Jun);
            g2.fillRect (270,150,15,(int) Jul);
            g2.fillRect (310,150,15,(int) Aug);
            g2.fillRect (350,150,15,(int) Sep);
            g2.fillRect (390,150,15,(int) Oct);
            g2.fillRect (430,150,15,(int) Nov);
            g2.fillRect (470,150,15,(int) Dec);
           

            //display Text
            g2.setColor(purple);
            g2.setFont (new Font("TimesRoman", Font.PLAIN, 20));
            g2.drawString("Philadelphia" ,  10,30);//text to display, x and y coordinates
            g2.setColor(green);
            g2.drawString("Seattle" ,  200,30);

        }
        public void mousePressed(MouseEvent e) {
            x = e.getX();
            y = e.getY(); 

            repaint();//updates the paint method
        }

        public void mouseReleased(MouseEvent e) {
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }

        public void mouseClicked(MouseEvent e) {
        }
    }
}