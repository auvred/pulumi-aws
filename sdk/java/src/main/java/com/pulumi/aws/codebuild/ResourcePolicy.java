// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.codebuild.ResourcePolicyArgs;
import com.pulumi.aws.codebuild.inputs.ResourcePolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a CodeBuild Resource Policy Resource.
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
 * import com.pulumi.aws.codebuild.ReportGroup;
 * import com.pulumi.aws.codebuild.ReportGroupArgs;
 * import com.pulumi.aws.codebuild.inputs.ReportGroupExportConfigArgs;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetPartitionArgs;
 * import com.pulumi.aws.inputs.GetCallerIdentityArgs;
 * import com.pulumi.aws.codebuild.ResourcePolicy;
 * import com.pulumi.aws.codebuild.ResourcePolicyArgs;
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
 *         var example = new ReportGroup(&#34;example&#34;, ReportGroupArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .type(&#34;TEST&#34;)
 *             .exportConfig(ReportGroupExportConfigArgs.builder()
 *                 .type(&#34;NO_EXPORT&#34;)
 *                 .build())
 *             .build());
 * 
 *         final var current = AwsFunctions.getPartition();
 * 
 *         final var currentGetCallerIdentity = AwsFunctions.getCallerIdentity();
 * 
 *         var exampleResourcePolicy = new ResourcePolicy(&#34;exampleResourcePolicy&#34;, ResourcePolicyArgs.builder()        
 *             .resourceArn(example.arn())
 *             .policy(example.arn().applyValue(arn -&gt; serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;version&#34;, &#34;2012-10-17&#34;),
 *                     jsonProperty(&#34;id&#34;, &#34;default&#34;),
 *                     jsonProperty(&#34;statement&#34;, jsonArray(jsonObject(
 *                         jsonProperty(&#34;sid&#34;, &#34;default&#34;),
 *                         jsonProperty(&#34;effect&#34;, &#34;Allow&#34;),
 *                         jsonProperty(&#34;principal&#34;, jsonObject(
 *                             jsonProperty(&#34;AWS&#34;, String.format(&#34;arn:%s:iam::%s:root&#34;, current.applyValue(getPartitionResult -&gt; getPartitionResult.partition()),currentGetCallerIdentity.applyValue(getCallerIdentityResult -&gt; getCallerIdentityResult.accountId())))
 *                         )),
 *                         jsonProperty(&#34;action&#34;, jsonArray(
 *                             &#34;codebuild:BatchGetReportGroups&#34;, 
 *                             &#34;codebuild:BatchGetReports&#34;, 
 *                             &#34;codebuild:ListReportsForReportGroup&#34;, 
 *                             &#34;codebuild:DescribeTestCases&#34;
 *                         )),
 *                         jsonProperty(&#34;resource&#34;, arn)
 *                     )))
 *                 ))))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import CodeBuild Resource Policy using the CodeBuild Resource Policy arn. For example:
 * 
 * ```sh
 * $ pulumi import aws:codebuild/resourcePolicy:ResourcePolicy example arn:aws:codebuild:us-west-2:123456789:report-group/report-group-name
 * ```
 * 
 */
@ResourceType(type="aws:codebuild/resourcePolicy:ResourcePolicy")
public class ResourcePolicy extends com.pulumi.resources.CustomResource {
    /**
     * A JSON-formatted resource policy. For more information, see [Sharing a Projec](https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share) and [Sharing a Report Group](https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share).
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return A JSON-formatted resource policy. For more information, see [Sharing a Projec](https://docs.aws.amazon.com/codebuild/latest/userguide/project-sharing.html#project-sharing-share) and [Sharing a Report Group](https://docs.aws.amazon.com/codebuild/latest/userguide/report-groups-sharing.html#report-groups-sharing-share).
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * The ARN of the Project or ReportGroup resource you want to associate with a resource policy.
     * 
     */
    @Export(name="resourceArn", refs={String.class}, tree="[0]")
    private Output<String> resourceArn;

    /**
     * @return The ARN of the Project or ReportGroup resource you want to associate with a resource policy.
     * 
     */
    public Output<String> resourceArn() {
        return this.resourceArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourcePolicy(String name) {
        this(name, ResourcePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourcePolicy(String name, ResourcePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourcePolicy(String name, ResourcePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codebuild/resourcePolicy:ResourcePolicy", name, args == null ? ResourcePolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourcePolicy(String name, Output<String> id, @Nullable ResourcePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:codebuild/resourcePolicy:ResourcePolicy", name, state, makeResourceOptions(options, id));
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
    public static ResourcePolicy get(String name, Output<String> id, @Nullable ResourcePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourcePolicy(name, id, state, options);
    }
}
