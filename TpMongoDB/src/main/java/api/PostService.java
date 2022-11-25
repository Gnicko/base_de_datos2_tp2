package api;

import java.util.List;

import org.bson.Document;

public interface PostService {
	 String findPost(String id);

	    String findLatestPosts();

	    String findByAuthor();

	    String findPostByAuthor(String name);

	    String searchPosts(String text);
}
