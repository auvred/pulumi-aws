// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an Elastic Container Registry Pull Through Cache Rule.
 *
 * More information about pull through cache rules, including the set of supported
 * upstream repositories, see [Using pull through cache rules](https://docs.aws.amazon.com/AmazonECR/latest/userguide/pull-through-cache.html).
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.ecr.PullThroughCacheRule("example", {
 *     ecrRepositoryPrefix: "ecr-public",
 *     upstreamRegistryUrl: "public.ecr.aws",
 *     credentialArn: "arn:aws:secretsmanager:us-east-1:123456789:secret:ecr-pullthroughcache/ecrpublic",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 *
 * ## Import
 *
 * Using `pulumi import`, import a pull-through cache rule using the `ecr_repository_prefix`. For example:
 *
 * ```sh
 * $ pulumi import aws:ecr/pullThroughCacheRule:PullThroughCacheRule example ecr-public
 * ```
 */
export class PullThroughCacheRule extends pulumi.CustomResource {
    /**
     * Get an existing PullThroughCacheRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PullThroughCacheRuleState, opts?: pulumi.CustomResourceOptions): PullThroughCacheRule {
        return new PullThroughCacheRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:ecr/pullThroughCacheRule:PullThroughCacheRule';

    /**
     * Returns true if the given object is an instance of PullThroughCacheRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PullThroughCacheRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PullThroughCacheRule.__pulumiType;
    }

    /**
     * ARN of the Secret which will be used to authenticate against the registry.
     */
    public readonly credentialArn!: pulumi.Output<string | undefined>;
    /**
     * The repository name prefix to use when caching images from the source registry.
     */
    public readonly ecrRepositoryPrefix!: pulumi.Output<string>;
    /**
     * The registry ID where the repository was created.
     */
    public /*out*/ readonly registryId!: pulumi.Output<string>;
    /**
     * The registry URL of the upstream public registry to use as the source.
     */
    public readonly upstreamRegistryUrl!: pulumi.Output<string>;

    /**
     * Create a PullThroughCacheRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PullThroughCacheRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PullThroughCacheRuleArgs | PullThroughCacheRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PullThroughCacheRuleState | undefined;
            resourceInputs["credentialArn"] = state ? state.credentialArn : undefined;
            resourceInputs["ecrRepositoryPrefix"] = state ? state.ecrRepositoryPrefix : undefined;
            resourceInputs["registryId"] = state ? state.registryId : undefined;
            resourceInputs["upstreamRegistryUrl"] = state ? state.upstreamRegistryUrl : undefined;
        } else {
            const args = argsOrState as PullThroughCacheRuleArgs | undefined;
            if ((!args || args.ecrRepositoryPrefix === undefined) && !opts.urn) {
                throw new Error("Missing required property 'ecrRepositoryPrefix'");
            }
            if ((!args || args.upstreamRegistryUrl === undefined) && !opts.urn) {
                throw new Error("Missing required property 'upstreamRegistryUrl'");
            }
            resourceInputs["credentialArn"] = args ? args.credentialArn : undefined;
            resourceInputs["ecrRepositoryPrefix"] = args ? args.ecrRepositoryPrefix : undefined;
            resourceInputs["upstreamRegistryUrl"] = args ? args.upstreamRegistryUrl : undefined;
            resourceInputs["registryId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PullThroughCacheRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PullThroughCacheRule resources.
 */
export interface PullThroughCacheRuleState {
    /**
     * ARN of the Secret which will be used to authenticate against the registry.
     */
    credentialArn?: pulumi.Input<string>;
    /**
     * The repository name prefix to use when caching images from the source registry.
     */
    ecrRepositoryPrefix?: pulumi.Input<string>;
    /**
     * The registry ID where the repository was created.
     */
    registryId?: pulumi.Input<string>;
    /**
     * The registry URL of the upstream public registry to use as the source.
     */
    upstreamRegistryUrl?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PullThroughCacheRule resource.
 */
export interface PullThroughCacheRuleArgs {
    /**
     * ARN of the Secret which will be used to authenticate against the registry.
     */
    credentialArn?: pulumi.Input<string>;
    /**
     * The repository name prefix to use when caching images from the source registry.
     */
    ecrRepositoryPrefix: pulumi.Input<string>;
    /**
     * The registry URL of the upstream public registry to use as the source.
     */
    upstreamRegistryUrl: pulumi.Input<string>;
}
