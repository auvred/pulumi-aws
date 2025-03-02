# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['SigningProfilePermissionArgs', 'SigningProfilePermission']

@pulumi.input_type
class SigningProfilePermissionArgs:
    def __init__(__self__, *,
                 action: pulumi.Input[str],
                 principal: pulumi.Input[str],
                 profile_name: pulumi.Input[str],
                 profile_version: Optional[pulumi.Input[str]] = None,
                 statement_id: Optional[pulumi.Input[str]] = None,
                 statement_id_prefix: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SigningProfilePermission resource.
        :param pulumi.Input[str] action: An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, `signer:RevokeSignature`, or `signer:SignPayload`.
        :param pulumi.Input[str] principal: The AWS principal to be granted a cross-account permission.
        :param pulumi.Input[str] profile_name: Name of the signing profile to add the cross-account permissions.
        :param pulumi.Input[str] profile_version: The signing profile version that a permission applies to.
        :param pulumi.Input[str] statement_id: A unique statement identifier. By default generated by the provider.
        :param pulumi.Input[str] statement_id_prefix: A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statement_id`.
        """
        pulumi.set(__self__, "action", action)
        pulumi.set(__self__, "principal", principal)
        pulumi.set(__self__, "profile_name", profile_name)
        if profile_version is not None:
            pulumi.set(__self__, "profile_version", profile_version)
        if statement_id is not None:
            pulumi.set(__self__, "statement_id", statement_id)
        if statement_id_prefix is not None:
            pulumi.set(__self__, "statement_id_prefix", statement_id_prefix)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Input[str]:
        """
        An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, `signer:RevokeSignature`, or `signer:SignPayload`.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: pulumi.Input[str]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def principal(self) -> pulumi.Input[str]:
        """
        The AWS principal to be granted a cross-account permission.
        """
        return pulumi.get(self, "principal")

    @principal.setter
    def principal(self, value: pulumi.Input[str]):
        pulumi.set(self, "principal", value)

    @property
    @pulumi.getter(name="profileName")
    def profile_name(self) -> pulumi.Input[str]:
        """
        Name of the signing profile to add the cross-account permissions.
        """
        return pulumi.get(self, "profile_name")

    @profile_name.setter
    def profile_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "profile_name", value)

    @property
    @pulumi.getter(name="profileVersion")
    def profile_version(self) -> Optional[pulumi.Input[str]]:
        """
        The signing profile version that a permission applies to.
        """
        return pulumi.get(self, "profile_version")

    @profile_version.setter
    def profile_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "profile_version", value)

    @property
    @pulumi.getter(name="statementId")
    def statement_id(self) -> Optional[pulumi.Input[str]]:
        """
        A unique statement identifier. By default generated by the provider.
        """
        return pulumi.get(self, "statement_id")

    @statement_id.setter
    def statement_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "statement_id", value)

    @property
    @pulumi.getter(name="statementIdPrefix")
    def statement_id_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statement_id`.
        """
        return pulumi.get(self, "statement_id_prefix")

    @statement_id_prefix.setter
    def statement_id_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "statement_id_prefix", value)


@pulumi.input_type
class _SigningProfilePermissionState:
    def __init__(__self__, *,
                 action: Optional[pulumi.Input[str]] = None,
                 principal: Optional[pulumi.Input[str]] = None,
                 profile_name: Optional[pulumi.Input[str]] = None,
                 profile_version: Optional[pulumi.Input[str]] = None,
                 statement_id: Optional[pulumi.Input[str]] = None,
                 statement_id_prefix: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SigningProfilePermission resources.
        :param pulumi.Input[str] action: An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, `signer:RevokeSignature`, or `signer:SignPayload`.
        :param pulumi.Input[str] principal: The AWS principal to be granted a cross-account permission.
        :param pulumi.Input[str] profile_name: Name of the signing profile to add the cross-account permissions.
        :param pulumi.Input[str] profile_version: The signing profile version that a permission applies to.
        :param pulumi.Input[str] statement_id: A unique statement identifier. By default generated by the provider.
        :param pulumi.Input[str] statement_id_prefix: A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statement_id`.
        """
        if action is not None:
            pulumi.set(__self__, "action", action)
        if principal is not None:
            pulumi.set(__self__, "principal", principal)
        if profile_name is not None:
            pulumi.set(__self__, "profile_name", profile_name)
        if profile_version is not None:
            pulumi.set(__self__, "profile_version", profile_version)
        if statement_id is not None:
            pulumi.set(__self__, "statement_id", statement_id)
        if statement_id_prefix is not None:
            pulumi.set(__self__, "statement_id_prefix", statement_id_prefix)

    @property
    @pulumi.getter
    def action(self) -> Optional[pulumi.Input[str]]:
        """
        An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, `signer:RevokeSignature`, or `signer:SignPayload`.
        """
        return pulumi.get(self, "action")

    @action.setter
    def action(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "action", value)

    @property
    @pulumi.getter
    def principal(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS principal to be granted a cross-account permission.
        """
        return pulumi.get(self, "principal")

    @principal.setter
    def principal(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "principal", value)

    @property
    @pulumi.getter(name="profileName")
    def profile_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the signing profile to add the cross-account permissions.
        """
        return pulumi.get(self, "profile_name")

    @profile_name.setter
    def profile_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "profile_name", value)

    @property
    @pulumi.getter(name="profileVersion")
    def profile_version(self) -> Optional[pulumi.Input[str]]:
        """
        The signing profile version that a permission applies to.
        """
        return pulumi.get(self, "profile_version")

    @profile_version.setter
    def profile_version(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "profile_version", value)

    @property
    @pulumi.getter(name="statementId")
    def statement_id(self) -> Optional[pulumi.Input[str]]:
        """
        A unique statement identifier. By default generated by the provider.
        """
        return pulumi.get(self, "statement_id")

    @statement_id.setter
    def statement_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "statement_id", value)

    @property
    @pulumi.getter(name="statementIdPrefix")
    def statement_id_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statement_id`.
        """
        return pulumi.get(self, "statement_id_prefix")

    @statement_id_prefix.setter
    def statement_id_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "statement_id_prefix", value)


class SigningProfilePermission(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 principal: Optional[pulumi.Input[str]] = None,
                 profile_name: Optional[pulumi.Input[str]] = None,
                 profile_version: Optional[pulumi.Input[str]] = None,
                 statement_id: Optional[pulumi.Input[str]] = None,
                 statement_id_prefix: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates a Signer Signing Profile Permission. That is, a cross-account permission for a signing profile.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        prod_sp = aws.signer.SigningProfile("prod_sp",
            platform_id="AWSLambda-SHA384-ECDSA",
            name_prefix="prod_sp_",
            signature_validity_period=aws.signer.SigningProfileSignatureValidityPeriodArgs(
                value=5,
                type="YEARS",
            ),
            tags={
                "tag1": "value1",
                "tag2": "value2",
            })
        sp_permission1 = aws.signer.SigningProfilePermission("sp_permission_1",
            profile_name=prod_sp.name,
            action="signer:StartSigningJob",
            principal=aws_account)
        sp_permission2 = aws.signer.SigningProfilePermission("sp_permission_2",
            profile_name=prod_sp.name,
            action="signer:GetSigningProfile",
            principal=aws_team_role_arn,
            statement_id="ProdAccountStartSigningJob_StatementId")
        sp_permission3 = aws.signer.SigningProfilePermission("sp_permission_3",
            profile_name=prod_sp.name,
            action="signer:RevokeSignature",
            principal="123456789012",
            profile_version=prod_sp.version,
            statement_id_prefix="version-permission-")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Signer signing profile permission statements using profile_name/statement_id. For example:

        ```sh
        $ pulumi import aws:signer/signingProfilePermission:SigningProfilePermission test_signer_signing_profile_permission prod_profile_DdW3Mk1foYL88fajut4mTVFGpuwfd4ACO6ANL0D1uIj7lrn8adK/ProdAccountStartSigningJobStatementId
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action: An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, `signer:RevokeSignature`, or `signer:SignPayload`.
        :param pulumi.Input[str] principal: The AWS principal to be granted a cross-account permission.
        :param pulumi.Input[str] profile_name: Name of the signing profile to add the cross-account permissions.
        :param pulumi.Input[str] profile_version: The signing profile version that a permission applies to.
        :param pulumi.Input[str] statement_id: A unique statement identifier. By default generated by the provider.
        :param pulumi.Input[str] statement_id_prefix: A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statement_id`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SigningProfilePermissionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a Signer Signing Profile Permission. That is, a cross-account permission for a signing profile.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        prod_sp = aws.signer.SigningProfile("prod_sp",
            platform_id="AWSLambda-SHA384-ECDSA",
            name_prefix="prod_sp_",
            signature_validity_period=aws.signer.SigningProfileSignatureValidityPeriodArgs(
                value=5,
                type="YEARS",
            ),
            tags={
                "tag1": "value1",
                "tag2": "value2",
            })
        sp_permission1 = aws.signer.SigningProfilePermission("sp_permission_1",
            profile_name=prod_sp.name,
            action="signer:StartSigningJob",
            principal=aws_account)
        sp_permission2 = aws.signer.SigningProfilePermission("sp_permission_2",
            profile_name=prod_sp.name,
            action="signer:GetSigningProfile",
            principal=aws_team_role_arn,
            statement_id="ProdAccountStartSigningJob_StatementId")
        sp_permission3 = aws.signer.SigningProfilePermission("sp_permission_3",
            profile_name=prod_sp.name,
            action="signer:RevokeSignature",
            principal="123456789012",
            profile_version=prod_sp.version,
            statement_id_prefix="version-permission-")
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Signer signing profile permission statements using profile_name/statement_id. For example:

        ```sh
        $ pulumi import aws:signer/signingProfilePermission:SigningProfilePermission test_signer_signing_profile_permission prod_profile_DdW3Mk1foYL88fajut4mTVFGpuwfd4ACO6ANL0D1uIj7lrn8adK/ProdAccountStartSigningJobStatementId
        ```

        :param str resource_name: The name of the resource.
        :param SigningProfilePermissionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SigningProfilePermissionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action: Optional[pulumi.Input[str]] = None,
                 principal: Optional[pulumi.Input[str]] = None,
                 profile_name: Optional[pulumi.Input[str]] = None,
                 profile_version: Optional[pulumi.Input[str]] = None,
                 statement_id: Optional[pulumi.Input[str]] = None,
                 statement_id_prefix: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SigningProfilePermissionArgs.__new__(SigningProfilePermissionArgs)

            if action is None and not opts.urn:
                raise TypeError("Missing required property 'action'")
            __props__.__dict__["action"] = action
            if principal is None and not opts.urn:
                raise TypeError("Missing required property 'principal'")
            __props__.__dict__["principal"] = principal
            if profile_name is None and not opts.urn:
                raise TypeError("Missing required property 'profile_name'")
            __props__.__dict__["profile_name"] = profile_name
            __props__.__dict__["profile_version"] = profile_version
            __props__.__dict__["statement_id"] = statement_id
            __props__.__dict__["statement_id_prefix"] = statement_id_prefix
        super(SigningProfilePermission, __self__).__init__(
            'aws:signer/signingProfilePermission:SigningProfilePermission',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            action: Optional[pulumi.Input[str]] = None,
            principal: Optional[pulumi.Input[str]] = None,
            profile_name: Optional[pulumi.Input[str]] = None,
            profile_version: Optional[pulumi.Input[str]] = None,
            statement_id: Optional[pulumi.Input[str]] = None,
            statement_id_prefix: Optional[pulumi.Input[str]] = None) -> 'SigningProfilePermission':
        """
        Get an existing SigningProfilePermission resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] action: An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, `signer:RevokeSignature`, or `signer:SignPayload`.
        :param pulumi.Input[str] principal: The AWS principal to be granted a cross-account permission.
        :param pulumi.Input[str] profile_name: Name of the signing profile to add the cross-account permissions.
        :param pulumi.Input[str] profile_version: The signing profile version that a permission applies to.
        :param pulumi.Input[str] statement_id: A unique statement identifier. By default generated by the provider.
        :param pulumi.Input[str] statement_id_prefix: A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statement_id`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SigningProfilePermissionState.__new__(_SigningProfilePermissionState)

        __props__.__dict__["action"] = action
        __props__.__dict__["principal"] = principal
        __props__.__dict__["profile_name"] = profile_name
        __props__.__dict__["profile_version"] = profile_version
        __props__.__dict__["statement_id"] = statement_id
        __props__.__dict__["statement_id_prefix"] = statement_id_prefix
        return SigningProfilePermission(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def action(self) -> pulumi.Output[str]:
        """
        An AWS Signer action permitted as part of cross-account permissions. Valid values: `signer:StartSigningJob`, `signer:GetSigningProfile`, `signer:RevokeSignature`, or `signer:SignPayload`.
        """
        return pulumi.get(self, "action")

    @property
    @pulumi.getter
    def principal(self) -> pulumi.Output[str]:
        """
        The AWS principal to be granted a cross-account permission.
        """
        return pulumi.get(self, "principal")

    @property
    @pulumi.getter(name="profileName")
    def profile_name(self) -> pulumi.Output[str]:
        """
        Name of the signing profile to add the cross-account permissions.
        """
        return pulumi.get(self, "profile_name")

    @property
    @pulumi.getter(name="profileVersion")
    def profile_version(self) -> pulumi.Output[str]:
        """
        The signing profile version that a permission applies to.
        """
        return pulumi.get(self, "profile_version")

    @property
    @pulumi.getter(name="statementId")
    def statement_id(self) -> pulumi.Output[str]:
        """
        A unique statement identifier. By default generated by the provider.
        """
        return pulumi.get(self, "statement_id")

    @property
    @pulumi.getter(name="statementIdPrefix")
    def statement_id_prefix(self) -> pulumi.Output[str]:
        """
        A statement identifier prefix. The provider will generate a unique suffix. Conflicts with `statement_id`.
        """
        return pulumi.get(self, "statement_id_prefix")

