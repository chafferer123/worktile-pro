package com.zqgame.mappers;

import org.noo.pagination.page.Page;
import java.util.List;
import com.zqgame.models.Blog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository(value="blogMapper")
public interface BlogMapper {
	Blog findById(@Param("id") int id );
	int save(Blog blog);
	List<Blog> findAllBlogs(Page tag);
	int delete(Blog blog);
}
