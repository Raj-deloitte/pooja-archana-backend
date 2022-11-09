package com.poojaarchana.webappapis.services.impl;

import com.poojaarchana.webappapis.entities.Story;
import com.poojaarchana.webappapis.payloads.StoryDto;
import com.poojaarchana.webappapis.repositories.StoryRepository;
import com.poojaarchana.webappapis.services.StoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StoryServiceImpl implements StoryService {

    @Autowired
    private StoryRepository storyRepository;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public List<StoryDto> getAllStory() {
        List<Story> stories=this.storyRepository.findAll();
        return stories.stream().map(this::storyToDto).collect(Collectors.toList());
    }


    private Story dtoToStory(StoryDto storyDto){
        return  this.modelMapper.map(storyDto,Story.class);
    }
    private StoryDto storyToDto(Story story){
        return this.modelMapper.map(story,StoryDto.class);
    }




}
