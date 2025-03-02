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

__all__ = ['ListenerRuleArgs', 'ListenerRule']

@pulumi.input_type
class ListenerRuleArgs:
    def __init__(__self__, *,
                 action: pulumi.Input['ListenerRuleActionArgs'],
                 listener_identifier: pulumi.Input[str],
                 match: pulumi.Input['ListenerRuleMatchArgs'],
                 priority: pulumi.Input[int],
                 service_identifier: pulumi.Input[str],
                 name: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a ListenerRule resource.
        :param pulumi.Input['ListenerRuleActionArgs'] action: The action for the listener rule.
        :param pulumi.Input[str] listener_identifier: The ID or Amazon Resource Name (ARN) of the listener.
        :param pulumi.Input['ListenerRuleMatchArgs'] match: The rule match.
        :param pulumi.Input[int] priority: The priority assigned to the rule. Each rule for a specific listener must have a unique priority. The lower the priority number the higher the priority.
               
               The following arguments are optional:
        :param pulumi.Input[str] service_identifier: The ID or Amazon Resource Identifier (ARN) of the service.
        :param pulumi.Input[str] name: The name of the rule. The name must be unique within the listener. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "action", action)
        pulumi.set(__self__, "listener_identifier", listener_identifier)
        pulumi.set(__self__, "match", match)
        pulumi.set(__self__, "priority", priority)
        pulumi.set(__self__, "service_identifier", service_identifier)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Input['ListenerRuleActionArgs']:
        """
        The action for the listener rule.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: pulumi.Input['ListenerRuleActionArgs']):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter(name="listenerIdentifier")
    def listener_identifier(self) -> pulumi.Input[str]:
        """
        The ID or Amazon Resource Name (ARN) of the listener.
        """
        return pulumi.get(self, "listener_identifier")

    @listener_identifier.setter
    def listener_identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "listener_identifier", value)

    @property
    @pulumi.getter
    def match(self) -> pulumi.Input['ListenerRuleMatchArgs']:
        """
        The rule match.
        """
        return pulumi.get(self, "match")

    @match.setter
    def match(self, value: pulumi.Input['ListenerRuleMatchArgs']):
        pulumi.set(self, "match", value)

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Input[int]:
        """
        The priority assigned to the rule. Each rule for a specific listener must have a unique priority. The lower the priority number the higher the priority.

        The following arguments are optional:
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: pulumi.Input[int]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter(name="serviceIdentifier")
    def service_identifier(self) -> pulumi.Input[str]:
        """
        The ID or Amazon Resource Identifier (ARN) of the service.
        """
        return pulumi.get(self, "service_identifier")

    @service_identifier.setter
    def service_identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_identifier", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the rule. The name must be unique within the listener. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _ListenerRuleState:
    def __init__(__self__, *,
                 action: Optional[pulumi.Input['ListenerRuleActionArgs']] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 listener_identifier: Optional[pulumi.Input[str]] = None,
                 match: Optional[pulumi.Input['ListenerRuleMatchArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 rule_id: Optional[pulumi.Input[str]] = None,
                 service_identifier: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering ListenerRule resources.
        :param pulumi.Input['ListenerRuleActionArgs'] action: The action for the listener rule.
        :param pulumi.Input[str] arn: The ARN for the listener rule.
        :param pulumi.Input[str] listener_identifier: The ID or Amazon Resource Name (ARN) of the listener.
        :param pulumi.Input['ListenerRuleMatchArgs'] match: The rule match.
        :param pulumi.Input[str] name: The name of the rule. The name must be unique within the listener. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
        :param pulumi.Input[int] priority: The priority assigned to the rule. Each rule for a specific listener must have a unique priority. The lower the priority number the higher the priority.
               
               The following arguments are optional:
        :param pulumi.Input[str] rule_id: Unique identifier for the listener rule.
        :param pulumi.Input[str] service_identifier: The ID or Amazon Resource Identifier (ARN) of the service.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if action is not None:
            pulumi.set(__self__, "action", action)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if listener_identifier is not None:
            pulumi.set(__self__, "listener_identifier", listener_identifier)
        if match is not None:
            pulumi.set(__self__, "match", match)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if priority is not None:
            pulumi.set(__self__, "priority", priority)
        if rule_id is not None:
            pulumi.set(__self__, "rule_id", rule_id)
        if service_identifier is not None:
            pulumi.set(__self__, "service_identifier", service_identifier)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input['ListenerRuleActionArgs']]:
        """
        The action for the listener rule.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input['ListenerRuleActionArgs']]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN for the listener rule.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="listenerIdentifier")
    def listener_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        The ID or Amazon Resource Name (ARN) of the listener.
        """
        return pulumi.get(self, "listener_identifier")

    @listener_identifier.setter
    def listener_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "listener_identifier", value)

    @property
    @pulumi.getter
    def match(self) -> Optional[pulumi.Input['ListenerRuleMatchArgs']]:
        """
        The rule match.
        """
        return pulumi.get(self, "match")

    @match.setter
    def match(self, value: Optional[pulumi.Input['ListenerRuleMatchArgs']]):
        pulumi.set(self, "match", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the rule. The name must be unique within the listener. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def priority(self) -> Optional[pulumi.Input[int]]:
        """
        The priority assigned to the rule. Each rule for a specific listener must have a unique priority. The lower the priority number the higher the priority.

        The following arguments are optional:
        """
        return pulumi.get(self, "priority")

    @priority.setter
    def priority(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "priority", value)

    @property
    @pulumi.getter(name="ruleId")
    def rule_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier for the listener rule.
        """
        return pulumi.get(self, "rule_id")

    @rule_id.setter
    def rule_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "rule_id", value)

    @property
    @pulumi.getter(name="serviceIdentifier")
    def service_identifier(self) -> Optional[pulumi.Input[str]]:
        """
        The ID or Amazon Resource Identifier (ARN) of the service.
        """
        return pulumi.get(self, "service_identifier")

    @service_identifier.setter
    def service_identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_identifier", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class ListenerRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[pulumi.InputType['ListenerRuleActionArgs']]] = None,
                 listener_identifier: Optional[pulumi.Input[str]] = None,
                 match: Optional[pulumi.Input[pulumi.InputType['ListenerRuleMatchArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 service_identifier: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Resource for managing an AWS VPC Lattice Listener Rule.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.vpclattice.ListenerRule("test",
            name="example",
            listener_identifier=example_aws_vpclattice_listener["listenerId"],
            service_identifier=example_aws_vpclattice_service["id"],
            priority=20,
            match=aws.vpclattice.ListenerRuleMatchArgs(
                http_match=aws.vpclattice.ListenerRuleMatchHttpMatchArgs(
                    header_matches=[aws.vpclattice.ListenerRuleMatchHttpMatchHeaderMatchArgs(
                        name="example-header",
                        case_sensitive=False,
                        match=aws.vpclattice.ListenerRuleMatchHttpMatchHeaderMatchMatchArgs(
                            exact="example-contains",
                        ),
                    )],
                    path_match=aws.vpclattice.ListenerRuleMatchHttpMatchPathMatchArgs(
                        case_sensitive=True,
                        match=aws.vpclattice.ListenerRuleMatchHttpMatchPathMatchMatchArgs(
                            prefix="/example-path",
                        ),
                    ),
                ),
            ),
            action=aws.vpclattice.ListenerRuleActionArgs(
                forward=aws.vpclattice.ListenerRuleActionForwardArgs(
                    target_groups=[
                        aws.vpclattice.ListenerRuleActionForwardTargetGroupArgs(
                            target_group_identifier=example["id"],
                            weight=1,
                        ),
                        aws.vpclattice.ListenerRuleActionForwardTargetGroupArgs(
                            target_group_identifier=example2["id"],
                            weight=2,
                        ),
                    ],
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ### Basic Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.vpclattice.ListenerRule("test",
            name="example",
            listener_identifier=example["listenerId"],
            service_identifier=example_aws_vpclattice_service["id"],
            priority=10,
            match=aws.vpclattice.ListenerRuleMatchArgs(
                http_match=aws.vpclattice.ListenerRuleMatchHttpMatchArgs(
                    path_match=aws.vpclattice.ListenerRuleMatchHttpMatchPathMatchArgs(
                        case_sensitive=False,
                        match=aws.vpclattice.ListenerRuleMatchHttpMatchPathMatchMatchArgs(
                            exact="/example-path",
                        ),
                    ),
                ),
            ),
            action=aws.vpclattice.ListenerRuleActionArgs(
                fixed_response=aws.vpclattice.ListenerRuleActionFixedResponseArgs(
                    status_code=404,
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import VPC Lattice Listener Rule using the `id`. For example:

        ```sh
        $ pulumi import aws:vpclattice/listenerRule:ListenerRule example service123/listener456/rule789
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ListenerRuleActionArgs']] action: The action for the listener rule.
        :param pulumi.Input[str] listener_identifier: The ID or Amazon Resource Name (ARN) of the listener.
        :param pulumi.Input[pulumi.InputType['ListenerRuleMatchArgs']] match: The rule match.
        :param pulumi.Input[str] name: The name of the rule. The name must be unique within the listener. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
        :param pulumi.Input[int] priority: The priority assigned to the rule. Each rule for a specific listener must have a unique priority. The lower the priority number the higher the priority.
               
               The following arguments are optional:
        :param pulumi.Input[str] service_identifier: The ID or Amazon Resource Identifier (ARN) of the service.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ListenerRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS VPC Lattice Listener Rule.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.vpclattice.ListenerRule("test",
            name="example",
            listener_identifier=example_aws_vpclattice_listener["listenerId"],
            service_identifier=example_aws_vpclattice_service["id"],
            priority=20,
            match=aws.vpclattice.ListenerRuleMatchArgs(
                http_match=aws.vpclattice.ListenerRuleMatchHttpMatchArgs(
                    header_matches=[aws.vpclattice.ListenerRuleMatchHttpMatchHeaderMatchArgs(
                        name="example-header",
                        case_sensitive=False,
                        match=aws.vpclattice.ListenerRuleMatchHttpMatchHeaderMatchMatchArgs(
                            exact="example-contains",
                        ),
                    )],
                    path_match=aws.vpclattice.ListenerRuleMatchHttpMatchPathMatchArgs(
                        case_sensitive=True,
                        match=aws.vpclattice.ListenerRuleMatchHttpMatchPathMatchMatchArgs(
                            prefix="/example-path",
                        ),
                    ),
                ),
            ),
            action=aws.vpclattice.ListenerRuleActionArgs(
                forward=aws.vpclattice.ListenerRuleActionForwardArgs(
                    target_groups=[
                        aws.vpclattice.ListenerRuleActionForwardTargetGroupArgs(
                            target_group_identifier=example["id"],
                            weight=1,
                        ),
                        aws.vpclattice.ListenerRuleActionForwardTargetGroupArgs(
                            target_group_identifier=example2["id"],
                            weight=2,
                        ),
                    ],
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ### Basic Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.vpclattice.ListenerRule("test",
            name="example",
            listener_identifier=example["listenerId"],
            service_identifier=example_aws_vpclattice_service["id"],
            priority=10,
            match=aws.vpclattice.ListenerRuleMatchArgs(
                http_match=aws.vpclattice.ListenerRuleMatchHttpMatchArgs(
                    path_match=aws.vpclattice.ListenerRuleMatchHttpMatchPathMatchArgs(
                        case_sensitive=False,
                        match=aws.vpclattice.ListenerRuleMatchHttpMatchPathMatchMatchArgs(
                            exact="/example-path",
                        ),
                    ),
                ),
            ),
            action=aws.vpclattice.ListenerRuleActionArgs(
                fixed_response=aws.vpclattice.ListenerRuleActionFixedResponseArgs(
                    status_code=404,
                ),
            ))
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import VPC Lattice Listener Rule using the `id`. For example:

        ```sh
        $ pulumi import aws:vpclattice/listenerRule:ListenerRule example service123/listener456/rule789
        ```

        :param str resource_name: The name of the resource.
        :param ListenerRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ListenerRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[pulumi.InputType['ListenerRuleActionArgs']]] = None,
                 listener_identifier: Optional[pulumi.Input[str]] = None,
                 match: Optional[pulumi.Input[pulumi.InputType['ListenerRuleMatchArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[int]] = None,
                 service_identifier: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ListenerRuleArgs.__new__(ListenerRuleArgs)

            if action is None and not opts.urn:
                raise TypeError("Missing required property 'action'")
            __props__.__dict__["action"] = action
            if listener_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'listener_identifier'")
            __props__.__dict__["listener_identifier"] = listener_identifier
            if match is None and not opts.urn:
                raise TypeError("Missing required property 'match'")
            __props__.__dict__["match"] = match
            __props__.__dict__["name"] = name
            if priority is None and not opts.urn:
                raise TypeError("Missing required property 'priority'")
            __props__.__dict__["priority"] = priority
            if service_identifier is None and not opts.urn:
                raise TypeError("Missing required property 'service_identifier'")
            __props__.__dict__["service_identifier"] = service_identifier
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["rule_id"] = None
            __props__.__dict__["tags_all"] = None
        super(ListenerRule, __self__).__init__(
            'aws:vpclattice/listenerRule:ListenerRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            action: Optional[pulumi.Input[pulumi.InputType['ListenerRuleActionArgs']]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            listener_identifier: Optional[pulumi.Input[str]] = None,
            match: Optional[pulumi.Input[pulumi.InputType['ListenerRuleMatchArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            priority: Optional[pulumi.Input[int]] = None,
            rule_id: Optional[pulumi.Input[str]] = None,
            service_identifier: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'ListenerRule':
        """
        Get an existing ListenerRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['ListenerRuleActionArgs']] action: The action for the listener rule.
        :param pulumi.Input[str] arn: The ARN for the listener rule.
        :param pulumi.Input[str] listener_identifier: The ID or Amazon Resource Name (ARN) of the listener.
        :param pulumi.Input[pulumi.InputType['ListenerRuleMatchArgs']] match: The rule match.
        :param pulumi.Input[str] name: The name of the rule. The name must be unique within the listener. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
        :param pulumi.Input[int] priority: The priority assigned to the rule. Each rule for a specific listener must have a unique priority. The lower the priority number the higher the priority.
               
               The following arguments are optional:
        :param pulumi.Input[str] rule_id: Unique identifier for the listener rule.
        :param pulumi.Input[str] service_identifier: The ID or Amazon Resource Identifier (ARN) of the service.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ListenerRuleState.__new__(_ListenerRuleState)

        __props__.__dict__["action"] = action
        __props__.__dict__["arn"] = arn
        __props__.__dict__["listener_identifier"] = listener_identifier
        __props__.__dict__["match"] = match
        __props__.__dict__["name"] = name
        __props__.__dict__["priority"] = priority
        __props__.__dict__["rule_id"] = rule_id
        __props__.__dict__["service_identifier"] = service_identifier
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return ListenerRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Output['outputs.ListenerRuleAction']:
        """
        The action for the listener rule.
        """
        return pulumi.get(self, "action")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The ARN for the listener rule.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="listenerIdentifier")
    def listener_identifier(self) -> pulumi.Output[str]:
        """
        The ID or Amazon Resource Name (ARN) of the listener.
        """
        return pulumi.get(self, "listener_identifier")

    @property
    @pulumi.getter
    def match(self) -> pulumi.Output['outputs.ListenerRuleMatch']:
        """
        The rule match.
        """
        return pulumi.get(self, "match")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the rule. The name must be unique within the listener. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[int]:
        """
        The priority assigned to the rule. Each rule for a specific listener must have a unique priority. The lower the priority number the higher the priority.

        The following arguments are optional:
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter(name="ruleId")
    def rule_id(self) -> pulumi.Output[str]:
        """
        Unique identifier for the listener rule.
        """
        return pulumi.get(self, "rule_id")

    @property
    @pulumi.getter(name="serviceIdentifier")
    def service_identifier(self) -> pulumi.Output[str]:
        """
        The ID or Amazon Resource Identifier (ARN) of the service.
        """
        return pulumi.get(self, "service_identifier")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
        pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")

        return pulumi.get(self, "tags_all")

