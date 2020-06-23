package XML.Class;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @authtor liFei
 * @date 2020/6/23-9:51
 */
public class ServerParser {
    public static void main(String[] args) throws DocumentException {
        //创建解析器
        SAXReader saxReader=new SAXReader();
        //通过解析器的reader将配置文件读取到内存中,生成一个Document[org.dom4j]对象树
       Document document=saxReader.read("D:\\Practice\\JavaWeb\\src\\XML\\xml\\server.xml");
        //获取connector结点对象的路径：server->service->connector
        //获取connector结点元素对象的xpath路径：/server/service/connector  server//connector //connector
        Element connectorElt = (Element)document.selectSingleNode("server//connector");
        //获取connectorELt结点元素对象的port属性对象
        Attribute portAttr=connectorElt.attribute("port");
        //获取portAttr属性对象的值
        String port=portAttr.getStringValue();
        System.out.println(port);
        //System.out.println(connectorElt.attributeValue("port"));
    }
}
