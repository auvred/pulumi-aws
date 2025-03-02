# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ClusterActivityStreamArgs', 'ClusterActivityStream']

@pulumi.input_type
class ClusterActivityStreamArgs:
    def __init__(__self__, *,
                 kms_key_id: pulumi.Input[str],
                 mode: pulumi.Input[str],
                 resource_arn: pulumi.Input[str],
                 engine_native_audit_fields_included: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a ClusterActivityStream resource.
        :param pulumi.Input[str] kms_key_id: The AWS KMS key identifier for encrypting messages in the database activity stream. The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
        :param pulumi.Input[str] mode: Specifies the mode of the database activity stream. Database events such as a change or access generate an activity stream event. The database session can handle these events either synchronously or asynchronously. One of: `sync`, `async`.
        :param pulumi.Input[str] resource_arn: The Amazon Resource Name (ARN) of the DB cluster.
        :param pulumi.Input[bool] engine_native_audit_fields_included: Specifies whether the database activity stream includes engine-native audit fields. This option only applies to an Oracle DB instance. By default, no engine-native audit fields are included. Defaults `false`.
        """
        pulumi.set(__self__, "kms_key_id", kms_key_id)
        pulumi.set(__self__, "mode", mode)
        pulumi.set(__self__, "resource_arn", resource_arn)
        if engine_native_audit_fields_included is not None:
            pulumi.set(__self__, "engine_native_audit_fields_included", engine_native_audit_fields_included)

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> pulumi.Input[str]:
        """
        The AWS KMS key identifier for encrypting messages in the database activity stream. The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
        """
        return pulumi.get(self, "kms_key_id")

    @kms_key_id.setter
    def kms_key_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "kms_key_id", value)

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Input[str]:
        """
        Specifies the mode of the database activity stream. Database events such as a change or access generate an activity stream event. The database session can handle these events either synchronously or asynchronously. One of: `sync`, `async`.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: pulumi.Input[str]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> pulumi.Input[str]:
        """
        The Amazon Resource Name (ARN) of the DB cluster.
        """
        return pulumi.get(self, "resource_arn")

    @resource_arn.setter
    def resource_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "resource_arn", value)

    @property
    @pulumi.getter(name="engineNativeAuditFieldsIncluded")
    def engine_native_audit_fields_included(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the database activity stream includes engine-native audit fields. This option only applies to an Oracle DB instance. By default, no engine-native audit fields are included. Defaults `false`.
        """
        return pulumi.get(self, "engine_native_audit_fields_included")

    @engine_native_audit_fields_included.setter
    def engine_native_audit_fields_included(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "engine_native_audit_fields_included", value)


@pulumi.input_type
class _ClusterActivityStreamState:
    def __init__(__self__, *,
                 engine_native_audit_fields_included: Optional[pulumi.Input[bool]] = None,
                 kinesis_stream_name: Optional[pulumi.Input[str]] = None,
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 resource_arn: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ClusterActivityStream resources.
        :param pulumi.Input[bool] engine_native_audit_fields_included: Specifies whether the database activity stream includes engine-native audit fields. This option only applies to an Oracle DB instance. By default, no engine-native audit fields are included. Defaults `false`.
        :param pulumi.Input[str] kinesis_stream_name: The name of the Amazon Kinesis data stream to be used for the database activity stream.
        :param pulumi.Input[str] kms_key_id: The AWS KMS key identifier for encrypting messages in the database activity stream. The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
        :param pulumi.Input[str] mode: Specifies the mode of the database activity stream. Database events such as a change or access generate an activity stream event. The database session can handle these events either synchronously or asynchronously. One of: `sync`, `async`.
        :param pulumi.Input[str] resource_arn: The Amazon Resource Name (ARN) of the DB cluster.
        """
        if engine_native_audit_fields_included is not None:
            pulumi.set(__self__, "engine_native_audit_fields_included", engine_native_audit_fields_included)
        if kinesis_stream_name is not None:
            pulumi.set(__self__, "kinesis_stream_name", kinesis_stream_name)
        if kms_key_id is not None:
            pulumi.set(__self__, "kms_key_id", kms_key_id)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if resource_arn is not None:
            pulumi.set(__self__, "resource_arn", resource_arn)

    @property
    @pulumi.getter(name="engineNativeAuditFieldsIncluded")
    def engine_native_audit_fields_included(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether the database activity stream includes engine-native audit fields. This option only applies to an Oracle DB instance. By default, no engine-native audit fields are included. Defaults `false`.
        """
        return pulumi.get(self, "engine_native_audit_fields_included")

    @engine_native_audit_fields_included.setter
    def engine_native_audit_fields_included(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "engine_native_audit_fields_included", value)

    @property
    @pulumi.getter(name="kinesisStreamName")
    def kinesis_stream_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Amazon Kinesis data stream to be used for the database activity stream.
        """
        return pulumi.get(self, "kinesis_stream_name")

    @kinesis_stream_name.setter
    def kinesis_stream_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kinesis_stream_name", value)

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS KMS key identifier for encrypting messages in the database activity stream. The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
        """
        return pulumi.get(self, "kms_key_id")

    @kms_key_id.setter
    def kms_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kms_key_id", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the mode of the database activity stream. Database events such as a change or access generate an activity stream event. The database session can handle these events either synchronously or asynchronously. One of: `sync`, `async`.
        """
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the DB cluster.
        """
        return pulumi.get(self, "resource_arn")

    @resource_arn.setter
    def resource_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "resource_arn", value)


class ClusterActivityStream(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 engine_native_audit_fields_included: Optional[pulumi.Input[bool]] = None,
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 resource_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages RDS Aurora Cluster Database Activity Streams.

        Database Activity Streams have some limits and requirements, refer to the [Monitoring Amazon Aurora using Database Activity Streams](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/DBActivityStreams.html) documentation for detailed limitations and requirements.

        > **Note:** This resource always calls the RDS [`StartActivityStream`][2] API with the `ApplyImmediately` parameter set to `true`. This is because the provider needs the activity stream to be started in order for it to get the associated attributes.

        > **Note:** This resource depends on having at least one `rds.ClusterInstance` created. To avoid race conditions when all resources are being created together, add an explicit resource reference using the resource `depends_on` meta-argument.

        > **Note:** This resource is available in all regions except the following: `cn-north-1`, `cn-northwest-1`, `us-gov-east-1`, `us-gov-west-1`

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        default = aws.rds.Cluster("default",
            cluster_identifier="aurora-cluster-demo",
            availability_zones=[
                "us-west-2a",
                "us-west-2b",
                "us-west-2c",
            ],
            database_name="mydb",
            master_username="foo",
            master_password="mustbeeightcharaters",
            engine="aurora-postgresql",
            engine_version="13.4")
        default_cluster_instance = aws.rds.ClusterInstance("default",
            identifier="aurora-instance-demo",
            cluster_identifier=default.cluster_identifier,
            engine=default.engine,
            instance_class="db.r6g.large")
        default_key = aws.kms.Key("default", description="AWS KMS Key to encrypt Database Activity Stream")
        default_cluster_activity_stream = aws.rds.ClusterActivityStream("default",
            resource_arn=default.arn,
            mode="async",
            kms_key_id=default_key.key_id)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import RDS Aurora Cluster Database Activity Streams using the `resource_arn`. For example:

        ```sh
        $ pulumi import aws:rds/clusterActivityStream:ClusterActivityStream default arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster-demo
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] engine_native_audit_fields_included: Specifies whether the database activity stream includes engine-native audit fields. This option only applies to an Oracle DB instance. By default, no engine-native audit fields are included. Defaults `false`.
        :param pulumi.Input[str] kms_key_id: The AWS KMS key identifier for encrypting messages in the database activity stream. The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
        :param pulumi.Input[str] mode: Specifies the mode of the database activity stream. Database events such as a change or access generate an activity stream event. The database session can handle these events either synchronously or asynchronously. One of: `sync`, `async`.
        :param pulumi.Input[str] resource_arn: The Amazon Resource Name (ARN) of the DB cluster.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ClusterActivityStreamArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages RDS Aurora Cluster Database Activity Streams.

        Database Activity Streams have some limits and requirements, refer to the [Monitoring Amazon Aurora using Database Activity Streams](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/DBActivityStreams.html) documentation for detailed limitations and requirements.

        > **Note:** This resource always calls the RDS [`StartActivityStream`][2] API with the `ApplyImmediately` parameter set to `true`. This is because the provider needs the activity stream to be started in order for it to get the associated attributes.

        > **Note:** This resource depends on having at least one `rds.ClusterInstance` created. To avoid race conditions when all resources are being created together, add an explicit resource reference using the resource `depends_on` meta-argument.

        > **Note:** This resource is available in all regions except the following: `cn-north-1`, `cn-northwest-1`, `us-gov-east-1`, `us-gov-west-1`

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        default = aws.rds.Cluster("default",
            cluster_identifier="aurora-cluster-demo",
            availability_zones=[
                "us-west-2a",
                "us-west-2b",
                "us-west-2c",
            ],
            database_name="mydb",
            master_username="foo",
            master_password="mustbeeightcharaters",
            engine="aurora-postgresql",
            engine_version="13.4")
        default_cluster_instance = aws.rds.ClusterInstance("default",
            identifier="aurora-instance-demo",
            cluster_identifier=default.cluster_identifier,
            engine=default.engine,
            instance_class="db.r6g.large")
        default_key = aws.kms.Key("default", description="AWS KMS Key to encrypt Database Activity Stream")
        default_cluster_activity_stream = aws.rds.ClusterActivityStream("default",
            resource_arn=default.arn,
            mode="async",
            kms_key_id=default_key.key_id)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import RDS Aurora Cluster Database Activity Streams using the `resource_arn`. For example:

        ```sh
        $ pulumi import aws:rds/clusterActivityStream:ClusterActivityStream default arn:aws:rds:us-west-2:123456789012:cluster:aurora-cluster-demo
        ```

        :param str resource_name: The name of the resource.
        :param ClusterActivityStreamArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClusterActivityStreamArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 engine_native_audit_fields_included: Optional[pulumi.Input[bool]] = None,
                 kms_key_id: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 resource_arn: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ClusterActivityStreamArgs.__new__(ClusterActivityStreamArgs)

            __props__.__dict__["engine_native_audit_fields_included"] = engine_native_audit_fields_included
            if kms_key_id is None and not opts.urn:
                raise TypeError("Missing required property 'kms_key_id'")
            __props__.__dict__["kms_key_id"] = kms_key_id
            if mode is None and not opts.urn:
                raise TypeError("Missing required property 'mode'")
            __props__.__dict__["mode"] = mode
            if resource_arn is None and not opts.urn:
                raise TypeError("Missing required property 'resource_arn'")
            __props__.__dict__["resource_arn"] = resource_arn
            __props__.__dict__["kinesis_stream_name"] = None
        super(ClusterActivityStream, __self__).__init__(
            'aws:rds/clusterActivityStream:ClusterActivityStream',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            engine_native_audit_fields_included: Optional[pulumi.Input[bool]] = None,
            kinesis_stream_name: Optional[pulumi.Input[str]] = None,
            kms_key_id: Optional[pulumi.Input[str]] = None,
            mode: Optional[pulumi.Input[str]] = None,
            resource_arn: Optional[pulumi.Input[str]] = None) -> 'ClusterActivityStream':
        """
        Get an existing ClusterActivityStream resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] engine_native_audit_fields_included: Specifies whether the database activity stream includes engine-native audit fields. This option only applies to an Oracle DB instance. By default, no engine-native audit fields are included. Defaults `false`.
        :param pulumi.Input[str] kinesis_stream_name: The name of the Amazon Kinesis data stream to be used for the database activity stream.
        :param pulumi.Input[str] kms_key_id: The AWS KMS key identifier for encrypting messages in the database activity stream. The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
        :param pulumi.Input[str] mode: Specifies the mode of the database activity stream. Database events such as a change or access generate an activity stream event. The database session can handle these events either synchronously or asynchronously. One of: `sync`, `async`.
        :param pulumi.Input[str] resource_arn: The Amazon Resource Name (ARN) of the DB cluster.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ClusterActivityStreamState.__new__(_ClusterActivityStreamState)

        __props__.__dict__["engine_native_audit_fields_included"] = engine_native_audit_fields_included
        __props__.__dict__["kinesis_stream_name"] = kinesis_stream_name
        __props__.__dict__["kms_key_id"] = kms_key_id
        __props__.__dict__["mode"] = mode
        __props__.__dict__["resource_arn"] = resource_arn
        return ClusterActivityStream(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="engineNativeAuditFieldsIncluded")
    def engine_native_audit_fields_included(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether the database activity stream includes engine-native audit fields. This option only applies to an Oracle DB instance. By default, no engine-native audit fields are included. Defaults `false`.
        """
        return pulumi.get(self, "engine_native_audit_fields_included")

    @property
    @pulumi.getter(name="kinesisStreamName")
    def kinesis_stream_name(self) -> pulumi.Output[str]:
        """
        The name of the Amazon Kinesis data stream to be used for the database activity stream.
        """
        return pulumi.get(self, "kinesis_stream_name")

    @property
    @pulumi.getter(name="kmsKeyId")
    def kms_key_id(self) -> pulumi.Output[str]:
        """
        The AWS KMS key identifier for encrypting messages in the database activity stream. The AWS KMS key identifier is the key ARN, key ID, alias ARN, or alias name for the KMS key.
        """
        return pulumi.get(self, "kms_key_id")

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Output[str]:
        """
        Specifies the mode of the database activity stream. Database events such as a change or access generate an activity stream event. The database session can handle these events either synchronously or asynchronously. One of: `sync`, `async`.
        """
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter(name="resourceArn")
    def resource_arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the DB cluster.
        """
        return pulumi.get(self, "resource_arn")

