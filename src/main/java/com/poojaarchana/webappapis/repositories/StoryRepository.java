package com.poojaarchana.webappapis.repositories;

import com.poojaarchana.webappapis.entities.Category;
import com.poojaarchana.webappapis.entities.Story;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoryRepository extends JpaRepository<Story, Long> {
    List<Story> findByCategory(Category category);
}
