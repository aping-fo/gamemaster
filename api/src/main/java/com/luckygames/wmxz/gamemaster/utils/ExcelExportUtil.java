package com.luckygames.wmxz.gamemaster.utils;

import java.beans.PropertyDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class ExcelExportUtil {
	public static void export(File file, List<?> list, String[] arr,Class<?> clazz) {
		XLSExport e = new XLSExport(file);
		try {
			Field[] fields = clazz.getDeclaredFields();
			// 实体类方法集合
			List<Method> methods = new ArrayList<Method>();
			for (Field field : fields) {
				// 通过类属性获得方法
				PropertyDescriptor pd = new PropertyDescriptor(field.getName(), clazz);
				// 获得get方法
				Method Method = pd.getReadMethod();
				// 将获得的get方法添加到集合
				methods.add(Method);
			}
			if (list==null) {
				e.createRow(0);
				for (int j = 0; j < arr.length; j++) {
					e.setCell(j, arr[j]);
				}
			} else {
				// 创建表数据
				for (int i = -1; i < list.size(); i++) {
					// 创建表头
					if (i == -1) {
						e.createRow(0);
						for (int j = 0; j < arr.length; j++) {
							e.setCell(j, arr[j]);
							e.setColumn(j, arr[j]);
						}
					} else {
						// 创建表数据
						e.createRow(i + 1);
						for (int j = 0; j < arr.length; j++) {
							if (methods.get(j).invoke(list.get(i)) != null) {
								if (fields[j].getType() == Long.class) {
									e.setCell(j, (Long) (methods.get(j).invoke(list.get(i))));
								} else if (fields[j].getType() == Integer.class) {
									e.setCell(j, (Integer) (methods.get(j).invoke(list.get(i))));
								} else if (fields[j].getType() == String.class) {
									e.setCell(j, (String) (methods.get(j).invoke(list.get(i))));
								} else if (fields[j].getType() == Boolean.class) {
									e.setCell(j, (Boolean) (methods.get(j).invoke(list.get(i))));
								}else if (fields[j].getType() == Double.class) {
									e.setCell(j, (Double) (methods.get(j).invoke(list.get(i))));
								}else if (fields[j].getType() == BigDecimal.class) {
									e.setCell(j, (BigDecimal) (methods.get(j).invoke(list.get(i))));
								}else if (fields[j].getType() == Date.class) {
									SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
									e.setCell(j, sdf.format (methods.get(j).invoke(list.get(i))));
								}
							}
						}
					}
				}
			}
			System.out.println(" 导出Excel文件[成功] ");
			e.exportXLS();
		} catch (XLSException e1) {
			System.out.println(" 导出Excel文件[失败] ");
			e1.printStackTrace();
		} catch (Exception e2) {
			System.out.println(" 导出Excel文件[失败] ");
			e2.printStackTrace();
		}
	}
}

class XLSExport {
	// 定制浮点数格式
	private static String NUMBER_FORMAT = " #,##0.00 ";
	private File xlsFileName;
	private HSSFWorkbook workbook;
	private HSSFSheet sheet;
	private HSSFRow row;

	public XLSExport(File file) {
		this.xlsFileName = file;
		this.workbook = new HSSFWorkbook();
		this.sheet = workbook.createSheet();

	}
	//设置列宽
	public void setColumn(int index,String temp){
		this.sheet.setColumnWidth(index, temp.getBytes().length*2*200);
	}

	/**
	 * 导出Excel文件
	 *
	 * @throws XLSException
	 */
	public void exportXLS() throws XLSException {
		try {
			FileOutputStream fOut = new FileOutputStream(xlsFileName);
			workbook.write(fOut);
			fOut.flush();
			fOut.close();
		} catch (FileNotFoundException e) {
			throw new XLSException(" 生成导出Excel文件出错!");
		} catch (IOException e) {
			throw new XLSException(" 写入Excel文件出错! ");
		}

	}

	/**
	 * 增加一行
	 *
	 * @param index
	 *            行号
	 */
	public void createRow(int index) {
		this.row = this.sheet.createRow(index);
	}

	/**
	 * 设置单元格
	 *
	 * @param index
	 *            列号
	 * @param value
	 *            单元格填充值
	 */
	public void setCell(int index, String value) {
		HSSFCell cell = this.row.createCell(index);
		cell.setCellType(CellType.NUMERIC);
		cell.setCellValue(value);
	}

	/**
	 * 设置单元格
	 *
	 * @param index
	 *            列号
	 * @param value
	 *            单元格填充值
	 */
	public void setCell(int index, int value) {
		HSSFCell cell = this.row.createCell(index);
		cell.setCellType(CellType.NUMERIC);
		cell.setCellValue(value);
	}

	/**
	 * 设置单元格
	 *
	 * @param index
	 *            列号
	 * @param value
	 *            单元格填充值
	 */
	public void setCell(int index, Boolean b) {
		HSSFCell cell = this.row.createCell(index);
		cell.setCellType(CellType.NUMERIC);
		cell.setCellValue(b);
	}
	/**
	 * 设置单元格
	 *
	 * @param index
	 *            列号
	 * @param value
	 *            单元格填充值
	 */
	public void setCell(int index, double value) {
		HSSFCell cell = this.row.createCell(index);
		cell.setCellType(CellType.NUMERIC);
		cell.setCellValue(value);
		HSSFCellStyle cellStyle = workbook.createCellStyle(); // 建立新的cell样式
		HSSFDataFormat format = workbook.createDataFormat();
		cellStyle.setDataFormat(format.getFormat(NUMBER_FORMAT)); // 设置cell样式为定制的浮点数格式
		cell.setCellStyle(cellStyle); // 设置该cell浮点数的显示格式
	}
	/**
	 *
	 * @param index
	 * @param value
	 */
	public void setCell(int index, BigDecimal value) {
		HSSFCell cell = this.row.createCell(index);
		cell.setCellType(CellType.NUMERIC);
		cell.setCellValue(value.doubleValue());
		HSSFCellStyle cellStyle = workbook.createCellStyle(); // 建立新的cell样式
		HSSFDataFormat format = workbook.createDataFormat();
		cellStyle.setDataFormat(format.getFormat(NUMBER_FORMAT)); // 设置cell样式为定制的浮点数格式
		cell.setCellStyle(cellStyle); // 设置该cell浮点数的显示格式
	}
}

// 异常
class XLSException extends Exception {
	private static final long serialVersionUID = 3750960059587844961L;

	public XLSException() {
	}

	public XLSException(String message) {
		super(message);
	}
}