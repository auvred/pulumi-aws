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
    'GetIpsetResult',
    'AwaitableGetIpsetResult',
    'get_ipset',
    'get_ipset_output',
]

@pulumi.output_type
class GetIpsetResult:
    """
    A collection of values returned by getIpset.
    """
    def __init__(__self__, id=None, name=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
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
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")


class AwaitableGetIpsetResult(GetIpsetResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetIpsetResult(
            id=self.id,
            name=self.name)


def get_ipset(name: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetIpsetResult:
    """
    `waf.IpSet` Retrieves a WAF IP Set Resource Id.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.waf.get_ipset(name="tfWAFIPSet")
    ```
    <!--End PulumiCodeChooser -->


    :param str name: Name of the WAF IP set.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:waf/getIpset:getIpset', __args__, opts=opts, typ=GetIpsetResult).value

    return AwaitableGetIpsetResult(
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'))


@_utilities.lift_output_func(get_ipset)
def get_ipset_output(name: Optional[pulumi.Input[str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetIpsetResult]:
    """
    `waf.IpSet` Retrieves a WAF IP Set Resource Id.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.waf.get_ipset(name="tfWAFIPSet")
    ```
    <!--End PulumiCodeChooser -->


    :param str name: Name of the WAF IP set.
    """
    ...
