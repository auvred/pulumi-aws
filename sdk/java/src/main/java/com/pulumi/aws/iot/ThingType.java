// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iot.ThingTypeArgs;
import com.pulumi.aws.iot.inputs.ThingTypeState;
import com.pulumi.aws.iot.outputs.ThingTypeProperties;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates and manages an AWS IoT Thing Type.
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
 * import com.pulumi.aws.iot.ThingType;
 * import com.pulumi.aws.iot.ThingTypeArgs;
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
 *         var foo = new ThingType(&#34;foo&#34;, ThingTypeArgs.builder()        
 *             .name(&#34;my_iot_thing&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import IOT Thing Types using the name. For example:
 * 
 * ```sh
 * $ pulumi import aws:iot/thingType:ThingType example example
 * ```
 * 
 */
@ResourceType(type="aws:iot/thingType:ThingType")
public class ThingType extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the created AWS IoT Thing Type.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the created AWS IoT Thing Type.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Whether the thing type is deprecated. If true, no new things could be associated with this type.
     * 
     */
    @Export(name="deprecated", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deprecated;

    /**
     * @return Whether the thing type is deprecated. If true, no new things could be associated with this type.
     * 
     */
    public Output<Optional<Boolean>> deprecated() {
        return Codegen.optional(this.deprecated);
    }
    /**
     * The name of the thing type.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the thing type.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * , Configuration block that can contain the following properties of the thing type:
     * 
     */
    @Export(name="properties", refs={ThingTypeProperties.class}, tree="[0]")
    private Output</* @Nullable */ ThingTypeProperties> properties;

    /**
     * @return , Configuration block that can contain the following properties of the thing type:
     * 
     */
    public Output<Optional<ThingTypeProperties>> properties() {
        return Codegen.optional(this.properties);
    }
    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ThingType(String name) {
        this(name, ThingTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ThingType(String name, @Nullable ThingTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ThingType(String name, @Nullable ThingTypeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/thingType:ThingType", name, args == null ? ThingTypeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ThingType(String name, Output<String> id, @Nullable ThingTypeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/thingType:ThingType", name, state, makeResourceOptions(options, id));
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
    public static ThingType get(String name, Output<String> id, @Nullable ThingTypeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ThingType(name, id, state, options);
    }
}
