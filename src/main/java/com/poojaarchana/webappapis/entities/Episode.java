package com.poojaarchana.webappapis.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "Episodes")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;


    private String ep_number;

    @Column
    private String content;


    @ManyToOne
    private Story story;

}
