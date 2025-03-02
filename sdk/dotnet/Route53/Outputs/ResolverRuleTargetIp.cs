// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Route53.Outputs
{

    [OutputType]
    public sealed class ResolverRuleTargetIp
    {
        /// <summary>
        /// One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
        /// </summary>
        public readonly string Ip;
        /// <summary>
        /// The port at `ip` that you want to forward DNS queries to. Default value is `53`
        /// </summary>
        public readonly int? Port;
        public readonly string? Protocol;

        [OutputConstructor]
        private ResolverRuleTargetIp(
            string ip,

            int? port,

            string? protocol)
        {
            Ip = ip;
            Port = port;
            Protocol = protocol;
        }
    }
}
