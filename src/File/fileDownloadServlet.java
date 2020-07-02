package File;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Base64;

@WebServlet(name = "fileDownloadServlet")
public class fileDownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        //response.setContentType("text/html;charset=UTF-8");
        //获取文件名
        String fileName = request.getParameter("fileName");
        //获取该文件的真实路径
        String realPath = this.getServletContext().getRealPath("/File/download");
        String downPath=realPath+"/"+fileName;
        System.out.println(downPath);
        //设置浏览器响应体文件类型
        String mimeType = request.getServletContext().getMimeType(fileName);
        response.setContentType(mimeType);
        //解决文件名中文乱码问题
        String header=request.getHeader("User-Agent");
        if(header!=null&&header.contains("Firefox")){
            fileName="=?utf-8?B?"+ Base64.getEncoder().encode(fileName.getBytes("utf-8"));
        }else{
            fileName= URLEncoder.encode(fileName,"UTF-8");
        }
        //设置浏览器响应内容格式为附件格式(告诉浏览器，是附件格式，下载)
        response.setHeader("Content-Disposition","attachment;filename="+fileName);
        //读取目标资源，同时写到客户端(下载)
        //创建读入流
        FileInputStream fis=new FileInputStream(downPath);
        //创建读出流
        ServletOutputStream outputStream = response.getOutputStream();
        byte[]b=new byte[1024];
        while (fis.read(b)!=-1){
            outputStream.write(b);
        }
        fis.close();
        outputStream.close();
    }
}
