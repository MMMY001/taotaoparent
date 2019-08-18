/**
 * FileName: PicServiceImpl
 * Author:   MaYue
 * Date:     2019/8/18 21:10
 * Description: 图片
 */
package com.taotao.service.impl;

import com.taotao.common.utils.FtpUtil;
import com.taotao.common.utils.IDUtils;
import com.taotao.service.IPicService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

@Service
public class PicServiceImpl implements IPicService {

    @Value("${FTP_ADDRESS}")
    private String FTP_ADDRESS;

    @Value("${FTP_PORT}")
    private int FTP_PORT;

    @Value("${FTP_USERNAME}")
    private String FTP_USERNAME;

    @Value("${FTP_PASSWORD}")
    private String FTP_PASSWORD;

    @Value("${FTP_BASE_PATH}")
    private String FTP_BASE_PATH;

    @Value("${IMAGE_BASE_URL}")
    private String IMAGE_BASE_URL;

    @Override
    public Map uploadPic(MultipartFile uploadFile) {
        Map resultMap = new HashMap();
        try {
            // 生成一个新的文件名字
            // 取原始文件名
            String oldName = uploadFile.getOriginalFilename();
            //生产新文件名,保证不重复使用UUID或者其他方法
//        UUID.randomUUID();
            String newName = IDUtils.genImageName();
            newName = newName + oldName.substring(oldName.lastIndexOf("."));
            // 图片上传
            String imagePath = new DateTime().toString("/yyyy/MM/dd");
            boolean result = FtpUtil.uploadFile(FTP_ADDRESS, FTP_PORT, FTP_USERNAME, FTP_PASSWORD, FTP_BASE_PATH,
                    imagePath, newName, uploadFile.getInputStream());
            if (!result) {
                resultMap.put("error", "1");
                resultMap.put("message", "文件上传失败");

                return resultMap;
            }
            resultMap.put("error", "0");
            resultMap.put("url", IMAGE_BASE_URL + imagePath + "/" + newName);
            return resultMap;
        } catch (IOException e) {
            e.printStackTrace();
            resultMap.put("error", "1");
            resultMap.put("message", "文件上传发生异常");
            return resultMap;
        }

    }

}
