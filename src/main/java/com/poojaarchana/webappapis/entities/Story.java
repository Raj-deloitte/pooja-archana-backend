package com.poojaarchana.webappapis.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name= "Stories")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Story {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 100, nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "views")
    private Long views;

    private Date date;

    @ManyToOne
    private Category category;

//  @OneToMany(mappedBy = "story", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//  private List<Episode> episodes  = new ArrayList<>();

}
