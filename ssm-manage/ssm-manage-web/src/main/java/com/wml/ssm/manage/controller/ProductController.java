package com.wml.ssm.manage.controller;

/**
 * Decription:
 * Created by WangMinli on 2017/12/26.
 */

import com.generator.pojo.Product;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/uploadFile")
public class ProductController {
    private static final Log logger =
            LogFactory.getLog(ProductController.class);

    @RequestMapping(value = "/input-product")
    public String inputProduct(Model model) {
        model.addAttribute("product", new Product());
        return "productForm";
    }

    @RequestMapping(value = "/save-product")
    public String saveProduct(HttpServletRequest servletRequest,
                              @ModelAttribute Product product,
                              BindingResult bindingResult, Model model) {
        List<MultipartFile> files = product.getImages();
        List<String> fileNames = new ArrayList<String>();
        if (null != files && files.size() > 0) {
            for (MultipartFile multipartFile : files) {
                String fileName =
                        multipartFile.getOriginalFilename();
                fileNames.add(fileName);
                // TODO: 2017/12/26 修改文件上传路径，并不在/images下
                String path = "d:\\"; //servletRequest.getSession().getServletContext().getRealPath("/statics/images");

                File imageFile = new File(path, fileName);
                try {
                    multipartFile.transferTo(imageFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        // save product here
        model.addAttribute("product", product);
        return "productDetail";
    }
}