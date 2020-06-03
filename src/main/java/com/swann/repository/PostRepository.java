package com.swann.repository;

import com.swann.entity.UserPost;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <UserPost, Long> {

}
