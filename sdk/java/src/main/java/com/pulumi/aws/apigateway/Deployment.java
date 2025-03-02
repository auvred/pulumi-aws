// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigateway.DeploymentArgs;
import com.pulumi.aws.apigateway.inputs.DeploymentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an API Gateway REST Deployment. A deployment is a snapshot of the REST API configuration. The deployment can then be published to callable endpoints via the `aws.apigateway.Stage` resource and optionally managed further with the `aws.apigateway.BasePathMapping` resource, `aws.apigateway.DomainName` resource, and `aws_api_method_settings` resource. For more information, see the [API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-deploy-api.html).
 * 
 * To properly capture all REST API configuration in a deployment, this resource must have dependencies on all prior resources that manage resources/paths, methods, integrations, etc.
 * 
 * * For REST APIs that are configured via OpenAPI specification (`aws.apigateway.RestApi` resource `body` argument), no special dependency setup is needed beyond referencing the  `id` attribute of that resource unless additional resources have further customized the REST API.
 * * When the REST API configuration involves other resources (`aws.apigateway.Integration` resource), the dependency setup can be done with implicit resource references in the `triggers` argument or explicit resource references using the [resource `dependsOn` custom option](https://www.pulumi.com/docs/intro/concepts/resources/#dependson). The `triggers` argument should be preferred over `depends_on`, since `depends_on` can only capture dependency ordering and will not cause the resource to recreate (redeploy the REST API) with upstream configuration changes.
 * 
 * !&gt; **WARNING:** It is recommended to use the `aws.apigateway.Stage` resource instead of managing an API Gateway Stage via the `stage_name` argument of this resource. When this resource is recreated (REST API redeployment) with the `stage_name` configured, the stage is deleted and recreated. This will cause a temporary service interruption, increase provide plan differences, and can require a second apply to recreate any downstream stage configuration such as associated `aws_api_method_settings` resources.
 * 
 * ## Example Usage
 * 
 * ### OpenAPI Specification
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.apigateway.RestApi;
 * import com.pulumi.aws.apigateway.RestApiArgs;
 * import com.pulumi.aws.apigateway.Deployment;
 * import com.pulumi.aws.apigateway.DeploymentArgs;
 * import com.pulumi.aws.apigateway.Stage;
 * import com.pulumi.aws.apigateway.StageArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new RestApi(&#34;example&#34;, RestApiArgs.builder()        
 *             .body(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;openapi&#34;, &#34;3.0.1&#34;),
 *                     jsonProperty(&#34;info&#34;, jsonObject(
 *                         jsonProperty(&#34;title&#34;, &#34;example&#34;),
 *                         jsonProperty(&#34;version&#34;, &#34;1.0&#34;)
 *                     )),
 *                     jsonProperty(&#34;paths&#34;, jsonObject(
 *                         jsonProperty(&#34;/path1&#34;, jsonObject(
 *                             jsonProperty(&#34;get&#34;, jsonObject(
 *                                 jsonProperty(&#34;x-amazon-apigateway-integration&#34;, jsonObject(
 *                                     jsonProperty(&#34;httpMethod&#34;, &#34;GET&#34;),
 *                                     jsonProperty(&#34;payloadFormatVersion&#34;, &#34;1.0&#34;),
 *                                     jsonProperty(&#34;type&#34;, &#34;HTTP_PROXY&#34;),
 *                                     jsonProperty(&#34;uri&#34;, &#34;https://ip-ranges.amazonaws.com/ip-ranges.json&#34;)
 *                                 ))
 *                             ))
 *                         ))
 *                     ))
 *                 )))
 *             .name(&#34;example&#34;)
 *             .build());
 * 
 *         var exampleDeployment = new Deployment(&#34;exampleDeployment&#34;, DeploymentArgs.builder()        
 *             .restApi(example.id())
 *             .triggers(Map.of(&#34;redeployment&#34;, StdFunctions.sha1().applyValue(invoke -&gt; invoke.result())))
 *             .build());
 * 
 *         var exampleStage = new Stage(&#34;exampleStage&#34;, StageArgs.builder()        
 *             .deployment(exampleDeployment.id())
 *             .restApi(example.id())
 *             .stageName(&#34;example&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Resources
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.apigateway.RestApi;
 * import com.pulumi.aws.apigateway.RestApiArgs;
 * import com.pulumi.aws.apigateway.Resource;
 * import com.pulumi.aws.apigateway.ResourceArgs;
 * import com.pulumi.aws.apigateway.Method;
 * import com.pulumi.aws.apigateway.MethodArgs;
 * import com.pulumi.aws.apigateway.Integration;
 * import com.pulumi.aws.apigateway.IntegrationArgs;
 * import com.pulumi.aws.apigateway.Deployment;
 * import com.pulumi.aws.apigateway.DeploymentArgs;
 * import com.pulumi.aws.apigateway.Stage;
 * import com.pulumi.aws.apigateway.StageArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new RestApi(&#34;example&#34;, RestApiArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .build());
 * 
 *         var exampleResource = new Resource(&#34;exampleResource&#34;, ResourceArgs.builder()        
 *             .parentId(example.rootResourceId())
 *             .pathPart(&#34;example&#34;)
 *             .restApi(example.id())
 *             .build());
 * 
 *         var exampleMethod = new Method(&#34;exampleMethod&#34;, MethodArgs.builder()        
 *             .authorization(&#34;NONE&#34;)
 *             .httpMethod(&#34;GET&#34;)
 *             .resourceId(exampleResource.id())
 *             .restApi(example.id())
 *             .build());
 * 
 *         var exampleIntegration = new Integration(&#34;exampleIntegration&#34;, IntegrationArgs.builder()        
 *             .httpMethod(exampleMethod.httpMethod())
 *             .resourceId(exampleResource.id())
 *             .restApi(example.id())
 *             .type(&#34;MOCK&#34;)
 *             .build());
 * 
 *         var exampleDeployment = new Deployment(&#34;exampleDeployment&#34;, DeploymentArgs.builder()        
 *             .restApi(example.id())
 *             .triggers(Map.of(&#34;redeployment&#34;, StdFunctions.sha1().applyValue(invoke -&gt; invoke.result())))
 *             .build());
 * 
 *         var exampleStage = new Stage(&#34;exampleStage&#34;, StageArgs.builder()        
 *             .deployment(exampleDeployment.id())
 *             .restApi(example.id())
 *             .stageName(&#34;example&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_api_gateway_deployment` using `REST-API-ID/DEPLOYMENT-ID`. For example:
 * 
 * ```sh
 * $ pulumi import aws:apigateway/deployment:Deployment example aabbccddee/1122334
 * ```
 * The `stage_name`, `stage_description`, and `variables` arguments cannot be imported. Use the `aws_api_gateway_stage` resource to import and manage stages.
 * 
 * The `triggers` argument cannot be imported.
 * 
 */
@ResourceType(type="aws:apigateway/deployment:Deployment")
public class Deployment extends com.pulumi.resources.CustomResource {
    /**
     * Creation date of the deployment
     * 
     */
    @Export(name="createdDate", refs={String.class}, tree="[0]")
    private Output<String> createdDate;

    /**
     * @return Creation date of the deployment
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * Description of the deployment
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the deployment
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Execution ARN to be used in `lambda_permission`&#39;s `source_arn`
     * when allowing API Gateway to invoke a Lambda function,
     * e.g., `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
     * 
     */
    @Export(name="executionArn", refs={String.class}, tree="[0]")
    private Output<String> executionArn;

    /**
     * @return Execution ARN to be used in `lambda_permission`&#39;s `source_arn`
     * when allowing API Gateway to invoke a Lambda function,
     * e.g., `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
     * 
     */
    public Output<String> executionArn() {
        return this.executionArn;
    }
    /**
     * URL to invoke the API pointing to the stage,
     * e.g., `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
     * 
     */
    @Export(name="invokeUrl", refs={String.class}, tree="[0]")
    private Output<String> invokeUrl;

    /**
     * @return URL to invoke the API pointing to the stage,
     * e.g., `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
     * 
     */
    public Output<String> invokeUrl() {
        return this.invokeUrl;
    }
    /**
     * REST API identifier.
     * 
     */
    @Export(name="restApi", refs={String.class}, tree="[0]")
    private Output<String> restApi;

    /**
     * @return REST API identifier.
     * 
     */
    public Output<String> restApi() {
        return this.restApi;
    }
    /**
     * Description to set on the stage managed by the `stage_name` argument.
     * 
     */
    @Export(name="stageDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> stageDescription;

    /**
     * @return Description to set on the stage managed by the `stage_name` argument.
     * 
     */
    public Output<Optional<String>> stageDescription() {
        return Codegen.optional(this.stageDescription);
    }
    /**
     * Name of the stage to create with this deployment. If the specified stage already exists, it will be updated to point to the new deployment. We recommend using the `aws.apigateway.Stage` resource instead to manage stages.
     * 
     */
    @Export(name="stageName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> stageName;

    /**
     * @return Name of the stage to create with this deployment. If the specified stage already exists, it will be updated to point to the new deployment. We recommend using the `aws.apigateway.Stage` resource instead to manage stages.
     * 
     */
    public Output<Optional<String>> stageName() {
        return Codegen.optional(this.stageName);
    }
    /**
     * Map of arbitrary keys and values that, when changed, will trigger a redeployment.
     * 
     */
    @Export(name="triggers", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> triggers;

    /**
     * @return Map of arbitrary keys and values that, when changed, will trigger a redeployment.
     * 
     */
    public Output<Optional<Map<String,String>>> triggers() {
        return Codegen.optional(this.triggers);
    }
    /**
     * Map to set on the stage managed by the `stage_name` argument.
     * 
     */
    @Export(name="variables", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> variables;

    /**
     * @return Map to set on the stage managed by the `stage_name` argument.
     * 
     */
    public Output<Optional<Map<String,String>>> variables() {
        return Codegen.optional(this.variables);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Deployment(String name) {
        this(name, DeploymentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Deployment(String name, DeploymentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Deployment(String name, DeploymentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/deployment:Deployment", name, args == null ? DeploymentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Deployment(String name, Output<String> id, @Nullable DeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/deployment:Deployment", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Deployment get(String name, Output<String> id, @Nullable DeploymentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Deployment(name, id, state, options);
    }
}
