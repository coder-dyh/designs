package edu.demo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 消息队列的监听器
 */
@WebListener
public class MessageQueueListener implements ServletContextListener{

    //阻塞队列
    private static BlockingQueue<String> queue;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        queue = new LinkedBlockingQueue<>();
        //将这个队列放入上下文作用域
        servletContextEvent.getServletContext().setAttribute("queue", queue);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        servletContextEvent.getServletContext().removeAttribute("queue");
    }
}
