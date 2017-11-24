package edu.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

/**
 * 发布，发送消息
 */
@WebServlet(urlPatterns = "/send")
public class PublishServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //接收页面的消息内容
        String message = req.getParameter("message");
        //将消息发布到消息队列
        BlockingQueue<String> queue = (BlockingQueue<String>)req.getServletContext().getAttribute("queue");
        try {
            queue.put(message);
        } catch (InterruptedException e) {
            throw new ServletException(e);
        }
    }
}
