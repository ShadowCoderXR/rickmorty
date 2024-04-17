package com.library.rickmorty.service;

import com.library.rickmorty.model.Episode;
import com.library.rickmorty.utils.HttpUtils;
import com.library.rickmorty.utils.JsonUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpisodeService {
    public List<Episode> getAllEpisodes() {
        String endpoint = "episode";
        String json = HttpUtils.get(endpoint, String.class);
        try {
            return JsonUtils.parseList(json, Episode.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public Episode getEpisodeById(int id) {
        String endpoint = "episode/" + id;
        String json = HttpUtils.get(endpoint, String.class);
        try {
            return JsonUtils.parse(json, Episode.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
