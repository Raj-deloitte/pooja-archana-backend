package com.poojaarchana.webappapis.services.impl;

import com.poojaarchana.webappapis.entities.Category;
import com.poojaarchana.webappapis.entities.Story;
import com.poojaarchana.webappapis.exceptions.ResourceNotFoundException;
import com.poojaarchana.webappapis.payloads.StoryDto;
import com.poojaarchana.webappapis.repositories.CategoryRepository;
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
    private CategoryRepository categoryRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<StoryDto> getStoryByCategory(Long categoryId) {
        Category category = this.categoryRepository.findById(categoryId).orElseThrow(() -> new ResourceNotFoundException("Category", "id", categoryId));
        List<Story> stories = this.storyRepository.findByCategory(category);
        return stories.stream().map((story) -> this.modelMapper.map(story, StoryDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<StoryDto> getAllStory() {
        List<Story> stories = this.storyRepository.findAll();
        return stories.stream().map(this::storyToDto).collect(Collectors.toList());
    }

    private Story dtoToStory(StoryDto storyDto){
        return  this.modelMapper.map(storyDto,Story.class);
    }
    private StoryDto storyToDto(Story story){
        return this.modelMapper.map(story,StoryDto.class);
    }

}
