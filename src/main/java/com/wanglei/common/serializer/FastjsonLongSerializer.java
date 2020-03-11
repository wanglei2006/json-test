package com.wanglei.common.serializer;

import java.io.IOException;
import java.lang.reflect.Type;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;


public class FastjsonLongSerializer implements ObjectSerializer {

	@Override
	public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features)
			throws IOException {
		SerializeWriter out = serializer.getWriter();
        if ( object == null ) {
            if ( out.isEnabled(SerializerFeature.WriteNullNumberAsZero) ) {
                out.write("0");
            } else {
                out.writeNull();
            }
            return;
        }
        out.writeString(object.toString());
	}

}
