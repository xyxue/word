package com.wwy;

import  org.apdplat.word.*;

import org.apdplat.word.WordFrequencyStatistics;
import org.apdplat.word.segmentation.SegmentationAlgorithm;
import org.apdplat.word.segmentation.Word;

import java.util.List;

/**
 * Created by wy_xue on 2018/4/18.
 */
public class test {

    public  void test1 (){
        List<Word> words = WordSegmenter.seg("我国工人阶级和广大劳动群众要更加紧密地团结在党中央周围");
        System.out.println(words);
    }

    public  void frequency()
    {
//词频统计设置
//词频统计设置
        WordFrequencyStatistics wordFrequencyStatistics = new WordFrequencyStatistics();
        wordFrequencyStatistics.setRemoveStopWord(false);
        wordFrequencyStatistics.setResultPath("word-frequency-statistics.txt");
        wordFrequencyStatistics.setSegmentationAlgorithm(SegmentationAlgorithm.MaxNgramScore);
//开始分词
        wordFrequencyStatistics.seg("明天下雨，结合成分子，明天有关于分子和原子的课程，下雨了也要去听课");
//输出词频统计结果
        wordFrequencyStatistics.dump();


    }

}
