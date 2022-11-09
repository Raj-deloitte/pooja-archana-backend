package com.poojaarchana.webappapis.payloads;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EpisodeDto {
    private long id;
    private String content;
    private String ep_number;
    private StoryDto storyDto;
}
