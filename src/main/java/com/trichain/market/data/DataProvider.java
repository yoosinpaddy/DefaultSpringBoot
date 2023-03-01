package com.trichain.market.data;

import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class DataProvider {
    public List<File> getFirstTimeMedia(){
        File firstImage = null;
        File firstImage2 = null;
        File firstImage3 = null;
        File secondImage = null;
        File video = null;
        try {
            firstImage = ResourceUtils.getFile("classpath:screen/121111.jpg");
            secondImage = ResourceUtils.getFile("classpath:screen/121141.jpg");
            video = ResourceUtils.getFile("classpath:screen/istock-1085133262_preview.mp4");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }



        return List.of(firstImage, secondImage, video);
    }
}
