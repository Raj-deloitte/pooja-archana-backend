package com.poojaarchana.webappapis.payloads;

import com.poojaarchana.webappapis.entities.Episode;
import lombok.*;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StoryDto {
    private long id;

    @Size(min = 4 , message = "Minimum size of title should be 4 characters")
    private String title;

    private String description;

    private Long views;

    private Date date;

    private CategoryDto category;

//  private List<Episode> episodes = new ArrayList<>();
}
