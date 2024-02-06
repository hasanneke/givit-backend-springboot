package com.zimaberlin.givit.repository;

import com.zimaberlin.givit.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Post, Integer> {
}
