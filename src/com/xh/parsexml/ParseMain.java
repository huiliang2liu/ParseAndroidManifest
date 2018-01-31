package com.xh.parsexml;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ParseMain {

	public static void main(String[] args) {

		byte[] byteSrc = null;
		FileInputStream fis = null;
		ByteArrayOutputStream bos = null;
		try {
			fis = new FileInputStream("xmltest/AndroidManifest.xml");
			bos = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int len = 0;
			while ((len = fis.read(buffer)) != -1) {
				bos.write(buffer, 0, len);
			}
			byteSrc = bos.toByteArray();
		} catch (Exception e) {
			System.out.println("parse xml error:" + e.toString());
		} finally {
			try {
				fis.close();
				bos.close();
			} catch (Exception e) {

			}
		}
		try {
			ParseXml xml = new ParseXml(byteSrc);
			List<String> strings = xml.activity;
			if (strings != null && strings.size() > 0)
				for (String string : strings) {
					System.out.println(string);
				}
//			Map<String, String> meta_data=xml.meta_data;
			
			// System.out.println(xml.packageName);
			// System.out.println(xml.versionCode);
			// System.out.println(xml.versionName);
			// System.out.println(xml.application);
			// System.out.println(xml.xmlSb);
			// Map<String, String> map=xml.prefixUriMap;
//			 Iterator<Entry<String, String>>
//			 iterator=meta_data.entrySet().iterator();
//			 while (iterator.hasNext()) {
//			 Entry<String, String> entry=iterator.next();
//			 System.out.println(entry.getKey()+"=="+entry.getValue());
//			 }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// System.out.println("Parse XML Header------------");
		// ParseChunkUtils.parseXmlHeader(byteSrc);
		// System.out.println();
		//
		// System.out.println("Parse String Chunk-------------");
		// ParseChunkUtils.parseStringChunk(byteSrc);
		// System.out.println();
		//
		// System.out.println("Parse Resource Chunk------------");
		// ParseChunkUtils.parseResourceChunk(byteSrc);
		// System.out.println();
		//
		// System.out.println("Parse XML Content-------------");
		// ParseChunkUtils.parseXmlContent(byteSrc);
		// System.out.println();
		//
		// ParseChunkUtils.writeFormatXmlToFile();

	}

}
