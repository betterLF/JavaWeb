package File;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@WebServlet(name = "fileUploadServlet")
public class fileUploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        /*
          1.创建工厂类  DiskFileItemFactory
          2.创建解析器ServletFileUpload类
          3.使用ServletFileUpload中的list<FileItem> parseRequest(request)
          4.FileItem中的write()方法，写到服务器
         */
        //1.创建工厂类  DiskFileItemFactory
        DiskFileItemFactory diskFileItemFactory=new DiskFileItemFactory();
        //2.创建解析器ServletFileUpload类
        ServletFileUpload upload = new ServletFileUpload(diskFileItemFactory);
        //获取upload文件(要上传到的地方)的真实路径
        String realPath = this.getServletContext().getRealPath("/File/upload");
        //设置单个文件的上传大小
        upload.setFileSizeMax(2*1024);
        //3.使用ServletFileUpload中的list<FileItem> parseRequest(request)
        //迭代集合，查找指定的文件
        try {
            List<FileItem> list=upload.parseRequest(request);
            for (FileItem fileItem:list){
                if(fileItem.isFormField()==false){
                    //4.FileItem中的write()方法，写到服务器
                    String uuid = UUID.randomUUID().toString().replace("-", "");
                    File file=new File(realPath+"/"+uuid+fileItem.getName());
                    fileItem.write(file);
                    response.getWriter().write("upload success!!!");
                }
            }
        } catch (FileUploadBase.FileSizeLimitExceededException e) {
            response.getWriter().write("文件不能超过2kb");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            //获取参数
        String uname = request.getParameter("uname");
        String fileupload = request.getParameter("fileupload");
        System.out.println(uname);
        System.out.println(fileupload);
    }
}
