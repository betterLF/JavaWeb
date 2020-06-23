package XML.Class;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;

/**
 * @authtor liFei
 * @date 2020/6/23-10:09
 */
public class XPathTest {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {
        //创建解析工厂
        DocumentBuilderFactory documentBuilderFactory=DocumentBuilderFactory.newInstance();
        //创建解析器
        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        //通过解析器来读取配置文件,生成一个Document[org.w3c.dom]对象树
        Document document = builder.parse("D:\\Practice\\JavaWeb\\src\\XML\\xml\\books.xml");
        //创建Xpath对象
        XPath xPath = XPathFactory.newInstance().newXPath();
          /*
          1.获取bookstore结点下book属性category值为web下的第二个title结点的文本内容
          bookstore->book[@category="web"][2]->title
          xpath路径：/bookstore/book[@category="web"][2]/title/text();
           */
          String titleXpath="/bookstore/book[@category='web'][2]/title/text()";
        String titleValue=(String)xPath.evaluate(titleXpath,document, XPathConstants.STRING);
        System.out.println(titleValue);
        /*
        2.获取bookstore结点下book属性categoty值为web的title属性为en的结点内容
         */
        String enXpath="/bookstore/book[@category='web']/title[@lang='en']/text()";
        String enValue=(String)xPath.evaluate(enXpath,document,XPathConstants.STRING);
        System.out.println(enValue);
        /*
        3.获取bookstore下book属性category值为cooking的title的lang属性的值
         */
        String langXpath="/bookstore/book[@category='cooking']/title/@lang";
        String langValue=(String)xPath.evaluate(langXpath,document,XPathConstants.STRING);
        System.out.println(langValue);
        /*
        4.获取bookstore结点下所有book的结点集合
         */

       NodeList bookList=(NodeList) xPath.evaluate("/bookstore/book",document,XPathConstants.NODESET);
        for (int i = 0; i <bookList.getLength() ; i++) {
            System.out.println("================");
          Element bookElt=(Element)bookList.item(i);
            String curTitle = (String) xPath.evaluate("title", bookElt, XPathConstants.STRING);
            String authorValue=(String)xPath.evaluate("author",bookElt,XPathConstants.STRING);
            String yearValue = (String) xPath.evaluate("year", bookElt, XPathConstants.STRING);
            String priceValue=(String)xPath.evaluate("price",bookElt,XPathConstants.STRING);
            System.out.println(curTitle);
            System.out.println(authorValue);
            System.out.println(yearValue);
            System.out.println(priceValue);

        }
    }
}
