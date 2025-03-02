# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetSubscribedRuleGroupResult',
    'AwaitableGetSubscribedRuleGroupResult',
    'get_subscribed_rule_group',
    'get_subscribed_rule_group_output',
]

@pulumi.output_type
class GetSubscribedRuleGroupResult:
    """
    A collection of values returned by getSubscribedRuleGroup.
    """
    def __init__(__self__, id=None, metric_name=None, name=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if metric_name and not isinstance(metric_name, str):
            raise TypeError("Expected argument 'metric_name' to be a str")
        pulumi.set(__self__, "metric_name", metric_name)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="metricName")
    def metric_name(self) -> Optional[str]:
        return pulumi.get(self, "metric_name")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        return pulumi.get(self, "name")


class AwaitableGetSubscribedRuleGroupResult(GetSubscribedRuleGroupResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSubscribedRuleGroupResult(
            id=self.id,
            metric_name=self.metric_name,
            name=self.name)


def get_subscribed_rule_group(metric_name: Optional[str] = None,
                              name: Optional[str] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSubscribedRuleGroupResult:
    """
    `waf_get_subscribed_rule_group` retrieves information about a Managed WAF Rule Group from AWS Marketplace (needs to be subscribed to first).

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    by_name = aws.waf.get_subscribed_rule_group(name="F5 Bot Detection Signatures For AWS WAF")
    by_metric_name = aws.waf.get_subscribed_rule_group(metric_name="F5BotDetectionSignatures")
    acl = aws.waf.WebAcl("acl", rules=[
        aws.waf.WebAclRuleArgs(
            priority=1,
            rule_id=by_name.id,
            type="GROUP",
        ),
        aws.waf.WebAclRuleArgs(
            priority=2,
            rule_id=by_metric_name.id,
            type="GROUP",
        ),
    ])
    ```
    <!--End PulumiCodeChooser -->


    :param str metric_name: Name of the WAF rule group.
    :param str name: Name of the WAF rule group.
    """
    __args__ = dict()
    __args__['metricName'] = metric_name
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:waf/getSubscribedRuleGroup:getSubscribedRuleGroup', __args__, opts=opts, typ=GetSubscribedRuleGroupResult).value

    return AwaitableGetSubscribedRuleGroupResult(
        id=pulumi.get(__ret__, 'id'),
        metric_name=pulumi.get(__ret__, 'metric_name'),
        name=pulumi.get(__ret__, 'name'))


@_utilities.lift_output_func(get_subscribed_rule_group)
def get_subscribed_rule_group_output(metric_name: Optional[pulumi.Input[Optional[str]]] = None,
                                     name: Optional[pulumi.Input[Optional[str]]] = None,
                                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSubscribedRuleGroupResult]:
    """
    `waf_get_subscribed_rule_group` retrieves information about a Managed WAF Rule Group from AWS Marketplace (needs to be subscribed to first).

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    by_name = aws.waf.get_subscribed_rule_group(name="F5 Bot Detection Signatures For AWS WAF")
    by_metric_name = aws.waf.get_subscribed_rule_group(metric_name="F5BotDetectionSignatures")
    acl = aws.waf.WebAcl("acl", rules=[
        aws.waf.WebAclRuleArgs(
            priority=1,
            rule_id=by_name.id,
            type="GROUP",
        ),
        aws.waf.WebAclRuleArgs(
            priority=2,
            rule_id=by_metric_name.id,
            type="GROUP",
        ),
    ])
    ```
    <!--End PulumiCodeChooser -->


    :param str metric_name: Name of the WAF rule group.
    :param str name: Name of the WAF rule group.
    """
    ...
