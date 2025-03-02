// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.grafana;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.grafana.RoleAssociationArgs;
import com.pulumi.aws.grafana.inputs.RoleAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Managed Grafana workspace role association resource.
 * 
 * ## Example Usage
 * 
 * ### Basic configuration
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.grafana.Workspace;
 * import com.pulumi.aws.grafana.WorkspaceArgs;
 * import com.pulumi.aws.grafana.RoleAssociation;
 * import com.pulumi.aws.grafana.RoleAssociationArgs;
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
 *         var assume = new Role(&#34;assume&#34;, RoleArgs.builder()        
 *             .name(&#34;grafana-assume&#34;)
 *             .assumeRolePolicy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;version&#34;, &#34;2012-10-17&#34;),
 *                     jsonProperty(&#34;statement&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;action&#34;, &#34;sts:AssumeRole&#34;),
 *                         jsonProperty(&#34;effect&#34;, &#34;Allow&#34;),
 *                         jsonProperty(&#34;sid&#34;, &#34;&#34;),
 *                         jsonProperty(&#34;principal&#34;, jsonObject(
 *                             jsonProperty(&#34;service&#34;, &#34;grafana.amazonaws.com&#34;)
 *                         ))
 *                     )))
 *                 )))
 *             .build());
 * 
 *         var exampleWorkspace = new Workspace(&#34;exampleWorkspace&#34;, WorkspaceArgs.builder()        
 *             .accountAccessType(&#34;CURRENT_ACCOUNT&#34;)
 *             .authenticationProviders(&#34;SAML&#34;)
 *             .permissionType(&#34;SERVICE_MANAGED&#34;)
 *             .roleArn(assume.arn())
 *             .build());
 * 
 *         var example = new RoleAssociation(&#34;example&#34;, RoleAssociationArgs.builder()        
 *             .role(&#34;ADMIN&#34;)
 *             .userIds(            
 *                 &#34;USER_ID_1&#34;,
 *                 &#34;USER_ID_2&#34;)
 *             .workspaceId(exampleWorkspace.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="aws:grafana/roleAssociation:RoleAssociation")
public class RoleAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The AWS SSO group ids to be assigned the role given in `role`.
     * 
     */
    @Export(name="groupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> groupIds;

    /**
     * @return The AWS SSO group ids to be assigned the role given in `role`.
     * 
     */
    public Output<Optional<List<String>>> groupIds() {
        return Codegen.optional(this.groupIds);
    }
    /**
     * The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
     * 
     */
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output<String> role;

    /**
     * @return The grafana role. Valid values can be found [here](https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdateInstruction.html#ManagedGrafana-Type-UpdateInstruction-role).
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    /**
     * The AWS SSO user ids to be assigned the role given in `role`.
     * 
     */
    @Export(name="userIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> userIds;

    /**
     * @return The AWS SSO user ids to be assigned the role given in `role`.
     * 
     */
    public Output<Optional<List<String>>> userIds() {
        return Codegen.optional(this.userIds);
    }
    /**
     * The workspace id.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="workspaceId", refs={String.class}, tree="[0]")
    private Output<String> workspaceId;

    /**
     * @return The workspace id.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RoleAssociation(String name) {
        this(name, RoleAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RoleAssociation(String name, RoleAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RoleAssociation(String name, RoleAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:grafana/roleAssociation:RoleAssociation", name, args == null ? RoleAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RoleAssociation(String name, Output<String> id, @Nullable RoleAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:grafana/roleAssociation:RoleAssociation", name, state, makeResourceOptions(options, id));
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
    public static RoleAssociation get(String name, Output<String> id, @Nullable RoleAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RoleAssociation(name, id, state, options);
    }
}
