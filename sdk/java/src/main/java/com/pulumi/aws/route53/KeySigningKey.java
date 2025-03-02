// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.route53.KeySigningKeyArgs;
import com.pulumi.aws.route53.inputs.KeySigningKeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Route 53 Key Signing Key. To manage Domain Name System Security Extensions (DNSSEC) for a Hosted Zone, see the `aws.route53.HostedZoneDnsSec` resource. For more information about managing DNSSEC in Route 53, see the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec.html).
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
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetCallerIdentityArgs;
 * import com.pulumi.aws.kms.Key;
 * import com.pulumi.aws.kms.KeyArgs;
 * import com.pulumi.aws.route53.Zone;
 * import com.pulumi.aws.route53.ZoneArgs;
 * import com.pulumi.aws.route53.KeySigningKey;
 * import com.pulumi.aws.route53.KeySigningKeyArgs;
 * import com.pulumi.aws.route53.HostedZoneDnsSec;
 * import com.pulumi.aws.route53.HostedZoneDnsSecArgs;
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
 *         final var current = AwsFunctions.getCallerIdentity();
 * 
 *         var example = new Key(&#34;example&#34;, KeyArgs.builder()        
 *             .customerMasterKeySpec(&#34;ECC_NIST_P256&#34;)
 *             .deletionWindowInDays(7)
 *             .keyUsage(&#34;SIGN_VERIFY&#34;)
 *             .policy(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;statement&#34;, jsonArray(
 *                         jsonObject(
 *                             jsonProperty(&#34;action&#34;, jsonArray(
 *                                 &#34;kms:DescribeKey&#34;, 
 *                                 &#34;kms:GetPublicKey&#34;, 
 *                                 &#34;kms:Sign&#34;
 *                             )),
 *                             jsonProperty(&#34;effect&#34;, &#34;Allow&#34;),
 *                             jsonProperty(&#34;principal&#34;, jsonObject(
 *                                 jsonProperty(&#34;service&#34;, &#34;dnssec-route53.amazonaws.com&#34;)
 *                             )),
 *                             jsonProperty(&#34;sid&#34;, &#34;Allow Route 53 DNSSEC Service&#34;),
 *                             jsonProperty(&#34;resource&#34;, &#34;*&#34;),
 *                             jsonProperty(&#34;condition&#34;, jsonObject(
 *                                 jsonProperty(&#34;stringEquals&#34;, jsonObject(
 *                                     jsonProperty(&#34;aws:SourceAccount&#34;, current.applyValue(getCallerIdentityResult -&gt; getCallerIdentityResult.accountId()))
 *                                 )),
 *                                 jsonProperty(&#34;arnLike&#34;, jsonObject(
 *                                     jsonProperty(&#34;aws:SourceArn&#34;, &#34;arn:aws:route53:::hostedzone/*&#34;)
 *                                 ))
 *                             ))
 *                         ), 
 *                         jsonObject(
 *                             jsonProperty(&#34;action&#34;, &#34;kms:CreateGrant&#34;),
 *                             jsonProperty(&#34;effect&#34;, &#34;Allow&#34;),
 *                             jsonProperty(&#34;principal&#34;, jsonObject(
 *                                 jsonProperty(&#34;service&#34;, &#34;dnssec-route53.amazonaws.com&#34;)
 *                             )),
 *                             jsonProperty(&#34;sid&#34;, &#34;Allow Route 53 DNSSEC Service to CreateGrant&#34;),
 *                             jsonProperty(&#34;resource&#34;, &#34;*&#34;),
 *                             jsonProperty(&#34;condition&#34;, jsonObject(
 *                                 jsonProperty(&#34;bool&#34;, jsonObject(
 *                                     jsonProperty(&#34;kms:GrantIsForAWSResource&#34;, &#34;true&#34;)
 *                                 ))
 *                             ))
 *                         ), 
 *                         jsonObject(
 *                             jsonProperty(&#34;action&#34;, &#34;kms:*&#34;),
 *                             jsonProperty(&#34;effect&#34;, &#34;Allow&#34;),
 *                             jsonProperty(&#34;principal&#34;, jsonObject(
 *                                 jsonProperty(&#34;AWS&#34;, String.format(&#34;arn:aws:iam::%s:root&#34;, current.applyValue(getCallerIdentityResult -&gt; getCallerIdentityResult.accountId())))
 *                             )),
 *                             jsonProperty(&#34;resource&#34;, &#34;*&#34;),
 *                             jsonProperty(&#34;sid&#34;, &#34;Enable IAM User Permissions&#34;)
 *                         )
 *                     )),
 *                     jsonProperty(&#34;version&#34;, &#34;2012-10-17&#34;)
 *                 )))
 *             .build());
 * 
 *         var exampleZone = new Zone(&#34;exampleZone&#34;, ZoneArgs.builder()        
 *             .name(&#34;example.com&#34;)
 *             .build());
 * 
 *         var exampleKeySigningKey = new KeySigningKey(&#34;exampleKeySigningKey&#34;, KeySigningKeyArgs.builder()        
 *             .hostedZoneId(test.id())
 *             .keyManagementServiceArn(testAwsKmsKey.arn())
 *             .name(&#34;example&#34;)
 *             .build());
 * 
 *         var exampleHostedZoneDnsSec = new HostedZoneDnsSec(&#34;exampleHostedZoneDnsSec&#34;, HostedZoneDnsSecArgs.builder()        
 *             .hostedZoneId(exampleKeySigningKey.hostedZoneId())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_route53_key_signing_key` resources using the Route 53 Hosted Zone identifier and KMS Key identifier, separated by a comma (`,`). For example:
 * 
 * ```sh
 * $ pulumi import aws:route53/keySigningKey:KeySigningKey example Z1D633PJN98FT9,example
 * ```
 * 
 */
@ResourceType(type="aws:route53/keySigningKey:KeySigningKey")
public class KeySigningKey extends com.pulumi.resources.CustomResource {
    /**
     * A string used to represent the delegation signer digest algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.3](https://tools.ietf.org/html/rfc8624#section-3.3).
     * 
     */
    @Export(name="digestAlgorithmMnemonic", refs={String.class}, tree="[0]")
    private Output<String> digestAlgorithmMnemonic;

    /**
     * @return A string used to represent the delegation signer digest algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.3](https://tools.ietf.org/html/rfc8624#section-3.3).
     * 
     */
    public Output<String> digestAlgorithmMnemonic() {
        return this.digestAlgorithmMnemonic;
    }
    /**
     * An integer used to represent the delegation signer digest algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.3](https://tools.ietf.org/html/rfc8624#section-3.3).
     * 
     */
    @Export(name="digestAlgorithmType", refs={Integer.class}, tree="[0]")
    private Output<Integer> digestAlgorithmType;

    /**
     * @return An integer used to represent the delegation signer digest algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.3](https://tools.ietf.org/html/rfc8624#section-3.3).
     * 
     */
    public Output<Integer> digestAlgorithmType() {
        return this.digestAlgorithmType;
    }
    /**
     * A cryptographic digest of a DNSKEY resource record (RR). DNSKEY records are used to publish the public key that resolvers can use to verify DNSSEC signatures that are used to secure certain kinds of information provided by the DNS system.
     * 
     */
    @Export(name="digestValue", refs={String.class}, tree="[0]")
    private Output<String> digestValue;

    /**
     * @return A cryptographic digest of a DNSKEY resource record (RR). DNSKEY records are used to publish the public key that resolvers can use to verify DNSSEC signatures that are used to secure certain kinds of information provided by the DNS system.
     * 
     */
    public Output<String> digestValue() {
        return this.digestValue;
    }
    /**
     * A string that represents a DNSKEY record.
     * 
     */
    @Export(name="dnskeyRecord", refs={String.class}, tree="[0]")
    private Output<String> dnskeyRecord;

    /**
     * @return A string that represents a DNSKEY record.
     * 
     */
    public Output<String> dnskeyRecord() {
        return this.dnskeyRecord;
    }
    /**
     * A string that represents a delegation signer (DS) record.
     * 
     */
    @Export(name="dsRecord", refs={String.class}, tree="[0]")
    private Output<String> dsRecord;

    /**
     * @return A string that represents a delegation signer (DS) record.
     * 
     */
    public Output<String> dsRecord() {
        return this.dsRecord;
    }
    /**
     * An integer that specifies how the key is used. For key-signing key (KSK), this value is always 257.
     * 
     */
    @Export(name="flag", refs={Integer.class}, tree="[0]")
    private Output<Integer> flag;

    /**
     * @return An integer that specifies how the key is used. For key-signing key (KSK), this value is always 257.
     * 
     */
    public Output<Integer> flag() {
        return this.flag;
    }
    /**
     * Identifier of the Route 53 Hosted Zone.
     * 
     */
    @Export(name="hostedZoneId", refs={String.class}, tree="[0]")
    private Output<String> hostedZoneId;

    /**
     * @return Identifier of the Route 53 Hosted Zone.
     * 
     */
    public Output<String> hostedZoneId() {
        return this.hostedZoneId;
    }
    /**
     * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key. This must be unique for each key-signing key (KSK) in a single hosted zone. This key must be in the `us-east-1` Region and meet certain requirements, which are described in the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-cmk-requirements.html) and [Route 53 API Reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateKeySigningKey.html).
     * 
     */
    @Export(name="keyManagementServiceArn", refs={String.class}, tree="[0]")
    private Output<String> keyManagementServiceArn;

    /**
     * @return Amazon Resource Name (ARN) of the Key Management Service (KMS) Key. This must be unique for each key-signing key (KSK) in a single hosted zone. This key must be in the `us-east-1` Region and meet certain requirements, which are described in the [Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-configuring-dnssec-cmk-requirements.html) and [Route 53 API Reference](https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateKeySigningKey.html).
     * 
     */
    public Output<String> keyManagementServiceArn() {
        return this.keyManagementServiceArn;
    }
    /**
     * An integer used to identify the DNSSEC record for the domain name. The process used to calculate the value is described in [RFC-4034 Appendix B](https://tools.ietf.org/rfc/rfc4034.txt).
     * 
     */
    @Export(name="keyTag", refs={Integer.class}, tree="[0]")
    private Output<Integer> keyTag;

    /**
     * @return An integer used to identify the DNSSEC record for the domain name. The process used to calculate the value is described in [RFC-4034 Appendix B](https://tools.ietf.org/rfc/rfc4034.txt).
     * 
     */
    public Output<Integer> keyTag() {
        return this.keyTag;
    }
    /**
     * Name of the key-signing key (KSK). Must be unique for each key-singing key in the same hosted zone.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the key-signing key (KSK). Must be unique for each key-singing key in the same hosted zone.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The public key, represented as a Base64 encoding, as required by [RFC-4034 Page 5](https://tools.ietf.org/rfc/rfc4034.txt).
     * 
     */
    @Export(name="publicKey", refs={String.class}, tree="[0]")
    private Output<String> publicKey;

    /**
     * @return The public key, represented as a Base64 encoding, as required by [RFC-4034 Page 5](https://tools.ietf.org/rfc/rfc4034.txt).
     * 
     */
    public Output<String> publicKey() {
        return this.publicKey;
    }
    /**
     * A string used to represent the signing algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.1](https://tools.ietf.org/html/rfc8624#section-3.1).
     * 
     */
    @Export(name="signingAlgorithmMnemonic", refs={String.class}, tree="[0]")
    private Output<String> signingAlgorithmMnemonic;

    /**
     * @return A string used to represent the signing algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.1](https://tools.ietf.org/html/rfc8624#section-3.1).
     * 
     */
    public Output<String> signingAlgorithmMnemonic() {
        return this.signingAlgorithmMnemonic;
    }
    /**
     * An integer used to represent the signing algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.1](https://tools.ietf.org/html/rfc8624#section-3.1).
     * 
     */
    @Export(name="signingAlgorithmType", refs={Integer.class}, tree="[0]")
    private Output<Integer> signingAlgorithmType;

    /**
     * @return An integer used to represent the signing algorithm. This value must follow the guidelines provided by [RFC-8624 Section 3.1](https://tools.ietf.org/html/rfc8624#section-3.1).
     * 
     */
    public Output<Integer> signingAlgorithmType() {
        return this.signingAlgorithmType;
    }
    /**
     * Status of the key-signing key (KSK). Valid values: `ACTIVE`, `INACTIVE`. Defaults to `ACTIVE`.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> status;

    /**
     * @return Status of the key-signing key (KSK). Valid values: `ACTIVE`, `INACTIVE`. Defaults to `ACTIVE`.
     * 
     */
    public Output<Optional<String>> status() {
        return Codegen.optional(this.status);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public KeySigningKey(String name) {
        this(name, KeySigningKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public KeySigningKey(String name, KeySigningKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public KeySigningKey(String name, KeySigningKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/keySigningKey:KeySigningKey", name, args == null ? KeySigningKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private KeySigningKey(String name, Output<String> id, @Nullable KeySigningKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/keySigningKey:KeySigningKey", name, state, makeResourceOptions(options, id));
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
    public static KeySigningKey get(String name, Output<String> id, @Nullable KeySigningKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new KeySigningKey(name, id, state, options);
    }
}
