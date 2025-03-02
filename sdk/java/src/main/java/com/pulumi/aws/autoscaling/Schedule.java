// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.autoscaling.ScheduleArgs;
import com.pulumi.aws.autoscaling.inputs.ScheduleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an AutoScaling Schedule resource.
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
 * import com.pulumi.aws.autoscaling.Group;
 * import com.pulumi.aws.autoscaling.GroupArgs;
 * import com.pulumi.aws.autoscaling.Schedule;
 * import com.pulumi.aws.autoscaling.ScheduleArgs;
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
 *         var foobar = new Group(&#34;foobar&#34;, GroupArgs.builder()        
 *             .availabilityZones(&#34;us-west-2a&#34;)
 *             .name(&#34;test-foobar5&#34;)
 *             .maxSize(1)
 *             .minSize(1)
 *             .healthCheckGracePeriod(300)
 *             .healthCheckType(&#34;ELB&#34;)
 *             .forceDelete(true)
 *             .terminationPolicies(&#34;OldestInstance&#34;)
 *             .build());
 * 
 *         var foobarSchedule = new Schedule(&#34;foobarSchedule&#34;, ScheduleArgs.builder()        
 *             .scheduledActionName(&#34;foobar&#34;)
 *             .minSize(0)
 *             .maxSize(1)
 *             .desiredCapacity(0)
 *             .startTime(&#34;2016-12-11T18:00:00Z&#34;)
 *             .endTime(&#34;2016-12-12T06:00:00Z&#34;)
 *             .autoscalingGroupName(foobar.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import AutoScaling ScheduledAction using the `auto-scaling-group-name` and `scheduled-action-name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:autoscaling/schedule:Schedule resource-name auto-scaling-group-name/scheduled-action-name
 * ```
 * 
 */
@ResourceType(type="aws:autoscaling/schedule:Schedule")
public class Schedule extends com.pulumi.resources.CustomResource {
    /**
     * ARN assigned by AWS to the autoscaling schedule.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN assigned by AWS to the autoscaling schedule.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name of the Auto Scaling group.
     * 
     */
    @Export(name="autoscalingGroupName", refs={String.class}, tree="[0]")
    private Output<String> autoscalingGroupName;

    /**
     * @return The name of the Auto Scaling group.
     * 
     */
    public Output<String> autoscalingGroupName() {
        return this.autoscalingGroupName;
    }
    /**
     * The initial capacity of the Auto Scaling group after the scheduled action runs and the capacity it attempts to maintain. Set to `-1` if you don&#39;t want to change the desired capacity at the scheduled time. Defaults to `0`.
     * 
     */
    @Export(name="desiredCapacity", refs={Integer.class}, tree="[0]")
    private Output<Integer> desiredCapacity;

    /**
     * @return The initial capacity of the Auto Scaling group after the scheduled action runs and the capacity it attempts to maintain. Set to `-1` if you don&#39;t want to change the desired capacity at the scheduled time. Defaults to `0`.
     * 
     */
    public Output<Integer> desiredCapacity() {
        return this.desiredCapacity;
    }
    /**
     * The date and time for the recurring schedule to end, in UTC with the format `&#34;YYYY-MM-DDThh:mm:ssZ&#34;` (e.g. `&#34;2021-06-01T00:00:00Z&#34;`).
     * 
     */
    @Export(name="endTime", refs={String.class}, tree="[0]")
    private Output<String> endTime;

    /**
     * @return The date and time for the recurring schedule to end, in UTC with the format `&#34;YYYY-MM-DDThh:mm:ssZ&#34;` (e.g. `&#34;2021-06-01T00:00:00Z&#34;`).
     * 
     */
    public Output<String> endTime() {
        return this.endTime;
    }
    /**
     * The maximum size of the Auto Scaling group. Set to `-1` if you don&#39;t want to change the maximum size at the scheduled time. Defaults to `0`.
     * 
     */
    @Export(name="maxSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> maxSize;

    /**
     * @return The maximum size of the Auto Scaling group. Set to `-1` if you don&#39;t want to change the maximum size at the scheduled time. Defaults to `0`.
     * 
     */
    public Output<Integer> maxSize() {
        return this.maxSize;
    }
    /**
     * The minimum size of the Auto Scaling group. Set to `-1` if you don&#39;t want to change the minimum size at the scheduled time. Defaults to `0`.
     * 
     */
    @Export(name="minSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> minSize;

    /**
     * @return The minimum size of the Auto Scaling group. Set to `-1` if you don&#39;t want to change the minimum size at the scheduled time. Defaults to `0`.
     * 
     */
    public Output<Integer> minSize() {
        return this.minSize;
    }
    /**
     * The recurring schedule for this action specified using the Unix cron syntax format.
     * 
     */
    @Export(name="recurrence", refs={String.class}, tree="[0]")
    private Output<String> recurrence;

    /**
     * @return The recurring schedule for this action specified using the Unix cron syntax format.
     * 
     */
    public Output<String> recurrence() {
        return this.recurrence;
    }
    /**
     * The name of this scaling action.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="scheduledActionName", refs={String.class}, tree="[0]")
    private Output<String> scheduledActionName;

    /**
     * @return The name of this scaling action.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> scheduledActionName() {
        return this.scheduledActionName;
    }
    /**
     * The date and time for the recurring schedule to start, in UTC with the format `&#34;YYYY-MM-DDThh:mm:ssZ&#34;` (e.g. `&#34;2021-06-01T00:00:00Z&#34;`).
     * 
     */
    @Export(name="startTime", refs={String.class}, tree="[0]")
    private Output<String> startTime;

    /**
     * @return The date and time for the recurring schedule to start, in UTC with the format `&#34;YYYY-MM-DDThh:mm:ssZ&#34;` (e.g. `&#34;2021-06-01T00:00:00Z&#34;`).
     * 
     */
    public Output<String> startTime() {
        return this.startTime;
    }
    /**
     * Specifies the time zone for a cron expression. Valid values are the canonical names of the IANA time zones (such as `Etc/GMT+9` or `Pacific/Tahiti`).
     * 
     * &gt; **NOTE:** When `start_time` and `end_time` are specified with `recurrence` , they form the boundaries of when the recurring action will start and stop.
     * 
     */
    @Export(name="timeZone", refs={String.class}, tree="[0]")
    private Output<String> timeZone;

    /**
     * @return Specifies the time zone for a cron expression. Valid values are the canonical names of the IANA time zones (such as `Etc/GMT+9` or `Pacific/Tahiti`).
     * 
     * &gt; **NOTE:** When `start_time` and `end_time` are specified with `recurrence` , they form the boundaries of when the recurring action will start and stop.
     * 
     */
    public Output<String> timeZone() {
        return this.timeZone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Schedule(String name) {
        this(name, ScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Schedule(String name, ScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schedule(String name, ScheduleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:autoscaling/schedule:Schedule", name, args == null ? ScheduleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Schedule(String name, Output<String> id, @Nullable ScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:autoscaling/schedule:Schedule", name, state, makeResourceOptions(options, id));
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
    public static Schedule get(String name, Output<String> id, @Nullable ScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Schedule(name, id, state, options);
    }
}
