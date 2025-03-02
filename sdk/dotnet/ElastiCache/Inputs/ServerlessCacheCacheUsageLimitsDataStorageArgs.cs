// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ElastiCache.Inputs
{

    public sealed class ServerlessCacheCacheUsageLimitsDataStorageArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The upper limit for data storage the cache is set to use. Set as Integer.
        /// </summary>
        [Input("maximum", required: true)]
        public Input<int> Maximum { get; set; } = null!;

        /// <summary>
        /// The unit that the storage is measured in, in GB.
        /// </summary>
        [Input("unit", required: true)]
        public Input<string> Unit { get; set; } = null!;

        public ServerlessCacheCacheUsageLimitsDataStorageArgs()
        {
        }
        public static new ServerlessCacheCacheUsageLimitsDataStorageArgs Empty => new ServerlessCacheCacheUsageLimitsDataStorageArgs();
    }
}
