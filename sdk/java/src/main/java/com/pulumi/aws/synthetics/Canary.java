// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.synthetics;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.synthetics.CanaryArgs;
import com.pulumi.aws.synthetics.inputs.CanaryState;
import com.pulumi.aws.synthetics.outputs.CanaryArtifactConfig;
import com.pulumi.aws.synthetics.outputs.CanaryRunConfig;
import com.pulumi.aws.synthetics.outputs.CanarySchedule;
import com.pulumi.aws.synthetics.outputs.CanaryTimeline;
import com.pulumi.aws.synthetics.outputs.CanaryVpcConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Synthetics Canary resource.
 * 
 * &gt; **NOTE:** When you create a canary, AWS creates supporting implicit resources. See the Amazon CloudWatch Synthetics documentation on [DeleteCanary](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_DeleteCanary.html) for a full list. Neither AWS nor this provider deletes these implicit resources automatically when the canary is deleted. Before deleting a canary, ensure you have all the information about the canary that you need to delete the implicit resources using the AWS Console, or AWS CLI.
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
 * import com.pulumi.aws.synthetics.Canary;
 * import com.pulumi.aws.synthetics.CanaryArgs;
 * import com.pulumi.aws.synthetics.inputs.CanaryScheduleArgs;
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
 *         var some = new Canary(&#34;some&#34;, CanaryArgs.builder()        
 *             .name(&#34;some-canary&#34;)
 *             .artifactS3Location(&#34;s3://some-bucket/&#34;)
 *             .executionRoleArn(&#34;some-role&#34;)
 *             .handler(&#34;exports.handler&#34;)
 *             .zipFile(&#34;test-fixtures/lambdatest.zip&#34;)
 *             .runtimeVersion(&#34;syn-1.0&#34;)
 *             .schedule(CanaryScheduleArgs.builder()
 *                 .expression(&#34;rate(0 minute)&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Synthetics Canaries using the `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:synthetics/canary:Canary some some-canary
 * ```
 * 
 */
@ResourceType(type="aws:synthetics/canary:Canary")
public class Canary extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the Canary.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Canary.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See Artifact Config.
     * 
     */
    @Export(name="artifactConfig", refs={CanaryArtifactConfig.class}, tree="[0]")
    private Output</* @Nullable */ CanaryArtifactConfig> artifactConfig;

    /**
     * @return configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3. See Artifact Config.
     * 
     */
    public Output<Optional<CanaryArtifactConfig>> artifactConfig() {
        return Codegen.optional(this.artifactConfig);
    }
    /**
     * Location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary.
     * 
     */
    @Export(name="artifactS3Location", refs={String.class}, tree="[0]")
    private Output<String> artifactS3Location;

    /**
     * @return Location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary.
     * 
     */
    public Output<String> artifactS3Location() {
        return this.artifactS3Location;
    }
    /**
     * Specifies whether to also delete the Lambda functions and layers used by this canary. The default is `false`.
     * 
     */
    @Export(name="deleteLambda", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deleteLambda;

    /**
     * @return Specifies whether to also delete the Lambda functions and layers used by this canary. The default is `false`.
     * 
     */
    public Output<Optional<Boolean>> deleteLambda() {
        return Codegen.optional(this.deleteLambda);
    }
    /**
     * ARN of the Lambda function that is used as your canary&#39;s engine.
     * 
     */
    @Export(name="engineArn", refs={String.class}, tree="[0]")
    private Output<String> engineArn;

    /**
     * @return ARN of the Lambda function that is used as your canary&#39;s engine.
     * 
     */
    public Output<String> engineArn() {
        return this.engineArn;
    }
    /**
     * ARN of the IAM role to be used to run the canary. see [AWS Docs](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CreateCanary.html#API_CreateCanary_RequestSyntax) for permissions needs for IAM Role.
     * 
     */
    @Export(name="executionRoleArn", refs={String.class}, tree="[0]")
    private Output<String> executionRoleArn;

    /**
     * @return ARN of the IAM role to be used to run the canary. see [AWS Docs](https://docs.aws.amazon.com/AmazonSynthetics/latest/APIReference/API_CreateCanary.html#API_CreateCanary_RequestSyntax) for permissions needs for IAM Role.
     * 
     */
    public Output<String> executionRoleArn() {
        return this.executionRoleArn;
    }
    /**
     * Number of days to retain data about failed runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     * 
     */
    @Export(name="failureRetentionPeriod", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> failureRetentionPeriod;

    /**
     * @return Number of days to retain data about failed runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     * 
     */
    public Output<Optional<Integer>> failureRetentionPeriod() {
        return Codegen.optional(this.failureRetentionPeriod);
    }
    /**
     * Entry point to use for the source code when running the canary. This value must end with the string `.handler` .
     * 
     */
    @Export(name="handler", refs={String.class}, tree="[0]")
    private Output<String> handler;

    /**
     * @return Entry point to use for the source code when running the canary. This value must end with the string `.handler` .
     * 
     */
    public Output<String> handler() {
        return this.handler;
    }
    /**
     * Name for this canary. Has a maximum length of 21 characters. Valid characters are lowercase alphanumeric, hyphen, or underscore.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name for this canary. Has a maximum length of 21 characters. Valid characters are lowercase alphanumeric, hyphen, or underscore.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configuration block for individual canary runs. Detailed below.
     * 
     */
    @Export(name="runConfig", refs={CanaryRunConfig.class}, tree="[0]")
    private Output<CanaryRunConfig> runConfig;

    /**
     * @return Configuration block for individual canary runs. Detailed below.
     * 
     */
    public Output<CanaryRunConfig> runConfig() {
        return this.runConfig;
    }
    /**
     * Runtime version to use for the canary. Versions change often so consult the [Amazon CloudWatch documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html) for the latest valid versions. Values include `syn-python-selenium-1.0`, `syn-nodejs-puppeteer-3.0`, `syn-nodejs-2.2`, `syn-nodejs-2.1`, `syn-nodejs-2.0`, and `syn-1.0`.
     * 
     */
    @Export(name="runtimeVersion", refs={String.class}, tree="[0]")
    private Output<String> runtimeVersion;

    /**
     * @return Runtime version to use for the canary. Versions change often so consult the [Amazon CloudWatch documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html) for the latest valid versions. Values include `syn-python-selenium-1.0`, `syn-nodejs-puppeteer-3.0`, `syn-nodejs-2.2`, `syn-nodejs-2.1`, `syn-nodejs-2.0`, and `syn-1.0`.
     * 
     */
    public Output<String> runtimeVersion() {
        return this.runtimeVersion;
    }
    /**
     * Full bucket name which is used if your canary script is located in S3. The bucket must already exist. **Conflicts with `zip_file`.**
     * 
     */
    @Export(name="s3Bucket", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> s3Bucket;

    /**
     * @return Full bucket name which is used if your canary script is located in S3. The bucket must already exist. **Conflicts with `zip_file`.**
     * 
     */
    public Output<Optional<String>> s3Bucket() {
        return Codegen.optional(this.s3Bucket);
    }
    /**
     * S3 key of your script. **Conflicts with `zip_file`.**
     * 
     */
    @Export(name="s3Key", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> s3Key;

    /**
     * @return S3 key of your script. **Conflicts with `zip_file`.**
     * 
     */
    public Output<Optional<String>> s3Key() {
        return Codegen.optional(this.s3Key);
    }
    /**
     * S3 version ID of your script. **Conflicts with `zip_file`.**
     * 
     */
    @Export(name="s3Version", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> s3Version;

    /**
     * @return S3 version ID of your script. **Conflicts with `zip_file`.**
     * 
     */
    public Output<Optional<String>> s3Version() {
        return Codegen.optional(this.s3Version);
    }
    /**
     * Configuration block providing how often the canary is to run and when these test runs are to stop. Detailed below.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="schedule", refs={CanarySchedule.class}, tree="[0]")
    private Output<CanarySchedule> schedule;

    /**
     * @return Configuration block providing how often the canary is to run and when these test runs are to stop. Detailed below.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<CanarySchedule> schedule() {
        return this.schedule;
    }
    /**
     * ARN of the Lambda layer where Synthetics stores the canary script code.
     * 
     */
    @Export(name="sourceLocationArn", refs={String.class}, tree="[0]")
    private Output<String> sourceLocationArn;

    /**
     * @return ARN of the Lambda layer where Synthetics stores the canary script code.
     * 
     */
    public Output<String> sourceLocationArn() {
        return this.sourceLocationArn;
    }
    /**
     * Whether to run or stop the canary.
     * 
     */
    @Export(name="startCanary", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> startCanary;

    /**
     * @return Whether to run or stop the canary.
     * 
     */
    public Output<Optional<Boolean>> startCanary() {
        return Codegen.optional(this.startCanary);
    }
    /**
     * Canary status.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Canary status.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Number of days to retain data about successful runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     * 
     */
    @Export(name="successRetentionPeriod", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> successRetentionPeriod;

    /**
     * @return Number of days to retain data about successful runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
     * 
     */
    public Output<Optional<Integer>> successRetentionPeriod() {
        return Codegen.optional(this.successRetentionPeriod);
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Structure that contains information about when the canary was created, modified, and most recently run. see Timeline.
     * 
     */
    @Export(name="timelines", refs={List.class,CanaryTimeline.class}, tree="[0,1]")
    private Output<List<CanaryTimeline>> timelines;

    /**
     * @return Structure that contains information about when the canary was created, modified, and most recently run. see Timeline.
     * 
     */
    public Output<List<CanaryTimeline>> timelines() {
        return this.timelines;
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    @Export(name="vpcConfig", refs={CanaryVpcConfig.class}, tree="[0]")
    private Output</* @Nullable */ CanaryVpcConfig> vpcConfig;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Output<Optional<CanaryVpcConfig>> vpcConfig() {
        return Codegen.optional(this.vpcConfig);
    }
    /**
     * ZIP file that contains the script, if you input your canary script directly into the canary instead of referring to an S3 location. It can be up to 225KB. **Conflicts with `s3_bucket`, `s3_key`, and `s3_version`.**
     * 
     */
    @Export(name="zipFile", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> zipFile;

    /**
     * @return ZIP file that contains the script, if you input your canary script directly into the canary instead of referring to an S3 location. It can be up to 225KB. **Conflicts with `s3_bucket`, `s3_key`, and `s3_version`.**
     * 
     */
    public Output<Optional<String>> zipFile() {
        return Codegen.optional(this.zipFile);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Canary(String name) {
        this(name, CanaryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Canary(String name, CanaryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Canary(String name, CanaryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:synthetics/canary:Canary", name, args == null ? CanaryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Canary(String name, Output<String> id, @Nullable CanaryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:synthetics/canary:Canary", name, state, makeResourceOptions(options, id));
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
    public static Canary get(String name, Output<String> id, @Nullable CanaryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Canary(name, id, state, options);
    }
}
