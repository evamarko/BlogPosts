package cz.czechitas.java2webapps.BlogPostsQuotes.service;

import cz.czechitas.java2webapps.BlogPostsQuotes.entity.Post;
import cz.czechitas.java2webapps.BlogPostsQuotes.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Page<Post> list() {
        return postRepository.findByPublishedBeforeOrderByPublished(LocalDate.now(), PageRequest.of(0, 5));
    }

    public Post singlePost(String slug) {
        return postRepository.findBySlug(slug);
    }
}
