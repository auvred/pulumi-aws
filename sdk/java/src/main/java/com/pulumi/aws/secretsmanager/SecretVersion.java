// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.secretsmanager.SecretVersionArgs;
import com.pulumi.aws.secretsmanager.inputs.SecretVersionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage AWS Secrets Manager secret version including its secret value. To manage secret metadata, see the `aws.secretsmanager.Secret` resource.
 * 
 * &gt; **NOTE:** If the `AWSCURRENT` staging label is present on this version during resource deletion, that label cannot be removed and will be skipped to prevent errors when fully deleting the secret. That label will leave this secret version active even after the resource is deleted from this provider unless the secret itself is deleted. Move the `AWSCURRENT` staging label before or after deleting this resource from this provider to fully trigger version deprecation if necessary.
 * 
 * ## Example Usage
 * 
 * ### Simple String Value
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.secretsmanager.SecretVersion;
 * import com.pulumi.aws.secretsmanager.SecretVersionArgs;
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
 *         var example = new SecretVersion(&#34;example&#34;, SecretVersionArgs.builder()        
 *             .secretId(exampleAwsSecretsmanagerSecret.id())
 *             .secretString(&#34;example-string-to-protect&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Key-Value Pairs
 * 
 * Secrets Manager also accepts key-value pairs in JSON.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.secretsmanager.SecretVersion;
 * import com.pulumi.aws.secretsmanager.SecretVersionArgs;
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
 *         final var config = ctx.config();
 *         final var example = config.get(&#34;example&#34;).orElse(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference));
 *         var exampleSecretVersion = new SecretVersion(&#34;exampleSecretVersion&#34;, SecretVersionArgs.builder()        
 *             .secretId(exampleAwsSecretsmanagerSecret.id())
 *             .secretString(serializeJson(
 *                 example))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Reading key-value pairs from JSON back into a native map
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_secretsmanager_secret_version` using the secret ID and version ID. For example:
 * 
 * ```sh
 * $ pulumi import aws:secretsmanager/secretVersion:SecretVersion example &#39;arn:aws:secretsmanager:us-east-1:123456789012:secret:example-123456|xxxxx-xxxxxxx-xxxxxxx-xxxxx&#39;
 * ```
 * 
 */
@ResourceType(type="aws:secretsmanager/secretVersion:SecretVersion")
public class SecretVersion extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the secret.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the secret.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
     * 
     */
    @Export(name="secretBinary", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> secretBinary;

    /**
     * @return Specifies binary data that you want to encrypt and store in this version of the secret. This is required if secret_string is not set. Needs to be encoded to base64.
     * 
     */
    public Output<Optional<String>> secretBinary() {
        return Codegen.optional(this.secretBinary);
    }
    /**
     * Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
     * 
     */
    @Export(name="secretId", refs={String.class}, tree="[0]")
    private Output<String> secretId;

    /**
     * @return Specifies the secret to which you want to add a new version. You can specify either the Amazon Resource Name (ARN) or the friendly name of the secret. The secret must already exist.
     * 
     */
    public Output<String> secretId() {
        return this.secretId;
    }
    /**
     * Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
     * 
     */
    @Export(name="secretString", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> secretString;

    /**
     * @return Specifies text data that you want to encrypt and store in this version of the secret. This is required if secret_binary is not set.
     * 
     */
    public Output<Optional<String>> secretString() {
        return Codegen.optional(this.secretString);
    }
    /**
     * The unique identifier of the version of the secret.
     * 
     */
    @Export(name="versionId", refs={String.class}, tree="[0]")
    private Output<String> versionId;

    /**
     * @return The unique identifier of the version of the secret.
     * 
     */
    public Output<String> versionId() {
        return this.versionId;
    }
    /**
     * Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that&#39;s already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
     * 
     * &gt; **NOTE:** If `version_stages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
     * 
     */
    @Export(name="versionStages", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> versionStages;

    /**
     * @return Specifies a list of staging labels that are attached to this version of the secret. A staging label must be unique to a single version of the secret. If you specify a staging label that&#39;s already associated with a different version of the same secret then that staging label is automatically removed from the other version and attached to this version. If you do not specify a value, then AWS Secrets Manager automatically moves the staging label `AWSCURRENT` to this new version on creation.
     * 
     * &gt; **NOTE:** If `version_stages` is configured, you must include the `AWSCURRENT` staging label if this secret version is the only version or if the label is currently present on this secret version, otherwise this provider will show a perpetual difference.
     * 
     */
    public Output<List<String>> versionStages() {
        return this.versionStages;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecretVersion(String name) {
        this(name, SecretVersionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecretVersion(String name, SecretVersionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecretVersion(String name, SecretVersionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:secretsmanager/secretVersion:SecretVersion", name, args == null ? SecretVersionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecretVersion(String name, Output<String> id, @Nullable SecretVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:secretsmanager/secretVersion:SecretVersion", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "secretBinary",
                "secretString"
            ))
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
    public static SecretVersion get(String name, Output<String> id, @Nullable SecretVersionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecretVersion(name, id, state, options);
    }
}
