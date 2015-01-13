package edf;

import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.CombinedDomainXYPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RectangleInsets;

public class grafico extends JFrame {
	
	public grafico() throws FileNotFoundException, EDFParserException {
        //super("XY Line Chart Example with JFreechart");
        
        //CombinedDomainXYPlot is used because of the layout format
        CombinedDomainXYPlot plot = createChartPanel();
        JFreeChart chart = new JFreeChart("",
                JFreeChart.DEFAULT_TITLE_FONT, plot, false);
        ChartPanel panel = new ChartPanel(chart, true, true, true, false, true);
        panel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(panel);
        //return panel; //to use in the GUI
    }
	
	private CombinedDomainXYPlot createChartPanel() throws FileNotFoundException, EDFParserException {
		
		Main m = new Main();
		m.inicializa();
		String [] ch = m.getUsed_channels();
		
	    XYDataset[] dataset = new XYDataset[18];
	    //create the datasets for all channels
	    for(int i=0;i<3;i++){//using 3 for test purpose. Use dataset.length for real purpose
	    	dataset[i] = createDataset(i, m);//"i" is the channel that will be used to create the dataset
	    }
	    
	    
	    XYItemRenderer renderer = new StandardXYItemRenderer();
	    //NumberAxis rangeAxis = new NumberAxis("");
	    CombinedDomainXYPlot plot = new CombinedDomainXYPlot(new NumberAxis(""));
        plot.setGap(1.0);
	    
	    XYPlot[] subplot = new XYPlot[18];
	    NumberAxis[] rangeAxis = new NumberAxis[18];//each subplot has it's own Y Axis
	    for(int i=0; i<subplot.length;i++){
	    	rangeAxis[i] = new NumberAxis(ch[i]);
	    	//XYPlot(dataset,DomainAxis, rangeAxis, renderer)
	    	subplot[i] = new XYPlot(dataset[i],null, rangeAxis[i], renderer);
		    subplot[i].getRangeAxis().setVisible(false);//range of Y axes are invisible
	    	subplot[i].getRangeAxis().setAutoRange(true);//Y axes auto Range
		    
		    plot.add(subplot[i], 1);//add subplot to CombinedDomainXYPlot
	    }
	    
        plot.setOrientation(PlotOrientation.VERTICAL);//plot orientation
	    

	    //ValueAxis range = plot.getRangeAxis(); //range = Y Axis
	    ValueAxis domain = plot.getDomainAxis();//doman = X Axis
	    //range.setVisible(false);
	    domain.setVisible(false);//range of X axes are invisible
	    
	    return plot;
	}
	
	//dataset for the chart
	private XYDataset createDataset(int i, Main m) throws FileNotFoundException, EDFParserException {
		
		String [] ch = m.getUsed_channels();
		
	    XYSeriesCollection dataset = new XYSeriesCollection();
	    XYSeries series1 = new XYSeries(ch[i]);//each chart only have one series; XYSeries("Name of the series")
	    
		double[][] ucs = m.getUsed_ch_signals();//signal points
		double[] time = m.getTime();//time of each signal point

	    for(int j=0;j<128;j++){//128 is the number of points in 1sec
	    	series1.add(time[j],ucs[i][j]);
	    	
	    }
	 
	    dataset.addSeries(series1);//add series to the dataset collection

	 
	    return dataset;
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
					new grafico().setVisible(true);
				} catch (FileNotFoundException | EDFParserException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
		
		
	}
}