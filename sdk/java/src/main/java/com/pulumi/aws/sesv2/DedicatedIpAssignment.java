// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sesv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sesv2.DedicatedIpAssignmentArgs;
import com.pulumi.aws.sesv2.inputs.DedicatedIpAssignmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS SESv2 (Simple Email V2) Dedicated IP Assignment.
 * 
 * This resource is used with &#34;Standard&#34; dedicated IP addresses. This includes addresses [requested and relinquished manually](https://docs.aws.amazon.com/ses/latest/dg/dedicated-ip-case.html) via an AWS support case, or [Bring Your Own IP](https://docs.aws.amazon.com/ses/latest/dg/dedicated-ip-byo.html) addresses. Once no longer assigned, this resource returns the IP to the [`ses-default-dedicated-pool`](https://docs.aws.amazon.com/ses/latest/dg/managing-ip-pools.html), managed by AWS.
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
 * import com.pulumi.aws.sesv2.DedicatedIpAssignment;
 * import com.pulumi.aws.sesv2.DedicatedIpAssignmentArgs;
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
 *         var example = new DedicatedIpAssignment(&#34;example&#34;, DedicatedIpAssignmentArgs.builder()        
 *             .ip(&#34;0.0.0.0&#34;)
 *             .destinationPoolName(&#34;my-pool&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import SESv2 (Simple Email V2) Dedicated IP Assignment using the `id`, which is a comma-separated string made up of `ip` and `destination_pool_name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:sesv2/dedicatedIpAssignment:DedicatedIpAssignment example &#34;0.0.0.0,my-pool&#34;
 * ```
 * 
 */
@ResourceType(type="aws:sesv2/dedicatedIpAssignment:DedicatedIpAssignment")
public class DedicatedIpAssignment extends com.pulumi.resources.CustomResource {
    /**
     * Dedicated IP address.
     * 
     */
    @Export(name="destinationPoolName", refs={String.class}, tree="[0]")
    private Output<String> destinationPoolName;

    /**
     * @return Dedicated IP address.
     * 
     */
    public Output<String> destinationPoolName() {
        return this.destinationPoolName;
    }
    /**
     * Dedicated IP address.
     * 
     */
    @Export(name="ip", refs={String.class}, tree="[0]")
    private Output<String> ip;

    /**
     * @return Dedicated IP address.
     * 
     */
    public Output<String> ip() {
        return this.ip;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DedicatedIpAssignment(String name) {
        this(name, DedicatedIpAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DedicatedIpAssignment(String name, DedicatedIpAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DedicatedIpAssignment(String name, DedicatedIpAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sesv2/dedicatedIpAssignment:DedicatedIpAssignment", name, args == null ? DedicatedIpAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DedicatedIpAssignment(String name, Output<String> id, @Nullable DedicatedIpAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sesv2/dedicatedIpAssignment:DedicatedIpAssignment", name, state, makeResourceOptions(options, id));
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
    public static DedicatedIpAssignment get(String name, Output<String> id, @Nullable DedicatedIpAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DedicatedIpAssignment(name, id, state, options);
    }
}
