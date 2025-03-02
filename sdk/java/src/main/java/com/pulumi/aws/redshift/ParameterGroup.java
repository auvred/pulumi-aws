// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.redshift.ParameterGroupArgs;
import com.pulumi.aws.redshift.inputs.ParameterGroupState;
import com.pulumi.aws.redshift.outputs.ParameterGroupParameter;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Redshift Cluster parameter group resource.
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
 * import com.pulumi.aws.redshift.ParameterGroup;
 * import com.pulumi.aws.redshift.ParameterGroupArgs;
 * import com.pulumi.aws.redshift.inputs.ParameterGroupParameterArgs;
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
 *         var bar = new ParameterGroup(&#34;bar&#34;, ParameterGroupArgs.builder()        
 *             .name(&#34;parameter-group-test&#34;)
 *             .family(&#34;redshift-1.0&#34;)
 *             .parameters(            
 *                 ParameterGroupParameterArgs.builder()
 *                     .name(&#34;require_ssl&#34;)
 *                     .value(&#34;true&#34;)
 *                     .build(),
 *                 ParameterGroupParameterArgs.builder()
 *                     .name(&#34;query_group&#34;)
 *                     .value(&#34;example&#34;)
 *                     .build(),
 *                 ParameterGroupParameterArgs.builder()
 *                     .name(&#34;enable_user_activity_logging&#34;)
 *                     .value(&#34;true&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Redshift Parameter Groups using the `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:redshift/parameterGroup:ParameterGroup paramgroup1 parameter-group-test-pulumi
 * ```
 * 
 */
@ResourceType(type="aws:redshift/parameterGroup:ParameterGroup")
public class ParameterGroup extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of parameter group
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of parameter group
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The description of the Redshift parameter group. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return The description of the Redshift parameter group. Defaults to &#34;Managed by Pulumi&#34;.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * The family of the Redshift parameter group.
     * 
     */
    @Export(name="family", refs={String.class}, tree="[0]")
    private Output<String> family;

    /**
     * @return The family of the Redshift parameter group.
     * 
     */
    public Output<String> family() {
        return this.family;
    }
    /**
     * The name of the Redshift parameter.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Redshift parameter.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of Redshift parameters to apply.
     * 
     */
    @Export(name="parameters", refs={List.class,ParameterGroupParameter.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ParameterGroupParameter>> parameters;

    /**
     * @return A list of Redshift parameters to apply.
     * 
     */
    public Output<Optional<List<ParameterGroupParameter>>> parameters() {
        return Codegen.optional(this.parameters);
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     * You can read more about the parameters that Redshift supports in the [documentation](http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html)
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     * You can read more about the parameters that Redshift supports in the [documentation](http://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html)
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ParameterGroup(String name) {
        this(name, ParameterGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ParameterGroup(String name, ParameterGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ParameterGroup(String name, ParameterGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/parameterGroup:ParameterGroup", name, args == null ? ParameterGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ParameterGroup(String name, Output<String> id, @Nullable ParameterGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/parameterGroup:ParameterGroup", name, state, makeResourceOptions(options, id));
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
    public static ParameterGroup get(String name, Output<String> id, @Nullable ParameterGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ParameterGroup(name, id, state, options);
    }
}
