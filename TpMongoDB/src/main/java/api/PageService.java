package api;

import java.util.List;

import org.bson.Document;

public interface PageService {
	  String findPage(String id);

	    List<Document> findAllPages();

}
