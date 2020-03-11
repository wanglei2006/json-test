package com.wanglei.common.serializer;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;


public class CustomLongSerializer extends JsonSerializer<Long> {

	@Override
	public void serialize(Long value, JsonGenerator gen,
			SerializerProvider serializers) throws IOException {
		gen.writeString(String.valueOf(value));
	}
	
	@Override
	public Class<Long> handledType() {
		return Long.class;
	}

}
