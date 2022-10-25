package com.sergeytechnologies.instazoo.facade;

import com.sergeytechnologies.instazoo.dto.PostDTO;
import com.sergeytechnologies.instazoo.entity.Post;
import org.springframework.stereotype.Component;

@Component
public class PostFacade {

    public PostDTO postToPostDTO(Post post) {
        PostDTO postDTO = new PostDTO();
        postDTO.setUserName(post.getUser().getUsername());
        postDTO.setId(postDTO.getId());
        postDTO.setCaption(post.getCaption());
        postDTO.setLikes(post.getLikes());
        postDTO.setUsersLiked(post.getLikedUsers());
        postDTO.setLocation(post.getLocation());
        postDTO.setTitle(postDTO.getTitle());

        return postDTO;
    }
}
