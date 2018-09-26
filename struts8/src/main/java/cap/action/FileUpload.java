package cap.action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.net.httpserver.Authenticator;

public class FilploadAction extends ActionSupport {
    private static final long serialVersionUID=1L;
    private File file;
    private String fileFileName;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }
    public String execute()throws Exception
    {
        InputStream is=new FileInputStream(file);
        OutputStream os=new FileOutputStream("d:\\"+fileFileName);
        byte[]buffer=new byte[1024];
        int length=0;
        while ((length=is.read(buffer))!=-1){
            os.close();
            is.close();
            return Success;
        }
    }
}
