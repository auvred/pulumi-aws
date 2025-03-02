# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DataShareAuthorizationArgs', 'DataShareAuthorization']

@pulumi.input_type
class DataShareAuthorizationArgs:
    def __init__(__self__, *,
                 consumer_identifier: pulumi.Input[str],
                 data_share_arn: pulumi.Input[str],
                 allow_writes: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a DataShareAuthorization resource.
        :param pulumi.Input[str] consumer_identifier: Identifier of the data consumer that is authorized to access the datashare. This identifier is an AWS account ID or a keyword, such as `ADX`.
        :param pulumi.Input[str] data_share_arn: Amazon Resource Name (ARN) of the datashare that producers are to authorize sharing for.
               
               The following arguments are optional:
        :param pulumi.Input[bool] allow_writes: Whether to allow write operations for a datashare.
        """
        pulumi.set(__self__, "consumer_identifier", consumer_identifier)
        pulumi.set(__self__, "data_share_arn", data_share_arn)
        if allow_writes is not None:
            pulumi.set(__self__, "allow_writes", allow_writes)

    @property
    @pulumi.getter(name="consumerIdentifier")
    def consumer_identifier(self) -> pulumi.Input[str]:
        """
        Identifier of the data consumer that is authorized to access the datashare. This identifier is an AWS account ID or a keyword, such as `ADX`.
        """
        return pulumi.get(self, "consumer_identifier")

    @consumer_identifier.setter
    def consumer_identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "consumer_identifier", value)

    @property
    @pulumi.getter(name="dataShareArn")
    def data_share_arn(self) -> pulumi.Input[str]:
        """
        Amazon Resource Name (ARN) of the datashare that producers are to authorize sharing for.

        The following arguments are optional:
        """
        return pulumi.get(self, "data_share_arn")

    @data_share_arn.setter
    def data_share_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "data_share_arn", value)

    @property
    @pulumi.getter(name="allowWrites")
    def allow_writes(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to allow write operations for a datashare.
        """
        return pulumi.get(self, "allow_writes")

    @allow_writes.setter
    def allow_writes(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_writes", value)


@pulumi.input_type
class _DataShareAuthorizationState:
    def __init__(__self__, *,
                 allow_writes: Optional[pulumi.Input[bool]] = None,
                 consumer_identifier: Optional[pulumi.Input[str]] = None,
                 data_share_arn: Optional[pulumi.Input[str]] = None,
                 managed_by: Optional[pulumi.Input[str]] = None,
                 producer_arn: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DataShareAuthorization resources.
        :param pulumi.Input[bool] allow_writes: Whether to allow write operations for a datashare.
        :param pulumi.Input[str] consumer_identifier: Identifier of the data consumer that is authorized to access the datashare. This identifier is an AWS account ID or a keyword, such as `ADX`.
        :param pulumi.Input[str] data_share_arn: Amazon Resource Name (ARN) of the datashare that producers are to authorize sharing for.
               
               The following arguments are optional:
        :param pulumi.Input[str] managed_by: Identifier of a datashare to show its managing entity.
        :param pulumi.Input[str] producer_arn: Amazon Resource Name (ARN) of the producer.
        """
        if allow_writes is not None:
            pulumi.set(__self__, "allow_writes", allow_writes)
        if consumer_identifier is not None:
            pulumi.set(__self__, "consumer_identifier", consumer_identifier)
        if data_share_arn is not None:
            pulumi.set(__self__, "data_share_arn", data_share_arn)
        if managed_by is not None:
            pulumi.set(__self__, "managed_by", managed_by)
        if producer_arn is not None:
            pulumi.set(__self__, "producer_arn", producer_arn)

    @property
    @pulumi.getter(name="allowWrites")
    def allow_writes(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to allow write operations for a datashare.
        """
        return pulumi.get(self, "allow_writes")

    @allow_writes.setter
    def allow_writes(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_writes", value)

    @property
    @pulumi.getter(name="consumerIdentifier")
    def consumer_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the data consumer that is authorized to access the datashare. This identifier is an AWS account ID or a keyword, such as `ADX`.
        """
        return pulumi.get(self, "consumer_identifier")

    @consumer_identifier.setter
    def consumer_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "consumer_identifier", value)

    @property
    @pulumi.getter(name="dataShareArn")
    def data_share_arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the datashare that producers are to authorize sharing for.

        The following arguments are optional:
        """
        return pulumi.get(self, "data_share_arn")

    @data_share_arn.setter
    def data_share_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "data_share_arn", value)

    @property
    @pulumi.getter(name="managedBy")
    def managed_by(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of a datashare to show its managing entity.
        """
        return pulumi.get(self, "managed_by")

    @managed_by.setter
    def managed_by(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "managed_by", value)

    @property
    @pulumi.getter(name="producerArn")
    def producer_arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the producer.
        """
        return pulumi.get(self, "producer_arn")

    @producer_arn.setter
    def producer_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "producer_arn", value)


class DataShareAuthorization(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_writes: Optional[pulumi.Input[bool]] = None,
                 consumer_identifier: Optional[pulumi.Input[str]] = None,
                 data_share_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing an AWS Redshift Data Share Authorization.

        ## Example Usage

        ### Basic Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.redshift.DataShareAuthorization("example",
            consumer_identifier="012345678901",
            data_share_arn="arn:aws:redshift:us-west-2:012345678901:datashare:3072dae5-022b-4d45-9cd3-01f010aae4b2/example_share")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Redshift Data Share Authorization using the `id`. For example:

        ```sh
        $ pulumi import aws:redshift/dataShareAuthorization:DataShareAuthorization example arn:aws:redshift:us-west-2:012345678901:datashare:3072dae5-022b-4d45-9cd3-01f010aae4b2/example_share,012345678901
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_writes: Whether to allow write operations for a datashare.
        :param pulumi.Input[str] consumer_identifier: Identifier of the data consumer that is authorized to access the datashare. This identifier is an AWS account ID or a keyword, such as `ADX`.
        :param pulumi.Input[str] data_share_arn: Amazon Resource Name (ARN) of the datashare that producers are to authorize sharing for.
               
               The following arguments are optional:
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DataShareAuthorizationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS Redshift Data Share Authorization.

        ## Example Usage

        ### Basic Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.redshift.DataShareAuthorization("example",
            consumer_identifier="012345678901",
            data_share_arn="arn:aws:redshift:us-west-2:012345678901:datashare:3072dae5-022b-4d45-9cd3-01f010aae4b2/example_share")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Redshift Data Share Authorization using the `id`. For example:

        ```sh
        $ pulumi import aws:redshift/dataShareAuthorization:DataShareAuthorization example arn:aws:redshift:us-west-2:012345678901:datashare:3072dae5-022b-4d45-9cd3-01f010aae4b2/example_share,012345678901
        ```

        :param str resource_name: The name of the resource.
        :param DataShareAuthorizationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DataShareAuthorizationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_writes: Optional[pulumi.Input[bool]] = None,
                 consumer_identifier: Optional[pulumi.Input[str]] = None,
                 data_share_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DataShareAuthorizationArgs.__new__(DataShareAuthorizationArgs)

            __props__.__dict__["allow_writes"] = allow_writes
            if consumer_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'consumer_identifier'")
            __props__.__dict__["consumer_identifier"] = consumer_identifier
            if data_share_arn is None and not opts.urn:
                raise TypeError("Missing required property 'data_share_arn'")
            __props__.__dict__["data_share_arn"] = data_share_arn
            __props__.__dict__["managed_by"] = None
            __props__.__dict__["producer_arn"] = None
        super(DataShareAuthorization, __self__).__init__(
            'aws:redshift/dataShareAuthorization:DataShareAuthorization',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allow_writes: Optional[pulumi.Input[bool]] = None,
            consumer_identifier: Optional[pulumi.Input[str]] = None,
            data_share_arn: Optional[pulumi.Input[str]] = None,
            managed_by: Optional[pulumi.Input[str]] = None,
            producer_arn: Optional[pulumi.Input[str]] = None) -> 'DataShareAuthorization':
        """
        Get an existing DataShareAuthorization resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_writes: Whether to allow write operations for a datashare.
        :param pulumi.Input[str] consumer_identifier: Identifier of the data consumer that is authorized to access the datashare. This identifier is an AWS account ID or a keyword, such as `ADX`.
        :param pulumi.Input[str] data_share_arn: Amazon Resource Name (ARN) of the datashare that producers are to authorize sharing for.
               
               The following arguments are optional:
        :param pulumi.Input[str] managed_by: Identifier of a datashare to show its managing entity.
        :param pulumi.Input[str] producer_arn: Amazon Resource Name (ARN) of the producer.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DataShareAuthorizationState.__new__(_DataShareAuthorizationState)

        __props__.__dict__["allow_writes"] = allow_writes
        __props__.__dict__["consumer_identifier"] = consumer_identifier
        __props__.__dict__["data_share_arn"] = data_share_arn
        __props__.__dict__["managed_by"] = managed_by
        __props__.__dict__["producer_arn"] = producer_arn
        return DataShareAuthorization(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowWrites")
    def allow_writes(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to allow write operations for a datashare.
        """
        return pulumi.get(self, "allow_writes")

    @property
    @pulumi.getter(name="consumerIdentifier")
    def consumer_identifier(self) -> pulumi.Output[str]:
        """
        Identifier of the data consumer that is authorized to access the datashare. This identifier is an AWS account ID or a keyword, such as `ADX`.
        """
        return pulumi.get(self, "consumer_identifier")

    @property
    @pulumi.getter(name="dataShareArn")
    def data_share_arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the datashare that producers are to authorize sharing for.

        The following arguments are optional:
        """
        return pulumi.get(self, "data_share_arn")

    @property
    @pulumi.getter(name="managedBy")
    def managed_by(self) -> pulumi.Output[str]:
        """
        Identifier of a datashare to show its managing entity.
        """
        return pulumi.get(self, "managed_by")

    @property
    @pulumi.getter(name="producerArn")
    def producer_arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the producer.
        """
        return pulumi.get(self, "producer_arn")

