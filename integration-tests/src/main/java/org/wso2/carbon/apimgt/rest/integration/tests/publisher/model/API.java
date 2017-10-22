/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.carbon.apimgt.rest.integration.tests.publisher.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
<<<<<<< bead95f1e51ee883082063d73f52a8e98122833a:integration-tests/src/main/java/org/wso2/carbon/apimgt/rest/integration/tests/publisher/model/API.java
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
=======
import io.swagger.annotations.ApiModelProperty;

>>>>>>> after java unit testing:integration-tests/src/main/java/org/wso2/carbon/apimgt/rest/integration/tests/publisher/model/API.java
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * API
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-09-07T02:17:03.896Z")
public class API {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("context")
  private String context = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("provider")
  private String provider = null;

  @SerializedName("wsdlUri")
  private String wsdlUri = null;

  @SerializedName("lifeCycleStatus")
  private String lifeCycleStatus = null;

  @SerializedName("workflowStatus")
  private String workflowStatus = null;

  @SerializedName("createdTime")
  private String createdTime = null;

  @SerializedName("apiPolicy")
  private String apiPolicy = null;

  @SerializedName("lastUpdatedTime")
  private String lastUpdatedTime = null;

  @SerializedName("responseCaching")
  private String responseCaching = null;

  @SerializedName("cacheTimeout")
  private Integer cacheTimeout = null;

  @SerializedName("destinationStatsEnabled")
  private String destinationStatsEnabled = null;

  @SerializedName("isDefaultVersion")
  private Boolean isDefaultVersion = null;

  @SerializedName("transport")
  private List<String> transport = new ArrayList<String>();

  @SerializedName("tags")
  private List<String> tags = null;

  @SerializedName("labels")
  private List<String> labels = null;

  @SerializedName("policies")
  private List<String> policies = new ArrayList<String>();

  /**
   * Gets or Sets visibility
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
  public enum VisibilityEnum {
    PUBLIC("PUBLIC"),
    
    PRIVATE("PRIVATE"),
    
    RESTRICTED("RESTRICTED"),
    
    CONTROLLED("CONTROLLED");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisibilityEnum fromValue(String text) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<VisibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VisibilityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("visibility")
  private VisibilityEnum visibility = null;

  @SerializedName("visibleRoles")
  private List<String> visibleRoles = null;

  @SerializedName("permission")
  private String permission = null;

  @SerializedName("userPermissionsForApi")
  private List<String> userPermissionsForApi = null;

  @SerializedName("visibleTenants")
  private List<String> visibleTenants = null;

  @SerializedName("gatewayEnvironments")
  private String gatewayEnvironments = null;

  @SerializedName("sequences")
  private List<Sequence> sequences = null;

  @SerializedName("businessInformation")
  private APIBusinessInformation businessInformation = null;

  @SerializedName("corsConfiguration")
  private APICorsConfiguration corsConfiguration = null;

  @SerializedName("endpoint")
  private List<APIEndpoint> endpoint = null;

  @SerializedName("securityScheme")
  private List<String> securityScheme = null;

  @SerializedName("operations")
  private List<APIOperations> operations = null;

  public API id(String id) {
    this.id = id;
    return this;
  }

   /**
   * UUID of the api registry artifact
   * @return id
  **/
  @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", value = "UUID of the api registry artifact ")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public API name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "CalculatorAPI", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public API description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "A calculator API that supports basic operations", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public API context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(example = "CalculatorAPI", required = true, value = "")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public API version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(example = "1.0.0", required = true, value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public API provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * If the provider value is not given user invoking the api will be used as the provider.
   * @return provider
  **/
  @ApiModelProperty(example = "admin", value = "If the provider value is not given user invoking the api will be used as the provider. ")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public API wsdlUri(String wsdlUri) {
    this.wsdlUri = wsdlUri;
    return this;
  }

