import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileName: TestFtpClient
 * Author:   MaYue
 * Date:     2019/7/18 1:24
 * Description: ftp客户端测试
 */

public class TestFtpClient {

    @Test
    public void testFtp() throws IOException {
        // 创建对象
        FTPClient ftpClient = new FTPClient();
        // 连接
        ftpClient.connect("144.168.60.58", 21);
        //登录
        ftpClient.login("ftpuser", "123");
        // 读取本地文件
        FileInputStream inputStream = new FileInputStream(new File("C:\\Users\\MaYue\\Pictures\\高清壁纸Z\\preview.jpg"));
        // 设置上传路径
        ftpClient.changeWorkingDirectory("/home/ftpuser/www");
        // 设置图片上传格式 二进制格式
        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
        // 上传图片
        ftpClient.storeFile("test.jpg", inputStream);

        // 关闭连接
        ftpClient.logout();

    }

}
