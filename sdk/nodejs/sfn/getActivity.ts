// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Step Functions Activity data source
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const sfnActivity = aws.sfn.getActivity({
 *     name: "my-activity",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getActivity(args?: GetActivityArgs, opts?: pulumi.InvokeOptions): Promise<GetActivityResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("aws:sfn/getActivity:getActivity", {
        "arn": args.arn,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getActivity.
 */
export interface GetActivityArgs {
    /**
     * ARN that identifies the activity.
     */
    arn?: string;
    /**
     * Name that identifies the activity.
     */
    name?: string;
}

/**
 * A collection of values returned by getActivity.
 */
export interface GetActivityResult {
    readonly arn: string;
    /**
     * Date the activity was created.
     */
    readonly creationDate: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
}
/**
 * Provides a Step Functions Activity data source
 *
 * ## Example Usage
 *
 * <!--Start PulumiCodeChooser -->
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const sfnActivity = aws.sfn.getActivity({
 *     name: "my-activity",
 * });
 * ```
 * <!--End PulumiCodeChooser -->
 */
export function getActivityOutput(args?: GetActivityOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetActivityResult> {
    return pulumi.output(args).apply((a: any) => getActivity(a, opts))
}

/**
 * A collection of arguments for invoking getActivity.
 */
export interface GetActivityOutputArgs {
    /**
     * ARN that identifies the activity.
     */
    arn?: pulumi.Input<string>;
    /**
     * Name that identifies the activity.
     */
    name?: pulumi.Input<string>;
}
