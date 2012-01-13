package com.ccc.service;

import com.ccc.api.Article;
import com.ccc.api.Folder;
import com.ccc.api.service.LibraryService;
import com.ccc.domain.ArticleImpl;
import com.ccc.domain.FolderImpl;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * //TODO class description
 * <p/>
 * Date: 1/10/12
 *
 * @author Nikita Levyankov
 */
@Component
public class LibraryServiceImpl implements LibraryService {

    public List<Folder> getFolders() {
        Folder folder = new FolderImpl();
        folder.setId(1);
        folder.setName("Test Folder name");
        return Arrays.asList(folder);
    }

    public List<Article> getFolderArticles(Integer folderId) {
        Article article = new ArticleImpl();
        article.setId(123);
        article.setName("Article 1");
        return Arrays.asList(article);
    }
}
