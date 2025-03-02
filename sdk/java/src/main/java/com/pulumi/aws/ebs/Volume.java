// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ebs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ebs.VolumeArgs;
import com.pulumi.aws.ebs.inputs.VolumeState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a single EBS volume.
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
 * import com.pulumi.aws.ebs.Volume;
 * import com.pulumi.aws.ebs.VolumeArgs;
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
 *         var example = new Volume(&#34;example&#34;, VolumeArgs.builder()        
 *             .availabilityZone(&#34;us-west-2a&#34;)
 *             .size(40)
 *             .tags(Map.of(&#34;Name&#34;, &#34;HelloWorld&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &gt; **NOTE:** At least one of `size` or `snapshot_id` is required when specifying an EBS volume
 * 
 * ## Import
 * 
 * Using `pulumi import`, import EBS Volumes using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:ebs/volume:Volume id vol-049df61146c4d7901
 * ```
 * 
 */
@ResourceType(type="aws:ebs/volume:Volume")
public class Volume extends com.pulumi.resources.CustomResource {
    /**
     * The volume ARN (e.g., arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The volume ARN (e.g., arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The AZ where the EBS volume will exist.
     * 
     */
    @Export(name="availabilityZone", refs={String.class}, tree="[0]")
    private Output<String> availabilityZone;

    /**
     * @return The AZ where the EBS volume will exist.
     * 
     */
    public Output<String> availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * If true, the disk will be encrypted.
     * 
     */
    @Export(name="encrypted", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> encrypted;

    /**
     * @return If true, the disk will be encrypted.
     * 
     */
    public Output<Boolean> encrypted() {
        return this.encrypted;
    }
    /**
     * If true, snapshot will be created before volume deletion. Any tags on the volume will be migrated to the snapshot. By default set to false
     * 
     */
    @Export(name="finalSnapshot", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> finalSnapshot;

    /**
     * @return If true, snapshot will be created before volume deletion. Any tags on the volume will be migrated to the snapshot. By default set to false
     * 
     */
    public Output<Optional<Boolean>> finalSnapshot() {
        return Codegen.optional(this.finalSnapshot);
    }
    /**
     * The amount of IOPS to provision for the disk. Only valid for `type` of `io1`, `io2` or `gp3`.
     * 
     */
    @Export(name="iops", refs={Integer.class}, tree="[0]")
    private Output<Integer> iops;

    /**
     * @return The amount of IOPS to provision for the disk. Only valid for `type` of `io1`, `io2` or `gp3`.
     * 
     */
    public Output<Integer> iops() {
        return this.iops;
    }
    /**
     * The ARN for the KMS encryption key. When specifying `kms_key_id`, `encrypted` needs to be set to true. Note: The provider must be running with credentials which have the `GenerateDataKeyWithoutPlaintext` permission on the specified KMS key as required by the [EBS KMS CMK volume provisioning process](https://docs.aws.amazon.com/kms/latest/developerguide/services-ebs.html#ebs-cmk) to prevent a volume from being created and almost immediately deleted.
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output<String> kmsKeyId;

    /**
     * @return The ARN for the KMS encryption key. When specifying `kms_key_id`, `encrypted` needs to be set to true. Note: The provider must be running with credentials which have the `GenerateDataKeyWithoutPlaintext` permission on the specified KMS key as required by the [EBS KMS CMK volume provisioning process](https://docs.aws.amazon.com/kms/latest/developerguide/services-ebs.html#ebs-cmk) to prevent a volume from being created and almost immediately deleted.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported on `io1` and `io2` volumes.
     * 
     */
    @Export(name="multiAttachEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> multiAttachEnabled;

    /**
     * @return Specifies whether to enable Amazon EBS Multi-Attach. Multi-Attach is supported on `io1` and `io2` volumes.
     * 
     */
    public Output<Optional<Boolean>> multiAttachEnabled() {
        return Codegen.optional(this.multiAttachEnabled);
    }
    /**
     * The Amazon Resource Name (ARN) of the Outpost.
     * 
     */
    @Export(name="outpostArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> outpostArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Outpost.
     * 
     */
    public Output<Optional<String>> outpostArn() {
        return Codegen.optional(this.outpostArn);
    }
    /**
     * The size of the drive in GiBs.
     * 
     */
    @Export(name="size", refs={Integer.class}, tree="[0]")
    private Output<Integer> size;

    /**
     * @return The size of the drive in GiBs.
     * 
     */
    public Output<Integer> size() {
        return this.size;
    }
    /**
     * A snapshot to base the EBS volume off of.
     * 
     */
    @Export(name="snapshotId", refs={String.class}, tree="[0]")
    private Output<String> snapshotId;

    /**
     * @return A snapshot to base the EBS volume off of.
     * 
     */
    public Output<String> snapshotId() {
        return this.snapshotId;
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
     * The throughput that the volume supports, in MiB/s. Only valid for `type` of `gp3`.
     * 
     * &gt; **NOTE:** When changing the `size`, `iops` or `type` of an instance, there are [considerations](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/considerations.html) to be aware of.
     * 
     */
    @Export(name="throughput", refs={Integer.class}, tree="[0]")
    private Output<Integer> throughput;

    /**
     * @return The throughput that the volume supports, in MiB/s. Only valid for `type` of `gp3`.
     * 
     * &gt; **NOTE:** When changing the `size`, `iops` or `type` of an instance, there are [considerations](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/considerations.html) to be aware of.
     * 
     */
    public Output<Integer> throughput() {
        return this.throughput;
    }
    /**
     * The type of EBS volume. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `gp2`).
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of EBS volume. Can be `standard`, `gp2`, `gp3`, `io1`, `io2`, `sc1` or `st1` (Default: `gp2`).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Volume(String name) {
        this(name, VolumeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Volume(String name, VolumeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Volume(String name, VolumeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ebs/volume:Volume", name, args == null ? VolumeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Volume(String name, Output<String> id, @Nullable VolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ebs/volume:Volume", name, state, makeResourceOptions(options, id));
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
    public static Volume get(String name, Output<String> id, @Nullable VolumeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Volume(name, id, state, options);
    }
}
