// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.inspector2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.inspector2.EnablerArgs;
import com.pulumi.aws.inspector2.inputs.EnablerState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource for enabling Amazon Inspector resource scans.
 * 
 * This resource must be created in the Organization&#39;s Administrator Account.
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
 * import com.pulumi.aws.inspector2.Enabler;
 * import com.pulumi.aws.inspector2.EnablerArgs;
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
 *         var example = new Enabler(&#34;example&#34;, EnablerArgs.builder()        
 *             .accountIds(&#34;123456789012&#34;)
 *             .resourceTypes(&#34;EC2&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### For the Calling Account
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetCallerIdentityArgs;
 * import com.pulumi.aws.inspector2.Enabler;
 * import com.pulumi.aws.inspector2.EnablerArgs;
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
 *         final var current = AwsFunctions.getCallerIdentity();
 * 
 *         var test = new Enabler(&#34;test&#34;, EnablerArgs.builder()        
 *             .accountIds(current.applyValue(getCallerIdentityResult -&gt; getCallerIdentityResult.accountId()))
 *             .resourceTypes(            
 *                 &#34;ECR&#34;,
 *                 &#34;EC2&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="aws:inspector2/enabler:Enabler")
public class Enabler extends com.pulumi.resources.CustomResource {
    /**
     * Set of account IDs.
     * Can contain one of: the Organization&#39;s Administrator Account, or one or more Member Accounts.
     * 
     */
    @Export(name="accountIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> accountIds;

    /**
     * @return Set of account IDs.
     * Can contain one of: the Organization&#39;s Administrator Account, or one or more Member Accounts.
     * 
     */
    public Output<List<String>> accountIds() {
        return this.accountIds;
    }
    /**
     * Type of resources to scan.
     * Valid values are `EC2`, `ECR`, `LAMBDA` and `LAMBDA_CODE`.
     * At least one item is required.
     * 
     */
    @Export(name="resourceTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> resourceTypes;

    /**
     * @return Type of resources to scan.
     * Valid values are `EC2`, `ECR`, `LAMBDA` and `LAMBDA_CODE`.
     * At least one item is required.
     * 
     */
    public Output<List<String>> resourceTypes() {
        return this.resourceTypes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Enabler(String name) {
        this(name, EnablerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Enabler(String name, EnablerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Enabler(String name, EnablerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:inspector2/enabler:Enabler", name, args == null ? EnablerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Enabler(String name, Output<String> id, @Nullable EnablerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:inspector2/enabler:Enabler", name, state, makeResourceOptions(options, id));
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
    public static Enabler get(String name, Output<String> id, @Nullable EnablerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Enabler(name, id, state, options);
    }
}
