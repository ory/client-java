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


package sh.ory.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sh.ory.model.LineItemV1;
import sh.ory.model.TaxLineItem;
import sh.ory.model.TimeInterval;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import sh.ory.JSON;

/**
 * InvoiceDataV1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-01T12:22:42.592869563Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class InvoiceDataV1 {
  public static final String SERIALIZED_NAME_BILLING_PERIOD = "billing_period";
  @SerializedName(SERIALIZED_NAME_BILLING_PERIOD)
  private TimeInterval billingPeriod;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<LineItemV1> items = new ArrayList<>();

  public static final String SERIALIZED_NAME_PLAN = "plan";
  @SerializedName(SERIALIZED_NAME_PLAN)
  private String plan;

  public static final String SERIALIZED_NAME_STRIPE_INVOICE_ITEM = "stripe_invoice_item";
  @SerializedName(SERIALIZED_NAME_STRIPE_INVOICE_ITEM)
  private String stripeInvoiceItem;

  public static final String SERIALIZED_NAME_STRIPE_INVOICE_STATUS = "stripe_invoice_status";
  @SerializedName(SERIALIZED_NAME_STRIPE_INVOICE_STATUS)
  private String stripeInvoiceStatus;

  public static final String SERIALIZED_NAME_STRIPE_LINK = "stripe_link";
  @SerializedName(SERIALIZED_NAME_STRIPE_LINK)
  private String stripeLink;

  public static final String SERIALIZED_NAME_SUBTITLE = "subtitle";
  @SerializedName(SERIALIZED_NAME_SUBTITLE)
  private String subtitle;

  public static final String SERIALIZED_NAME_TAX = "tax";
  @SerializedName(SERIALIZED_NAME_TAX)
  private TaxLineItem tax;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TOTAL_IN_CENT = "total_in_cent";
  @SerializedName(SERIALIZED_NAME_TOTAL_IN_CENT)
  private Long totalInCent;

  public InvoiceDataV1() {
  }

  public InvoiceDataV1(
     String currency, 
     Boolean deleted, 
     List<LineItemV1> items, 
     String plan, 
     String stripeLink, 
     String subtitle, 
     String title
  ) {
    this();
    this.currency = currency;
    this.deleted = deleted;
    this.items = items;
    this.plan = plan;
    this.stripeLink = stripeLink;
    this.subtitle = subtitle;
    this.title = title;
  }

  public InvoiceDataV1 billingPeriod(TimeInterval billingPeriod) {
    this.billingPeriod = billingPeriod;
    return this;
  }

  /**
   * Get billingPeriod
   * @return billingPeriod
   */
  @javax.annotation.Nonnull
  public TimeInterval getBillingPeriod() {
    return billingPeriod;
  }

  public void setBillingPeriod(TimeInterval billingPeriod) {
    this.billingPeriod = billingPeriod;
  }


  /**
   * The currency of the invoice.
   * @return currency
   */
  @javax.annotation.Nonnull
  public String getCurrency() {
    return currency;
  }



  /**
   * Deleted is true if the invoice has been soft-deleted.
   * @return deleted
   */
  @javax.annotation.Nullable
  public Boolean getDeleted() {
    return deleted;
  }



  /**
   * The items that are part of this invoice.
   * @return items
   */
  @javax.annotation.Nonnull
  public List<LineItemV1> getItems() {
    return items;
  }



  /**
   * The plan that this invoice is based on, in the format \&quot;Name@version\&quot;.
   * @return plan
   */
  @javax.annotation.Nullable
  public String getPlan() {
    return plan;
  }



  public InvoiceDataV1 stripeInvoiceItem(String stripeInvoiceItem) {
    this.stripeInvoiceItem = stripeInvoiceItem;
    return this;
  }

  /**
   * Get stripeInvoiceItem
   * @return stripeInvoiceItem
   */
  @javax.annotation.Nullable
  public String getStripeInvoiceItem() {
    return stripeInvoiceItem;
  }

  public void setStripeInvoiceItem(String stripeInvoiceItem) {
    this.stripeInvoiceItem = stripeInvoiceItem;
  }


  public InvoiceDataV1 stripeInvoiceStatus(String stripeInvoiceStatus) {
    this.stripeInvoiceStatus = stripeInvoiceStatus;
    return this;
  }

  /**
   * The status of the invoice, one of &#x60;draft&#x60;, &#x60;open&#x60;, &#x60;paid&#x60;, &#x60;uncollectible&#x60;, or &#x60;void&#x60;. [Learn more](https://stripe.com/docs/billing/invoices/workflow#workflow-overview)
   * @return stripeInvoiceStatus
   */
  @javax.annotation.Nullable
  public String getStripeInvoiceStatus() {
    return stripeInvoiceStatus;
  }

  public void setStripeInvoiceStatus(String stripeInvoiceStatus) {
    this.stripeInvoiceStatus = stripeInvoiceStatus;
  }


  /**
   * An optional link to the invoice on Stripe.
   * @return stripeLink
   */
  @javax.annotation.Nullable
  public String getStripeLink() {
    return stripeLink;
  }



  /**
   * The subtitle of the invoice.
   * @return subtitle
   */
  @javax.annotation.Nullable
  public String getSubtitle() {
    return subtitle;
  }



  public InvoiceDataV1 tax(TaxLineItem tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Get tax
   * @return tax
   */
  @javax.annotation.Nullable
  public TaxLineItem getTax() {
    return tax;
  }

  public void setTax(TaxLineItem tax) {
    this.tax = tax;
  }


  /**
   * The title of the invoice.
   * @return title
   */
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }



  public InvoiceDataV1 totalInCent(Long totalInCent) {
    this.totalInCent = totalInCent;
    return this;
  }

  /**
   * Get totalInCent
   * @return totalInCent
   */
  @javax.annotation.Nonnull
  public Long getTotalInCent() {
    return totalInCent;
  }

  public void setTotalInCent(Long totalInCent) {
    this.totalInCent = totalInCent;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the InvoiceDataV1 instance itself
   */
  public InvoiceDataV1 putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceDataV1 invoiceDataV1 = (InvoiceDataV1) o;
    return Objects.equals(this.billingPeriod, invoiceDataV1.billingPeriod) &&
        Objects.equals(this.currency, invoiceDataV1.currency) &&
        Objects.equals(this.deleted, invoiceDataV1.deleted) &&
        Objects.equals(this.items, invoiceDataV1.items) &&
        Objects.equals(this.plan, invoiceDataV1.plan) &&
        Objects.equals(this.stripeInvoiceItem, invoiceDataV1.stripeInvoiceItem) &&
        Objects.equals(this.stripeInvoiceStatus, invoiceDataV1.stripeInvoiceStatus) &&
        Objects.equals(this.stripeLink, invoiceDataV1.stripeLink) &&
        Objects.equals(this.subtitle, invoiceDataV1.subtitle) &&
        Objects.equals(this.tax, invoiceDataV1.tax) &&
        Objects.equals(this.title, invoiceDataV1.title) &&
        Objects.equals(this.totalInCent, invoiceDataV1.totalInCent)&&
        Objects.equals(this.additionalProperties, invoiceDataV1.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billingPeriod, currency, deleted, items, plan, stripeInvoiceItem, stripeInvoiceStatus, stripeLink, subtitle, tax, title, totalInCent, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceDataV1 {\n");
    sb.append("    billingPeriod: ").append(toIndentedString(billingPeriod)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    stripeInvoiceItem: ").append(toIndentedString(stripeInvoiceItem)).append("\n");
    sb.append("    stripeInvoiceStatus: ").append(toIndentedString(stripeInvoiceStatus)).append("\n");
    sb.append("    stripeLink: ").append(toIndentedString(stripeLink)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    totalInCent: ").append(toIndentedString(totalInCent)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("billing_period");
    openapiFields.add("currency");
    openapiFields.add("deleted");
    openapiFields.add("items");
    openapiFields.add("plan");
    openapiFields.add("stripe_invoice_item");
    openapiFields.add("stripe_invoice_status");
    openapiFields.add("stripe_link");
    openapiFields.add("subtitle");
    openapiFields.add("tax");
    openapiFields.add("title");
    openapiFields.add("total_in_cent");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("billing_period");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("items");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("total_in_cent");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InvoiceDataV1
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InvoiceDataV1.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InvoiceDataV1 is not found in the empty JSON string", InvoiceDataV1.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InvoiceDataV1.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `billing_period`
      TimeInterval.validateJsonElement(jsonObj.get("billing_period"));
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("items").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }

      JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
      // validate the required field `items` (array)
      for (int i = 0; i < jsonArrayitems.size(); i++) {
        LineItemV1.validateJsonElement(jsonArrayitems.get(i));
      };
      if ((jsonObj.get("plan") != null && !jsonObj.get("plan").isJsonNull()) && !jsonObj.get("plan").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plan` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plan").toString()));
      }
      if ((jsonObj.get("stripe_invoice_item") != null && !jsonObj.get("stripe_invoice_item").isJsonNull()) && !jsonObj.get("stripe_invoice_item").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stripe_invoice_item` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stripe_invoice_item").toString()));
      }
      if ((jsonObj.get("stripe_invoice_status") != null && !jsonObj.get("stripe_invoice_status").isJsonNull()) && !jsonObj.get("stripe_invoice_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stripe_invoice_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stripe_invoice_status").toString()));
      }
      if ((jsonObj.get("stripe_link") != null && !jsonObj.get("stripe_link").isJsonNull()) && !jsonObj.get("stripe_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stripe_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stripe_link").toString()));
      }
      if ((jsonObj.get("subtitle") != null && !jsonObj.get("subtitle").isJsonNull()) && !jsonObj.get("subtitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subtitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subtitle").toString()));
      }
      // validate the optional field `tax`
      if (jsonObj.get("tax") != null && !jsonObj.get("tax").isJsonNull()) {
        TaxLineItem.validateJsonElement(jsonObj.get("tax"));
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InvoiceDataV1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InvoiceDataV1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InvoiceDataV1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InvoiceDataV1.class));

       return (TypeAdapter<T>) new TypeAdapter<InvoiceDataV1>() {
           @Override
           public void write(JsonWriter out, InvoiceDataV1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public InvoiceDataV1 read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             InvoiceDataV1 instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InvoiceDataV1 given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InvoiceDataV1
   * @throws IOException if the JSON string is invalid with respect to InvoiceDataV1
   */
  public static InvoiceDataV1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InvoiceDataV1.class);
  }

  /**
   * Convert an instance of InvoiceDataV1 to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

