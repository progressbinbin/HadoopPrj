package com.huaren.hadoop;

import org.apache.commons.io.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;


import java.io.FileInputStream;


/**
 * Created by yuantousanfen on 2018/11/23.
 */
public class HadoopUtil {
    public static void main(String[] args) throws Exception{
       Configuration configuration=new Configuration();
       configuration.set("fs.defaultFS","hdfs://Huaren6:9000");
        System.out.println(configuration);
        FileSystem fileSystem=FileSystem.get(configuration);
        Path path= new Path("hdfs://Huaren6:9000/haha.txt");
        //FSDataOutputStream outputStream=fileSystem.create(path);
        /*FileInputStream inputStream= new FileInputStream("D:/qingshu.txt");
        IOUtils.copy(inputStream, outputStream);*/

    }
}
