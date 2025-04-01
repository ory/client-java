/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.20.0
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.api;

import sh.ory.ApiException;
import sh.ory.model.BatchCheckPermissionBody;
import sh.ory.model.BatchCheckPermissionResult;
import sh.ory.model.CheckPermissionResult;
import sh.ory.model.ErrorGeneric;
import sh.ory.model.ExpandedPermissionTree;
import sh.ory.model.PostCheckPermissionBody;
import sh.ory.model.PostCheckPermissionOrErrorBody;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PermissionApi
 */
@Disabled
public class PermissionApiTest {

    private final PermissionApi api = new PermissionApi();

    /**
     * Batch check permissions
     *
     * To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void batchCheckPermissionTest() throws ApiException {
        Long maxDepth = null;
        BatchCheckPermissionBody batchCheckPermissionBody = null;
        BatchCheckPermissionResult response = api.batchCheckPermission(maxDepth, batchCheckPermissionBody);
        // TODO: test validations
    }

    /**
     * Check a permission
     *
     * To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkPermissionTest() throws ApiException {
        String namespace = null;
        String _object = null;
        String relation = null;
        String subjectId = null;
        String subjectSetNamespace = null;
        String subjectSetObject = null;
        String subjectSetRelation = null;
        Long maxDepth = null;
        CheckPermissionResult response = api.checkPermission(namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation, maxDepth);
        // TODO: test validations
    }

    /**
     * Check a permission
     *
     * To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkPermissionOrErrorTest() throws ApiException {
        String namespace = null;
        String _object = null;
        String relation = null;
        String subjectId = null;
        String subjectSetNamespace = null;
        String subjectSetObject = null;
        String subjectSetRelation = null;
        Long maxDepth = null;
        CheckPermissionResult response = api.checkPermissionOrError(namespace, _object, relation, subjectId, subjectSetNamespace, subjectSetObject, subjectSetRelation, maxDepth);
        // TODO: test validations
    }

    /**
     * Expand a Relationship into permissions.
     *
     * Use this endpoint to expand a relationship tuple into permissions.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void expandPermissionsTest() throws ApiException {
        String namespace = null;
        String _object = null;
        String relation = null;
        Long maxDepth = null;
        ExpandedPermissionTree response = api.expandPermissions(namespace, _object, relation, maxDepth);
        // TODO: test validations
    }

    /**
     * Check a permission
     *
     * To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postCheckPermissionTest() throws ApiException {
        Long maxDepth = null;
        PostCheckPermissionBody postCheckPermissionBody = null;
        CheckPermissionResult response = api.postCheckPermission(maxDepth, postCheckPermissionBody);
        // TODO: test validations
    }

    /**
     * Check a permission
     *
     * To learn how relationship tuples and the check works, head over to [the documentation](https://www.ory.sh/docs/keto/concepts/api-overview).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postCheckPermissionOrErrorTest() throws ApiException {
        Long maxDepth = null;
        PostCheckPermissionOrErrorBody postCheckPermissionOrErrorBody = null;
        CheckPermissionResult response = api.postCheckPermissionOrError(maxDepth, postCheckPermissionOrErrorBody);
        // TODO: test validations
    }

}
