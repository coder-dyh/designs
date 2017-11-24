package factory.containerfactory;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 容器工厂
 */
public class ContainerFactory {

    //单例的容器(Singleton)
    private static Map<String, Object> singleton = new HashMap<String, Object>();
    //原型的容器（prototype）
    private static Map<String, Definition> prototype = new HashMap<String, Definition>();

    public ContainerFactory(String resourcePath) {
        //先初始化原型容器
        initPrototype(resourcePath);
        //初始化单例容器
        initSingleton();
    }

    //初始原型的容器
    private void initPrototype(String resourcePath){
        //创建SAX解析器
        SAXReader reader = new SAXReader();
        try {
            //解析，并创建Document对象
            Document doc = reader.read(Thread.currentThread().getContextClassLoader().getResourceAsStream(resourcePath));
            //获取doc的根节点
            Element root = doc.getRootElement();
            //获取所有的子节点
            List<Element> childs = root.elements();
            //解析子元素
            for (Element e: childs) {
                String id = e.attributeValue("id");
                String className = e.attributeValue("class");
                String scope = e.attributeValue("scope");
                //构建bean的描述定义
                Definition def = new Definition();
                def.setId(id);
                def.setClassName(className);
                if(scope != null){
                    def.setScope(scope);
                }
                //将def放入prototype容器中
                prototype.put(id, def);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 初始化单例的容器
     */
    private void initSingleton(){
        for (String key : prototype.keySet()) {
            Definition def = prototype.get(key);
            if("singleton".equals(def.getScope())){
                try {
                    singleton.put(key, Class.forName(def.getClassName()).newInstance());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public Object getBean(String name){
        return getContainerBean(name);
    }

    public <T> T getBean(String name, Class<T> clazz){
        return (T)getContainerBean(name);
    }

    private Object getContainerBean(String name){
        //获取作用域属性
        String scope = prototype.get(name).getScope();
        try {
            return ("singleton".equals(scope)) ? singleton.get(name) :
                    Class.forName(prototype.get(name).getClassName()).newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
