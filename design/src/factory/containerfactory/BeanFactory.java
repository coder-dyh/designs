package factory.containerfactory;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 容器工厂
 */
public class BeanFactory {

    //核心容器，用于存放所有已注册的实例
    private static Map<String, Object> container = new HashMap<String, Object>();

    /**
     * 在构造方法中初始化容器
     * resourcePath是外部传入的一个xml配置文件的路径
     * 目的就是去解析这个beans.xml文件
     * 使用dom4j来解析xml
     */
    public BeanFactory(String resourcePath){
        init(resourcePath);
    }

    /**
     * 初始化容器
     * @param resourcePath
     */
    private void init(String resourcePath){
        //创建SAX解析器
        SAXReader reader = new SAXReader();
        try {
            //读取xml文件，并构建成一个Document对象
            Document doc = reader.read(Thread.currentThread().getContextClassLoader().getResourceAsStream(resourcePath));
            //现获取document的根元素
            Element root = doc.getRootElement();
            //获取所有的子元素
            List<Element> childs = root.elements();
            //循环遍历，解析子元素的属性
            for (Element e : childs) {
                //获取id属性的值
                String id = e.attributeValue("id");
                //获取class属性的值
                String className = e.attributeValue("class");
                //将信息放入容器中
                container.put(id, Class.forName(className).newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 提供一个从容器中获取实例的方法
     * @param id
     * @return
     */
    public Object getBean(String id){
        return container.get(id);
    }

    /**
     * 重载一个泛型的方法
     */
    public <T> T getBean(String id, Class<T> clazz){
        return (T)container.get(id);
    }
}
