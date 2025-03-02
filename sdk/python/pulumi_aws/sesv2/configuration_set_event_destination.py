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

__all__ = ['ConfigurationSetEventDestinationArgs', 'ConfigurationSetEventDestination']

@pulumi.input_type
class ConfigurationSetEventDestinationArgs:
    def __init__(__self__, *,
                 configuration_set_name: pulumi.Input[str],
                 event_destination: pulumi.Input['ConfigurationSetEventDestinationEventDestinationArgs'],
                 event_destination_name: pulumi.Input[str]):
        """
        The set of arguments for constructing a ConfigurationSetEventDestination resource.
        :param pulumi.Input[str] configuration_set_name: The name of the configuration set.
        :param pulumi.Input['ConfigurationSetEventDestinationEventDestinationArgs'] event_destination: A name that identifies the event destination within the configuration set.
        :param pulumi.Input[str] event_destination_name: An object that defines the event destination. See event_destination below.
        """
        pulumi.set(__self__, "configuration_set_name", configuration_set_name)
        pulumi.set(__self__, "event_destination", event_destination)
        pulumi.set(__self__, "event_destination_name", event_destination_name)

    @property
    @pulumi.getter(name="configurationSetName")
    def configuration_set_name(self) -> pulumi.Input[str]:
        """
        The name of the configuration set.
        """
        return pulumi.get(self, "configuration_set_name")

    @configuration_set_name.setter
    def configuration_set_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "configuration_set_name", value)

    @property
    @pulumi.getter(name="eventDestination")
    def event_destination(self) -> pulumi.Input['ConfigurationSetEventDestinationEventDestinationArgs']:
        """
        A name that identifies the event destination within the configuration set.
        """
        return pulumi.get(self, "event_destination")

    @event_destination.setter
    def event_destination(self, value: pulumi.Input['ConfigurationSetEventDestinationEventDestinationArgs']):
        pulumi.set(self, "event_destination", value)

    @property
    @pulumi.getter(name="eventDestinationName")
    def event_destination_name(self) -> pulumi.Input[str]:
        """
        An object that defines the event destination. See event_destination below.
        """
        return pulumi.get(self, "event_destination_name")

    @event_destination_name.setter
    def event_destination_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "event_destination_name", value)


@pulumi.input_type
class _ConfigurationSetEventDestinationState:
    def __init__(__self__, *,
                 configuration_set_name: Optional[pulumi.Input[str]] = None,
                 event_destination: Optional[pulumi.Input['ConfigurationSetEventDestinationEventDestinationArgs']] = None,
                 event_destination_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ConfigurationSetEventDestination resources.
        :param pulumi.Input[str] configuration_set_name: The name of the configuration set.
        :param pulumi.Input['ConfigurationSetEventDestinationEventDestinationArgs'] event_destination: A name that identifies the event destination within the configuration set.
        :param pulumi.Input[str] event_destination_name: An object that defines the event destination. See event_destination below.
        """
        if configuration_set_name is not None:
            pulumi.set(__self__, "configuration_set_name", configuration_set_name)
        if event_destination is not None:
            pulumi.set(__self__, "event_destination", event_destination)
        if event_destination_name is not None:
            pulumi.set(__self__, "event_destination_name", event_destination_name)

    @property
    @pulumi.getter(name="configurationSetName")
    def configuration_set_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the configuration set.
        """
        return pulumi.get(self, "configuration_set_name")

    @configuration_set_name.setter
    def configuration_set_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "configuration_set_name", value)

    @property
    @pulumi.getter(name="eventDestination")
    def event_destination(self) -> Optional[pulumi.Input['ConfigurationSetEventDestinationEventDestinationArgs']]:
        """
        A name that identifies the event destination within the configuration set.
        """
        return pulumi.get(self, "event_destination")

    @event_destination.setter
    def event_destination(self, value: Optional[pulumi.Input['ConfigurationSetEventDestinationEventDestinationArgs']]):
        pulumi.set(self, "event_destination", value)

    @property
    @pulumi.getter(name="eventDestinationName")
    def event_destination_name(self) -> Optional[pulumi.Input[str]]:
        """
        An object that defines the event destination. See event_destination below.
        """
        return pulumi.get(self, "event_destination_name")

    @event_destination_name.setter
    def event_destination_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "event_destination_name", value)


