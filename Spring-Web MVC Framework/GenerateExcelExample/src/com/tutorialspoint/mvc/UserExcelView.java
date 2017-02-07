package com.tutorialspoint.mvc;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class UserExcelView extends AbstractExcelView {
    int rowNum = 1;
    @Override
    protected void buildExcelDocument(Map<String, Object> arg0, HSSFWorkbook arg1, HttpServletRequest arg2,
            HttpServletResponse arg3) throws Exception {
        Map<String,String> userData = (Map<String, String>) arg0.get("userData");

        // create a wordsheet
        HSSFSheet sheet = arg1.createSheet("User Report");
       

        HSSFRow header = sheet.createRow(0);
        header.createCell(0).setCellValue("Roll No");
        header.createCell(1).setCellValue("Name");

        userData.entrySet().forEach(entry -> {
            // create the row data
            HSSFRow row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(entry.getKey());
            row.createCell(1).setCellValue(entry.getValue());
        });
    }
}