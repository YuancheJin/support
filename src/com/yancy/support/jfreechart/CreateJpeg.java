package com.yancy.support.jfreechart;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
public class CreateJpeg extends ApplicationFrame {
/**
* 
*/
private static final long serialVersionUID = 1L;
public CreateJpeg(String s) {
   super(s);
   setContentPane(createDemoLine());
}
public static void main(String[] args) {
   CreateJpeg fjc = new CreateJpeg("折线图");
   fjc.pack();
   RefineryUtilities.centerFrameOnScreen(fjc);
   fjc.setVisible(true);

}
// 生成显示图表的面板
public static JPanel createDemoLine() {
   JFreeChart jfreechart = createChart(createDataset());
   return new ChartPanel(jfreechart);
}
// 生成图表主对象JFreeChart
public static JFreeChart createChart(DefaultCategoryDataset linedataset) {
   // 定义图表对象
   JFreeChart chart = ChartFactory.createLineChart("一季度销售曲线", //折线图名称
     "时间", // 横坐标名称
     "销售额(百万)", // 纵坐标名称
     linedataset, // 数据
     PlotOrientation.VERTICAL, // 水平显示图像
     true, // include legend
     true, // tooltips
     false // urls
     );
   CategoryPlot plot = chart.getCategoryPlot();
   plot.setRangeGridlinesVisible(true); //是否显示格子线
   plot.setBackgroundAlpha(0.3f); //设置背景透明度
   NumberAxis rangeAxis = (NumberAxis)plot.getRangeAxis();
   rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
   rangeAxis.setAutoRangeIncludesZero(true);
   rangeAxis.setUpperMargin(0.20);
   rangeAxis.setLabelAngle(Math.PI / 2.0);
   return chart;
}
// 生成数据
public static DefaultCategoryDataset createDataset() {
   DefaultCategoryDataset linedataset = new DefaultCategoryDataset();
   // 各曲线名称
   String series1 = "冰箱";
   String series2 = "彩电";
   String series3 = "洗衣机";
   // 横轴名称(列名称)
   String type1 = "1月";
   String type2 = "2月";
   String type3 = "3月";
   linedataset.addValue(0.0, series1, type1);
   linedataset.addValue(4.2, series1, type2);
   linedataset.addValue(3.9, series1, type3);
   linedataset.addValue(1.0, series2, type1);
   linedataset.addValue(5.2, series2, type2);
   linedataset.addValue(7.9, series2, type3);
   linedataset.addValue(2.0, series3, type1);
   linedataset.addValue(9.2, series3, type2);
   linedataset.addValue(8.9, series3, type3);
   return linedataset;
}
}