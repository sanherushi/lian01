package com.bawei;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/** 
* @author 作者:majingji
* @version 创建时间：2019年12月5日 下午1:53:00 
* 类功能说明 
*/
public class FileUtil {
	/***
	 * @Title: writeFile * 
	 * @Description: 按照指定的编码把内容写入指定的文件中 *
	 * @param path * 
	 * @param content * 
	 * @param charset * 
	 * @throws IOException * 
	 * @return: void
	 */
	/*
	 * public static void writeFile(String path, String content, String charset)
	 * throws IOException { // 创建写入的文件 File file = new File(path); // 创建输出流对象
	 * BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new
	 * FileOutputStream(file), charset)); bw.write(content); bw.flush(); bw.close();
	 * 
	 * }
	 */
	public static void writeFile(String path,String content,String charset) throws IOException {
		File file = new File(path);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
		bw.write(content);
		bw.flush();
		bw.close();
		
	}
}
