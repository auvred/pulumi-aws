// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.GuardDuty.Inputs
{

    public sealed class OrganizationConfigurationFeatureAdditionalConfigurationGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The status of the additional configuration that will be configured for the organization. Valid values: `NEW`, `ALL`, `NONE`.
        /// </summary>
        [Input("autoEnable", required: true)]
        public Input<string> AutoEnable { get; set; } = null!;

        /// <summary>
        /// The name of the additional configuration that will be configured for the organization. Valid values: `EKS_ADDON_MANAGEMENT`.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public OrganizationConfigurationFeatureAdditionalConfigurationGetArgs()
        {
        }
        public static new OrganizationConfigurationFeatureAdditionalConfigurationGetArgs Empty => new OrganizationConfigurationFeatureAdditionalConfigurationGetArgs();
    }
}
