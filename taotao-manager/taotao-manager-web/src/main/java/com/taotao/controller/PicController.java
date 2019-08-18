/**
 * FileName: PicController
 * Author:   MaYue
 * Date:     2019/8/18 22:19
 * Description: 上传图片处理
 */
package com.taotao.controller;

import com.taotao.common.utils.JsonUtils;
import com.taotao.service.IPicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Controller
public class PicController {


    @Autowired
    private IPicService picService;

    /**
     * 图片上传
     *
     * @param uploadFile
     * @return
     */
    @RequestMapping("/pic/upload")
    @ResponseBody
    public String uploadPicture(MultipartFile uploadFile) {
        Map result = picService.uploadPic(uploadFile);
        String jsonResult = JsonUtils.objectToJson(result);
        return jsonResult;
    }

}
