package com.tyk.controller;

import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tyk.service.MedService;
import com.tyk.vo.YpxxCustom;

@Controller
@RequestMapping("/ypml")
public class ExportAction {
	@Autowired
	private MedService medService;

	@RequestMapping("/ypxxexport.action")
	public void ypxxexport(HttpServletResponse response) {
		List<YpxxCustom> list = medService.FindListByCustom(null);
		HSSFWorkbook wb = ExportAction.export_text(list);
		try {
			String fileName = new String("MedicineRelation.xls".getBytes("UTF-8"), "ISO-8859-1");
			response.setContentType("application/x-download");
			response.setHeader("Content-disposition", "attachment; filename=" + fileName);
			OutputStream os = response.getOutputStream();
			// 将工作薄写入到输出流中
			wb.write(os);
			os.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public static HSSFWorkbook export_text(List<YpxxCustom> list) {
		try {
			// 创建工作薄对象
			HSSFWorkbook wb = new HSSFWorkbook();
			// 创建标题行样式
			HSSFCellStyle headStyle = headStyle(wb);
			// 创建内容行样式
			HSSFCellStyle contentStyle = contentStyle(wb);

			// 创建表
			HSSFSheet sheet_1 = wb.createSheet("药品信息");
			// 设置表的默认列宽
			for(int i=0;i<12;i++)
				sheet_1.autoSizeColumn(i, true);
			// 创建标题行
			HSSFRow headRow = sheet_1.createRow(0);
			HSSFCell head_cell_1 = headRow.createCell(0); // 创建标题行第一列
			head_cell_1.setCellValue("药品流水号"); // 第一列内容
			head_cell_1.setCellStyle(headStyle); // 将标题行样式添加

			HSSFCell head_cell_2 = headRow.createCell(1);
			head_cell_2.setCellValue("药品名称");
			head_cell_2.setCellStyle(headStyle);

			HSSFCell head_cell_3 = headRow.createCell(2);
			head_cell_3.setCellValue("剂    型");
			head_cell_3.setCellStyle(headStyle);
			
			HSSFCell head_cell_4 = headRow.createCell(3);
			head_cell_4.setCellValue("规    格");
			head_cell_4.setCellStyle(headStyle);
			
			HSSFCell head_cell_5 = headRow.createCell(4);
			head_cell_5.setCellValue("单    位");
			head_cell_5.setCellStyle(headStyle);
			
			HSSFCell head_cell_6 = headRow.createCell(5);
			head_cell_6.setCellValue("生产企业");
			head_cell_6.setCellStyle(headStyle);
			
			
			HSSFCell head_cell_7 = headRow.createCell(6);
			head_cell_7.setCellValue("批准文号");
			head_cell_7.setCellStyle(headStyle);
			
			HSSFCell head_cell_8 = headRow.createCell(7);
			head_cell_8.setCellValue("是否进口药（1:是;0:不是）");
			head_cell_8.setCellStyle(headStyle);
			
			HSSFCell head_cell_9 = headRow.createCell(8);
			head_cell_9.setCellValue("质量层次");
			head_cell_9.setCellStyle(headStyle);
			
			HSSFCell head_cell_10 = headRow.createCell(9);
			head_cell_10.setCellValue("交易状态");
			head_cell_10.setCellStyle(headStyle);

			HSSFCell head_cell_11 = headRow.createCell(10);
			head_cell_11.setCellValue("商品类别");
			head_cell_11.setCellStyle(headStyle);
			
			HSSFCell head_cell_12 = headRow.createCell(11);
			head_cell_12.setCellValue("产品说明");
			head_cell_12.setCellStyle(headStyle);
			// 为内容行添加数据和样式
			for (int i = 0; i < list.size(); i++) {
				HSSFRow contentRow = sheet_1.createRow(i+1);
				HSSFCell content_cell_1 = contentRow.createCell(0);
				content_cell_1.setCellValue(list.get(i).getMednumber());
				content_cell_1.setCellStyle(contentStyle);

				HSSFCell content_cell_2 = contentRow.createCell(1);
				 content_cell_2.setCellValue(list.get(i).getMedname());
				content_cell_2.setCellStyle(contentStyle);

				HSSFCell content_cell_3 = contentRow.createCell(2);
				content_cell_3.setCellValue(list.get(i).getMedjx());
				content_cell_3.setCellStyle(contentStyle);
				
				HSSFCell content_cell_4 = contentRow.createCell(3);
				content_cell_4.setCellValue(list.get(i).getMedgg());
				content_cell_4.setCellStyle(contentStyle);
				
				HSSFCell content_cell_5 = contentRow.createCell(4);
				content_cell_5.setCellValue(list.get(i).getMeddw());
				content_cell_5.setCellStyle(contentStyle);
				
				HSSFCell content_cell_6 = contentRow.createCell(5);
				content_cell_6.setCellValue(list.get(i).getMedmake());
				content_cell_6.setCellStyle(contentStyle);
				
				HSSFCell content_cell_7 = contentRow.createCell(6);
				content_cell_7.setCellValue(list.get(i).getMedpz());
				content_cell_7.setCellStyle(contentStyle);
				
				HSSFCell content_cell_8 = contentRow.createCell(7);
				content_cell_8.setCellValue(list.get(i).getMedjk());
				content_cell_8.setCellStyle(contentStyle);
				
				HSSFCell content_cell_9 = contentRow.createCell(8);
				content_cell_9.setCellValue(list.get(i).getZlccmc());
				content_cell_9.setCellStyle(contentStyle);
				
				HSSFCell content_cell_10 = contentRow.createCell(9);
				content_cell_10.setCellValue(list.get(i).getJyztmc());
				content_cell_10.setCellStyle(contentStyle);
				
				HSSFCell content_cell_11 = contentRow.createCell(10);
				content_cell_11.setCellValue(list.get(i).getLbmc());
				content_cell_11.setCellStyle(contentStyle);
				
				HSSFCell content_cell_12 = contentRow.createCell(11);
				content_cell_12.setCellValue(list.get(i).getMedabout());
				content_cell_12.setCellStyle(contentStyle);
			}
			return wb;
		} catch (Exception e) {
			e.getStackTrace();
		}

		return null;
	}

	public static HSSFCellStyle headStyle(HSSFWorkbook wb) {
		HSSFCellStyle headStyle = wb.createCellStyle(); // 创建样式对象
		HSSFFont headFont = wb.createFont(); // 创建字体
		headFont.setFontName("宋体");
		headFont.setColor(HSSFFont.COLOR_RED);
		headStyle.setFont(headFont);
		headStyle.setAlignment(HorizontalAlignment.CENTER);
		return headStyle;
	}
	
	public static HSSFCellStyle contentStyle(HSSFWorkbook wb) {
		HSSFCellStyle contentStyle = wb.createCellStyle();
		HSSFFont contentFont = wb.createFont();
		contentFont.setFontName("微软雅黑");
		contentFont.setColor(HSSFFont.COLOR_NORMAL);
		contentStyle.setFont(contentFont);
		contentStyle.setAlignment(HorizontalAlignment.CENTER);
		return contentStyle;
	}

}
