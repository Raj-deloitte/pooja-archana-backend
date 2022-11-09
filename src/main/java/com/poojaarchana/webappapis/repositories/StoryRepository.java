package com.poojaarchana.webappapis.repositories;

import com.poojaarchana.webappapis.entities.Story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryRepository extends JpaRepository<Story,Long> {

}
