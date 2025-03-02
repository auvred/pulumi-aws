// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appmesh.GatewayRouteArgs;
import com.pulumi.aws.appmesh.inputs.GatewayRouteState;
import com.pulumi.aws.appmesh.outputs.GatewayRouteSpec;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an AWS App Mesh gateway route resource.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.appmesh.GatewayRoute;
 * import com.pulumi.aws.appmesh.GatewayRouteArgs;
 * import com.pulumi.aws.appmesh.inputs.GatewayRouteSpecArgs;
 * import com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteArgs;
 * import com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionArgs;
 * import com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionTargetArgs;
 * import com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs;
 * import com.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteMatchArgs;
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
 *         var example = new GatewayRoute(&#34;example&#34;, GatewayRouteArgs.builder()        
 *             .name(&#34;example-gateway-route&#34;)
 *             .meshName(&#34;example-service-mesh&#34;)
 *             .virtualGatewayName(exampleAwsAppmeshVirtualGateway.name())
 *             .spec(GatewayRouteSpecArgs.builder()
 *                 .httpRoute(GatewayRouteSpecHttpRouteArgs.builder()
 *                     .action(GatewayRouteSpecHttpRouteActionArgs.builder()
 *                         .target(GatewayRouteSpecHttpRouteActionTargetArgs.builder()
 *                             .virtualService(GatewayRouteSpecHttpRouteActionTargetVirtualServiceArgs.builder()
 *                                 .virtualServiceName(exampleAwsAppmeshVirtualService.name())
 *                                 .build())
 *                             .build())
 *                         .build())
 *                     .match(GatewayRouteSpecHttpRouteMatchArgs.builder()
 *                         .prefix(&#34;/&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .tags(Map.of(&#34;Environment&#34;, &#34;test&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import App Mesh gateway routes using `mesh_name` and `virtual_gateway_name` together with the gateway route&#39;s `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:appmesh/gatewayRoute:GatewayRoute example mesh/gw1/example-gateway-route
 * ```
 * 
 */
@ResourceType(type="aws:appmesh/gatewayRoute:GatewayRoute")
public class GatewayRoute extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the gateway route.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the gateway route.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Creation date of the gateway route.
     * 
     */
    @Export(name="createdDate", refs={String.class}, tree="[0]")
    private Output<String> createdDate;

    /**
     * @return Creation date of the gateway route.
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * Last update date of the gateway route.
     * 
     */
    @Export(name="lastUpdatedDate", refs={String.class}, tree="[0]")
    private Output<String> lastUpdatedDate;

    /**
     * @return Last update date of the gateway route.
     * 
     */
    public Output<String> lastUpdatedDate() {
        return this.lastUpdatedDate;
    }
    /**
     * Name of the service mesh in which to create the gateway route. Must be between 1 and 255 characters in length.
     * 
     */
    @Export(name="meshName", refs={String.class}, tree="[0]")
    private Output<String> meshName;

    /**
     * @return Name of the service mesh in which to create the gateway route. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> meshName() {
        return this.meshName;
    }
    /**
     * AWS account ID of the service mesh&#39;s owner. Defaults to the account ID the AWS provider is currently connected to.
     * 
     */
    @Export(name="meshOwner", refs={String.class}, tree="[0]")
    private Output<String> meshOwner;

    /**
     * @return AWS account ID of the service mesh&#39;s owner. Defaults to the account ID the AWS provider is currently connected to.
     * 
     */
    public Output<String> meshOwner() {
        return this.meshOwner;
    }
    /**
     * Name to use for the gateway route. Must be between 1 and 255 characters in length.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name to use for the gateway route. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Resource owner&#39;s AWS account ID.
     * 
     */
    @Export(name="resourceOwner", refs={String.class}, tree="[0]")
    private Output<String> resourceOwner;

    /**
     * @return Resource owner&#39;s AWS account ID.
     * 
     */
    public Output<String> resourceOwner() {
        return this.resourceOwner;
    }
    /**
     * Gateway route specification to apply.
     * 
     */
    @Export(name="spec", refs={GatewayRouteSpec.class}, tree="[0]")
    private Output<GatewayRouteSpec> spec;

    /**
     * @return Gateway route specification to apply.
     * 
     */
    public Output<GatewayRouteSpec> spec() {
        return this.spec;
    }
    /**
     * Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Name of the virtual gateway to associate the gateway route with. Must be between 1 and 255 characters in length.
     * 
     */
    @Export(name="virtualGatewayName", refs={String.class}, tree="[0]")
    private Output<String> virtualGatewayName;

    /**
     * @return Name of the virtual gateway to associate the gateway route with. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> virtualGatewayName() {
        return this.virtualGatewayName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GatewayRoute(String name) {
        this(name, GatewayRouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GatewayRoute(String name, GatewayRouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GatewayRoute(String name, GatewayRouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appmesh/gatewayRoute:GatewayRoute", name, args == null ? GatewayRouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GatewayRoute(String name, Output<String> id, @Nullable GatewayRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appmesh/gatewayRoute:GatewayRoute", name, state, makeResourceOptions(options, id));
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
    public static GatewayRoute get(String name, Output<String> id, @Nullable GatewayRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GatewayRoute(name, id, state, options);
    }
}
