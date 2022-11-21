package com.poojaarchana.webappapis.services;

import com.poojaarchana.webappapis.payloads.StoryDto;

import java.util.List;

public interface StoryService {

    List<StoryDto> getStoryByCategory(Long categoryId);
    List<StoryDto> getAllStory();
}
