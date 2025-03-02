// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.WafV2.Outputs
{

    [OutputType]
    public sealed class WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJa3Fingerprint
    {
        /// <summary>
        /// Match status to assign to the web request if the request doesn't have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
        /// </summary>
        public readonly string FallbackBehavior;

        [OutputConstructor]
        private WebAclRuleStatementRateBasedStatementScopeDownStatementRegexPatternSetReferenceStatementFieldToMatchJa3Fingerprint(string fallbackBehavior)
        {
            FallbackBehavior = fallbackBehavior;
        }
    }
}
