package com.ccq.moment4u.repository.es;

import com.ccq.moment4u.domain.EsBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface EsBlogRepository extends ElasticsearchRepository<EsBlog,String> {
    Page<EsBlog> findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContainingOrTagsContaining(String title, String summary, String content, String tags, Pageable pageable);
    EsBlog findByBlogId(Long blogId);
}
