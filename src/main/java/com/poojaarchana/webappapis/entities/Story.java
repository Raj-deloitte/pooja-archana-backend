package com.poojaarchana.webappapis.entities;

import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.ArrayList;
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
    private long id;

    @Column(name = "title", length = 100, nullable = false)
    private String Title;



    @OneToMany(mappedBy = "story", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Episode> episodes  = new ArrayList<>();



    @ManyToOne
    private Category category;



}
