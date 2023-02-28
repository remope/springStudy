package com.springStudy.springboot.web.dto;

import com.springStudy.springboot.domain.posts.Posts;

public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String auther;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.auther = entity.getAuther();
    }
}
