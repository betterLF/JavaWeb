package XML.Class;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @authtor liFei
 * @date 2020/6/22-19:51
 */
public class SysConfigParser {
    public static void main(String[] args) throws DocumentException {
        //创建解析器
        SAXReader reader = new SAXReader();
        //通过解析器的reader将配置文件读取到内存中,生成一个Document[org.dom4j]对象树
        Document document=reader.read("D:\\Practice\\JavaWeb\\src\\XML\\xml\\sys-config.xml");

        //driver-name结点元素的路径 config->database-info->driver-name
        //driver-name结点元素的xpath路径：/config/database-info/driver-name
        Element driverNameElt =(Element) document.selectSingleNode("/config/database-info/driver-name");
        //获取driverNameElt结点元素对象的文本内容
        String driverName= driverNameElt.getStringValue();
        System.out.println(driverName);

        //url结点元素路径：config->database-info->url
        //url结点元素的xpath路径：/config/database-info/url   或者//url 或者 config//url
        Element urlNameElt =(Element) document.selectSingleNode("config//url");
        //获取driverNameElt结点元素对象的文本内容
        String urlName= urlNameElt.getStringValue();
        System.out.println(urlName);


        //user结点元素路径：config->database-info->user
        //url结点元素的xpath路径：/config/database-info/user   或者//user 或者 config//user
        Element uesrNameElt =(Element) document.selectSingleNode("//uesr");
        //获取driverNameElt结点元素对象的文本内容
        String uesrName= uesrNameElt.getStringValue();
        System.out.println(uesrName);
          //该方法也可以
         //Element element=(Element) document.selectObject("//uesr");
         //System.out.println(element.getStringValue());


        //password结点元素路径：config->database-info->password
        //password结点元素的xpath路径：/config/database-info/password   或者//password 或者 config//password
        Element element=(Element) document.selectObject("//password");
        System.out.println(element.getStringValue());
    }
}