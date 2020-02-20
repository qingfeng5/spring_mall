package com.qingfeng.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * 文件处理的接口
 * @author 清风
 * @date 2020/2/19 16:08
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