class ConfigurationSetEventDestination(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configuration_set_name: Optional[pulumi.Input[str]] = None,
                 event_destination: Optional[pulumi.Input[pulumi.InputType['ConfigurationSetEventDestinationEventDestinationArgs']]] = None,
                 event_destination_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for managing an AWS SESv2 (Simple Email V2) Configuration Set Event Destination.

        ## Example Usage

        ### Cloud Watch Destination

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.sesv2.ConfigurationSet("example", configuration_set_name="example")
        example_configuration_set_event_destination = aws.sesv2.ConfigurationSetEventDestination("example",
            configuration_set_name=example.configuration_set_name,
            event_destination_name="example",
            event_destination=aws.sesv2.ConfigurationSetEventDestinationEventDestinationArgs(
                cloud_watch_destination=aws.sesv2.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs(
                    dimension_configurations=[aws.sesv2.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfigurationArgs(
                        default_dimension_value="example",
                        dimension_name="example",
                        dimension_value_source="MESSAGE_TAG",
                    )],
                ),
                enabled=True,
                matching_event_types=["SEND"],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ### Kinesis Firehose Destination

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.sesv2.ConfigurationSet("example", configuration_set_name="example")
        example_configuration_set_event_destination = aws.sesv2.ConfigurationSetEventDestination("example",
            configuration_set_name=example.configuration_set_name,
            event_destination_name="example",
            event_destination=aws.sesv2.ConfigurationSetEventDestinationEventDestinationArgs(
                kinesis_firehose_destination=aws.sesv2.ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs(
                    delivery_stream_arn=example_aws_kinesis_firehose_delivery_stream["arn"],
                    iam_role_arn=example_aws_iam_role["arn"],
                ),
                enabled=True,
                matching_event_types=["SEND"],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ### Pinpoint Destination

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.sesv2.ConfigurationSet("example", configuration_set_name="example")
        example_configuration_set_event_destination = aws.sesv2.ConfigurationSetEventDestination("example",
            configuration_set_name=example.configuration_set_name,
            event_destination_name="example",
            event_destination=aws.sesv2.ConfigurationSetEventDestinationEventDestinationArgs(
                pinpoint_destination=aws.sesv2.ConfigurationSetEventDestinationEventDestinationPinpointDestinationArgs(
                    application_arn=example_aws_pinpoint_app["arn"],
                ),
                enabled=True,
                matching_event_types=["SEND"],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ### SNS Destination

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.sesv2.ConfigurationSet("example", configuration_set_name="example")
        example_configuration_set_event_destination = aws.sesv2.ConfigurationSetEventDestination("example",
            configuration_set_name=example.configuration_set_name,
            event_destination_name="example",
            event_destination=aws.sesv2.ConfigurationSetEventDestinationEventDestinationArgs(
                sns_destination=aws.sesv2.ConfigurationSetEventDestinationEventDestinationSnsDestinationArgs(
                    topic_arn=example_aws_sns_topic["arn"],
                ),
                enabled=True,
                matching_event_types=["SEND"],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import SESv2 (Simple Email V2) Configuration Set Event Destination using the `id` (`configuration_set_name|event_destination_name`). For example:

        ```sh
        $ pulumi import aws:sesv2/configurationSetEventDestination:ConfigurationSetEventDestination example example_configuration_set|example_event_destination
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] configuration_set_name: The name of the configuration set.
        :param pulumi.Input[pulumi.InputType['ConfigurationSetEventDestinationEventDestinationArgs']] event_destination: A name that identifies the event destination within the configuration set.
        :param pulumi.Input[str] event_destination_name: An object that defines the event destination. See event_destination below.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ConfigurationSetEventDestinationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS SESv2 (Simple Email V2) Configuration Set Event Destination.

        ## Example Usage

        ### Cloud Watch Destination

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.sesv2.ConfigurationSet("example", configuration_set_name="example")
        example_configuration_set_event_destination = aws.sesv2.ConfigurationSetEventDestination("example",
            configuration_set_name=example.configuration_set_name,
            event_destination_name="example",
            event_destination=aws.sesv2.ConfigurationSetEventDestinationEventDestinationArgs(
                cloud_watch_destination=aws.sesv2.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationArgs(
                    dimension_configurations=[aws.sesv2.ConfigurationSetEventDestinationEventDestinationCloudWatchDestinationDimensionConfigurationArgs(
                        default_dimension_value="example",
                        dimension_name="example",
                        dimension_value_source="MESSAGE_TAG",
                    )],
                ),
                enabled=True,
                matching_event_types=["SEND"],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ### Kinesis Firehose Destination

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.sesv2.ConfigurationSet("example", configuration_set_name="example")
        example_configuration_set_event_destination = aws.sesv2.ConfigurationSetEventDestination("example",
            configuration_set_name=example.configuration_set_name,
            event_destination_name="example",
            event_destination=aws.sesv2.ConfigurationSetEventDestinationEventDestinationArgs(
                kinesis_firehose_destination=aws.sesv2.ConfigurationSetEventDestinationEventDestinationKinesisFirehoseDestinationArgs(
                    delivery_stream_arn=example_aws_kinesis_firehose_delivery_stream["arn"],
                    iam_role_arn=example_aws_iam_role["arn"],
                ),
                enabled=True,
                matching_event_types=["SEND"],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ### Pinpoint Destination

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.sesv2.ConfigurationSet("example", configuration_set_name="example")
        example_configuration_set_event_destination = aws.sesv2.ConfigurationSetEventDestination("example",
            configuration_set_name=example.configuration_set_name,
            event_destination_name="example",
            event_destination=aws.sesv2.ConfigurationSetEventDestinationEventDestinationArgs(
                pinpoint_destination=aws.sesv2.ConfigurationSetEventDestinationEventDestinationPinpointDestinationArgs(
                    application_arn=example_aws_pinpoint_app["arn"],
                ),
                enabled=True,
                matching_event_types=["SEND"],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ### SNS Destination

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.sesv2.ConfigurationSet("example", configuration_set_name="example")
        example_configuration_set_event_destination = aws.sesv2.ConfigurationSetEventDestination("example",
            configuration_set_name=example.configuration_set_name,
            event_destination_name="example",
            event_destination=aws.sesv2.ConfigurationSetEventDestinationEventDestinationArgs(
                sns_destination=aws.sesv2.ConfigurationSetEventDestinationEventDestinationSnsDestinationArgs(
                    topic_arn=example_aws_sns_topic["arn"],
                ),
                enabled=True,
                matching_event_types=["SEND"],
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import SESv2 (Simple Email V2) Configuration Set Event Destination using the `id` (`configuration_set_name|event_destination_name`). For example:

        ```sh
        $ pulumi import aws:sesv2/configurationSetEventDestination:ConfigurationSetEventDestination example example_configuration_set|example_event_destination
        ```

        :param str resource_name: The name of the resource.
        :param ConfigurationSetEventDestinationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ConfigurationSetEventDestinationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 configuration_set_name: Optional[pulumi.Input[str]] = None,
                 event_destination: Optional[pulumi.Input[pulumi.InputType['ConfigurationSetEventDestinationEventDestinationArgs']]] = None,
                 event_destination_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ConfigurationSetEventDestinationArgs.__new__(ConfigurationSetEventDestinationArgs)

            if configuration_set_name is None and not opts.urn:
                raise TypeError("Missing required property 'configuration_set_name'")
            __props__.__dict__["configuration_set_name"] = configuration_set_name
            if event_destination is None and not opts.urn:
                raise TypeError("Missing required property 'event_destination'")
            __props__.__dict__["event_destination"] = event_destination
            if event_destination_name is None and not opts.urn:
                raise TypeError("Missing required property 'event_destination_name'")
            __props__.__dict__["event_destination_name"] = event_destination_name
        super(ConfigurationSetEventDestination, __self__).__init__(
            'aws:sesv2/configurationSetEventDestination:ConfigurationSetEventDestination',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            configuration_set_name: Optional[pulumi.Input[str]] = None,
            event_destination: Optional[pulumi.Input[pulumi.InputType['ConfigurationSetEventDestinationEventDestinationArgs']]] = None,
            event_destination_name: Optional[pulumi.Input[str]] = None) -> 'ConfigurationSetEventDestination':
        """
        Get an existing ConfigurationSetEventDestination resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] configuration_set_name: The name of the configuration set.
        :param pulumi.Input[pulumi.InputType['ConfigurationSetEventDestinationEventDestinationArgs']] event_destination: A name that identifies the event destination within the configuration set.
        :param pulumi.Input[str] event_destination_name: An object that defines the event destination. See event_destination below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ConfigurationSetEventDestinationState.__new__(_ConfigurationSetEventDestinationState)

        __props__.__dict__["configuration_set_name"] = configuration_set_name
        __props__.__dict__["event_destination"] = event_destination
        __props__.__dict__["event_destination_name"] = event_destination_name
        return ConfigurationSetEventDestination(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configurationSetName")
    def configuration_set_name(self) -> pulumi.Output[str]:
        """
        The name of the configuration set.
        """
        return pulumi.get(self, "configuration_set_name")

    @property
    @pulumi.getter(name="eventDestination")
    def event_destination(self) -> pulumi.Output['outputs.ConfigurationSetEventDestinationEventDestination']:
        """
        A name that identifies the event destination within the configuration set.
        """
        return pulumi.get(self, "event_destination")

    @property
    @pulumi.getter(name="eventDestinationName")
    def event_destination_name(self) -> pulumi.Output[str]:
        """
        An object that defines the event destination. See event_destination below.
        """
        return pulumi.get(self, "event_destination_name")

