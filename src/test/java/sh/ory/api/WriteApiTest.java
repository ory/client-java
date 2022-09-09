/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.37
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.api;

import sh.ory.ApiException;
import sh.ory.model.GenericError;
import sh.ory.model.PatchDelta;
import sh.ory.model.RelationQuery;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WriteApi
 */
@Ignore
public class WriteApiTest {

    private final WriteApi api = new WriteApi();

    
    /**
     * # Create a Relation Tuple
     *
     * Use this endpoint to create a relation tuple.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRelationTupleTest() throws ApiException {
        RelationQuery relationQuery = null;
                RelationQuery response = api.createRelationTuple(relationQuery);
        // TODO: test validations
    }
    
    /**
     * # Delete Relation Tuples
     *
     * Use this endpoint to delete relation tuples
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRelationTuplesTest() throws ApiException {
        String namespace = null;
        String _object = null;
        String relation = null;
        String subjectId = null;
        String subjectSetNamespace = null;
        String subjectSetObject = null;
        String subjectSetRelation = null;
                api.deleteRelationTuples(namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation);
        // TODO: test validations
    }
    
    /**
     * # Patch Multiple Relation Tuples
     *
     * Use this endpoint to patch one or more relation tuples.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchRelationTuplesTest() throws ApiException {
        List<PatchDelta> patchDelta = null;
                api.patchRelationTuples(patchDelta);
        // TODO: test validations
    }
    
}
