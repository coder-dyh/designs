package edu.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

/**
 * 订阅，接收消息
 */
@WebServlet(urlPatterns = "/receive")
public class SubscribeServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取消息队列
        BlockingQueue<String> queue = (BlockingQueue<String>)req.getServletContext().getAttribute("queue");
        //获取消息，并响应客户端
        try {
            String message = queue.take();
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().println(message);
        } catch (InterruptedException e) {
            throw new ServletException(e);
        }
    }
}
