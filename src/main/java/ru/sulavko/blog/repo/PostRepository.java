package ru.sulavko.blog.repo;

import org.springframework.data.repository.CrudRepository;
import ru.sulavko.blog.models.Post;

public interface PostRepository extends CrudRepository<Post,Long> {
}
