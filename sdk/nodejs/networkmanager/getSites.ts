// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieve information about sites.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.networkmanager.getSites({
 *     globalNetworkId: globalNetworkId,
 *     tags: {
 *         Env: "test",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getSites(args: GetSitesArgs, opts?: pulumi.InvokeOptions): Promise<GetSitesResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:networkmanager/getSites:getSites", {
        "globalNetworkId": args.globalNetworkId,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getSites.
 */
export interface GetSitesArgs {
    /**
     * ID of the Global Network of the sites to retrieve.
     */
    globalNetworkId: string;
    /**
     * Restricts the list to the sites with these tags.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getSites.
 */
export interface GetSitesResult {
    readonly globalNetworkId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * IDs of the sites.
     */
    readonly ids: string[];
    readonly tags?: {[key: string]: string};
}
/**
 * Retrieve information about sites.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = aws.networkmanager.getSites({
 *     globalNetworkId: globalNetworkId,
 *     tags: {
 *         Env: "test",
 *     },
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getSitesOutput(args: GetSitesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetSitesResult> {
    return pulumi.output(args).apply((a: any) => getSites(a, opts))
}

/**
 * A collection of arguments for invoking getSites.
 */
export interface GetSitesOutputArgs {
    /**
     * ID of the Global Network of the sites to retrieve.
     */
    globalNetworkId: pulumi.Input<string>;
    /**
     * Restricts the list to the sites with these tags.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
