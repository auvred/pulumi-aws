// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.datasync.LocationAzureBlobArgs;
import com.pulumi.aws.datasync.inputs.LocationAzureBlobState;
import com.pulumi.aws.datasync.outputs.LocationAzureBlobSasConfiguration;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Microsoft Azure Blob Storage Location within AWS DataSync.
 * 
 * &gt; **NOTE:** The DataSync Agents must be available before creating this resource.
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
 * import com.pulumi.aws.datasync.LocationAzureBlob;
 * import com.pulumi.aws.datasync.LocationAzureBlobArgs;
 * import com.pulumi.aws.datasync.inputs.LocationAzureBlobSasConfigurationArgs;
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
 *         var example = new LocationAzureBlob(&#34;example&#34;, LocationAzureBlobArgs.builder()        
 *             .agentArns(exampleAwsDatasyncAgent.arn())
 *             .authenticationType(&#34;SAS&#34;)
 *             .containerUrl(&#34;https://example.com/path&#34;)
 *             .sasConfiguration(LocationAzureBlobSasConfigurationArgs.builder()
 *                 .token(&#34;sp=r&amp;st=2023-12-20T14:54:52Z&amp;se=2023-12-20T22:54:52Z&amp;spr=https&amp;sv=2021-06-08&amp;sr=c&amp;sig=aBBKDWQvyuVcTPH9EBp%2FXTI9E%2F%2Fmq171%2BZU178wcwqU%3D&#34;)
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
 * Using `pulumi import`, import `aws_datasync_location_azure_blob` using the Amazon Resource Name (ARN). For example:
 * 
 * ```sh
 * $ pulumi import aws:datasync/locationAzureBlob:LocationAzureBlob example arn:aws:datasync:us-east-1:123456789012:location/loc-12345678901234567
 * ```
 * 
 */
@ResourceType(type="aws:datasync/locationAzureBlob:LocationAzureBlob")
public class LocationAzureBlob extends com.pulumi.resources.CustomResource {
    /**
     * The access tier that you want your objects or files transferred into. Valid values: `HOT`, `COOL` and `ARCHIVE`. Default: `HOT`.
     * 
     */
    @Export(name="accessTier", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> accessTier;

    /**
     * @return The access tier that you want your objects or files transferred into. Valid values: `HOT`, `COOL` and `ARCHIVE`. Default: `HOT`.
     * 
     */
    public Output<Optional<String>> accessTier() {
        return Codegen.optional(this.accessTier);
    }
    /**
     * A list of DataSync Agent ARNs with which this location will be associated.
     * 
     */
    @Export(name="agentArns", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> agentArns;

    /**
     * @return A list of DataSync Agent ARNs with which this location will be associated.
     * 
     */
    public Output<List<String>> agentArns() {
        return this.agentArns;
    }
    /**
     * Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the DataSync Location.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The authentication method DataSync uses to access your Azure Blob Storage. Valid values: `SAS`.
     * 
     */
    @Export(name="authenticationType", refs={String.class}, tree="[0]")
    private Output<String> authenticationType;

    /**
     * @return The authentication method DataSync uses to access your Azure Blob Storage. Valid values: `SAS`.
     * 
     */
    public Output<String> authenticationType() {
        return this.authenticationType;
    }
    /**
     * The type of blob that you want your objects or files to be when transferring them into Azure Blob Storage. Valid values: `BLOB`. Default: `BLOB`.
     * 
     */
    @Export(name="blobType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> blobType;

    /**
     * @return The type of blob that you want your objects or files to be when transferring them into Azure Blob Storage. Valid values: `BLOB`. Default: `BLOB`.
     * 
     */
    public Output<Optional<String>> blobType() {
        return Codegen.optional(this.blobType);
    }
    /**
     * The URL of the Azure Blob Storage container involved in your transfer.
     * 
     */
    @Export(name="containerUrl", refs={String.class}, tree="[0]")
    private Output<String> containerUrl;

    /**
     * @return The URL of the Azure Blob Storage container involved in your transfer.
     * 
     */
    public Output<String> containerUrl() {
        return this.containerUrl;
    }
    /**
     * The SAS configuration that allows DataSync to access your Azure Blob Storage. See configuration below.
     * 
     */
    @Export(name="sasConfiguration", refs={LocationAzureBlobSasConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ LocationAzureBlobSasConfiguration> sasConfiguration;

    /**
     * @return The SAS configuration that allows DataSync to access your Azure Blob Storage. See configuration below.
     * 
     */
    public Output<Optional<LocationAzureBlobSasConfiguration>> sasConfiguration() {
        return Codegen.optional(this.sasConfiguration);
    }
    /**
     * Path segments if you want to limit your transfer to a virtual directory in the container.
     * 
     */
    @Export(name="subdirectory", refs={String.class}, tree="[0]")
    private Output<String> subdirectory;

    /**
     * @return Path segments if you want to limit your transfer to a virtual directory in the container.
     * 
     */
    public Output<String> subdirectory() {
        return this.subdirectory;
    }
    /**
     * Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
    @Export(name="uri", refs={String.class}, tree="[0]")
    private Output<String> uri;

    public Output<String> uri() {
        return this.uri;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LocationAzureBlob(String name) {
        this(name, LocationAzureBlobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LocationAzureBlob(String name, LocationAzureBlobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LocationAzureBlob(String name, LocationAzureBlobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:datasync/locationAzureBlob:LocationAzureBlob", name, args == null ? LocationAzureBlobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LocationAzureBlob(String name, Output<String> id, @Nullable LocationAzureBlobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:datasync/locationAzureBlob:LocationAzureBlob", name, state, makeResourceOptions(options, id));
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
    public static LocationAzureBlob get(String name, Output<String> id, @Nullable LocationAzureBlobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LocationAzureBlob(name, id, state, options);
    }
}
