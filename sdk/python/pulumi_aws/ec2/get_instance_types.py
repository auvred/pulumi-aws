# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetInstanceTypesResult',
    'AwaitableGetInstanceTypesResult',
    'get_instance_types',
    'get_instance_types_output',
]

@pulumi.output_type
class GetInstanceTypesResult:
    """
    A collection of values returned by getInstanceTypes.
    """
    def __init__(__self__, filters=None, id=None, instance_types=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if instance_types and not isinstance(instance_types, list):
            raise TypeError("Expected argument 'instance_types' to be a list")
        pulumi.set(__self__, "instance_types", instance_types)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetInstanceTypesFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="instanceTypes")
    def instance_types(self) -> Sequence[str]:
        """
        List of EC2 Instance Types.
        """
        return pulumi.get(self, "instance_types")


class AwaitableGetInstanceTypesResult(GetInstanceTypesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstanceTypesResult(
            filters=self.filters,
            id=self.id,
            instance_types=self.instance_types)


def get_instance_types(filters: Optional[Sequence[pulumi.InputType['GetInstanceTypesFilterArgs']]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstanceTypesResult:
    """
    Information about EC2 Instance Types.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.ec2.get_instance_types(filters=[
        aws.ec2.GetInstanceTypesFilterArgs(
            name="auto-recovery-supported",
            values=["true"],
        ),
        aws.ec2.GetInstanceTypesFilterArgs(
            name="network-info.encryption-in-transit-supported",
            values=["true"],
        ),
        aws.ec2.GetInstanceTypesFilterArgs(
            name="instance-storage-supported",
            values=["true"],
        ),
        aws.ec2.GetInstanceTypesFilterArgs(
            name="instance-type",
            values=[
                "g5.2xlarge",
                "g5.4xlarge",
            ],
        ),
    ])
    ```
    <!--End PulumiCodeChooser -->


    :param Sequence[pulumi.InputType['GetInstanceTypesFilterArgs']] filters: One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypes.html) for supported filters. Detailed below.
    """
    __args__ = dict()
    __args__['filters'] = filters
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:ec2/getInstanceTypes:getInstanceTypes', __args__, opts=opts, typ=GetInstanceTypesResult).value

    return AwaitableGetInstanceTypesResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        instance_types=pulumi.get(__ret__, 'instance_types'))


@_utilities.lift_output_func(get_instance_types)
def get_instance_types_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetInstanceTypesFilterArgs']]]]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetInstanceTypesResult]:
    """
    Information about EC2 Instance Types.

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.ec2.get_instance_types(filters=[
        aws.ec2.GetInstanceTypesFilterArgs(
            name="auto-recovery-supported",
            values=["true"],
        ),
        aws.ec2.GetInstanceTypesFilterArgs(
            name="network-info.encryption-in-transit-supported",
            values=["true"],
        ),
        aws.ec2.GetInstanceTypesFilterArgs(
            name="instance-storage-supported",
            values=["true"],
        ),
        aws.ec2.GetInstanceTypesFilterArgs(
            name="instance-type",
            values=[
                "g5.2xlarge",
                "g5.4xlarge",
            ],
        ),
    ])
    ```
    <!--End PulumiCodeChooser -->


    :param Sequence[pulumi.InputType['GetInstanceTypesFilterArgs']] filters: One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypes.html) for supported filters. Detailed below.
    """
    ...
