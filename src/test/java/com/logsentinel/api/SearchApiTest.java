/*
 * LogSentinel RESTful API
 * Read more at https://docs.logsentinel.com/en/latest/index.html
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.logsentinel.api;

import com.logsentinel.ApiException;
import com.logsentinel.model.AuditLogEntry;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
@Ignore
public class SearchApiTest {

    private final SearchApi api = new SearchApi();

    
    /**
     * Search entries in batches by field
     *
     * Search entries by specifying a list of actorIds or entityIds. If entityId is specified, entityType should also be specified.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBatchTest() throws ApiException {
        String applicationId = null;
        String field = null;
        List<String> values = null;
        Integer batchSize = null;
        String entityType = null;
        Integer page = null;
        List<AuditLogEntry> response = api.getBatch(applicationId, field, values, batchSize, entityType, page);

        // TODO: test validations
    }
    
    /**
     * Get entity history
     *
     * Fetches all entries related to a specific entity (specified by type and id). Entity modifications can consist of diffs, so that fetching the whole history can be used for reconstructing the current state of the entity
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEntityHistoryTest() throws ApiException {
        String applicationId = null;
        String entityId = null;
        String entityType = null;
        List<AuditLogEntry> response = api.getEntityHistory(applicationId, entityId, entityType);

        // TODO: test validations
    }
    
    /**
     * Search logged entries
     *
     * Perform search using a Lucene query. The lucene query syntax can be &lt;a href&#x3D;\&quot;https://www.elastic.co/guide/en/elasticsearch/reference/current/query-dsl-query-string-query.html#query-string-syntax\&quot;&gt;found here&lt;/a&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void searchTest() throws ApiException {
        String applicationId = null;
        Long endTime = null;
        Integer page = null;
        Integer pageSize = null;
        String query = null;
        Long startTime = null;
        List<AuditLogEntry> response = api.search(applicationId, null);

        // TODO: test validations
    }
    
}
