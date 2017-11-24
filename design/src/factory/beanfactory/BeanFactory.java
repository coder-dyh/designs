package factory.beanfactory;

/**
 * 万能工厂
 */
public class BeanFactory {

    /**
     * 这里的name参数其实就是任何对象的完整类名（包名+类名）
     * @return
     */
    public static <T> T getBean(String name){
        T bean = null;
        try {
            //依据完整类名创建唯一的的Class对象
            Class<?> clazz = Class.forName(name);
            //根据Class对象创建实例
            bean = (T)clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }
}
