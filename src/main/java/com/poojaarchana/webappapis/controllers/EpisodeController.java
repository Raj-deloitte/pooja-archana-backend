package com.poojaarchana.webappapis.controllers;

import com.poojaarchana.webappapis.payloads.EpisodeDto;
import com.poojaarchana.webappapis.services.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/episode")
public class EpisodeController {

    @Autowired
    private EpisodeService episodeService;

    @GetMapping("/all")
    public ResponseEntity<List<EpisodeDto>> getAllEpisode(){
        return  ResponseEntity.ok(this.episodeService.getAllEpisode());
    }


    @GetMapping("/story/{storyId}")
        public ResponseEntity<List<EpisodeDto>> getEpisodeByStory(@PathVariable Long storyId){
        List<EpisodeDto> episodeDtos=this.episodeService.getEpisodeByStory(storyId);
        return new ResponseEntity<List<EpisodeDto>>(episodeDtos, HttpStatus.OK);
    }

}
