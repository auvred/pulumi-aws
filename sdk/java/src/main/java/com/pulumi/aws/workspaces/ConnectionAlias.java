// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.workspaces;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.workspaces.ConnectionAliasArgs;
import com.pulumi.aws.workspaces.inputs.ConnectionAliasState;
import com.pulumi.aws.workspaces.outputs.ConnectionAliasTimeouts;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS WorkSpaces Connection Alias.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.workspaces.ConnectionAlias;
 * import com.pulumi.aws.workspaces.ConnectionAliasArgs;
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
 *         var example = new ConnectionAlias(&#34;example&#34;, ConnectionAliasArgs.builder()        
 *             .connectionString(&#34;testdomain.test&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import WorkSpaces Connection Alias using the connection alias ID. For example:
 * 
 * ```sh
 * $ pulumi import aws:workspaces/connectionAlias:ConnectionAlias example rft-8012925589
 * ```
 * 
 */
@ResourceType(type="aws:workspaces/connectionAlias:ConnectionAlias")
public class ConnectionAlias extends com.pulumi.resources.CustomResource {
    /**
     * The connection string specified for the connection alias. The connection string must be in the form of a fully qualified domain name (FQDN), such as www.example.com.
     * 
     */
    @Export(name="connectionString", refs={String.class}, tree="[0]")
    private Output<String> connectionString;

    /**
     * @return The connection string specified for the connection alias. The connection string must be in the form of a fully qualified domain name (FQDN), such as www.example.com.
     * 
     */
    public Output<String> connectionString() {
        return this.connectionString;
    }
    /**
     * The identifier of the Amazon Web Services account that owns the connection alias.
     * 
     */
    @Export(name="ownerAccountId", refs={String.class}, tree="[0]")
    private Output<String> ownerAccountId;

    /**
     * @return The identifier of the Amazon Web Services account that owns the connection alias.
     * 
     */
    public Output<String> ownerAccountId() {
        return this.ownerAccountId;
    }
    /**
     * The current state of the connection alias.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The current state of the connection alias.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * A map of tags assigned to the WorkSpaces Connection Alias. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags assigned to the WorkSpaces Connection Alias. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @Export(name="timeouts", refs={ConnectionAliasTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ ConnectionAliasTimeouts> timeouts;

    public Output<Optional<ConnectionAliasTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ConnectionAlias(String name) {
        this(name, ConnectionAliasArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ConnectionAlias(String name, ConnectionAliasArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ConnectionAlias(String name, ConnectionAliasArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:workspaces/connectionAlias:ConnectionAlias", name, args == null ? ConnectionAliasArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ConnectionAlias(String name, Output<String> id, @Nullable ConnectionAliasState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:workspaces/connectionAlias:ConnectionAlias", name, state, makeResourceOptions(options, id));
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
    public static ConnectionAlias get(String name, Output<String> id, @Nullable ConnectionAliasState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ConnectionAlias(name, id, state, options);
    }
}
