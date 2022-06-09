/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.189
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import sh.ory.model.KetoNamespace;
import sh.ory.model.NormalizedProjectRevisionHook;
import sh.ory.model.NormalizedProjectRevisionIdentitySchema;
import sh.ory.model.NormalizedProjectRevisionThirdPartyProvider;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for NormalizedProjectRevision
 */
public class NormalizedProjectRevisionTest {
    private final NormalizedProjectRevision model = new NormalizedProjectRevision();

    /**
     * Model tests for NormalizedProjectRevision
     */
    @Test
    public void testNormalizedProjectRevision() {
        // TODO: test NormalizedProjectRevision
    }

    /**
     * Test the property 'createdAt'
     */
    @Test
    public void createdAtTest() {
        // TODO: test createdAt
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'ketoNamespaces'
     */
    @Test
    public void ketoNamespacesTest() {
        // TODO: test ketoNamespaces
    }

    /**
     * Test the property 'ketoReadMaxDepth'
     */
    @Test
    public void ketoReadMaxDepthTest() {
        // TODO: test ketoReadMaxDepth
    }

    /**
     * Test the property 'kratosCookiesSameSite'
     */
    @Test
    public void kratosCookiesSameSiteTest() {
        // TODO: test kratosCookiesSameSite
    }

    /**
     * Test the property 'kratosCourierSmtpConnectionUri'
     */
    @Test
    public void kratosCourierSmtpConnectionUriTest() {
        // TODO: test kratosCourierSmtpConnectionUri
    }

    /**
     * Test the property 'kratosCourierSmtpFromAddress'
     */
    @Test
    public void kratosCourierSmtpFromAddressTest() {
        // TODO: test kratosCourierSmtpFromAddress
    }

    /**
     * Test the property 'kratosCourierSmtpFromName'
     */
    @Test
    public void kratosCourierSmtpFromNameTest() {
        // TODO: test kratosCourierSmtpFromName
    }

    /**
     * Test the property 'kratosCourierSmtpHeaders'
     */
    @Test
    public void kratosCourierSmtpHeadersTest() {
        // TODO: test kratosCourierSmtpHeaders
    }

    /**
     * Test the property 'kratosCourierTemplatesRecoveryInvalidEmailBodyHtml'
     */
    @Test
    public void kratosCourierTemplatesRecoveryInvalidEmailBodyHtmlTest() {
        // TODO: test kratosCourierTemplatesRecoveryInvalidEmailBodyHtml
    }

    /**
     * Test the property 'kratosCourierTemplatesRecoveryInvalidEmailBodyPlaintext'
     */
    @Test
    public void kratosCourierTemplatesRecoveryInvalidEmailBodyPlaintextTest() {
        // TODO: test kratosCourierTemplatesRecoveryInvalidEmailBodyPlaintext
    }

    /**
     * Test the property 'kratosCourierTemplatesRecoveryInvalidEmailSubject'
     */
    @Test
    public void kratosCourierTemplatesRecoveryInvalidEmailSubjectTest() {
        // TODO: test kratosCourierTemplatesRecoveryInvalidEmailSubject
    }

    /**
     * Test the property 'kratosCourierTemplatesRecoveryValidEmailBodyHtml'
     */
    @Test
    public void kratosCourierTemplatesRecoveryValidEmailBodyHtmlTest() {
        // TODO: test kratosCourierTemplatesRecoveryValidEmailBodyHtml
    }

    /**
     * Test the property 'kratosCourierTemplatesRecoveryValidEmailBodyPlaintext'
     */
    @Test
    public void kratosCourierTemplatesRecoveryValidEmailBodyPlaintextTest() {
        // TODO: test kratosCourierTemplatesRecoveryValidEmailBodyPlaintext
    }

    /**
     * Test the property 'kratosCourierTemplatesRecoveryValidEmailSubject'
     */
    @Test
    public void kratosCourierTemplatesRecoveryValidEmailSubjectTest() {
        // TODO: test kratosCourierTemplatesRecoveryValidEmailSubject
    }

    /**
     * Test the property 'kratosCourierTemplatesVerificationInvalidEmailBodyHtml'
     */
    @Test
    public void kratosCourierTemplatesVerificationInvalidEmailBodyHtmlTest() {
        // TODO: test kratosCourierTemplatesVerificationInvalidEmailBodyHtml
    }

    /**
     * Test the property 'kratosCourierTemplatesVerificationInvalidEmailBodyPlaintext'
     */
    @Test
    public void kratosCourierTemplatesVerificationInvalidEmailBodyPlaintextTest() {
        // TODO: test kratosCourierTemplatesVerificationInvalidEmailBodyPlaintext
    }

    /**
     * Test the property 'kratosCourierTemplatesVerificationInvalidEmailSubject'
     */
    @Test
    public void kratosCourierTemplatesVerificationInvalidEmailSubjectTest() {
        // TODO: test kratosCourierTemplatesVerificationInvalidEmailSubject
    }

    /**
     * Test the property 'kratosCourierTemplatesVerificationValidEmailBodyHtml'
     */
    @Test
    public void kratosCourierTemplatesVerificationValidEmailBodyHtmlTest() {
        // TODO: test kratosCourierTemplatesVerificationValidEmailBodyHtml
    }

    /**
     * Test the property 'kratosCourierTemplatesVerificationValidEmailBodyPlaintext'
     */
    @Test
    public void kratosCourierTemplatesVerificationValidEmailBodyPlaintextTest() {
        // TODO: test kratosCourierTemplatesVerificationValidEmailBodyPlaintext
    }

    /**
     * Test the property 'kratosCourierTemplatesVerificationValidEmailSubject'
     */
    @Test
    public void kratosCourierTemplatesVerificationValidEmailSubjectTest() {
        // TODO: test kratosCourierTemplatesVerificationValidEmailSubject
    }

    /**
     * Test the property 'kratosIdentitySchemas'
     */
    @Test
    public void kratosIdentitySchemasTest() {
        // TODO: test kratosIdentitySchemas
    }

    /**
     * Test the property 'kratosSecretsCipher'
     */
    @Test
    public void kratosSecretsCipherTest() {
        // TODO: test kratosSecretsCipher
    }

    /**
     * Test the property 'kratosSecretsCookie'
     */
    @Test
    public void kratosSecretsCookieTest() {
        // TODO: test kratosSecretsCookie
    }

    /**
     * Test the property 'kratosSecretsDefault'
     */
    @Test
    public void kratosSecretsDefaultTest() {
        // TODO: test kratosSecretsDefault
    }

    /**
     * Test the property 'kratosSelfserviceAllowedReturnUrls'
     */
    @Test
    public void kratosSelfserviceAllowedReturnUrlsTest() {
        // TODO: test kratosSelfserviceAllowedReturnUrls
    }

    /**
     * Test the property 'kratosSelfserviceDefaultBrowserReturnUrl'
     */
    @Test
    public void kratosSelfserviceDefaultBrowserReturnUrlTest() {
        // TODO: test kratosSelfserviceDefaultBrowserReturnUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsErrorUiUrl'
     */
    @Test
    public void kratosSelfserviceFlowsErrorUiUrlTest() {
        // TODO: test kratosSelfserviceFlowsErrorUiUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsHooks'
     */
    @Test
    public void kratosSelfserviceFlowsHooksTest() {
        // TODO: test kratosSelfserviceFlowsHooks
    }

    /**
     * Test the property 'kratosSelfserviceFlowsLoginAfterDefaultBrowserReturnUrl'
     */
    @Test
    public void kratosSelfserviceFlowsLoginAfterDefaultBrowserReturnUrlTest() {
        // TODO: test kratosSelfserviceFlowsLoginAfterDefaultBrowserReturnUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsLoginAfterOidcDefaultBrowserReturnUrl'
     */
    @Test
    public void kratosSelfserviceFlowsLoginAfterOidcDefaultBrowserReturnUrlTest() {
        // TODO: test kratosSelfserviceFlowsLoginAfterOidcDefaultBrowserReturnUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsLoginAfterPasswordDefaultBrowserReturnUrl'
     */
    @Test
    public void kratosSelfserviceFlowsLoginAfterPasswordDefaultBrowserReturnUrlTest() {
        // TODO: test kratosSelfserviceFlowsLoginAfterPasswordDefaultBrowserReturnUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsLoginAfterWebauthnDefaultBrowserReturnUrl'
     */
    @Test
    public void kratosSelfserviceFlowsLoginAfterWebauthnDefaultBrowserReturnUrlTest() {
        // TODO: test kratosSelfserviceFlowsLoginAfterWebauthnDefaultBrowserReturnUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsLoginLifespan'
     */
    @Test
    public void kratosSelfserviceFlowsLoginLifespanTest() {
        // TODO: test kratosSelfserviceFlowsLoginLifespan
    }

    /**
     * Test the property 'kratosSelfserviceFlowsLoginUiUrl'
     */
    @Test
    public void kratosSelfserviceFlowsLoginUiUrlTest() {
        // TODO: test kratosSelfserviceFlowsLoginUiUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsLogoutAfterDefaultBrowserReturnUrl'
     */
    @Test
    public void kratosSelfserviceFlowsLogoutAfterDefaultBrowserReturnUrlTest() {
        // TODO: test kratosSelfserviceFlowsLogoutAfterDefaultBrowserReturnUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsRecoveryAfterDefaultBrowserReturnUrl'
     */
    @Test
    public void kratosSelfserviceFlowsRecoveryAfterDefaultBrowserReturnUrlTest() {
        // TODO: test kratosSelfserviceFlowsRecoveryAfterDefaultBrowserReturnUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsRecoveryEnabled'
     */
    @Test
    public void kratosSelfserviceFlowsRecoveryEnabledTest() {
        // TODO: test kratosSelfserviceFlowsRecoveryEnabled
    }

    /**
     * Test the property 'kratosSelfserviceFlowsRecoveryLifespan'
     */
    @Test
    public void kratosSelfserviceFlowsRecoveryLifespanTest() {
        // TODO: test kratosSelfserviceFlowsRecoveryLifespan
    }

    /**
     * Test the property 'kratosSelfserviceFlowsRecoveryUiUrl'
     */
    @Test
    public void kratosSelfserviceFlowsRecoveryUiUrlTest() {
        // TODO: test kratosSelfserviceFlowsRecoveryUiUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsRegistrationAfterDefaultBrowserReturnUrl'
     */
    @Test
    public void kratosSelfserviceFlowsRegistrationAfterDefaultBrowserReturnUrlTest() {
        // TODO: test kratosSelfserviceFlowsRegistrationAfterDefaultBrowserReturnUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsRegistrationAfterOidcDefaultBrowserReturnUrl'
     */
    @Test
    public void kratosSelfserviceFlowsRegistrationAfterOidcDefaultBrowserReturnUrlTest() {
        // TODO: test kratosSelfserviceFlowsRegistrationAfterOidcDefaultBrowserReturnUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsRegistrationAfterPasswordDefaultBrowserReturnUrl'
     */
    @Test
    public void kratosSelfserviceFlowsRegistrationAfterPasswordDefaultBrowserReturnUrlTest() {
        // TODO: test kratosSelfserviceFlowsRegistrationAfterPasswordDefaultBrowserReturnUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsRegistrationAfterWebauthnDefaultBrowserReturnUrl'
     */
    @Test
    public void kratosSelfserviceFlowsRegistrationAfterWebauthnDefaultBrowserReturnUrlTest() {
        // TODO: test kratosSelfserviceFlowsRegistrationAfterWebauthnDefaultBrowserReturnUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsRegistrationEnabled'
     */
    @Test
    public void kratosSelfserviceFlowsRegistrationEnabledTest() {
        // TODO: test kratosSelfserviceFlowsRegistrationEnabled
    }

    /**
     * Test the property 'kratosSelfserviceFlowsRegistrationLifespan'
     */
    @Test
    public void kratosSelfserviceFlowsRegistrationLifespanTest() {
        // TODO: test kratosSelfserviceFlowsRegistrationLifespan
    }

    /**
     * Test the property 'kratosSelfserviceFlowsRegistrationUiUrl'
     */
    @Test
    public void kratosSelfserviceFlowsRegistrationUiUrlTest() {
        // TODO: test kratosSelfserviceFlowsRegistrationUiUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsSettingsAfterDefaultBrowserReturnUrl'
     */
    @Test
    public void kratosSelfserviceFlowsSettingsAfterDefaultBrowserReturnUrlTest() {
        // TODO: test kratosSelfserviceFlowsSettingsAfterDefaultBrowserReturnUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsSettingsAfterPasswordDefaultBrowserReturnUrl'
     */
    @Test
    public void kratosSelfserviceFlowsSettingsAfterPasswordDefaultBrowserReturnUrlTest() {
        // TODO: test kratosSelfserviceFlowsSettingsAfterPasswordDefaultBrowserReturnUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsSettingsAfterProfileDefaultBrowserReturnUrl'
     */
    @Test
    public void kratosSelfserviceFlowsSettingsAfterProfileDefaultBrowserReturnUrlTest() {
        // TODO: test kratosSelfserviceFlowsSettingsAfterProfileDefaultBrowserReturnUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsSettingsLifespan'
     */
    @Test
    public void kratosSelfserviceFlowsSettingsLifespanTest() {
        // TODO: test kratosSelfserviceFlowsSettingsLifespan
    }

    /**
     * Test the property 'kratosSelfserviceFlowsSettingsPrivilegedSessionMaxAge'
     */
    @Test
    public void kratosSelfserviceFlowsSettingsPrivilegedSessionMaxAgeTest() {
        // TODO: test kratosSelfserviceFlowsSettingsPrivilegedSessionMaxAge
    }

    /**
     * Test the property 'kratosSelfserviceFlowsSettingsRequiredAal'
     */
    @Test
    public void kratosSelfserviceFlowsSettingsRequiredAalTest() {
        // TODO: test kratosSelfserviceFlowsSettingsRequiredAal
    }

    /**
     * Test the property 'kratosSelfserviceFlowsSettingsUiUrl'
     */
    @Test
    public void kratosSelfserviceFlowsSettingsUiUrlTest() {
        // TODO: test kratosSelfserviceFlowsSettingsUiUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsVerificationAfterDefaultBrowserReturnUrl'
     */
    @Test
    public void kratosSelfserviceFlowsVerificationAfterDefaultBrowserReturnUrlTest() {
        // TODO: test kratosSelfserviceFlowsVerificationAfterDefaultBrowserReturnUrl
    }

    /**
     * Test the property 'kratosSelfserviceFlowsVerificationEnabled'
     */
    @Test
    public void kratosSelfserviceFlowsVerificationEnabledTest() {
        // TODO: test kratosSelfserviceFlowsVerificationEnabled
    }

    /**
     * Test the property 'kratosSelfserviceFlowsVerificationLifespan'
     */
    @Test
    public void kratosSelfserviceFlowsVerificationLifespanTest() {
        // TODO: test kratosSelfserviceFlowsVerificationLifespan
    }

    /**
     * Test the property 'kratosSelfserviceFlowsVerificationUiUrl'
     */
    @Test
    public void kratosSelfserviceFlowsVerificationUiUrlTest() {
        // TODO: test kratosSelfserviceFlowsVerificationUiUrl
    }

    /**
     * Test the property 'kratosSelfserviceMethodsLinkConfigBaseUrl'
     */
    @Test
    public void kratosSelfserviceMethodsLinkConfigBaseUrlTest() {
        // TODO: test kratosSelfserviceMethodsLinkConfigBaseUrl
    }

    /**
     * Test the property 'kratosSelfserviceMethodsLinkConfigLifespan'
     */
    @Test
    public void kratosSelfserviceMethodsLinkConfigLifespanTest() {
        // TODO: test kratosSelfserviceMethodsLinkConfigLifespan
    }

    /**
     * Test the property 'kratosSelfserviceMethodsLinkEnabled'
     */
    @Test
    public void kratosSelfserviceMethodsLinkEnabledTest() {
        // TODO: test kratosSelfserviceMethodsLinkEnabled
    }

    /**
     * Test the property 'kratosSelfserviceMethodsLookupSecretEnabled'
     */
    @Test
    public void kratosSelfserviceMethodsLookupSecretEnabledTest() {
        // TODO: test kratosSelfserviceMethodsLookupSecretEnabled
    }

    /**
     * Test the property 'kratosSelfserviceMethodsOidcConfigBaseRedirectUri'
     */
    @Test
    public void kratosSelfserviceMethodsOidcConfigBaseRedirectUriTest() {
        // TODO: test kratosSelfserviceMethodsOidcConfigBaseRedirectUri
    }

    /**
     * Test the property 'kratosSelfserviceMethodsOidcConfigProviders'
     */
    @Test
    public void kratosSelfserviceMethodsOidcConfigProvidersTest() {
        // TODO: test kratosSelfserviceMethodsOidcConfigProviders
    }

    /**
     * Test the property 'kratosSelfserviceMethodsOidcEnabled'
     */
    @Test
    public void kratosSelfserviceMethodsOidcEnabledTest() {
        // TODO: test kratosSelfserviceMethodsOidcEnabled
    }

    /**
     * Test the property 'kratosSelfserviceMethodsPasswordConfigHaveibeenpwnedEnabled'
     */
    @Test
    public void kratosSelfserviceMethodsPasswordConfigHaveibeenpwnedEnabledTest() {
        // TODO: test kratosSelfserviceMethodsPasswordConfigHaveibeenpwnedEnabled
    }

    /**
     * Test the property 'kratosSelfserviceMethodsPasswordConfigIdentifierSimilarityCheckEnabled'
     */
    @Test
    public void kratosSelfserviceMethodsPasswordConfigIdentifierSimilarityCheckEnabledTest() {
        // TODO: test kratosSelfserviceMethodsPasswordConfigIdentifierSimilarityCheckEnabled
    }

    /**
     * Test the property 'kratosSelfserviceMethodsPasswordConfigIgnoreNetworkErrors'
     */
    @Test
    public void kratosSelfserviceMethodsPasswordConfigIgnoreNetworkErrorsTest() {
        // TODO: test kratosSelfserviceMethodsPasswordConfigIgnoreNetworkErrors
    }

    /**
     * Test the property 'kratosSelfserviceMethodsPasswordConfigMaxBreaches'
     */
    @Test
    public void kratosSelfserviceMethodsPasswordConfigMaxBreachesTest() {
        // TODO: test kratosSelfserviceMethodsPasswordConfigMaxBreaches
    }

    /**
     * Test the property 'kratosSelfserviceMethodsPasswordConfigMinPasswordLength'
     */
    @Test
    public void kratosSelfserviceMethodsPasswordConfigMinPasswordLengthTest() {
        // TODO: test kratosSelfserviceMethodsPasswordConfigMinPasswordLength
    }

    /**
     * Test the property 'kratosSelfserviceMethodsPasswordEnabled'
     */
    @Test
    public void kratosSelfserviceMethodsPasswordEnabledTest() {
        // TODO: test kratosSelfserviceMethodsPasswordEnabled
    }

    /**
     * Test the property 'kratosSelfserviceMethodsProfileEnabled'
     */
    @Test
    public void kratosSelfserviceMethodsProfileEnabledTest() {
        // TODO: test kratosSelfserviceMethodsProfileEnabled
    }

    /**
     * Test the property 'kratosSelfserviceMethodsTotpConfigIssuer'
     */
    @Test
    public void kratosSelfserviceMethodsTotpConfigIssuerTest() {
        // TODO: test kratosSelfserviceMethodsTotpConfigIssuer
    }

    /**
     * Test the property 'kratosSelfserviceMethodsTotpEnabled'
     */
    @Test
    public void kratosSelfserviceMethodsTotpEnabledTest() {
        // TODO: test kratosSelfserviceMethodsTotpEnabled
    }

    /**
     * Test the property 'kratosSelfserviceMethodsWebauthnConfigPasswordless'
     */
    @Test
    public void kratosSelfserviceMethodsWebauthnConfigPasswordlessTest() {
        // TODO: test kratosSelfserviceMethodsWebauthnConfigPasswordless
    }

    /**
     * Test the property 'kratosSelfserviceMethodsWebauthnConfigRpDisplayName'
     */
    @Test
    public void kratosSelfserviceMethodsWebauthnConfigRpDisplayNameTest() {
        // TODO: test kratosSelfserviceMethodsWebauthnConfigRpDisplayName
    }

    /**
     * Test the property 'kratosSelfserviceMethodsWebauthnConfigRpIcon'
     */
    @Test
    public void kratosSelfserviceMethodsWebauthnConfigRpIconTest() {
        // TODO: test kratosSelfserviceMethodsWebauthnConfigRpIcon
    }

    /**
     * Test the property 'kratosSelfserviceMethodsWebauthnConfigRpId'
     */
    @Test
    public void kratosSelfserviceMethodsWebauthnConfigRpIdTest() {
        // TODO: test kratosSelfserviceMethodsWebauthnConfigRpId
    }

    /**
     * Test the property 'kratosSelfserviceMethodsWebauthnConfigRpOrigin'
     */
    @Test
    public void kratosSelfserviceMethodsWebauthnConfigRpOriginTest() {
        // TODO: test kratosSelfserviceMethodsWebauthnConfigRpOrigin
    }

    /**
     * Test the property 'kratosSelfserviceMethodsWebauthnEnabled'
     */
    @Test
    public void kratosSelfserviceMethodsWebauthnEnabledTest() {
        // TODO: test kratosSelfserviceMethodsWebauthnEnabled
    }

    /**
     * Test the property 'kratosSessionCookiePersistent'
     */
    @Test
    public void kratosSessionCookiePersistentTest() {
        // TODO: test kratosSessionCookiePersistent
    }

    /**
     * Test the property 'kratosSessionCookieSameSite'
     */
    @Test
    public void kratosSessionCookieSameSiteTest() {
        // TODO: test kratosSessionCookieSameSite
    }

    /**
     * Test the property 'kratosSessionLifespan'
     */
    @Test
    public void kratosSessionLifespanTest() {
        // TODO: test kratosSessionLifespan
    }

    /**
     * Test the property 'kratosSessionWhoamiRequiredAal'
     */
    @Test
    public void kratosSessionWhoamiRequiredAalTest() {
        // TODO: test kratosSessionWhoamiRequiredAal
    }

    /**
     * Test the property 'name'
     */
    @Test
    public void nameTest() {
        // TODO: test name
    }

    /**
     * Test the property 'projectId'
     */
    @Test
    public void projectIdTest() {
        // TODO: test projectId
    }

    /**
     * Test the property 'updatedAt'
     */
    @Test
    public void updatedAtTest() {
        // TODO: test updatedAt
    }

}
