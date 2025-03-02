// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.NetworkAclArgs;
import com.pulumi.aws.ec2.inputs.NetworkAclState;
import com.pulumi.aws.ec2.outputs.NetworkAclEgress;
import com.pulumi.aws.ec2.outputs.NetworkAclIngress;
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
 * Provides an network ACL resource. You might set up network ACLs with rules similar
 * to your security groups in order to add an additional layer of security to your VPC.
 * 
 * &gt; **NOTE on Network ACLs and Network ACL Rules:** This provider currently
 * provides both a standalone Network ACL Rule resource and a Network ACL resource with rules
 * defined in-line. At this time you cannot use a Network ACL with in-line rules
 * in conjunction with any Network ACL Rule resources. Doing so will cause
 * a conflict of rule settings and will overwrite rules.
 * 
 * &gt; **NOTE on Network ACLs and Network ACL Associations:** the provider provides both a standalone network ACL association
 * resource and a network ACL resource with a `subnet_ids` attribute. Do not use the same subnet ID in both a network ACL
 * resource and a network ACL association resource. Doing so will cause a conflict of associations and will overwrite the association.
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
 * import com.pulumi.aws.ec2.NetworkAcl;
 * import com.pulumi.aws.ec2.NetworkAclArgs;
 * import com.pulumi.aws.ec2.inputs.NetworkAclEgressArgs;
 * import com.pulumi.aws.ec2.inputs.NetworkAclIngressArgs;
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
 *         var main = new NetworkAcl(&#34;main&#34;, NetworkAclArgs.builder()        
 *             .vpcId(mainAwsVpc.id())
 *             .egress(NetworkAclEgressArgs.builder()
 *                 .protocol(&#34;tcp&#34;)
 *                 .ruleNo(200)
 *                 .action(&#34;allow&#34;)
 *                 .cidrBlock(&#34;10.3.0.0/18&#34;)
 *                 .fromPort(443)
 *                 .toPort(443)
 *                 .build())
 *             .ingress(NetworkAclIngressArgs.builder()
 *                 .protocol(&#34;tcp&#34;)
 *                 .ruleNo(100)
 *                 .action(&#34;allow&#34;)
 *                 .cidrBlock(&#34;10.3.0.0/18&#34;)
 *                 .fromPort(80)
 *                 .toPort(80)
 *                 .build())
 *             .tags(Map.of(&#34;Name&#34;, &#34;main&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Network ACLs using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:ec2/networkAcl:NetworkAcl main acl-7aaabd18
 * ```
 * 
 */
@ResourceType(type="aws:ec2/networkAcl:NetworkAcl")
public class NetworkAcl extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the network ACL
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the network ACL
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies an egress rule. Parameters defined below.
     * 
     */
    @Export(name="egress", refs={List.class,NetworkAclEgress.class}, tree="[0,1]")
    private Output<List<NetworkAclEgress>> egress;

    /**
     * @return Specifies an egress rule. Parameters defined below.
     * 
     */
    public Output<List<NetworkAclEgress>> egress() {
        return this.egress;
    }
    /**
     * Specifies an ingress rule. Parameters defined below.
     * 
     */
    @Export(name="ingress", refs={List.class,NetworkAclIngress.class}, tree="[0,1]")
    private Output<List<NetworkAclIngress>> ingress;

    /**
     * @return Specifies an ingress rule. Parameters defined below.
     * 
     */
    public Output<List<NetworkAclIngress>> ingress() {
        return this.ingress;
    }
    /**
     * The ID of the AWS account that owns the network ACL.
     * 
     */
    @Export(name="ownerId", refs={String.class}, tree="[0]")
    private Output<String> ownerId;

    /**
     * @return The ID of the AWS account that owns the network ACL.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * A list of Subnet IDs to apply the ACL to
     * 
     */
    @Export(name="subnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subnetIds;

    /**
     * @return A list of Subnet IDs to apply the ACL to
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The ID of the associated VPC.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The ID of the associated VPC.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkAcl(String name) {
        this(name, NetworkAclArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkAcl(String name, NetworkAclArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkAcl(String name, NetworkAclArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/networkAcl:NetworkAcl", name, args == null ? NetworkAclArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkAcl(String name, Output<String> id, @Nullable NetworkAclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/networkAcl:NetworkAcl", name, state, makeResourceOptions(options, id));
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
    public static NetworkAcl get(String name, Output<String> id, @Nullable NetworkAclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkAcl(name, id, state, options);
    }
}
