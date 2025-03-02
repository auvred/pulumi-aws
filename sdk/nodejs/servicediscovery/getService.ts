// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Retrieves information about a Service Discovery Service.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.servicediscovery.getService({
 *     name: "example",
 *     namespaceId: "NAMESPACE_ID_VALUE",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getService(args: GetServiceArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:servicediscovery/getService:getService", {
        "name": args.name,
        "namespaceId": args.namespaceId,
        "tags": args.tags,
        "tagsAll": args.tagsAll,
    }, opts);
}

/**
 * A collection of arguments for invoking getService.
 */
export interface GetServiceArgs {
    /**
     * Name of the service.
     */
    name: string;
    /**
     * ID of the namespace that the service belongs to.
     */
    namespaceId: string;
    /**
     * Map of tags to assign to the service. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: {[key: string]: string};
    /**
     * (**Deprecated**) Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated this attribute has been deprecated
     */
    tagsAll?: {[key: string]: string};
}

/**
 * A collection of values returned by getService.
 */
export interface GetServiceResult {
    /**
     * ARN of the service.
     */
    readonly arn: string;
    /**
     * Description of the service.
     */
    readonly description: string;
    /**
     * Complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
     */
    readonly dnsConfigs: outputs.servicediscovery.GetServiceDnsConfig[];
    /**
     * Complex type that contains settings for an optional health check. Only for Public DNS namespaces.
     */
    readonly healthCheckConfigs: outputs.servicediscovery.GetServiceHealthCheckConfig[];
    /**
     * A complex type that contains settings for ECS managed health checks.
     */
    readonly healthCheckCustomConfigs: outputs.servicediscovery.GetServiceHealthCheckCustomConfig[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * ID of the namespace to use for DNS configuration.
     */
    readonly namespaceId: string;
    /**
     * Map of tags to assign to the service. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    readonly tags?: {[key: string]: string};
    /**
     * (**Deprecated**) Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated this attribute has been deprecated
     */
    readonly tagsAll: {[key: string]: string};
}
/**
 * Retrieves information about a Service Discovery Service.
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const test = aws.servicediscovery.getService({
 *     name: "example",
 *     namespaceId: "NAMESPACE_ID_VALUE",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getServiceOutput(args: GetServiceOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServiceResult> {
    return pulumi.output(args).apply((a: any) => getService(a, opts))
}

/**
 * A collection of arguments for invoking getService.
 */
export interface GetServiceOutputArgs {
    /**
     * Name of the service.
     */
    name: pulumi.Input<string>;
    /**
     * ID of the namespace that the service belongs to.
     */
    namespaceId: pulumi.Input<string>;
    /**
     * Map of tags to assign to the service. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * (**Deprecated**) Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated this attribute has been deprecated
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
