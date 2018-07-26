package org.springframework.data.elasticsearch.utils;

import org.elasticsearch.common.io.stream.BytesStream;
import org.elasticsearch.common.xcontent.XContentBuilder;

public class XContentBuilderToString {
    public static String convert(XContentBuilder xContentBuilder){
        return ((BytesStream) xContentBuilder.getOutputStream()).bytes().utf8ToString();
    }
}
