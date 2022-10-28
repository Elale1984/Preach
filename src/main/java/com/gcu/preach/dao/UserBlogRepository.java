package com.gcu.preach.dao;

import com.gcu.preach.entity.BlogPost;

import java.util.List;
//UserBlogRepository is the repot for user blogs
public interface UserBlogRepository {
	void createUserBlogPosts(BlogPost blogPost);

	void updateUserBlogPosts(BlogPost blogPost);

	void deleteUserBlogPosts(int id);

	BlogPost getUserBlogPostById(int id);

	List<BlogPost> getAllUserBlogPosts(String username);

	int GetNextUserBlogPostId();
}