   /**
   * WSDL URL if the API is based on a WSDL endpoint
   * @return wsdlUri
  **/
  @ApiModelProperty(example = "http://www.webservicex.com/globalweather.asmx?wsdl", value = "WSDL URL if the API is based on a WSDL endpoint ")
  public String getWsdlUri() {
    return wsdlUri;
  }

  public void setWsdlUri(String wsdlUri) {
    this.wsdlUri = wsdlUri;
  }

  public API lifeCycleStatus(String lifeCycleStatus) {
    this.lifeCycleStatus = lifeCycleStatus;
    return this;
  }

   /**
   * Get lifeCycleStatus
   * @return lifeCycleStatus
  **/
  @ApiModelProperty(example = "CREATED", value = "")
  public String getLifeCycleStatus() {
    return lifeCycleStatus;
  }

  public void setLifeCycleStatus(String lifeCycleStatus) {
    this.lifeCycleStatus = lifeCycleStatus;
  }

  public API workflowStatus(String workflowStatus) {
    this.workflowStatus = workflowStatus;
    return this;
  }

   /**
   * Get workflowStatus
   * @return workflowStatus
  **/
  @ApiModelProperty(example = "APPROVED", value = "")
  public String getWorkflowStatus() {
    return workflowStatus;
  }

  public void setWorkflowStatus(String workflowStatus) {
    this.workflowStatus = workflowStatus;
  }

  public API createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @ApiModelProperty(example = "2017-02-20T13:57:16.229Z", value = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public API apiPolicy(String apiPolicy) {
    this.apiPolicy = apiPolicy;
    return this;
  }

   /**
   * Get apiPolicy
   * @return apiPolicy
  **/
  @ApiModelProperty(example = "UNLIMITED", value = "")
  public String getApiPolicy() {
    return apiPolicy;
  }

  public void setApiPolicy(String apiPolicy) {
    this.apiPolicy = apiPolicy;
  }

  public API lastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

   /**
   * Get lastUpdatedTime
   * @return lastUpdatedTime
  **/
  @ApiModelProperty(example = "2017-02-20T13:57:16.229Z", value = "")
  public String getLastUpdatedTime() {
    return lastUpdatedTime;
  }

  public void setLastUpdatedTime(String lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }

  public API responseCaching(String responseCaching) {
    this.responseCaching = responseCaching;
    return this;
  }

   /**
   * Get responseCaching
   * @return responseCaching
  **/
  @ApiModelProperty(example = "Disabled", value = "")
  public String getResponseCaching() {
    return responseCaching;
  }

  public void setResponseCaching(String responseCaching) {
    this.responseCaching = responseCaching;
  }

  public API cacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
    return this;
  }

   /**
   * Get cacheTimeout
   * @return cacheTimeout
  **/
  @ApiModelProperty(example = "300", value = "")
  public Integer getCacheTimeout() {
    return cacheTimeout;
  }

  public void setCacheTimeout(Integer cacheTimeout) {
    this.cacheTimeout = cacheTimeout;
  }

  public API destinationStatsEnabled(String destinationStatsEnabled) {
    this.destinationStatsEnabled = destinationStatsEnabled;
    return this;
  }

   /**
   * Get destinationStatsEnabled
   * @return destinationStatsEnabled
  **/
  @ApiModelProperty(example = "Disabled", value = "")
  public String getDestinationStatsEnabled() {
    return destinationStatsEnabled;
  }

  public void setDestinationStatsEnabled(String destinationStatsEnabled) {
    this.destinationStatsEnabled = destinationStatsEnabled;
  }

  public API isDefaultVersion(Boolean isDefaultVersion) {
    this.isDefaultVersion = isDefaultVersion;
    return this;
  }

   /**
   * Get isDefaultVersion
   * @return isDefaultVersion
  **/
  @ApiModelProperty(example = "false", required = true, value = "")
  public Boolean getIsDefaultVersion() {
    return isDefaultVersion;
  }

