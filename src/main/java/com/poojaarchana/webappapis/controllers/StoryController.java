package com.poojaarchana.webappapis.controllers;

import com.poojaarchana.webappapis.entities.Category;
import com.poojaarchana.webappapis.payloads.StoryDto;
import com.poojaarchana.webappapis.services.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/story")
public class StoryController {
    @Autowired
    private StoryService storyService;

    @GetMapping("/all")
    public ResponseEntity<List<StoryDto>> getAllStory(){
        return ResponseEntity.ok(this.storyService.getAllStory());
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<StoryDto>> getStoryByCategory(@PathVariable Long categoryId) {
        List<StoryDto> storyDtos = this.storyService.getStoryByCategory(categoryId);
        return new ResponseEntity<List<StoryDto>>(storyDtos, HttpStatus.OK);
    }
}
