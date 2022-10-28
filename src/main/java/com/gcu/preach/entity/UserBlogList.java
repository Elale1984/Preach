package com.gcu.preach.entity;

import lombok.*;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
// data
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
// Blog List
public class UserBlogList {

	
	private List<BlogPost> userBlogPosts;

}