  public void setIsDefaultVersion(Boolean isDefaultVersion) {
    this.isDefaultVersion = isDefaultVersion;
  }

  public API transport(List<String> transport) {
    this.transport = transport;
    return this;
  }

  public API addTransportItem(String transportItem) {
    this.transport.add(transportItem);
    return this;
  }

   /**
   * Supported transports for the API (http and/or https).
   * @return transport
  **/
  @ApiModelProperty(example = "[\"http\",\"https\"]", required = true, value = "Supported transports for the API (http and/or https). ")
  public List<String> getTransport() {
    return transport;
  }

  public void setTransport(List<String> transport) {
    this.transport = transport;
  }

  public API tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public API addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(example = "[\"substract\",\"add\"]", value = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public API labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public API addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<String>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(example = "[\"public\",\"private\"]", value = "")
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public API policies(List<String> policies) {
    this.policies = policies;
    return this;
  }

  public API addPoliciesItem(String policiesItem) {
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * Get policies
   * @return policies
  **/
  @ApiModelProperty(example = "[\"Unlimited\"]", required = true, value = "")
  public List<String> getPolicies() {
    return policies;
  }

  public void setPolicies(List<String> policies) {
    this.policies = policies;
  }

  public API visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @ApiModelProperty(example = "PUBLIC", required = true, value = "")
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public API visibleRoles(List<String> visibleRoles) {
    this.visibleRoles = visibleRoles;
    return this;
  }

  public API addVisibleRolesItem(String visibleRolesItem) {
    if (this.visibleRoles == null) {
      this.visibleRoles = new ArrayList<String>();
    }
    this.visibleRoles.add(visibleRolesItem);
    return this;
  }

   /**
   * Get visibleRoles
   * @return visibleRoles
  **/
  @ApiModelProperty(example = "[]", value = "")
  public List<String> getVisibleRoles() {
    return visibleRoles;
  }

  public void setVisibleRoles(List<String> visibleRoles) {
    this.visibleRoles = visibleRoles;
  }

  public API permission(String permission) {
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @ApiModelProperty(example = "[{\"groupId\" : 1000, \"permission\" : [\"READ\",\"UPDATE\"]},{\"groupId\" : 1001, \"permission\" : [\"READ\",\"UPDATE\"]}]", value = "")
  public String getPermission() {
    return permission;
  }

  public void setPermission(String permission) {
    this.permission = permission;
  }

  public API userPermissionsForApi(List<String> userPermissionsForApi) {
    this.userPermissionsForApi = userPermissionsForApi;
    return this;
  }

  public API addUserPermissionsForApiItem(String userPermissionsForApiItem) {
    if (this.userPermissionsForApi == null) {
      this.userPermissionsForApi = new ArrayList<String>();
    }
    this.userPermissionsForApi.add(userPermissionsForApiItem);
    return this;
  }

   /**
   * LoggedIn user permissions for the API
   * @return userPermissionsForApi
  **/
  @ApiModelProperty(example = "[\"READ\",\"UPDATE\"]", value = "LoggedIn user permissions for the API ")
  public List<String> getUserPermissionsForApi() {
    return userPermissionsForApi;
  }

  public void setUserPermissionsForApi(List<String> userPermissionsForApi) {
    this.userPermissionsForApi = userPermissionsForApi;
  }

  public API visibleTenants(List<String> visibleTenants) {
    this.visibleTenants = visibleTenants;
    return this;
  }

  public API addVisibleTenantsItem(String visibleTenantsItem) {
    if (this.visibleTenants == null) {
      this.visibleTenants = new ArrayList<String>();
    }
    this.visibleTenants.add(visibleTenantsItem);
    return this;
  }

   /**
   * Get visibleTenants
   * @return visibleTenants
  **/
  @ApiModelProperty(example = "[]", value = "")
  public List<String> getVisibleTenants() {
    return visibleTenants;
  }

  public void setVisibleTenants(List<String> visibleTenants) {
    this.visibleTenants = visibleTenants;
  }

  public API gatewayEnvironments(String gatewayEnvironments) {
    this.gatewayEnvironments = gatewayEnvironments;
    return this;
  }

   /**
   * Comma separated list of gateway environments.
   * @return gatewayEnvironments
  **/
  @ApiModelProperty(example = "Production and Sandbox", value = "Comma separated list of gateway environments. ")
  public String getGatewayEnvironments() {
    return gatewayEnvironments;
  }

  public void setGatewayEnvironments(String gatewayEnvironments) {
    this.gatewayEnvironments = gatewayEnvironments;
  }

  public API sequences(List<Sequence> sequences) {
    this.sequences = sequences;
    return this;
  }

  public API addSequencesItem(Sequence sequencesItem) {
    if (this.sequences == null) {
      this.sequences = new ArrayList<Sequence>();
    }
    this.sequences.add(sequencesItem);
    return this;
  }

   /**
   * Get sequences
   * @return sequences
  **/
  @ApiModelProperty(example = "[]", value = "")
  public List<Sequence> getSequences() {
    return sequences;
  }

  public void setSequences(List<Sequence> sequences) {
    this.sequences = sequences;
  }

  public API businessInformation(APIBusinessInformation businessInformation) {
    this.businessInformation = businessInformation;
    return this;
  }

   /**
   * Get businessInformation
   * @return businessInformation
  **/
  @ApiModelProperty(value = "")
  public APIBusinessInformation getBusinessInformation() {
    return businessInformation;
  }

  public void setBusinessInformation(APIBusinessInformation businessInformation) {
    this.businessInformation = businessInformation;
  }

  public API corsConfiguration(APICorsConfiguration corsConfiguration) {
    this.corsConfiguration = corsConfiguration;
    return this;
  }

   /**
   * Get corsConfiguration
   * @return corsConfiguration
  **/
  @ApiModelProperty(value = "")
  public APICorsConfiguration getCorsConfiguration() {
    return corsConfiguration;
  }

  public void setCorsConfiguration(APICorsConfiguration corsConfiguration) {
    this.corsConfiguration = corsConfiguration;
  }

  public API endpoint(List<APIEndpoint> endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  public API addEndpointItem(APIEndpoint endpointItem) {
    if (this.endpoint == null) {
      this.endpoint = new ArrayList<APIEndpoint>();
    }
    this.endpoint.add(endpointItem);
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @ApiModelProperty(value = "")
  public List<APIEndpoint> getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(List<APIEndpoint> endpoint) {
    this.endpoint = endpoint;
  }

  public API securityScheme(List<String> securityScheme) {
    this.securityScheme = securityScheme;
    return this;
  }

  public API addSecuritySchemeItem(String securitySchemeItem) {
    if (this.securityScheme == null) {
      this.securityScheme = new ArrayList<String>();
    }
    this.securityScheme.add(securitySchemeItem);
    return this;
  }

   /**
   * Get securityScheme
   * @return securityScheme
  **/
  @ApiModelProperty(value = "")
  public List<String> getSecurityScheme() {
    return securityScheme;
  }

  public void setSecurityScheme(List<String> securityScheme) {
    this.securityScheme = securityScheme;
  }

  public API operations(List<APIOperations> operations) {
    this.operations = operations;
    return this;
  }

  public API addOperationsItem(APIOperations operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<APIOperations>();
    }
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @ApiModelProperty(value = "")
  public List<APIOperations> getOperations() {
    return operations;
  }

  public void setOperations(List<APIOperations> operations) {
    this.operations = operations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    API API = (org.wso2.carbon.apimgt.rest.integration.tests.publisher.model.API) o;
    return Objects.equals(this.id, API.id) &&
        Objects.equals(this.name, API.name) &&
        Objects.equals(this.description, API.description) &&
        Objects.equals(this.context, API.context) &&
        Objects.equals(this.version, API.version) &&
        Objects.equals(this.provider, API.provider) &&
        Objects.equals(this.wsdlUri, API.wsdlUri) &&
        Objects.equals(this.lifeCycleStatus, API.lifeCycleStatus) &&
        Objects.equals(this.workflowStatus, API.workflowStatus) &&
        Objects.equals(this.createdTime, API.createdTime) &&
        Objects.equals(this.apiPolicy, API.apiPolicy) &&
        Objects.equals(this.lastUpdatedTime, API.lastUpdatedTime) &&
        Objects.equals(this.responseCaching, API.responseCaching) &&
        Objects.equals(this.cacheTimeout, API.cacheTimeout) &&
        Objects.equals(this.destinationStatsEnabled, API.destinationStatsEnabled) &&
        Objects.equals(this.isDefaultVersion, API.isDefaultVersion) &&
        Objects.equals(this.transport, API.transport) &&
        Objects.equals(this.tags, API.tags) &&
        Objects.equals(this.labels, API.labels) &&
        Objects.equals(this.policies, API.policies) &&
        Objects.equals(this.visibility, API.visibility) &&
        Objects.equals(this.visibleRoles, API.visibleRoles) &&
        Objects.equals(this.permission, API.permission) &&
        Objects.equals(this.userPermissionsForApi, API.userPermissionsForApi) &&
        Objects.equals(this.visibleTenants, API.visibleTenants) &&
        Objects.equals(this.gatewayEnvironments, API.gatewayEnvironments) &&
        Objects.equals(this.sequences, API.sequences) &&
        Objects.equals(this.businessInformation, API.businessInformation) &&
        Objects.equals(this.corsConfiguration, API.corsConfiguration) &&
        Objects.equals(this.endpoint, API.endpoint) &&
        Objects.equals(this.securityScheme, API.securityScheme) &&
        Objects.equals(this.operations, API.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, context, version, provider, wsdlUri, lifeCycleStatus, workflowStatus, createdTime, apiPolicy, lastUpdatedTime, responseCaching, cacheTimeout, destinationStatsEnabled, isDefaultVersion, transport, tags, labels, policies, visibility, visibleRoles, permission, userPermissionsForApi, visibleTenants, gatewayEnvironments, sequences, businessInformation, corsConfiguration, endpoint, securityScheme, operations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class API {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    wsdlUri: ").append(toIndentedString(wsdlUri)).append("\n");
    sb.append("    lifeCycleStatus: ").append(toIndentedString(lifeCycleStatus)).append("\n");
    sb.append("    workflowStatus: ").append(toIndentedString(workflowStatus)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    apiPolicy: ").append(toIndentedString(apiPolicy)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
    sb.append("    responseCaching: ").append(toIndentedString(responseCaching)).append("\n");
    sb.append("    cacheTimeout: ").append(toIndentedString(cacheTimeout)).append("\n");
    sb.append("    destinationStatsEnabled: ").append(toIndentedString(destinationStatsEnabled)).append("\n");
    sb.append("    isDefaultVersion: ").append(toIndentedString(isDefaultVersion)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    visibleRoles: ").append(toIndentedString(visibleRoles)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    userPermissionsForApi: ").append(toIndentedString(userPermissionsForApi)).append("\n");
    sb.append("    visibleTenants: ").append(toIndentedString(visibleTenants)).append("\n");
    sb.append("    gatewayEnvironments: ").append(toIndentedString(gatewayEnvironments)).append("\n");
    sb.append("    sequences: ").append(toIndentedString(sequences)).append("\n");
    sb.append("    businessInformation: ").append(toIndentedString(businessInformation)).append("\n");
    sb.append("    corsConfiguration: ").append(toIndentedString(corsConfiguration)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    securityScheme: ").append(toIndentedString(securityScheme)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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
  
}

