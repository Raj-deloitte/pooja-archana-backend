package com.poojaarchana.webappapis.services;

import com.poojaarchana.webappapis.payloads.EpisodeDto;

import java.util.List;

public interface EpisodeService {

    List<EpisodeDto> getAllEpisode();

    List<EpisodeDto> getEpisodeByStory(Long storyId);

}
