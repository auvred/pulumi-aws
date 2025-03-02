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
    'GetPeeringAttachmentResult',
    'AwaitableGetPeeringAttachmentResult',
    'get_peering_attachment',
    'get_peering_attachment_output',
]

@pulumi.output_type
class GetPeeringAttachmentResult:
    """
    A collection of values returned by getPeeringAttachment.
    """
    def __init__(__self__, filters=None, id=None, peer_account_id=None, peer_region=None, peer_transit_gateway_id=None, tags=None, transit_gateway_id=None):
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if peer_account_id and not isinstance(peer_account_id, str):
            raise TypeError("Expected argument 'peer_account_id' to be a str")
        pulumi.set(__self__, "peer_account_id", peer_account_id)
        if peer_region and not isinstance(peer_region, str):
            raise TypeError("Expected argument 'peer_region' to be a str")
        pulumi.set(__self__, "peer_region", peer_region)
        if peer_transit_gateway_id and not isinstance(peer_transit_gateway_id, str):
            raise TypeError("Expected argument 'peer_transit_gateway_id' to be a str")
        pulumi.set(__self__, "peer_transit_gateway_id", peer_transit_gateway_id)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if transit_gateway_id and not isinstance(transit_gateway_id, str):
            raise TypeError("Expected argument 'transit_gateway_id' to be a str")
        pulumi.set(__self__, "transit_gateway_id", transit_gateway_id)

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetPeeringAttachmentFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="peerAccountId")
    def peer_account_id(self) -> str:
        """
        Identifier of the peer AWS account
        """
        return pulumi.get(self, "peer_account_id")

    @property
    @pulumi.getter(name="peerRegion")
    def peer_region(self) -> str:
        """
        Identifier of the peer AWS region
        """
        return pulumi.get(self, "peer_region")

    @property
    @pulumi.getter(name="peerTransitGatewayId")
    def peer_transit_gateway_id(self) -> str:
        """
        Identifier of the peer EC2 Transit Gateway
        """
        return pulumi.get(self, "peer_transit_gateway_id")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="transitGatewayId")
    def transit_gateway_id(self) -> str:
        """
        Identifier of the local EC2 Transit Gateway
        """
        return pulumi.get(self, "transit_gateway_id")


class AwaitableGetPeeringAttachmentResult(GetPeeringAttachmentResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetPeeringAttachmentResult(
            filters=self.filters,
            id=self.id,
            peer_account_id=self.peer_account_id,
            peer_region=self.peer_region,
            peer_transit_gateway_id=self.peer_transit_gateway_id,
            tags=self.tags,
            transit_gateway_id=self.transit_gateway_id)


def get_peering_attachment(filters: Optional[Sequence[pulumi.InputType['GetPeeringAttachmentFilterArgs']]] = None,
                           id: Optional[str] = None,
                           tags: Optional[Mapping[str, str]] = None,
                           opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetPeeringAttachmentResult:
    """
    Get information on an EC2 Transit Gateway Peering Attachment.

    ## Example Usage

    ### By Filter

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ec2transitgateway.get_peering_attachment(filters=[aws.ec2transitgateway.GetPeeringAttachmentFilterArgs(
        name="transit-gateway-attachment-id",
        values=["tgw-attach-12345678"],
    )])
    ```
    <!--End PulumiCodeChooser -->

    ### By Identifier

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    attachment = aws.ec2transitgateway.get_peering_attachment(id="tgw-attach-12345678")
    ```
    <!--End PulumiCodeChooser -->


    :param Sequence[pulumi.InputType['GetPeeringAttachmentFilterArgs']] filters: One or more configuration blocks containing name-values filters. Detailed below.
    :param str id: Identifier of the EC2 Transit Gateway Peering Attachment.
    :param Mapping[str, str] tags: Mapping of tags, each pair of which must exactly match
           a pair on the specific EC2 Transit Gateway Peering Attachment to retrieve.
           
           More complex filters can be expressed using one or more `filter` sub-blocks,
           which take the following arguments:
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['id'] = id
    __args__['tags'] = tags
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:ec2transitgateway/getPeeringAttachment:getPeeringAttachment', __args__, opts=opts, typ=GetPeeringAttachmentResult).value

    return AwaitableGetPeeringAttachmentResult(
        filters=pulumi.get(__ret__, 'filters'),
        id=pulumi.get(__ret__, 'id'),
        peer_account_id=pulumi.get(__ret__, 'peer_account_id'),
        peer_region=pulumi.get(__ret__, 'peer_region'),
        peer_transit_gateway_id=pulumi.get(__ret__, 'peer_transit_gateway_id'),
        tags=pulumi.get(__ret__, 'tags'),
        transit_gateway_id=pulumi.get(__ret__, 'transit_gateway_id'))


@_utilities.lift_output_func(get_peering_attachment)
def get_peering_attachment_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetPeeringAttachmentFilterArgs']]]]] = None,
                                  id: Optional[pulumi.Input[Optional[str]]] = None,
                                  tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                                  opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetPeeringAttachmentResult]:
    """
    Get information on an EC2 Transit Gateway Peering Attachment.

    ## Example Usage

    ### By Filter

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ec2transitgateway.get_peering_attachment(filters=[aws.ec2transitgateway.GetPeeringAttachmentFilterArgs(
        name="transit-gateway-attachment-id",
        values=["tgw-attach-12345678"],
    )])
    ```
    <!--End PulumiCodeChooser -->

    ### By Identifier

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    attachment = aws.ec2transitgateway.get_peering_attachment(id="tgw-attach-12345678")
    ```
    <!--End PulumiCodeChooser -->


    :param Sequence[pulumi.InputType['GetPeeringAttachmentFilterArgs']] filters: One or more configuration blocks containing name-values filters. Detailed below.
    :param str id: Identifier of the EC2 Transit Gateway Peering Attachment.
    :param Mapping[str, str] tags: Mapping of tags, each pair of which must exactly match
           a pair on the specific EC2 Transit Gateway Peering Attachment to retrieve.
           
           More complex filters can be expressed using one or more `filter` sub-blocks,
           which take the following arguments:
    """
    ...
