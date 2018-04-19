package com.wwy;

import org.apdplat.word.WordSegmenter;
import org.apdplat.word.WordFrequencyStatistics;
import org.apdplat.word.segmentation.SegmentationAlgorithm;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wy_xue on 2018/4/18.
 *
 * 文件分词
 */
public class wordsetfile {

    public void setformfile()
    {

        //分词源文件
        String intput = "D:\\Restfulapi_gitlab\\Restful_gitlab_sametimeWorkCopy\\word\\src\\main\\java\\com\\wwy\\test.txt";
        //分词结果
        String output="D:\\Restfulapi_gitlab\\Restful_gitlab_sametimeWorkCopy\\word\\src\\main\\java\\com\\wwy\\outtest.txt";
        try {
            WordSegmenter.seg(new File(intput),new File(output));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 统计词频
     */
    public void setformfilefrequency()
    {

        //分词源文件
        String intput = "D:\\Restfulapi_gitlab\\Restful_gitlab_sametimeWorkCopy\\word\\src\\main\\java\\com\\wwy\\test.txt";
        //分词结果
        String output="D:\\Restfulapi_gitlab\\Restful_gitlab_sametimeWorkCopy\\word\\src\\main\\java\\com\\wwy\\outtest.txt";
        try {

            //词频统计设置
            WordFrequencyStatistics wordFrequencyStatistics = new WordFrequencyStatistics();
            wordFrequencyStatistics.setRemoveStopWord(true);
            wordFrequencyStatistics.setResultPath("word-frequency-statistics.txt");
            wordFrequencyStatistics.setSegmentationAlgorithm(SegmentationAlgorithm.MaxNgramScore);

//            //准备文件
//            Files.write(Paths.get(intput), Arrays.asList("word分词是一个Java实现的分布式中文分词组件，提供了多种基于词典的分词算法，并利用ngram模型来消除歧义。"));
//清除之前的统计结果
            wordFrequencyStatistics.reset();
//对文件进行分词
            wordFrequencyStatistics.seg(new File(intput), new File(output));
//输出词频统计结果
            wordFrequencyStatistics.dump(output);



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
