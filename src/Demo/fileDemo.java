package Demo;

/**
 * @author lifei
 * @date 2020/7/2 8:32
 */
public class fileDemo {
    /*
    *文件上传&下载
          *上传
              1.导入两个jar包 commons-fileupload-1.4.jar commons-io-2.7.jar
              2.form 属性一定为method="post" enctype="multipart/form-data"(get会丢失数据)
                而且文件的type一定为file
              3.步骤  具体看fileUploadServlet
                   *创建工厂类  DiskFileItemFactory
                   *创建解析器ServletFileUpload类
                   *使用ServletFileUpload中的list<FileItem> parseRequest(request)
                   *FileItem中的write()方法，写到服务器
              4.优化文件上传
                 *使用UUID优化同名无法上传问题
                 *设置上传文件的大小  upload.setFileSizeMax(2*1024);
          *下载  具体看fileDownloadServlet
              1. //设置浏览器响应体文件类型
                  String mimeType = request.getServletContext().getMimeType(fileName);
                  response.setContentType(mimeType)
              2. //解决文件名中文乱码问题
                 String header=request.getHeader("User-Agent");
                 if(header!=null&&header.contains("Firefox")){
                 fileName="=?utf-8?B?"+ Base64.getEncoder().encode(fileName.getBytes("utf-8"));
                  }else{
                 fileName= URLEncoder.encode(fileName,"UTF-8");
                  }
              3. //设置浏览器响应内容格式为附件格式(告诉浏览器，是附件格式，下载)
                response.setHeader("Content-Disposition","attachment;filename="+fileName);
     */
}
