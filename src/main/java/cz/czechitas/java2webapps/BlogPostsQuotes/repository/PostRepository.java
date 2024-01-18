package cz.czechitas.java2webapps.BlogPostsQuotes.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cz.czechitas.java2webapps.BlogPostsQuotes.entity.Post;

import java.time.LocalDate;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    Page<Post> findByPublishedBeforeOrderByPublished(LocalDate date, Pageable pageable);

    Post findBySlug(String slug);
}
