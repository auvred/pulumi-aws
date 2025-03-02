// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigatewayv2.RouteResponseArgs;
import com.pulumi.aws.apigatewayv2.inputs.RouteResponseState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Amazon API Gateway Version 2 route response.
 * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
 * 
 * ## Example Usage
 * 
 * ### Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.apigatewayv2.RouteResponse;
 * import com.pulumi.aws.apigatewayv2.RouteResponseArgs;
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
 *         var example = new RouteResponse(&#34;example&#34;, RouteResponseArgs.builder()        
 *             .apiId(exampleAwsApigatewayv2Api.id())
 *             .routeId(exampleAwsApigatewayv2Route.id())
 *             .routeResponseKey(&#34;$default&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_apigatewayv2_route_response` using the API identifier, route identifier and route response identifier. For example:
 * 
 * ```sh
 * $ pulumi import aws:apigatewayv2/routeResponse:RouteResponse example aabbccddee/1122334/998877
 * ```
 * 
 */
@ResourceType(type="aws:apigatewayv2/routeResponse:RouteResponse")
public class RouteResponse extends com.pulumi.resources.CustomResource {
    /**
     * API identifier.
     * 
     */
    @Export(name="apiId", refs={String.class}, tree="[0]")
    private Output<String> apiId;

    /**
     * @return API identifier.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }
    /**
     * The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
     * 
     */
    @Export(name="modelSelectionExpression", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> modelSelectionExpression;

    /**
     * @return The [model selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions) for the route response.
     * 
     */
    public Output<Optional<String>> modelSelectionExpression() {
        return Codegen.optional(this.modelSelectionExpression);
    }
    /**
     * Response models for the route response.
     * 
     */
    @Export(name="responseModels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> responseModels;

    /**
     * @return Response models for the route response.
     * 
     */
    public Output<Optional<Map<String,String>>> responseModels() {
        return Codegen.optional(this.responseModels);
    }
    /**
     * Identifier of the `aws.apigatewayv2.Route`.
     * 
     */
    @Export(name="routeId", refs={String.class}, tree="[0]")
    private Output<String> routeId;

    /**
     * @return Identifier of the `aws.apigatewayv2.Route`.
     * 
     */
    public Output<String> routeId() {
        return this.routeId;
    }
    /**
     * Route response key.
     * 
     */
    @Export(name="routeResponseKey", refs={String.class}, tree="[0]")
    private Output<String> routeResponseKey;

    /**
     * @return Route response key.
     * 
     */
    public Output<String> routeResponseKey() {
        return this.routeResponseKey;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RouteResponse(String name) {
        this(name, RouteResponseArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RouteResponse(String name, RouteResponseArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RouteResponse(String name, RouteResponseArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/routeResponse:RouteResponse", name, args == null ? RouteResponseArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RouteResponse(String name, Output<String> id, @Nullable RouteResponseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/routeResponse:RouteResponse", name, state, makeResourceOptions(options, id));
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
    public static RouteResponse get(String name, Output<String> id, @Nullable RouteResponseState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RouteResponse(name, id, state, options);
    }
}
