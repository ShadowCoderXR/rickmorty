package com.library.rickmorty;

import com.library.rickmorty.model.Character;
import com.library.rickmorty.model.Episode;
import com.library.rickmorty.model.Location;
import com.library.rickmorty.service.CharacterService;
import com.library.rickmorty.service.EpisodeService;
import com.library.rickmorty.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RickMortyClient {
    private final CharacterService characterService;
    private final EpisodeService episodeService;
    private final LocationService locationService;


    @Autowired
    public RickMortyClient(CharacterService characterService, EpisodeService episodeService, LocationService locationService) {
        this.characterService = characterService;
        this.episodeService = episodeService;
        this.locationService = locationService;
    }

    public Character getCharacterById(int id) {
        return characterService.getCharacterById(id);
    }
    public List<Character> getCharacters() {
        return characterService.getAllCharacters();
    }
    public Location getLocationById(int id) {
        return locationService.getLocationById(id);
    }
    public List<Location> getLocations() {
        return locationService.getAllLocations();
    }
    public Episode getEpisodeById(int id) {
        return episodeService.getEpisodeById(id);
    }
    public List<Episode> getEpisodes() {
        return episodeService.getAllEpisodes();
    }
}
