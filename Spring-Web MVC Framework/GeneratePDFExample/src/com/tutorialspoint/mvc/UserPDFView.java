package com.tutorialspoint.mvc;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.BadElementException;
import com.lowagie.text.Document;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */
public class UserPDFView extends AbstractPdfView {

    @Override
    protected void buildPdfDocument(Map<String, Object> arg0, Document arg1, PdfWriter arg2, HttpServletRequest arg3,
	    HttpServletResponse arg4) throws Exception {

	Map<String,String> userData = (Map<String, String>) arg0.get("userData");
	Table table = new Table(2);
	table.addCell("Rool NO");
	table.addCell("Name");
	
	userData.entrySet().forEach(entry -> {
	    try {
		table.addCell(entry.getKey());
		table.addCell(entry.getValue());
	    } catch (BadElementException e) {
		e.printStackTrace();
	    }
	});
	arg1.add(table);
    }
}