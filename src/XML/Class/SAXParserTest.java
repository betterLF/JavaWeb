package XML.Class;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * @authtor liFei
 * @date 2020/6/22-11:47
 */
public class SAXParserTest {
    static class MyDefaultHandler extends DefaultHandler {
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            //super.startElement(uri, localName, qName, attributes);
            System.out.print("<"+qName+">");
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            //super.endElement(uri, localName, qName);
            System.out.print("</"+qName+">");
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            //super.characters(ch, start, length);
            System.out.print(new String(ch,start,length));
        }
    }
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {//边解读边解析，适合解析大文本文件
        //创建解析工程
        SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();
        //创建解析器
        SAXParser saxParser = saxParserFactory.newSAXParser();
        //通过解析器的parser方法
        saxParser.parse("D:\\Practice\\JavaWeb\\src\\XML\\xml\\students.xml",new MyDefaultHandler());

    }
}
