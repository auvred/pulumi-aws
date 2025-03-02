// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.comprehend;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.comprehend.EntityRecognizerArgs;
import com.pulumi.aws.comprehend.inputs.EntityRecognizerState;
import com.pulumi.aws.comprehend.outputs.EntityRecognizerInputDataConfig;
import com.pulumi.aws.comprehend.outputs.EntityRecognizerVpcConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS Comprehend Entity Recognizer.
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
 * import com.pulumi.aws.s3.BucketObjectv2;
 * import com.pulumi.aws.comprehend.EntityRecognizer;
 * import com.pulumi.aws.comprehend.EntityRecognizerArgs;
 * import com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigArgs;
 * import com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigDocumentsArgs;
 * import com.pulumi.aws.comprehend.inputs.EntityRecognizerInputDataConfigEntityListArgs;
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
 *         var documents = new BucketObjectv2(&#34;documents&#34;);
 * 
 *         var entities = new BucketObjectv2(&#34;entities&#34;);
 * 
 *         var example = new EntityRecognizer(&#34;example&#34;, EntityRecognizerArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .dataAccessRoleArn(exampleAwsIamRole.arn())
 *             .languageCode(&#34;en&#34;)
 *             .inputDataConfig(EntityRecognizerInputDataConfigArgs.builder()
 *                 .entityTypes(                
 *                     EntityRecognizerInputDataConfigEntityTypeArgs.builder()
 *                         .type(&#34;ENTITY_1&#34;)
 *                         .build(),
 *                     EntityRecognizerInputDataConfigEntityTypeArgs.builder()
 *                         .type(&#34;ENTITY_2&#34;)
 *                         .build())
 *                 .documents(EntityRecognizerInputDataConfigDocumentsArgs.builder()
 *                     .s3Uri(documents.id().applyValue(id -&gt; String.format(&#34;s3://%s/%s&#34;, documentsAwsS3Bucket.bucket(),id)))
 *                     .build())
 *                 .entityList(EntityRecognizerInputDataConfigEntityListArgs.builder()
 *                     .s3Uri(entities.id().applyValue(id -&gt; String.format(&#34;s3://%s/%s&#34;, entitiesAwsS3Bucket.bucket(),id)))
 *                     .build())
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
 * Using `pulumi import`, import Comprehend Entity Recognizer using the ARN. For example:
 * 
 * ```sh
 * $ pulumi import aws:comprehend/entityRecognizer:EntityRecognizer example arn:aws:comprehend:us-west-2:123456789012:entity-recognizer/example
 * ```
 * 
 */
@ResourceType(type="aws:comprehend/entityRecognizer:EntityRecognizer")
public class EntityRecognizer extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the Entity Recognizer version.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN of the Entity Recognizer version.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ARN for an IAM Role which allows Comprehend to read the training and testing data.
     * 
     */
    @Export(name="dataAccessRoleArn", refs={String.class}, tree="[0]")
    private Output<String> dataAccessRoleArn;

    /**
     * @return The ARN for an IAM Role which allows Comprehend to read the training and testing data.
     * 
     */
    public Output<String> dataAccessRoleArn() {
        return this.dataAccessRoleArn;
    }
    /**
     * Configuration for the training and testing data.
     * See the `input_data_config` Configuration Block section below.
     * 
     */
    @Export(name="inputDataConfig", refs={EntityRecognizerInputDataConfig.class}, tree="[0]")
    private Output<EntityRecognizerInputDataConfig> inputDataConfig;

    /**
     * @return Configuration for the training and testing data.
     * See the `input_data_config` Configuration Block section below.
     * 
     */
    public Output<EntityRecognizerInputDataConfig> inputDataConfig() {
        return this.inputDataConfig;
    }
    /**
     * Two-letter language code for the language.
     * One of `en`, `es`, `fr`, `it`, `de`, or `pt`.
     * 
     */
    @Export(name="languageCode", refs={String.class}, tree="[0]")
    private Output<String> languageCode;

    /**
     * @return Two-letter language code for the language.
     * One of `en`, `es`, `fr`, `it`, `de`, or `pt`.
     * 
     */
    public Output<String> languageCode() {
        return this.languageCode;
    }
    /**
     * The ID or ARN of a KMS Key used to encrypt trained Entity Recognizers.
     * 
     */
    @Export(name="modelKmsKeyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> modelKmsKeyId;

    /**
     * @return The ID or ARN of a KMS Key used to encrypt trained Entity Recognizers.
     * 
     */
    public Output<Optional<String>> modelKmsKeyId() {
        return Codegen.optional(this.modelKmsKeyId);
    }
    /**
     * Name for the Entity Recognizer.
     * Has a maximum length of 63 characters.
     * Can contain upper- and lower-case letters, numbers, and hypen (`-`).
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name for the Entity Recognizer.
     * Has a maximum length of 63 characters.
     * Can contain upper- and lower-case letters, numbers, and hypen (`-`).
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` Configuration Block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` Configuration Block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Name for the version of the Entity Recognizer.
     * Each version must have a unique name within the Entity Recognizer.
     * If omitted, the provider will assign a random, unique version name.
     * If explicitly set to `&#34;&#34;`, no version name will be set.
     * Has a maximum length of 63 characters.
     * Can contain upper- and lower-case letters, numbers, and hypen (`-`).
     * Conflicts with `version_name_prefix`.
     * 
     */
    @Export(name="versionName", refs={String.class}, tree="[0]")
    private Output<String> versionName;

    /**
     * @return Name for the version of the Entity Recognizer.
     * Each version must have a unique name within the Entity Recognizer.
     * If omitted, the provider will assign a random, unique version name.
     * If explicitly set to `&#34;&#34;`, no version name will be set.
     * Has a maximum length of 63 characters.
     * Can contain upper- and lower-case letters, numbers, and hypen (`-`).
     * Conflicts with `version_name_prefix`.
     * 
     */
    public Output<String> versionName() {
        return this.versionName;
    }
    /**
     * Creates a unique version name beginning with the specified prefix.
     * Has a maximum length of 37 characters.
     * Can contain upper- and lower-case letters, numbers, and hypen (`-`).
     * Conflicts with `version_name`.
     * 
     */
    @Export(name="versionNamePrefix", refs={String.class}, tree="[0]")
    private Output<String> versionNamePrefix;

    /**
     * @return Creates a unique version name beginning with the specified prefix.
     * Has a maximum length of 37 characters.
     * Can contain upper- and lower-case letters, numbers, and hypen (`-`).
     * Conflicts with `version_name`.
     * 
     */
    public Output<String> versionNamePrefix() {
        return this.versionNamePrefix;
    }
    /**
     * ID or ARN of a KMS Key used to encrypt storage volumes during job processing.
     * 
     */
    @Export(name="volumeKmsKeyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> volumeKmsKeyId;

    /**
     * @return ID or ARN of a KMS Key used to encrypt storage volumes during job processing.
     * 
     */
    public Output<Optional<String>> volumeKmsKeyId() {
        return Codegen.optional(this.volumeKmsKeyId);
    }
    /**
     * Configuration parameters for VPC to contain Entity Recognizer resources.
     * See the `vpc_config` Configuration Block section below.
     * 
     */
    @Export(name="vpcConfig", refs={EntityRecognizerVpcConfig.class}, tree="[0]")
    private Output</* @Nullable */ EntityRecognizerVpcConfig> vpcConfig;

    /**
     * @return Configuration parameters for VPC to contain Entity Recognizer resources.
     * See the `vpc_config` Configuration Block section below.
     * 
     */
    public Output<Optional<EntityRecognizerVpcConfig>> vpcConfig() {
        return Codegen.optional(this.vpcConfig);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EntityRecognizer(String name) {
        this(name, EntityRecognizerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EntityRecognizer(String name, EntityRecognizerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EntityRecognizer(String name, EntityRecognizerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:comprehend/entityRecognizer:EntityRecognizer", name, args == null ? EntityRecognizerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EntityRecognizer(String name, Output<String> id, @Nullable EntityRecognizerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:comprehend/entityRecognizer:EntityRecognizer", name, state, makeResourceOptions(options, id));
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
    public static EntityRecognizer get(String name, Output<String> id, @Nullable EntityRecognizerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EntityRecognizer(name, id, state, options);
    }
}
