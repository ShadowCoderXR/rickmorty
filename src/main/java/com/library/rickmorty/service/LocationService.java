package com.library.rickmorty.service;

import com.library.rickmorty.model.Location;
import com.library.rickmorty.utils.HttpUtils;
import com.library.rickmorty.utils.JsonUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    public List<Location> getAllLocations() {
        String endpoint = "location";
        String json = HttpUtils.get(endpoint, String.class);
        try {
            return JsonUtils.parseList(json, Location.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public Location getLocationById(int id) {
        String endpoint = "location/" + id;
        String json = HttpUtils.get(endpoint, String.class);
        try {
            return JsonUtils.parse(json, Location.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
