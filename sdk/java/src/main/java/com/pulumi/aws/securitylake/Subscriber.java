// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securitylake;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.securitylake.SubscriberArgs;
import com.pulumi.aws.securitylake.inputs.SubscriberState;
import com.pulumi.aws.securitylake.outputs.SubscriberSource;
import com.pulumi.aws.securitylake.outputs.SubscriberSubscriberIdentity;
import com.pulumi.aws.securitylake.outputs.SubscriberTimeouts;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS Security Lake Subscriber.
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
 * import com.pulumi.aws.securitylake.Subscriber;
 * import com.pulumi.aws.securitylake.SubscriberArgs;
 * import com.pulumi.aws.securitylake.inputs.SubscriberSourceArgs;
 * import com.pulumi.aws.securitylake.inputs.SubscriberSourceAwsLogSourceResourceArgs;
 * import com.pulumi.aws.securitylake.inputs.SubscriberSubscriberIdentityArgs;
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
 *         var example = new Subscriber(&#34;example&#34;, SubscriberArgs.builder()        
 *             .subscriberName(&#34;example-name&#34;)
 *             .sourceVersion(&#34;1.0&#34;)
 *             .accessType(&#34;S3&#34;)
 *             .source(SubscriberSourceArgs.builder()
 *                 .awsLogSourceResource(SubscriberSourceAwsLogSourceResourceArgs.builder()
 *                     .sourceName(&#34;ROUTE53&#34;)
 *                     .sourceVersion(&#34;1.0&#34;)
 *                     .build())
 *                 .build())
 *             .subscriberIdentity(SubscriberSubscriberIdentityArgs.builder()
 *                 .externalId(&#34;example&#34;)
 *                 .principal(&#34;1234567890&#34;)
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
 * Using `pulumi import`, import Security Lake subscriber using the subscriber ARN. For example:
 * 
 * ```sh
 * $ pulumi import aws:securitylake/subscriber:Subscriber example arn:aws:securitylake:eu-west-2:1234567890:subscriber/9f3bfe79-d543-474d-a93c-f3846805d208
 * ```
 * 
 */
@ResourceType(type="aws:securitylake/subscriber:Subscriber")
public class Subscriber extends com.pulumi.resources.CustomResource {
    @Export(name="accessType", refs={String.class}, tree="[0]")
    private Output<String> accessType;

    public Output<String> accessType() {
        return this.accessType;
    }
    /**
     * ARN of the Data Lake.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the Data Lake.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The Amazon Resource Name (ARN) which uniquely defines the AWS RAM resource share. Before accepting the RAM resource share invitation, you can view details related to the RAM resource share.
     * 
     */
    @Export(name="resourceShareArn", refs={String.class}, tree="[0]")
    private Output<String> resourceShareArn;

    /**
     * @return The Amazon Resource Name (ARN) which uniquely defines the AWS RAM resource share. Before accepting the RAM resource share invitation, you can view details related to the RAM resource share.
     * 
     */
    public Output<String> resourceShareArn() {
        return this.resourceShareArn;
    }
    /**
     * The name of the resource share.
     * 
     */
    @Export(name="resourceShareName", refs={String.class}, tree="[0]")
    private Output<String> resourceShareName;

    /**
     * @return The name of the resource share.
     * 
     */
    public Output<String> resourceShareName() {
        return this.resourceShareName;
    }
    /**
     * The ARN of the IAM role to be used by the entity putting logs into your custom source partition.
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output<String> roleArn;

    /**
     * @return The ARN of the IAM role to be used by the entity putting logs into your custom source partition.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * The ARN for the Amazon Security Lake Amazon S3 bucket.
     * 
     */
    @Export(name="s3BucketArn", refs={String.class}, tree="[0]")
    private Output<String> s3BucketArn;

    /**
     * @return The ARN for the Amazon Security Lake Amazon S3 bucket.
     * 
     */
    public Output<String> s3BucketArn() {
        return this.s3BucketArn;
    }
    /**
     * The supported AWS services from which logs and events are collected. Security Lake supports log and event collection for natively supported AWS services.
     * 
     */
    @Export(name="source", refs={SubscriberSource.class}, tree="[0]")
    private Output</* @Nullable */ SubscriberSource> source;

    /**
     * @return The supported AWS services from which logs and events are collected. Security Lake supports log and event collection for natively supported AWS services.
     * 
     */
    public Output<Optional<SubscriberSource>> source() {
        return Codegen.optional(this.source);
    }
    /**
     * The description for your subscriber account in Security Lake.
     * 
     */
    @Export(name="subscriberDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subscriberDescription;

    /**
     * @return The description for your subscriber account in Security Lake.
     * 
     */
    public Output<Optional<String>> subscriberDescription() {
        return Codegen.optional(this.subscriberDescription);
    }
    /**
     * The subscriber endpoint to which exception messages are posted.
     * 
     */
    @Export(name="subscriberEndpoint", refs={String.class}, tree="[0]")
    private Output<String> subscriberEndpoint;

    /**
     * @return The subscriber endpoint to which exception messages are posted.
     * 
     */
    public Output<String> subscriberEndpoint() {
        return this.subscriberEndpoint;
    }
    /**
     * The AWS identity used to access your data.
     * 
     */
    @Export(name="subscriberIdentity", refs={SubscriberSubscriberIdentity.class}, tree="[0]")
    private Output</* @Nullable */ SubscriberSubscriberIdentity> subscriberIdentity;

    /**
     * @return The AWS identity used to access your data.
     * 
     */
    public Output<Optional<SubscriberSubscriberIdentity>> subscriberIdentity() {
        return Codegen.optional(this.subscriberIdentity);
    }
    /**
     * The name of your Security Lake subscriber account.
     * 
     */
    @Export(name="subscriberName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subscriberName;

    /**
     * @return The name of your Security Lake subscriber account.
     * 
     */
    public Output<Optional<String>> subscriberName() {
        return Codegen.optional(this.subscriberName);
    }
    /**
     * The subscriber status of the Amazon Security Lake subscriber account.
     * 
     */
    @Export(name="subscriberStatus", refs={String.class}, tree="[0]")
    private Output<String> subscriberStatus;

    /**
     * @return The subscriber status of the Amazon Security Lake subscriber account.
     * 
     */
    public Output<String> subscriberStatus() {
        return this.subscriberStatus;
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
    @Export(name="timeouts", refs={SubscriberTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ SubscriberTimeouts> timeouts;

    public Output<Optional<SubscriberTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Subscriber(String name) {
        this(name, SubscriberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Subscriber(String name, @Nullable SubscriberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Subscriber(String name, @Nullable SubscriberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:securitylake/subscriber:Subscriber", name, args == null ? SubscriberArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Subscriber(String name, Output<String> id, @Nullable SubscriberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:securitylake/subscriber:Subscriber", name, state, makeResourceOptions(options, id));
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
    public static Subscriber get(String name, Output<String> id, @Nullable SubscriberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Subscriber(name, id, state, options);
    }
}
