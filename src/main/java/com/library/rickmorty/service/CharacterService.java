package com.library.rickmorty.service;

import com.library.rickmorty.model.Character;
import com.library.rickmorty.utils.HttpUtils;
import com.library.rickmorty.utils.JsonUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {
    public List<Character> getAllCharacters() {
        String endpoint = "character";
        String json = HttpUtils.get(endpoint, String.class);
        try {
            return JsonUtils.parseList(json, Character.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public Character getCharacterById(int id) {
        String endpoint = "character/" + id;
        String json = HttpUtils.get(endpoint, String.class);
        try {
            return JsonUtils.parse(json, Character.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
