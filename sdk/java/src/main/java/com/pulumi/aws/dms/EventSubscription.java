// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.dms.EventSubscriptionArgs;
import com.pulumi.aws.dms.inputs.EventSubscriptionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DMS (Data Migration Service) event subscription resource.
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
 * import com.pulumi.aws.dms.EventSubscription;
 * import com.pulumi.aws.dms.EventSubscriptionArgs;
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
 *         var example = new EventSubscription(&#34;example&#34;, EventSubscriptionArgs.builder()        
 *             .enabled(true)
 *             .eventCategories(            
 *                 &#34;creation&#34;,
 *                 &#34;failure&#34;)
 *             .name(&#34;my-favorite-event-subscription&#34;)
 *             .snsTopicArn(exampleAwsSnsTopic.arn())
 *             .sourceIds(exampleAwsDmsReplicationTask.replicationTaskId())
 *             .sourceType(&#34;replication-task&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;example&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import event subscriptions using the `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:dms/eventSubscription:EventSubscription test my-awesome-event-subscription
 * ```
 * 
 */
@ResourceType(type="aws:dms/eventSubscription:EventSubscription")
public class EventSubscription extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the DMS Event Subscription.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the DMS Event Subscription.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Whether the event subscription should be enabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether the event subscription should be enabled.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * List of event categories to listen for, see `DescribeEventCategories` for a canonical list.
     * 
     */
    @Export(name="eventCategories", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> eventCategories;

    /**
     * @return List of event categories to listen for, see `DescribeEventCategories` for a canonical list.
     * 
     */
    public Output<List<String>> eventCategories() {
        return this.eventCategories;
    }
    /**
     * Name of event subscription.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of event subscription.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * SNS topic arn to send events on.
     * 
     */
    @Export(name="snsTopicArn", refs={String.class}, tree="[0]")
    private Output<String> snsTopicArn;

    /**
     * @return SNS topic arn to send events on.
     * 
     */
    public Output<String> snsTopicArn() {
        return this.snsTopicArn;
    }
    /**
     * Ids of sources to listen to. If you don&#39;t specify a value, notifications are provided for all sources.
     * 
     */
    @Export(name="sourceIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> sourceIds;

    /**
     * @return Ids of sources to listen to. If you don&#39;t specify a value, notifications are provided for all sources.
     * 
     */
    public Output<Optional<List<String>>> sourceIds() {
        return Codegen.optional(this.sourceIds);
    }
    /**
     * Type of source for events. Valid values: `replication-instance` or `replication-task`
     * 
     */
    @Export(name="sourceType", refs={String.class}, tree="[0]")
    private Output<String> sourceType;

    /**
     * @return Type of source for events. Valid values: `replication-instance` or `replication-task`
     * 
     */
    public Output<String> sourceType() {
        return this.sourceType;
    }
    /**
     * Map of resource tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of resource tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    public EventSubscription(String name) {
        this(name, EventSubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventSubscription(String name, EventSubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventSubscription(String name, EventSubscriptionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dms/eventSubscription:EventSubscription", name, args == null ? EventSubscriptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventSubscription(String name, Output<String> id, @Nullable EventSubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dms/eventSubscription:EventSubscription", name, state, makeResourceOptions(options, id));
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
    public static EventSubscription get(String name, Output<String> id, @Nullable EventSubscriptionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventSubscription(name, id, state, options);
    }
}
