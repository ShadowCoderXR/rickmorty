package com.library.rickmorty.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.library.rickmorty.model.Character;

import java.util.List;

public class JsonUtils {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T parse(String json, Class<T> valueType) throws JsonProcessingException {
        return objectMapper.readValue(json, valueType);
    }

    public static <T> List<T> parseList(String json, Class<T> valueType) throws JsonProcessingException {
        return objectMapper.readValue(json, objectMapper.getTypeFactory().constructCollectionType(List.class, valueType));
    }
}
