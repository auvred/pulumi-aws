// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Manages an API Gateway REST API. The REST API can be configured via [importing an OpenAPI specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api.html) in the `body` argument (with other arguments serving as overrides) or via other provider resources to manage the resources (`aws.apigateway.Resource` resource), methods (`aws.apigateway.Method` resource), integrations (`aws.apigateway.Integration` resource), etc. of the REST API. Once the REST API is configured, the `aws.apigateway.Deployment` resource can be used along with the `aws.apigateway.Stage` resource to publish the REST API.
 *
 * > **Note:** Amazon API Gateway Version 1 resources are used for creating and deploying REST APIs. To create and deploy WebSocket and HTTP APIs, use Amazon API Gateway Version 2 resources.
 *
 * !> **WARN:** When importing Open API Specifications with the `body` argument, by default the API Gateway REST API will be replaced with the Open API Specification thus removing any existing methods, resources, integrations, or endpoints. Endpoint mutations are asynchronous operations, and race conditions with DNS are possible. To overcome this limitation, use the `putRestApiMode` attribute and set it to `merge`.
 *
 * ## Example Usage
 *
 * ### OpenAPI Specification
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as std from "@pulumi/std";
 *
 * const example = new aws.apigateway.RestApi("example", {
 *     body: JSON.stringify({
 *         openapi: "3.0.1",
 *         info: {
 *             title: "example",
 *             version: "1.0",
 *         },
 *         paths: {
 *             "/path1": {
 *                 get: {
 *                     "x-amazon-apigateway-integration": {
 *                         httpMethod: "GET",
 *                         payloadFormatVersion: "1.0",
 *                         type: "HTTP_PROXY",
 *                         uri: "https://ip-ranges.amazonaws.com/ip-ranges.json",
 *                     },
 *                 },
 *             },
 *         },
 *     }),
 *     name: "example",
 *     endpointConfiguration: {
 *         types: "REGIONAL",
 *     },
 * });
 * const exampleDeployment = new aws.apigateway.Deployment("example", {
 *     restApi: example.id,
 *     triggers: {
 *         redeployment: std.sha1Output({
 *             input: pulumi.jsonStringify(example.body),
 *         }).apply(invoke => invoke.result),
 *     },
 * });
 * const exampleStage = new aws.apigateway.Stage("example", {
 *     deployment: exampleDeployment.id,
 *     restApi: example.id,
 *     stageName: "example",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### OpenAPI Specification with Private Endpoints
 *
 * Using `putRestApiMode` = `merge` when importing the OpenAPI Specification, the AWS control plane will not delete all existing literal properties that are not explicitly set in the OpenAPI definition. Impacted API Gateway properties: ApiKeySourceType, BinaryMediaTypes, Description, EndpointConfiguration, MinimumCompressionSize, Name, Policy).
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as std from "@pulumi/std";
 *
 * const available = aws.getAvailabilityZones({
 *     state: "available",
 *     filters: [{
 *         name: "opt-in-status",
 *         values: ["opt-in-not-required"],
 *     }],
 * });
 * const current = aws.getRegion({});
 * const example = new aws.ec2.Vpc("example", {
 *     cidrBlock: "10.0.0.0/16",
 *     enableDnsSupport: true,
 *     enableDnsHostnames: true,
 * });
 * const exampleDefaultSecurityGroup = new aws.ec2.DefaultSecurityGroup("example", {vpcId: example.id});
 * const exampleSubnet = new aws.ec2.Subnet("example", {
 *     availabilityZone: available.then(available => available.names?.[0]),
 *     cidrBlock: example.cidrBlock.apply(cidrBlock => std.cidrsubnetOutput({
 *         input: cidrBlock,
 *         newbits: 8,
 *         netnum: 0,
 *     })).apply(invoke => invoke.result),
 *     vpcId: example.id,
 * });
 * const exampleVpcEndpoint: aws.ec2.VpcEndpoint[] = [];
 * for (const range = {value: 0}; range.value < 3; range.value++) {
 *     exampleVpcEndpoint.push(new aws.ec2.VpcEndpoint(`example-${range.value}`, {
 *         privateDnsEnabled: false,
 *         securityGroupIds: [exampleDefaultSecurityGroup.id],
 *         serviceName: current.then(current => `com.amazonaws.${current.name}.execute-api`),
 *         subnetIds: [exampleSubnet.id],
 *         vpcEndpointType: "Interface",
 *         vpcId: example.id,
 *     }));
 * }
 * const exampleRestApi = new aws.apigateway.RestApi("example", {
 *     body: JSON.stringify({
 *         openapi: "3.0.1",
 *         info: {
 *             title: "example",
 *             version: "1.0",
 *         },
 *         paths: {
 *             "/path1": {
 *                 get: {
 *                     "x-amazon-apigateway-integration": {
 *                         httpMethod: "GET",
 *                         payloadFormatVersion: "1.0",
 *                         type: "HTTP_PROXY",
 *                         uri: "https://ip-ranges.amazonaws.com/ip-ranges.json",
 *                     },
 *                 },
 *             },
 *         },
 *     }),
 *     name: "example",
 *     putRestApiMode: "merge",
 *     endpointConfiguration: {
 *         types: "PRIVATE",
 *         vpcEndpointIds: [
 *             exampleVpcEndpoint[0].id,
 *             exampleVpcEndpoint[1].id,
 *             exampleVpcEndpoint[2].id,
 *         ],
 *     },
 * });
 * const exampleDeployment = new aws.apigateway.Deployment("example", {
 *     restApi: exampleRestApi.id,
 *     triggers: {
 *         redeployment: std.sha1Output({
 *             input: pulumi.jsonStringify(exampleRestApi.body),
 *         }).apply(invoke => invoke.result),
 *     },
 * });
 * const exampleStage = new aws.apigateway.Stage("example", {
 *     deployment: exampleDeployment.id,
 *     restApi: exampleRestApi.id,
 *     stageName: "example",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ### Resources
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 * import * as std from "@pulumi/std";
 *
 * const example = new aws.apigateway.RestApi("example", {name: "example"});
 * const exampleResource = new aws.apigateway.Resource("example", {
 *     parentId: example.rootResourceId,
 *     pathPart: "example",
 *     restApi: example.id,
 * });
 * const exampleMethod = new aws.apigateway.Method("example", {
 *     authorization: "NONE",
 *     httpMethod: "GET",
 *     resourceId: exampleResource.id,
 *     restApi: example.id,
 * });
 * const exampleIntegration = new aws.apigateway.Integration("example", {
 *     httpMethod: exampleMethod.httpMethod,
 *     resourceId: exampleResource.id,
 *     restApi: example.id,
 *     type: "MOCK",
 * });
 * const exampleDeployment = new aws.apigateway.Deployment("example", {
 *     restApi: example.id,
 *     triggers: {
 *         redeployment: std.sha1Output({
 *             input: pulumi.jsonStringify([
 *                 exampleResource.id,
 *                 exampleMethod.id,
 *                 exampleIntegration.id,
 *             ]),
 *         }).apply(invoke => invoke.result),
 *     },
 * });
 * const exampleStage = new aws.apigateway.Stage("example", {
 *     deployment: exampleDeployment.id,
 *     restApi: example.id,
 *     stageName: "example",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import `aws_api_gateway_rest_api` using the REST API ID. For example:
 *
 * ```sh
 * $ pulumi import aws:apigateway/restApi:RestApi example 12345abcde
 * ```
 * ~> __NOTE:__ Resource import does not currently support the `body` attribute.
 */
export class RestApi extends pulumi.CustomResource {
    /**
     * Get an existing RestApi resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RestApiState, opts?: pulumi.CustomResourceOptions): RestApi {
        return new RestApi(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:apigateway/restApi:RestApi';

    /**
     * Returns true if the given object is an instance of RestApi.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RestApi {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RestApi.__pulumiType;
    }

    /**
     * Source of the API key for requests. Valid values are `HEADER` (default) and `AUTHORIZER`. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-api-key-source` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions-api-key-source.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    public readonly apiKeySource!: pulumi.Output<string>;
    /**
     * ARN
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * List of binary media types supported by the REST API. By default, the REST API supports only UTF-8-encoded text payloads. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-binary-media-types` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions-binary-media-types.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    public readonly binaryMediaTypes!: pulumi.Output<string[]>;
    /**
     * OpenAPI specification that defines the set of routes and integrations to create as part of the REST API. This configuration, and any updates to it, will replace all REST API configuration except values overridden in this resource configuration and other resource updates applied after this resource but before any `aws.apigateway.Deployment` creation. More information about REST API OpenAPI support can be found in the [API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api.html).
     */
    public readonly body!: pulumi.Output<string | undefined>;
    /**
     * Creation date of the REST API
     */
    public /*out*/ readonly createdDate!: pulumi.Output<string>;
    /**
     * Description of the REST API. If importing an OpenAPI specification via the `body` argument, this corresponds to the `info.description` field. If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Whether clients can invoke your API by using the default execute-api endpoint. By default, clients can invoke your API with the default https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a custom domain name to invoke your API, disable the default endpoint. Defaults to `false`. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-endpoint-configuration` extension `disableExecuteApiEndpoint` property](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions-endpoint-configuration.html). If the argument value is `true` and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    public readonly disableExecuteApiEndpoint!: pulumi.Output<boolean>;
    /**
     * Configuration block defining API endpoint configuration including endpoint type. Defined below.
     */
    public readonly endpointConfiguration!: pulumi.Output<outputs.apigateway.RestApiEndpointConfiguration>;
    /**
     * Execution ARN part to be used in `lambdaPermission`'s `sourceArn`
     * when allowing API Gateway to invoke a Lambda function,
     * e.g., `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j`, which can be concatenated with allowed stage, method and resource path.
     */
    public /*out*/ readonly executionArn!: pulumi.Output<string>;
    /**
     * Whether warnings while API Gateway is creating or updating the resource should return an error or not. Defaults to `false`
     */
    public readonly failOnWarnings!: pulumi.Output<boolean | undefined>;
    /**
     * Minimum response size to compress for the REST API. String containing an integer value between `-1` and `10485760` (10MB). `-1` will disable an existing compression configuration, and all other values will enable compression with the configured size. New resources can simply omit this argument to disable compression, rather than setting the value to `-1`. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-minimum-compression-size` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-openapi-minimum-compression-size.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    public readonly minimumCompressionSize!: pulumi.Output<string>;
    /**
     * Name of the REST API. If importing an OpenAPI specification via the `body` argument, this corresponds to the `info.title` field. If the argument value is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Map of customizations for importing the specification in the `body` argument. For example, to exclude DocumentationParts from an imported API, set `ignore` equal to `documentation`. Additional documentation, including other parameters such as `basepath`, can be found in the [API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api.html).
     */
    public readonly parameters!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * JSON formatted policy document that controls access to the API Gateway. For more information about building AWS IAM policy documents with Pulumi, see the AWS IAM Policy Document Guide. The provider will only perform drift detection of its value when present in a configuration. We recommend using the `aws.apigateway.RestApiPolicy` resource instead. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-policy` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/openapi-extensions-policy.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    public readonly policy!: pulumi.Output<string>;
    /**
     * Mode of the PutRestApi operation when importing an OpenAPI specification via the `body` argument (create or update operation). Valid values are `merge` and `overwrite`. If unspecificed, defaults to `overwrite` (for backwards compatibility). This corresponds to the [`x-amazon-apigateway-put-integration-method` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions-put-integration-method.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    public readonly putRestApiMode!: pulumi.Output<string | undefined>;
    /**
     * Resource ID of the REST API's root
     */
    public /*out*/ readonly rootResourceId!: pulumi.Output<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a RestApi resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: RestApiArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RestApiArgs | RestApiState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RestApiState | undefined;
            resourceInputs["apiKeySource"] = state ? state.apiKeySource : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["binaryMediaTypes"] = state ? state.binaryMediaTypes : undefined;
            resourceInputs["body"] = state ? state.body : undefined;
            resourceInputs["createdDate"] = state ? state.createdDate : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["disableExecuteApiEndpoint"] = state ? state.disableExecuteApiEndpoint : undefined;
            resourceInputs["endpointConfiguration"] = state ? state.endpointConfiguration : undefined;
            resourceInputs["executionArn"] = state ? state.executionArn : undefined;
            resourceInputs["failOnWarnings"] = state ? state.failOnWarnings : undefined;
            resourceInputs["minimumCompressionSize"] = state ? state.minimumCompressionSize : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parameters"] = state ? state.parameters : undefined;
            resourceInputs["policy"] = state ? state.policy : undefined;
            resourceInputs["putRestApiMode"] = state ? state.putRestApiMode : undefined;
            resourceInputs["rootResourceId"] = state ? state.rootResourceId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as RestApiArgs | undefined;
            resourceInputs["apiKeySource"] = args ? args.apiKeySource : undefined;
            resourceInputs["binaryMediaTypes"] = args ? args.binaryMediaTypes : undefined;
            resourceInputs["body"] = args ? args.body : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["disableExecuteApiEndpoint"] = args ? args.disableExecuteApiEndpoint : undefined;
            resourceInputs["endpointConfiguration"] = args ? args.endpointConfiguration : undefined;
            resourceInputs["failOnWarnings"] = args ? args.failOnWarnings : undefined;
            resourceInputs["minimumCompressionSize"] = args ? args.minimumCompressionSize : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["parameters"] = args ? args.parameters : undefined;
            resourceInputs["policy"] = args ? args.policy : undefined;
            resourceInputs["putRestApiMode"] = args ? args.putRestApiMode : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["createdDate"] = undefined /*out*/;
            resourceInputs["executionArn"] = undefined /*out*/;
            resourceInputs["rootResourceId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RestApi.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RestApi resources.
 */
export interface RestApiState {
    /**
     * Source of the API key for requests. Valid values are `HEADER` (default) and `AUTHORIZER`. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-api-key-source` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions-api-key-source.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    apiKeySource?: pulumi.Input<string>;
    /**
     * ARN
     */
    arn?: pulumi.Input<string>;
    /**
     * List of binary media types supported by the REST API. By default, the REST API supports only UTF-8-encoded text payloads. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-binary-media-types` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions-binary-media-types.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    binaryMediaTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * OpenAPI specification that defines the set of routes and integrations to create as part of the REST API. This configuration, and any updates to it, will replace all REST API configuration except values overridden in this resource configuration and other resource updates applied after this resource but before any `aws.apigateway.Deployment` creation. More information about REST API OpenAPI support can be found in the [API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api.html).
     */
    body?: pulumi.Input<string>;
    /**
     * Creation date of the REST API
     */
    createdDate?: pulumi.Input<string>;
    /**
     * Description of the REST API. If importing an OpenAPI specification via the `body` argument, this corresponds to the `info.description` field. If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether clients can invoke your API by using the default execute-api endpoint. By default, clients can invoke your API with the default https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a custom domain name to invoke your API, disable the default endpoint. Defaults to `false`. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-endpoint-configuration` extension `disableExecuteApiEndpoint` property](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions-endpoint-configuration.html). If the argument value is `true` and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    disableExecuteApiEndpoint?: pulumi.Input<boolean>;
    /**
     * Configuration block defining API endpoint configuration including endpoint type. Defined below.
     */
    endpointConfiguration?: pulumi.Input<inputs.apigateway.RestApiEndpointConfiguration>;
    /**
     * Execution ARN part to be used in `lambdaPermission`'s `sourceArn`
     * when allowing API Gateway to invoke a Lambda function,
     * e.g., `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j`, which can be concatenated with allowed stage, method and resource path.
     */
    executionArn?: pulumi.Input<string>;
    /**
     * Whether warnings while API Gateway is creating or updating the resource should return an error or not. Defaults to `false`
     */
    failOnWarnings?: pulumi.Input<boolean>;
    /**
     * Minimum response size to compress for the REST API. String containing an integer value between `-1` and `10485760` (10MB). `-1` will disable an existing compression configuration, and all other values will enable compression with the configured size. New resources can simply omit this argument to disable compression, rather than setting the value to `-1`. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-minimum-compression-size` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-openapi-minimum-compression-size.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    minimumCompressionSize?: pulumi.Input<string>;
    /**
     * Name of the REST API. If importing an OpenAPI specification via the `body` argument, this corresponds to the `info.title` field. If the argument value is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    name?: pulumi.Input<string>;
    /**
     * Map of customizations for importing the specification in the `body` argument. For example, to exclude DocumentationParts from an imported API, set `ignore` equal to `documentation`. Additional documentation, including other parameters such as `basepath`, can be found in the [API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api.html).
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * JSON formatted policy document that controls access to the API Gateway. For more information about building AWS IAM policy documents with Pulumi, see the AWS IAM Policy Document Guide. The provider will only perform drift detection of its value when present in a configuration. We recommend using the `aws.apigateway.RestApiPolicy` resource instead. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-policy` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/openapi-extensions-policy.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    policy?: pulumi.Input<string>;
    /**
     * Mode of the PutRestApi operation when importing an OpenAPI specification via the `body` argument (create or update operation). Valid values are `merge` and `overwrite`. If unspecificed, defaults to `overwrite` (for backwards compatibility). This corresponds to the [`x-amazon-apigateway-put-integration-method` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions-put-integration-method.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    putRestApiMode?: pulumi.Input<string>;
    /**
     * Resource ID of the REST API's root
     */
    rootResourceId?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a RestApi resource.
 */
export interface RestApiArgs {
    /**
     * Source of the API key for requests. Valid values are `HEADER` (default) and `AUTHORIZER`. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-api-key-source` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions-api-key-source.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    apiKeySource?: pulumi.Input<string>;
    /**
     * List of binary media types supported by the REST API. By default, the REST API supports only UTF-8-encoded text payloads. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-binary-media-types` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions-binary-media-types.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    binaryMediaTypes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * OpenAPI specification that defines the set of routes and integrations to create as part of the REST API. This configuration, and any updates to it, will replace all REST API configuration except values overridden in this resource configuration and other resource updates applied after this resource but before any `aws.apigateway.Deployment` creation. More information about REST API OpenAPI support can be found in the [API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api.html).
     */
    body?: pulumi.Input<string>;
    /**
     * Description of the REST API. If importing an OpenAPI specification via the `body` argument, this corresponds to the `info.description` field. If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    description?: pulumi.Input<string>;
    /**
     * Whether clients can invoke your API by using the default execute-api endpoint. By default, clients can invoke your API with the default https://{api_id}.execute-api.{region}.amazonaws.com endpoint. To require that clients use a custom domain name to invoke your API, disable the default endpoint. Defaults to `false`. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-endpoint-configuration` extension `disableExecuteApiEndpoint` property](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions-endpoint-configuration.html). If the argument value is `true` and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    disableExecuteApiEndpoint?: pulumi.Input<boolean>;
    /**
     * Configuration block defining API endpoint configuration including endpoint type. Defined below.
     */
    endpointConfiguration?: pulumi.Input<inputs.apigateway.RestApiEndpointConfiguration>;
    /**
     * Whether warnings while API Gateway is creating or updating the resource should return an error or not. Defaults to `false`
     */
    failOnWarnings?: pulumi.Input<boolean>;
    /**
     * Minimum response size to compress for the REST API. String containing an integer value between `-1` and `10485760` (10MB). `-1` will disable an existing compression configuration, and all other values will enable compression with the configured size. New resources can simply omit this argument to disable compression, rather than setting the value to `-1`. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-minimum-compression-size` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-openapi-minimum-compression-size.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    minimumCompressionSize?: pulumi.Input<string>;
    /**
     * Name of the REST API. If importing an OpenAPI specification via the `body` argument, this corresponds to the `info.title` field. If the argument value is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    name?: pulumi.Input<string>;
    /**
     * Map of customizations for importing the specification in the `body` argument. For example, to exclude DocumentationParts from an imported API, set `ignore` equal to `documentation`. Additional documentation, including other parameters such as `basepath`, can be found in the [API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-import-api.html).
     */
    parameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * JSON formatted policy document that controls access to the API Gateway. For more information about building AWS IAM policy documents with Pulumi, see the AWS IAM Policy Document Guide. The provider will only perform drift detection of its value when present in a configuration. We recommend using the `aws.apigateway.RestApiPolicy` resource instead. If importing an OpenAPI specification via the `body` argument, this corresponds to the [`x-amazon-apigateway-policy` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/openapi-extensions-policy.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    policy?: pulumi.Input<string>;
    /**
     * Mode of the PutRestApi operation when importing an OpenAPI specification via the `body` argument (create or update operation). Valid values are `merge` and `overwrite`. If unspecificed, defaults to `overwrite` (for backwards compatibility). This corresponds to the [`x-amazon-apigateway-put-integration-method` extension](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions-put-integration-method.html). If the argument value is provided and is different than the OpenAPI value, the argument value will override the OpenAPI value.
     */
    putRestApiMode?: pulumi.Input<string>;
    /**
     * Key-value map of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
