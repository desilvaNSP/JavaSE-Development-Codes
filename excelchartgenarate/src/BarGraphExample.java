import org.faceless.graph2.*;
import java.awt.Color;
import java.awt.Paint;
import java.io.FileOutputStream;
import java.io.IOException;

public class BarGraphExample
{
    public static void main (String args[]) throws IOException
    {
        // Create 2 series
        //
        BarSeries series1 = new BarSeries("2001");
        series1.setRoundBars(true);
        series1.setBarWidth(0.8);
	series1.set("apples",5);
	series1.set("bananas",9);
	series1.set("oranges",2);
	series1.set("grapes",6);
	series1.setBarLabels(new TextStyle("Helvetica", 10, Color.black, Align.BOTTOM), null);

        BarSeries series2 = new BarSeries("2002");
        series2.setBarWidth(0.8);
        series2.setBarDepth(0.8);
	series2.set("apples",9);
	series2.set("bananas",10);
	series2.set("oranges",5);
	series2.set("grapes",3);
        
        // Create the graph and add the series
        //
        AxesGraph graph = new AxesGraph();
	graph.addSeries(series1);
	graph.addSeries(series2);

        // Set some options, including coloring the walls of the graph with stripes
        //
        graph.getAxis(Axis.LEFT).setWallPaint(new Paint[]{new Color(238,238,238),Color.white}, new Color(204,204,204), null);
        graph.getAxis(Axis.BOTTOM).setWallPaint(new Paint[]{new Color(238,238,238),Color.white}, new Color(204,204,204), null);
        graph.setBackWallPaint(new Paint[]{new Color(238,238,238),Color.white}, new Color(204,204,204), Axis.LEFT, Axis.BOTTOM, null);
        graph.setLightVector(1,0,-1);
	graph.setXRotation(30);
	graph.setYRotation(50);
        graph.setAxis(Axis.ZAXIS, new ZAxis());

        // Add a title
        //
	TextStyle style = new TextStyle("Default", 24, Color.black, Align.CENTER);
	graph.addText("Fruit Consumption Graph", style);
        
        // Write the file
        //
	ImageOutput image = new ImageOutput(500, 500);
	graph.draw(image);
	FileOutputStream out = new FileOutputStream("BarGraphExample.png");
	image.writePNG(out, 0);
        out.close();
    }
}
