//Created by Muhammad Hanif Fadhil bin Zakaria (78245)
//Tested by Nurshahira binti Nabi (80800)
package netbeansproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.SQLException;
import java.text.DateFormatSymbols;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class ExpenseVisualization extends JFrame implements graph{    //implements the graph interface 
    private final int year;
    private String chartTitle;
    private String categoryAxisLabel;
    private String valueAxisLabel;
    private CategoryDataset dataset;
    private JFreeChart chart;
    private CategoryPlot plot;
    private BarRenderer renderer;
    private ChartPanel chartPanel;
    
    
    public ExpenseVisualization(database d,int year) throws SQLException {
        setTitle("Graph Expenses Montly");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 600);//800,600
        this.year=year;
        JPanel chartPanel = showMonthly(d);
        add(chartPanel, BorderLayout.CENTER);
        setLocationRelativeTo(null);
    }
    
    public JPanel showMonthly(database d) throws SQLException {
        chartTitle = "Average Monthly Expenses";
        categoryAxisLabel = "Month";
        valueAxisLabel = "Amount Expenses (MYR)";
        
        dataset = createDataset(d);
        
        chart = ChartFactory.createBarChart(
            chartTitle,
            categoryAxisLabel,
            valueAxisLabel,
            dataset,
            PlotOrientation.VERTICAL,
            true,
            true,
            false   
        );
        
        // Customize the chart
        plot = (CategoryPlot) chart.getPlot();
        plot.setBackgroundPaint(new Color(200, 230, 240));
        plot.setRangeGridlinePaint(Color.RED);
        
//        renderer = (BarRenderer) plot.getRenderer();
//        renderer.setDrawBarOutline(false);// Change the bar color to blue
        renderer=new BarRenderer();
        renderer.setDrawBarOutline(false);
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
        renderer.setBaseItemLabelsVisible(true);
        plot.setRenderer(renderer);
        
        // Create chart panel and set its properties
        chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(700, 400));
        chartPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        
        return chartPanel;
    }
    
    public CategoryDataset createDataset(database d) throws SQLException {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
     //Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
     String query="SELECT Amount FROM expenses WHERE Year=? AND Month=?";
     d.setStatement(query);
     d.getStatement().setInt(1,year);
     for(int i=0;i<=12;i++){
        
        d.getStatement().setInt(2,i+1);
        d.executeQ();
        double expenseAmount=0.0;
        while (d.getResultSet().next()){
            expenseAmount+=d.getResultSet().getDouble("Amount");
        }
        dataset.addValue(expenseAmount, "Monthly Expenses", getMonthName(i));
     }
     
     

    return dataset;
}

public String getMonthName(int monthIndex) {
    DateFormatSymbols dfs = new DateFormatSymbols(Locale.getDefault());
    String[] months = dfs.getShortMonths();
    return months[monthIndex];
}

    

    @Override
    public void showMonthly() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}