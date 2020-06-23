package XML.Class;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.Iterator;

/**
 * @authtor liFei
 * @date 2020/6/22-11:13
 */
public class Dom4jTest {//dom4j 加载完整个文档到内存再解析
    public static void main(String[] args) throws DocumentException {
        //创建解析器
        SAXReader reader=new SAXReader();
        //通过解析器的read方法将配置文件读取到内存中，生成一个Document[org.dom4j]对象树
        Document document=reader.read("D:\\Practice\\JavaWeb\\src\\XML\\xml\\students.xml");
        //获取根节点
        Element root = document.getRootElement();
        //开始遍历根节点
        Iterator<Element> rootIter=root.elementIterator();
        while (rootIter.hasNext()){
           Element studentElt= rootIter.next();
            Iterator<Element> childIter=studentElt.elementIterator();
            while (childIter.hasNext()){
              Element innerElt=childIter.next();
                System.out.println(innerElt.getStringValue());
            }
            System.out.println("========================================");
        }
    }
}
