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

__all__ = [
    'GetClusterResult',
    'AwaitableGetClusterResult',
    'get_cluster',
    'get_cluster_output',
]

@pulumi.output_type
class GetClusterResult:
    """
    A collection of values returned by getCluster.
    """
    def __init__(__self__, cluster_certificates=None, cluster_id=None, cluster_state=None, id=None, security_group_id=None, subnet_ids=None, vpc_id=None):
        if cluster_certificates and not isinstance(cluster_certificates, list):
            raise TypeError("Expected argument 'cluster_certificates' to be a list")
        pulumi.set(__self__, "cluster_certificates", cluster_certificates)
        if cluster_id and not isinstance(cluster_id, str):
            raise TypeError("Expected argument 'cluster_id' to be a str")
        pulumi.set(__self__, "cluster_id", cluster_id)
        if cluster_state and not isinstance(cluster_state, str):
            raise TypeError("Expected argument 'cluster_state' to be a str")
        pulumi.set(__self__, "cluster_state", cluster_state)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if security_group_id and not isinstance(security_group_id, str):
            raise TypeError("Expected argument 'security_group_id' to be a str")
        pulumi.set(__self__, "security_group_id", security_group_id)
        if subnet_ids and not isinstance(subnet_ids, list):
            raise TypeError("Expected argument 'subnet_ids' to be a list")
        pulumi.set(__self__, "subnet_ids", subnet_ids)
        if vpc_id and not isinstance(vpc_id, str):
            raise TypeError("Expected argument 'vpc_id' to be a str")
        pulumi.set(__self__, "vpc_id", vpc_id)

    @property
    @pulumi.getter(name="clusterCertificates")
    def cluster_certificates(self) -> Sequence['outputs.GetClusterClusterCertificateResult']:
        """
        The list of cluster certificates.
        * `cluster_certificates.0.cluster_certificate` - The cluster certificate issued (signed) by the issuing certificate authority (CA) of the cluster's owner.
        * `cluster_certificates.0.cluster_csr` - The certificate signing request (CSR). Available only in UNINITIALIZED state.
        * `cluster_certificates.0.aws_hardware_certificate` - The HSM hardware certificate issued (signed) by AWS CloudHSM.
        * `cluster_certificates.0.hsm_certificate` - The HSM certificate issued (signed) by the HSM hardware.
        * `cluster_certificates.0.manufacturer_hardware_certificate` - The HSM hardware certificate issued (signed) by the hardware manufacturer.
        The number of available cluster certificates may vary depending on state of the cluster.
        """
        return pulumi.get(self, "cluster_certificates")

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> str:
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="clusterState")
    def cluster_state(self) -> str:
        return pulumi.get(self, "cluster_state")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="securityGroupId")
    def security_group_id(self) -> str:
        """
        ID of the security group associated with the CloudHSM cluster.
        """
        return pulumi.get(self, "security_group_id")

    @property
    @pulumi.getter(name="subnetIds")
    def subnet_ids(self) -> Sequence[str]:
        """
        IDs of subnets in which cluster operates.
        """
        return pulumi.get(self, "subnet_ids")

    @property
    @pulumi.getter(name="vpcId")
    def vpc_id(self) -> str:
        """
        ID of the VPC that the CloudHSM cluster resides in.
        """
        return pulumi.get(self, "vpc_id")


class AwaitableGetClusterResult(GetClusterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClusterResult(
            cluster_certificates=self.cluster_certificates,
            cluster_id=self.cluster_id,
            cluster_state=self.cluster_state,
            id=self.id,
            security_group_id=self.security_group_id,
            subnet_ids=self.subnet_ids,
            vpc_id=self.vpc_id)


def get_cluster(cluster_id: Optional[str] = None,
                cluster_state: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClusterResult:
    """
    Use this data source to get information about a CloudHSM v2 cluster

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    cluster = aws.cloudhsmv2.get_cluster(cluster_id="cluster-testclusterid")
    ```
    <!--End PulumiCodeChooser -->


    :param str cluster_id: ID of Cloud HSM v2 cluster.
    :param str cluster_state: State of the cluster to be found.
    """
    __args__ = dict()
    __args__['clusterId'] = cluster_id
    __args__['clusterState'] = cluster_state
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('aws:cloudhsmv2/getCluster:getCluster', __args__, opts=opts, typ=GetClusterResult).value

    return AwaitableGetClusterResult(
        cluster_certificates=pulumi.get(__ret__, 'cluster_certificates'),
        cluster_id=pulumi.get(__ret__, 'cluster_id'),
        cluster_state=pulumi.get(__ret__, 'cluster_state'),
        id=pulumi.get(__ret__, 'id'),
        security_group_id=pulumi.get(__ret__, 'security_group_id'),
        subnet_ids=pulumi.get(__ret__, 'subnet_ids'),
        vpc_id=pulumi.get(__ret__, 'vpc_id'))


@_utilities.lift_output_func(get_cluster)
def get_cluster_output(cluster_id: Optional[pulumi.Input[str]] = None,
                       cluster_state: Optional[pulumi.Input[Optional[str]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetClusterResult]:
    """
    Use this data source to get information about a CloudHSM v2 cluster

    ## Example Usage

    <!--Start PulumiCodeChooser -->
    ```python
    import pulumi
    import pulumi_aws as aws

    cluster = aws.cloudhsmv2.get_cluster(cluster_id="cluster-testclusterid")
    ```
    <!--End PulumiCodeChooser -->


    :param str cluster_id: ID of Cloud HSM v2 cluster.
    :param str cluster_state: State of the cluster to be found.
    """
    ...
