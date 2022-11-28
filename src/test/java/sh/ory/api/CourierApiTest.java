/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.0.0
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.api;

import sh.ory.ApiException;
import sh.ory.model.CourierMessageStatus;
import sh.ory.model.ErrorGeneric;
import sh.ory.model.Message;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CourierApi
 */
@Disabled
public class CourierApiTest {

    private final CourierApi api = new CourierApi();

    /**
     * List Messages
     *
     * Lists all messages by given status and recipient.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCourierMessagesTest() throws ApiException {
        Long perPage = null;
        Long page = null;
        CourierMessageStatus status = null;
        String recipient = null;
        List<Message> response = api.listCourierMessages(perPage, page, status, recipient);
        // TODO: test validations
    }

}
