// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.dms.ReplicationTaskArgs;
import com.pulumi.aws.dms.inputs.ReplicationTaskState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a DMS (Data Migration Service) replication task resource. DMS replication tasks can be created, updated, deleted, and imported.
 * 
 * &gt; **NOTE:** Changing most arguments will stop the task if it is running. You can set `start_replication_task` to resume the task afterwards.
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
 * import com.pulumi.aws.dms.ReplicationTask;
 * import com.pulumi.aws.dms.ReplicationTaskArgs;
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
 *         var test = new ReplicationTask(&#34;test&#34;, ReplicationTaskArgs.builder()        
 *             .cdcStartTime(&#34;1993-05-21T05:50:00Z&#34;)
 *             .migrationType(&#34;full-load&#34;)
 *             .replicationInstanceArn(test_dms_replication_instance_tf.replicationInstanceArn())
 *             .replicationTaskId(&#34;test-dms-replication-task-tf&#34;)
 *             .replicationTaskSettings(&#34;...&#34;)
 *             .sourceEndpointArn(test_dms_source_endpoint_tf.endpointArn())
 *             .tableMappings(&#34;{\&#34;rules\&#34;:[{\&#34;rule-type\&#34;:\&#34;selection\&#34;,\&#34;rule-id\&#34;:\&#34;1\&#34;,\&#34;rule-name\&#34;:\&#34;1\&#34;,\&#34;object-locator\&#34;:{\&#34;schema-name\&#34;:\&#34;%\&#34;,\&#34;table-name\&#34;:\&#34;%\&#34;},\&#34;rule-action\&#34;:\&#34;include\&#34;}]}&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;test&#34;))
 *             .targetEndpointArn(test_dms_target_endpoint_tf.endpointArn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import replication tasks using the `replication_task_id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:dms/replicationTask:ReplicationTask test test-dms-replication-task-tf
 * ```
 * 
 */
@ResourceType(type="aws:dms/replicationTask:ReplicationTask")
public class ReplicationTask extends com.pulumi.resources.CustomResource {
    /**
     * Indicates when you want a change data capture (CDC) operation to start. The value can be a RFC3339 formatted date, a checkpoint, or a LSN/SCN format depending on the source engine. For more information see [Determining a CDC native start point](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Task.CDC.html#CHAP_Task.CDC.StartPoint.Native).
     * 
     */
    @Export(name="cdcStartPosition", refs={String.class}, tree="[0]")
    private Output<String> cdcStartPosition;

    /**
     * @return Indicates when you want a change data capture (CDC) operation to start. The value can be a RFC3339 formatted date, a checkpoint, or a LSN/SCN format depending on the source engine. For more information see [Determining a CDC native start point](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Task.CDC.html#CHAP_Task.CDC.StartPoint.Native).
     * 
     */
    public Output<String> cdcStartPosition() {
        return this.cdcStartPosition;
    }
    /**
     * RFC3339 formatted date string or UNIX timestamp for the start of the Change Data Capture (CDC) operation.
     * 
     */
    @Export(name="cdcStartTime", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cdcStartTime;

    /**
     * @return RFC3339 formatted date string or UNIX timestamp for the start of the Change Data Capture (CDC) operation.
     * 
     */
    public Output<Optional<String>> cdcStartTime() {
        return Codegen.optional(this.cdcStartTime);
    }
    /**
     * The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
     * 
     */
    @Export(name="migrationType", refs={String.class}, tree="[0]")
    private Output<String> migrationType;

    /**
     * @return The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
     * 
     */
    public Output<String> migrationType() {
        return this.migrationType;
    }
    /**
     * The Amazon Resource Name (ARN) of the replication instance.
     * 
     */
    @Export(name="replicationInstanceArn", refs={String.class}, tree="[0]")
    private Output<String> replicationInstanceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the replication instance.
     * 
     */
    public Output<String> replicationInstanceArn() {
        return this.replicationInstanceArn;
    }
    /**
     * The Amazon Resource Name (ARN) for the replication task.
     * 
     */
    @Export(name="replicationTaskArn", refs={String.class}, tree="[0]")
    private Output<String> replicationTaskArn;

    /**
     * @return The Amazon Resource Name (ARN) for the replication task.
     * 
     */
    public Output<String> replicationTaskArn() {
        return this.replicationTaskArn;
    }
    /**
     * The replication task identifier.
     * 
     * - Must contain from 1 to 255 alphanumeric characters or hyphens.
     * - First character must be a letter.
     * - Cannot end with a hyphen.
     * - Cannot contain two consecutive hyphens.
     * 
     */
    @Export(name="replicationTaskId", refs={String.class}, tree="[0]")
    private Output<String> replicationTaskId;

    /**
     * @return The replication task identifier.
     * 
     * - Must contain from 1 to 255 alphanumeric characters or hyphens.
     * - First character must be a letter.
     * - Cannot end with a hyphen.
     * - Cannot contain two consecutive hyphens.
     * 
     */
    public Output<String> replicationTaskId() {
        return this.replicationTaskId;
    }
    /**
     * An escaped JSON string that contains the task settings. For a complete list of task settings, see [Task Settings for AWS Database Migration Service Tasks](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html).
     * 
     */
    @Export(name="replicationTaskSettings", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> replicationTaskSettings;

    /**
     * @return An escaped JSON string that contains the task settings. For a complete list of task settings, see [Task Settings for AWS Database Migration Service Tasks](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html).
     * 
     */
    public Output<Optional<String>> replicationTaskSettings() {
        return Codegen.optional(this.replicationTaskSettings);
    }
    /**
     * The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
     * 
     */
    @Export(name="sourceEndpointArn", refs={String.class}, tree="[0]")
    private Output<String> sourceEndpointArn;

    /**
     * @return The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
     * 
     */
    public Output<String> sourceEndpointArn() {
        return this.sourceEndpointArn;
    }
    /**
     * Whether to run or stop the replication task.
     * 
     */
    @Export(name="startReplicationTask", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> startReplicationTask;

    /**
     * @return Whether to run or stop the replication task.
     * 
     */
    public Output<Optional<Boolean>> startReplicationTask() {
        return Codegen.optional(this.startReplicationTask);
    }
    /**
     * Replication Task status.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Replication Task status.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
     * 
     */
    @Export(name="tableMappings", refs={String.class}, tree="[0]")
    private Output<String> tableMappings;

    /**
     * @return An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
     * 
     */
    public Output<String> tableMappings() {
        return this.tableMappings;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
     * 
     */
    @Export(name="targetEndpointArn", refs={String.class}, tree="[0]")
    private Output<String> targetEndpointArn;

    /**
     * @return The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
     * 
     */
    public Output<String> targetEndpointArn() {
        return this.targetEndpointArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicationTask(String name) {
        this(name, ReplicationTaskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicationTask(String name, ReplicationTaskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicationTask(String name, ReplicationTaskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dms/replicationTask:ReplicationTask", name, args == null ? ReplicationTaskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReplicationTask(String name, Output<String> id, @Nullable ReplicationTaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:dms/replicationTask:ReplicationTask", name, state, makeResourceOptions(options, id));
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
    public static ReplicationTask get(String name, Output<String> id, @Nullable ReplicationTaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReplicationTask(name, id, state, options);
    }
}
