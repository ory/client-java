

# SelfServiceLoginFlow

This object represents a login flow. A login flow is initiated at the \"Initiate Login API / Browser Flow\" endpoint by a client.  Once a login flow is completed successfully, a session cookie or session token will be issued.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **IdentityCredentialsType** |  |  [optional] |
|**createdAt** | **OffsetDateTime** | CreatedAt is a helper struct field for gobuffalo.pop. |  [optional] |
|**expiresAt** | **OffsetDateTime** | ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to log in, a new flow has to be initiated. |  |
|**id** | **String** |  |  |
|**issuedAt** | **OffsetDateTime** | IssuedAt is the time (UTC) when the flow started. |  |
|**refresh** | **Boolean** | Refresh stores whether this login flow should enforce re-authentication. |  [optional] |
|**requestUrl** | **String** | RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL&#39;s path or query for example. |  |
|**requestedAal** | **AuthenticatorAssuranceLevel** |  |  [optional] |
|**returnTo** | **String** | ReturnTo contains the requested return_to URL. |  [optional] |
|**type** | **String** | The flow type can either be &#x60;api&#x60; or &#x60;browser&#x60;. |  |
|**ui** | [**UiContainer**](UiContainer.md) |  |  |
|**updatedAt** | **OffsetDateTime** | UpdatedAt is a helper struct field for gobuffalo.pop. |  [optional] |



