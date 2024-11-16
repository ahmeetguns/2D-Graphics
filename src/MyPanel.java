import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    Image image;
    MyPanel(){
        image =new ImageIcon("C:\\Users\\ahmee\\OneDrive\\Desktop\\aa.png").getImage();
        this.setPreferredSize(new Dimension(500,500));
    }
    public void paint (Graphics g ){
        Graphics2D g2D = (Graphics2D) g;
        //g2D.setStroke(new BasicStroke(5));
        //g2D.drawLine(0,0,500,500);

         //g2D.setStroke(new BasicStroke(5));
         // g2D.drawRect(0,0,500,300);

         // g2D.setPaint(Color.MAGENTA);
         // g2D.fillRect(0,0,500,300);

         //  g2D.setPaint(Color.MAGENTA);
         //  g2D.drawRect(0,0,500,300);
         // g2D.fillRect(0,0,500,300);

         // g2D.setPaint(Color.orange);
         // g2D.drawOval(0,0,300,300);
         // g2D.fillOval(0,0,300,300);
         /*
         -----POKEMON----
          */
          //  g2D.drawArc(10,10,100,100,0,180);

          // g2D.setPaint(Color.red);
          // g2D.fillArc(10,10,100,100,0,180);
          // g2D.setPaint(Color.white);
          // g2D.fillArc(10,10,100,100,180,180);


           //  g2D.setFont(new Font("Ink Free",Font.ITALIC,50));
           //  g2D.drawString("Hey YOU !!",50,50);
           //int[] xPoints = {150,250,350};
           //int[] yPoints= {300,150,300};
           //g2D.drawPolygon(xPoints , yPoints,3);
           //  g2D.fillPolygon(xPoints,yPoints,3);

        g2D.drawImage(image,0,0,null);
    }
}
